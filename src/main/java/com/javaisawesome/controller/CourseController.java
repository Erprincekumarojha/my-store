package com.javaisawesome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
	
	
	@GetMapping("/premiumcourse")
	public String premiumCoursePage(Model model) {
	
		 return "premiumcourse";
	}
	
	
	
	@GetMapping("/javacourse")
	public String javacoursepage(Model model) {
	
		 return "javacourse";
	}
	
	

	@GetMapping("/springbootcourse")
	public String springbootcoursepage(Model model) {
	
		 return "springbootcourse";
	}
	
	

	@GetMapping("/html5course")
	public String html5coursepage(Model model) {
	
		 return "html5course";
	}

}
