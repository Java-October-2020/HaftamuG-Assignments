package com.haftamu.counter.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CounterController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String welcom() {
		
		return "welcome.jsp";
	}

	
	@GetMapping("/counter")
	public String counter(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("counter");
		if(currentCount == null) {
	            session.setAttribute("counter", 0);
	        }
	        	currentCount++;
	        	session.setAttribute("counter", currentCount);
	        	model.addAttribute("counter", currentCount);
		
		return "counter.jsp";
	}
	
	
}
