package com.haftamu.displayDate.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class displayDateController {

	
	@RequestMapping(value="/", method=RequestMethod.GET)
	private String displayTemplate() {
		
		return "template.jsp";
		
	}
	
	
	
	@RequestMapping(value="/date",method=RequestMethod.GET)
	private String displayDate(Model viewModel) {
		SimpleDateFormat formatter = new SimpleDateFormat("E, dd MMM, yyyy");  
		String strDate = formatter.format(new Date());  
        viewModel.addAttribute("date", strDate);
		return "date.jsp";
		
	}
	
	@RequestMapping(value="/time",method=RequestMethod.GET)
	private String displayTime(Model viewModel) {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		 viewModel.addAttribute("time", dateFormat.format(new Date()));
		return "time.jsp";
		
	
}

}