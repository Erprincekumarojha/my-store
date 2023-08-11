package com.javaisawesome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaisawesome.entity.User;
import com.javaisawesome.service.WelcomeService;
import com.javaisawesome.util.LoginRequest;

@Controller
public class WelcomeController {
	
	
	@Autowired
	private WelcomeService welcomeService;

	@PostMapping("/welcome")
	public String welcome(@ModelAttribute LoginRequest loginRequest, Model model) {
		
		User user = welcomeService.getUser(loginRequest);
		if(user==null) {
			model.addAttribute("errorMessage", "Sorry Please Enter Correct UserId & Password");
			return "error";
		}
		System.out.println("Welcome to main page");
		System.out.println(loginRequest.toString());
		return "welcome";
	}

}
