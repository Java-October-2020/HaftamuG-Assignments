package com.haftamu.ninjaGold.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.haftamu.ninjaGold.models.*;

@Controller
public class MainController {
	@RequestMapping("/Gold")
	public String gold(HttpSession session, Model model) {
		if(session.getAttribute("totalGold")==null) {
			session.setAttribute("totalGold", 0);
		}
		
		Building farm = new Building("farm",10,20,false);
		Building cave = new Building("cave",5,10,false);
		Building house = new Building("house",2,5,false);
		Building casino = new Building("casino",-50,50,false);
		
		Building[] mybuildings = new Building[] {farm,cave,house,casino};
		for(Building build: mybuildings) {
			System.out.println(build.getName());
			
		}
		
		model.addAttribute("totalGold", session.getAttribute("totalGold"));
		return "index.jsp";
	}

	
	@RequestMapping(path="/getGold",  method=RequestMethod.POST)
	public String getGold(@RequestParam(value="building") String building, HttpSession session) {
		
		Random ran = new Random();
		int gold = (int)session.getAttribute("totalGold");
		int goldThisTurn = 0;
		if(building.equals("farm")) {
			goldThisTurn = ran.nextInt(20-10) + 10;
			
		}
		else if(building.equals("cave")) {
			goldThisTurn = ran.nextInt(10-5) + 5;
			
		}
		
		else if(building.equals("house")) {
			goldThisTurn = ran.nextInt(5-2) + 2;
			
		}else {
			goldThisTurn = ran.nextInt(50-1) + 1;
			if(ran.nextBoolean()) {
				goldThisTurn = goldThisTurn*-1;
			}
		}
		
		session.setAttribute("totalGold", gold+= goldThisTurn);
		
		return "redirect:/Gold";
	}
	
}
