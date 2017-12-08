package com.rimelp.dojoninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimelp.dojoninjas.models.Ninja;
import com.rimelp.dojoninjas.services.DojoService;

@Controller
public class Ninjas {

	private final DojoService dojoService;
	
	public Ninjas(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		Ninja newNinja = dojoService.createNinja(ninja);
		String dojoId = Long.toString(newNinja.getDojo().getId());
		return "redirect:/dojos/".concat(dojoId);
	}
}
