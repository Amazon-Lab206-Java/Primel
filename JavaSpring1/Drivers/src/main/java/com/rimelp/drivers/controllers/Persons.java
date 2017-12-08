package com.rimelp.drivers.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimelp.drivers.models.Person;
import com.rimelp.drivers.services.DriverService;

@Controller
public class Persons {
	private final DriverService driverService;
	
	public Persons(DriverService driverService) {
		this.driverService = driverService;
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "newPerson.jsp";
	}
	
	@PostMapping("/persons/new")
	public String addPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		driverService.createPerson(person);
		return "redirect:/licenses/new";
	}
	
	@RequestMapping("/persons/{id}")
	public String personInfo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("person", driverService.getPerson(id));
		return "personInfo.jsp";
	}
}
