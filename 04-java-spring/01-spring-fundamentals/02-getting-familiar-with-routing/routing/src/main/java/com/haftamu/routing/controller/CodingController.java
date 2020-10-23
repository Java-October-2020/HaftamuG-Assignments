package com.haftamu.routing.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

	@RequestMapping("")
	private String CodingDojo(Model model) {
		return "Hello Coding Dojo";
		
	}
	
	@RequestMapping("/python")
	private String Python() {
		return "Python/Django was awesome!";
		
	}
	
	
	@RequestMapping("/java")
	private String Java() {
		return "java/Spring is better!";
	}
	
	
	
	
}
