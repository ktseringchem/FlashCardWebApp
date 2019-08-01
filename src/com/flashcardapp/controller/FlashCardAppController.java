package com.flashcardapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.flashcardapp.entities.Flashcarduser;
import com.flashcardapp.service.CardServices;
import com.flashcardapp.service.UserServices;


@Controller
@SessionAttributes(value = {"sFlashcarduser", "sFlashCards"})
public class FlashCardAppController 
{
	
	@ModelAttribute("sFlashcarduser") //@ModelAttribute("sFlashcarduser") Flashcarduser fcuser
	public Flashcarduser setUpFlashCarduser() {
		Flashcarduser fcuser = new Flashcarduser();
		return fcuser;		
	}
	
	@RequestMapping("/toLoginPage")
	public ModelAndView toLoginPage() 
	{
		return new ModelAndView("login");
	}
	
	@RequestMapping("/welcomepage")
	public ModelAndView getWelcomepage(@SessionAttribute("sFlashcarduser") Flashcarduser sfuser) 
	{
		return new ModelAndView("welcomepage");
	}
	
	
	@RequestMapping("/Login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("herreeeee");
		String uname = request.getParameter("uname");
		String upasswd = request.getParameter("upasswd");
		
		ModelAndView mv = new ModelAndView();
		
		UserServices uService = new UserServices();
		Flashcarduser user = uService.validateUser(uname, upasswd);
		mv.addObject("sFlashcarduser", user);

		if(user != null)
		{
			String message = "You are registred, please try logging in";
			mv.setViewName("landingpage");
			request.setAttribute("user_id", user.getUser_id());
			mv.addObject("message", message);
			mv.addObject("fullname", user.getCname());
			return mv;
		}
		else
		{
			mv.addObject("WrongCred", "block");
			mv.setViewName("login");
			return mv;
		}
	}
	
	@RequestMapping("/Register")
	public ModelAndView registerFlashCardUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String emailAdd = request.getParameter("emailAddress");
		String fullName = request.getParameter("fullName");
		String upasswd = request.getParameter("password");
		ModelAndView mv = new ModelAndView();
		UserServices uService = new UserServices();

		if(emailAdd.isEmpty() || fullName.isEmpty() || upasswd.isEmpty() )
		{
			request.setAttribute("inCorrectReg", "block");
			mv.setViewName("index");
			mv.addObject(request);
		}
		else
		{
			uService.registerCardUser(emailAdd, fullName, upasswd);
			String message = "You have registered, \nplease try logging in";
			request.setAttribute("message", message);
			mv.setViewName("index");
			mv.addObject(request);
		}
		return mv;

	}
	
	@RequestMapping("/createcard")
	public @ResponseBody ModelAndView createFlashCard(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{		
		String frontcard = request.getParameter("frontcard");
		String backcard = request.getParameter("backcard");
		CardServices cardServices = new CardServices();
		boolean result = cardServices.addFlashCard(frontcard, backcard);
		
		if(result)
		{
			request.setAttribute("createCardMessage", "block");
		}
		else
		{
			request.setAttribute("notCreateCardMessage", "block");
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcomepage");
		mv.addObject(request);
		return mv;
	}
	
	@RequestMapping("/deletecard/{id}")
	public @ResponseBody void deleteFlashCard(@PathVariable String id)//@RequestParam(value="Remove") int flashcard_id)
	{		
		CardServices cardServices = new CardServices();
		cardServices.removeFlashCard(Integer.parseInt(id));		
	}
	
	@RequestMapping("/edit/{front}/{back}/{id}")
	public @ResponseBody void editFlashCard(@PathVariable String front, @PathVariable String back, @PathVariable String id)
	{
		System.out.println(front+", "+back+", "+id);
		CardServices cardServices = new CardServices();
		cardServices.updateFlashCard(front, back, id);
				
	}
	
		
}
