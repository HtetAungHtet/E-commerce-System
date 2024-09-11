package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/","/index"})
	public String home() {
		return "index";
	}
	
	@GetMapping("/base")
	public String base() {
		return "base";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/products")
	public String product() {
		return "product";
	}
	
	@GetMapping("/dashboard")
	public String adminDashboard() {
		return "admin/dashboard";
	}
	
	@GetMapping("/forgot_password")
	public String forgotPassoward() {
		return "forgot_password";
	}

}
