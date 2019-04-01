package com.kamal.SpringMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kamal.SpringMvc.dto.Employee;

@Controller
public class ObjectController {

	
	@RequestMapping("/readObject")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("readObject");
		/* adding object to the controller*/
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Kamal");
		emp.setSalary(100000);
		modelAndView.addObject("employee",emp);
		return modelAndView;
		
	}
}
