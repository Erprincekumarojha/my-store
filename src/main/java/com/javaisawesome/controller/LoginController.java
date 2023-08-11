package com.javaisawesome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaisawesome.util.LoginRequest;

@Controller
public class LoginController {
	
	
	@RequestMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("loginRequest", new LoginRequest());
		return "login";
	}

}
