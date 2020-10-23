package com.haftamu.routing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DojoController {

	
	
	@RequestMapping("/{dojo}")
	private String TheDojo(@PathVariable("dojo") String dojo, Model model) {
		model.addAttribute("dojo", dojo);
		return "dojo.jsp";
		
	}
	@RequestMapping("/dojo/{burbank}")
	private String Burbank(@PathVariable("burbank") String burbank, Model model) {
		
		if(burbank.equalsIgnoreCase("burbank")) {
			model.addAttribute("bank", "Burbank Dojo is located in Southern California");
		}else if(burbank.equalsIgnoreCase("san-jose")){
			model.addAttribute("bank", "SJ dojo is the headquarters");
		}else {
			model.addAttribute("bank", "You enter wrong input");
		}
		
		return "burbank.jsp";
		
	}

}
