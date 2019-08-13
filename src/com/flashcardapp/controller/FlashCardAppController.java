package com.flashcardapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.flashcardapp.entities.FlashCards;
import com.flashcardapp.entities.Flashcarduser;
import com.flashcardapp.service.CardServices;
import com.flashcardapp.service.UserServices;

@Controller
@SessionAttributes(value = { "sFlashcarduser", "sFlashCards" })
public class FlashCardAppController {

//	Helper method. Initializes the session attribute.
//  Method name convention: setUp+session attribute name
//  e.g. session attribute name: sEmployee , method name: setUpsEmployee()
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
		return new ModelAndView("index");
	}

	// This Handler will direct you to login.jsp
	@RequestMapping("/LoginPage")
	public ModelAndView getLoginPage(HttpSession session) {
		ModelAndView mv = new ModelAndView();

		Flashcarduser flashcarduser = (Flashcarduser) session.getAttribute("sFlashcarduser");
		if (flashcarduser != null && session.getAttribute("uname") != null && session.getAttribute("upasswd") != null) {
			mv.setViewName("redirect:/Logout");
			return mv;
		} else {

			mv.addObject("userKey", new Flashcarduser());
			mv.setViewName("login");
			return mv;
		}
	}

	// This Handler will direct you to welcomepage.jsp which is home
	@RequestMapping("/WelcomePage")
	public ModelAndView getWelcomepage(HttpSession session) {
		Flashcarduser flashcarduser = (Flashcarduser) session.getAttribute("sFlashcarduser");
		
		ModelAndView mv = new ModelAndView();
		if (flashcarduser != null 
				&& session.getAttribute("uname") != null 
				&& session.getAttribute("upasswd") != null) 
		{
			CardServices cService = new CardServices();
			List<FlashCards> flashcardlist = cService.getAllFlashCard();
			mv.addObject("totalCards", flashcardlist.size());
			
			mv.setViewName("welcomepage");
			return mv;
		} 
		else 
		{
			mv.setViewName("redirect:/LoginPage");
			return mv;
		}

	}

	// This Handler will direct you to study.jsp
	@RequestMapping("/StudyPage")
	public ModelAndView getStudyPage(HttpSession session) {
		Flashcarduser flashcarduser = (Flashcarduser) session.getAttribute("sFlashcarduser");
		ModelAndView mv = new ModelAndView();
		if (flashcarduser != null && session.getAttribute("uname") != null && session.getAttribute("upasswd") != null) {
			
			mv.setViewName("study");
			return mv;
		} else {
			mv.setViewName("redirect:/LoginPage");
			return mv;
		}
	}

	// This Handler will direct you to quiz.jsp
	@RequestMapping("/QuizPage")
	public ModelAndView getQuizPage(HttpSession session) 
	{
		Flashcarduser flashcarduser = (Flashcarduser) session.getAttribute("sFlashcarduser");
		ModelAndView mv = new ModelAndView();

		if (flashcarduser != null && session.getAttribute("uname") != null 
				&& session.getAttribute("upasswd") != null) 
		{
			mv.setViewName("quiz");
			return mv;
		} 
		else 
		{
			mv.setViewName("redirect:/LoginPage");
			return mv;
		}
	}

	/********************************************************************
	 * End of navigation
	 ***************************************************************/

//	This handler will receive login request and direct user to welcomepage request handler 
	@RequestMapping(value = "/Login", method = { RequestMethod.POST })
	public ModelAndView doPost(@RequestParam("uname") String uname, @RequestParam("upasswd") String upasswd,
			HttpSession session) {
		ModelAndView mv = new ModelAndView();

		UserServices uService = new UserServices();
		Flashcarduser user = uService.validateUser(uname, upasswd);

		if (user != null) {
			mv.setViewName("redirect:/WelcomePage");
			mv.addObject("sFlashcarduser", user);
			session.setAttribute("uname", uname);
			session.setAttribute("upasswd", upasswd);

			return mv;
		} else {
			session.setAttribute("WrongCred", "block");
			mv.setViewName("redirect:/LoginPage");
			return mv;
		}
	}

	// This Handler will clear the session and direct user to login.jsp
	@RequestMapping("/Logout")
	public String getLoginPageAfterLogOut(HttpSession session) {
		session.removeAttribute("uname");
		session.removeAttribute("upasswd");
		session.removeAttribute("sFlashcarduser");
		session.invalidate();
		return "redirect:/LoginPage";
	}

	@RequestMapping("/Register")
	public ModelAndView registerFlashCardUser(@Valid @ModelAttribute("userKey") Flashcarduser flashcarduser,
			BindingResult errors) {
		ModelAndView mv = new ModelAndView();

		if (errors.hasErrors()) {
			mv.addObject("inCorrectReg", "block");
			mv.setViewName("login");
			return mv;
		} else {
			UserServices uService = new UserServices();
			mv.addObject("CorrectReg", "block");
			uService.registerCardUser(flashcarduser.getEmail(), flashcarduser.getCname(), flashcarduser.getPassword());
			mv.setViewName("welcomepage");
			return mv;
		}
	}

//	@RequestMapping("/createcard")
//	public @ResponseBody ModelAndView createFlashCard(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String frontcard = request.getParameter("frontcard");
//		String backcard = request.getParameter("backcard");
//		CardServices cardServices = new CardServices();
//		boolean result = cardServices.addFlashCard(frontcard, backcard, 2);
//
//		if (result) {
//			request.setAttribute("createCardMessage", "block");
//		} else {
//			request.setAttribute("notCreateCardMessage", "block");
//		}
//
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("welcomepage");
//		mv.addObject(request);
//		return mv;
//	}

	@RequestMapping("/deletecard/{id}")
	public @ResponseBody void deleteFlashCard(@PathVariable String id)// @RequestParam(value="Remove") int flashcard_id)
	{
		CardServices cardServices = new CardServices();
		cardServices.removeFlashCard(Integer.parseInt(id));
	}

	@RequestMapping("/edit/{front}/{back}/{id}")
	public @ResponseBody void editFlashCard(
			@PathVariable String front, 
			@PathVariable String back,
			@PathVariable String id) 
	{
		
		CardServices cardServices = new CardServices();
		FlashCards found_fc = (FlashCards) cardServices.getFlashCardById(Integer.parseInt(id));
		if(found_fc != null)
		{
			System.out.println("flash card edited");
			cardServices.updateFlashCard(front, back, id);
		}
		else
		{
			System.out.println("flash card added");
			cardServices.addFlashCard(front, back, Integer.parseInt(id));
		}
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String[] { "cName" });
	}

}
