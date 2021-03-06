package com.rimelp.drivers.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimelp.drivers.models.License;
import com.rimelp.drivers.services.DriverService;

@Controller
public class Licenses {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	private final DriverService driverService;
	
	public Licenses(DriverService driverService) {
		this.driverService = driverService;
	}
	
	@RequestMapping("/licenses/new")
	public String newLicense(@ModelAttribute License license, Model model) {
		model.addAttribute("persons", driverService.allPersons());
		return "newLicense.jsp";
	}
	
	@PostMapping("/licenses/new")
	public String addLicense(@Valid @ModelAttribute License license, BindingResult result, Model model) {
		License newLicense = driverService.createLicense(license);
		String personId = Long.toString(newLicense.getPerson().getId());
		return "redirect:/persons/".concat(personId);
	}
	
}
