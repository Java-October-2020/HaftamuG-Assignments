package com.haftamu.theCode.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class TheCode {
	
	
	
	@RequestMapping(path="/")
	private String code() {
	
		return "code.jsp";
	}

	
	@RequestMapping(path="/code", method=RequestMethod.POST)
	public String codeResult(@RequestParam(value="code") String code,Model model, RedirectAttributes redirectAttributes) {
	           if(code.equalsIgnoreCase("bushido")) {
	        	   model.addAttribute("code", code);
	        	   return "result.jsp";
	           }else {
	        	   redirectAttributes.addFlashAttribute("error", "You must train harder!");
	        	   return "redirect:/";
	           }
			
	
	}
	
	

}
