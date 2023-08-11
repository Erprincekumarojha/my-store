package com.javaisawesome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaisawesome.entity.User;
import com.javaisawesome.service.RegisterService;
import com.javaisawesome.util.LoginRequest;

@Controller
public class RegisterController {
		
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/register")
	public String getRegisterPage(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute User user, Model model) {
		 user = registerService.saveUser(user);
		if(user==null) {
			model.addAttribute("errorMessage", " UserId already exist in Database, please give some other name");
			return "error";
		}
		model.addAttribute("loginRequest", new LoginRequest());
		model.addAttribute("succss", " User registration successfully done..");
		return "login";
	}
	
	@GetMapping("/forgetPassword")
	public String forgetPassword(Model model) {
		return "forgetPassword";	
	}

}
