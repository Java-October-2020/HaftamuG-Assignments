package com.haftamu.strings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

			@RequestMapping(value="/", method=RequestMethod.GET)
			private String index() {
				return "Hello client how are you doing?";
			}
			@RequestMapping(value="/random", method=RequestMethod.GET)
		  private String color() {
				return "Spring Boot is great! So easy to just respond with strings.";
			  
		  }
		}
