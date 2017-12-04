package com.rimelp.ninjagold.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Main {
	@RequestMapping("/")
	public String index(HttpSession session) {
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<String> log = (ArrayList<String>) session.getAttribute("log");
		if(gold == null) {
			gold = 0;
			session.setAttribute("gold", gold);
		}
		if(log == null) {
			ArrayList<String> logs = new ArrayList<String>();
			session.setAttribute("log", logs);
		}
		return "index.jsp";
	}
	
	@RequestMapping(path="/", method=RequestMethod.POST)
	public String process(HttpSession session, @RequestParam(value="building") String building ) {
		Integer gold = (Integer) session.getAttribute("gold");
		ArrayList<String> log = (ArrayList<String>) session.getAttribute("log");
		Date date = new java.util.Date();
		Random rand = new Random();
		System.out.println(building);
		if(building.equals("farm") ) {
			Integer farmgold = rand.nextInt(11) + 10;
			gold += farmgold;
			log.add(0, "You earned " + farmgold + " gold from the farm! (" + date + ")");
		}
		else if(building.equals("cave")) {
			Integer cavegold = rand.nextInt(6) + 5;
			gold += cavegold;
			log.add(0, "You earned " + cavegold + " gold from the cave! (" + date + ")");
		}
		else if(building.equals("house")) {
			Integer housegold = rand.nextInt(4) + 2;
			gold += housegold;
			log.add(0, "You earned " + housegold + " gold from the house! (" + date + ")");
		}
		else {
			Integer winlose = rand.nextInt(2) ;
			Integer casinogold = rand.nextInt(51);
			if(winlose == 1) {
				gold -= casinogold;
				log.add(0, "You lost " + casinogold + " gold at the casino! (" + date + ")");
			}
			else {
				gold += casinogold;
				log.add(0, "You earned " + casinogold + " gold at the casino! (" + date + ")");
			}
		}
		session.setAttribute("gold", gold);
		session.setAttribute("log", log);
		return "redirect:/";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
}
