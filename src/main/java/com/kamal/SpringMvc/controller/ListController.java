package com.kamal.SpringMvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kamal.SpringMvc.dto.Employee;

@Controller
public class ListController {

	
	@RequestMapping("/listObject")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("listObject");
		/* adding object to the controller*/
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("Kamal");
		emp.setSalary(100000);
		
		Employee emp1=new Employee();
		emp1.setId(1);
		emp1.setName("Pramod");
		emp1.setSalary(200000);
		
		Employee emp2=new Employee();
		emp2.setId(1);
		emp2.setName("Rajput");
		emp2.setSalary(300000);
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		modelAndView.addObject("employees",list);
		return modelAndView;
		
	}
}
