package com.rimelp.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeCtrl {
	@RequestMapping 
	public String index(@RequestParam(value="name", defaultValue = "Human") String name, Model model) {
		model.addAttribute("name", name);
		return "index.jsp";
	}

}
