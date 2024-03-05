package com.runch.HelloSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	// Xây dựng action 
	@GetMapping("/")
	public String trangChu() {
		return "index";
	}
}
