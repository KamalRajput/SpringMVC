package com.kamal.SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kamal.SpringMvc.dto.user;

@Controller
public class userController {

	/*@RequestMapping("registerPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userRegister");
		return modelAndView;
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ModelAndView RegisterUser(@ModelAttribute("user") user user1) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user",user1);
		modelAndView.setViewName("successPage");
		return modelAndView;
	}
	
	*/
	
	/* Simplifying it using ModelMap and StringView 
	 * 1. first Method only displays show String View will work here.
	 * 2. Second case required Model, so we add object into Model and return StringView Directly*/
	@RequestMapping("registerPage")
	public String showRegistrationPage() {
		return "userRegister";
	}
	
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String RegisterUser(@ModelAttribute("user") user user1,ModelMap model) {
		model.addAttribute("user",user1);
			return "successPage";
	}
	
	
	
	
	
	
	
	
	
}
