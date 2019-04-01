package com.kamal.SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		/* adding data which can be fetched using request object in jsp  and also using Jsp expression lnggs*/
		modelAndView.addObject("id",101);
		modelAndView.addObject("name","kamal");
		modelAndView.addObject("Salary","nahi Bataunga");
		return modelAndView;
		
	}

}
