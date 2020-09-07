package com.intro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeController {
	@GetMapping("/")
	public String welcome() {
		System.out.println("hi");
		return "welcome";
	}
}
