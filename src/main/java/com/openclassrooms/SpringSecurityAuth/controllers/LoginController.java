package com.openclassrooms.SpringSecurityAuth.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@GetMapping("/user")
	public String getUser() {
		
		return "Welcome, user";
		
	}
	
	@GetMapping("/admin")
	public String getAdmin() {
		
		return "Welcome, admin";
		
	}
	
	@GetMapping("/")
	public String getGithub() {
		
		return "Welcome, Github user";
		
	}
	
	
}
