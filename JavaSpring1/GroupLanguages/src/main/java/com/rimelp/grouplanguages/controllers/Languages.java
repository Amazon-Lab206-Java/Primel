package com.rimelp.grouplanguages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimelp.grouplanguages.models.Language;
import com.rimelp.grouplanguages.services.LanguageService;

@Controller
public class Languages {
	private final LanguageService languageService;
	
	public Languages(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String languages(@ModelAttribute("language") Language language, Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "languages.jsp";
	}
	
	@RequestMapping("/languages/{index}")
	public String findLangById(Model model, @PathVariable("index") Long index) {
		model.addAttribute("language", languageService.findLangById(index));
		return "showLang.jsp";
	}
	
	@PostMapping("/languages")
	public String addLang(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "languages.jsp";
		}
		else {
			languageService.addLang(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("languages/edit/{id}")
	public String editLang(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLangById(id);
		if(language != null) {
			model.addAttribute("language", language);
			return "editLang.jsp";
		}
		else {
			return "redirect:/languages";
		}
	}
	
	@PostMapping("/languages/edit/{id}")
	public String updateLang(@PathVariable("id") Long id, @Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "editLang.jsp";
		}
		else {
			languageService.updateLang(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String deleteLang(@PathVariable("id") Long id) {
		languageService.deleteLang(id);
		return "redirect:/languages";
	}
	
}
