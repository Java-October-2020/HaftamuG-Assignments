package com.haftamu.hellohuman.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

		@Controller
		public class HumanController {

		@RequestMapping(value="/", method=RequestMethod.GET)
		private String home() {
			return "human.jsp";
		}
		@RequestMapping(value="/{name}", method=RequestMethod.GET)
	  private String color(@PathVariable("name") String name, Model viewModel) {
			viewModel.addAttribute("myname", name);
			return "name.jsp";
		  
	  }
	}

	
