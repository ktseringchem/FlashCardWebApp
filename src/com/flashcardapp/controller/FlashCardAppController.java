package com.flashcardapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.flashcardapp.entities.FlashCards;
import com.flashcardapp.entities.Flashcarduser;
import com.flashcardapp.service.CardServices;
import com.flashcardapp.service.UserServices;

@Controller
@SessionAttributes(value = { "sFlashcarduser", "sFlashCards" })
public class FlashCardAppController {

	@ModelAttribute("sFlashcarduser")
	public Flashcarduser setUpFlashCarduser() {
		Flashcarduser fcuser = new Flashcarduser();
		return fcuser;
	}

	@ModelAttribute("sFlashCards")
	public FlashCards setUpFlashCards() {
		FlashCards fcs = new FlashCards();
		return fcs;
	}

	// This Handler will direct you to index.jsp
	@RequestMapping("/LandingPage")
	public ModelAndView getLandingPage() {
		System.out.println();
		return new ModelAndView("index");
	}

	// This Handler will direct you to login.jsp
	@RequestMapping("/LoginPage")
	public ModelAndView getLoginPage() {
		return new ModelAndView("login");
	}
	
	// This Handler will direct you to welcomepage.jsp
	@RequestMapping("/WelcomePage")
	public ModelAndView getWelcomepage(@SessionAttribute("sFlashcarduser") Flashcarduser sfuser) 
	{
		ModelAndView mv = new ModelAndView();

		CardServices cService = new CardServices();
		List<FlashCards> flashcardlist = cService.getAllFlashCard();
		mv.addObject("sFlashCards", flashcardlist);

		mv.setViewName("welcomepage");
		return mv;
	}

	// This Handler will direct you to study.jsp
	@RequestMapping("/StudyPage")
	public ModelAndView getStudyPage() {
		System.out.println();
		return new ModelAndView("study");
	}

	@RequestMapping(value = "/Login", method = { RequestMethod.POST })
	public ModelAndView doPost(Model model, @RequestParam("uname") String uname,
			@RequestParam("upasswd") String upasswd) {
		ModelAndView mv = new ModelAndView();

		UserServices uService = new UserServices();
		Flashcarduser user = uService.validateUser(uname, upasswd);

		if (user != null) {
			mv.setViewName("redirect:/WelcomePage");
			mv.addObject("sFlashcarduser", user);
			return mv;
		} else {
			mv.addObject("WrongCred", "block");
			mv.setViewName("login");
			return mv;
		}
	}

//	@RequestMapping("/getWelcompage")
//	public ModelAndView getWelcompage() {
//		ModelAndView mv = new ModelAndView();
//
//		CardServices cService = new CardServices();
//		List<FlashCards> flashcardlist = cService.getAllFlashCard();
//		mv.addObject("sFlashCards", flashcardlist);
//
//		mv.setViewName("welcomepage");
//		return mv;
//	}

	@RequestMapping("/Register")
	public ModelAndView registerFlashCardUser(@RequestParam("emailAddress") String emailAddress,
			@RequestParam("fullName") String fullName, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView();
		UserServices uService = new UserServices();

		if (emailAddress.isEmpty() || fullName.isEmpty() || password.isEmpty()) {
			mv.addObject("inCorrectReg", "block");
		} else {
			uService.registerCardUser(emailAddress, fullName, password);
			mv.addObject("RightCred", "block");
		}
		mv.setViewName("login");
		return mv;
	}

	@RequestMapping("/createcard")
	public @ResponseBody ModelAndView createFlashCard(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String frontcard = request.getParameter("frontcard");
		String backcard = request.getParameter("backcard");
		CardServices cardServices = new CardServices();
		boolean result = cardServices.addFlashCard(frontcard, backcard);

		if (result) {
			request.setAttribute("createCardMessage", "block");
		} else {
			request.setAttribute("notCreateCardMessage", "block");
		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcomepage");
		mv.addObject(request);
		return mv;
	}

	@RequestMapping("/deletecard/{id}")
	public @ResponseBody void deleteFlashCard(@PathVariable String id)// @RequestParam(value="Remove") int flashcard_id)
	{
		CardServices cardServices = new CardServices();
		cardServices.removeFlashCard(Integer.parseInt(id));
	}

	@RequestMapping("/edit/{front}/{back}/{id}")
	public @ResponseBody void editFlashCard(@PathVariable String front, @PathVariable String back,
			@PathVariable String id) {
		System.out.println(front + ", " + back + ", " + id);
		CardServices cardServices = new CardServices();
		cardServices.updateFlashCard(front, back, id);

	}

}
