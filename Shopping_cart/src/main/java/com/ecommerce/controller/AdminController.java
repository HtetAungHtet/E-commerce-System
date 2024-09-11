package com.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@GetMapping("/add_product")
	public String loadAddProduct() {
		return "admin/add_product";
	}
	
	@GetMapping("/category")
	public String category() {
		return "admin/category";
	}
	
	@GetMapping("/add_admin")
	public String loadAdminAdd() {
		return "admin/add_admin";
	}
}
