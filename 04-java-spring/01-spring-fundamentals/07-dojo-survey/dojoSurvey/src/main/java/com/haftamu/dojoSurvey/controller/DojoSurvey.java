package com.haftamu.dojoSurvey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurvey {
	

	

	
	@RequestMapping(value="/new", method=RequestMethod.POST)
	private String survey(@RequestParam(value="name") String name, @RequestParam(value="comment") String comment,
			@RequestParam(value="location") String location, @RequestParam(value="language") String language, Model model) {
		
		model.addAttribute("yourname", name);
		model.addAttribute("comment", comment);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		
		return "survey.jsp";
		
	}
	
	@RequestMapping("/")
	private String result() {
		
		return "index.jsp";
	}
	
	
}
