package com.rimelp.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Main {
	@RequestMapping("/")
	public String index(@ModelAttribute("errors") String errors) {
		return "index.jsp";
	}
	
	@RequestMapping("/trycode")
	public String trycode(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes ) {
		if(code.equals("bushido")) {
			return "theCode.jsp";
		}
		else {
			redirectAttributes.addFlashAttribute("errors", "You must train harder!");
			return "redirect:/";
		}
	}
}
