package com.haftamu.strings;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class StringRouting {
	
	

		public static void main(String[] args) {
			SpringApplication.run(StringRouting.class, args);
		}

		@RequestMapping(value = "/", method=RequestMethod.GET)
		public String hello() {
			return "Welcome!";
	}
		@RequestMapping(value = "/random", method=RequestMethod.GET)
		public String random() {
			return "Spring Boot is so cool!";
	}
}
