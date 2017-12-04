package com.rimelp.learningplatform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0483/{assignNum}")
	public String assignments(Model model,
			@PathVariable("assignNum") String assignment
			) {
		if(assignment.equals("0345")) {
			model.addAttribute("content", "The goal of this assignment is to learn about coding forms");
		}
		else {
			model.addAttribute("content", "The goal of this assignment is to learn about Fortran to Binary");
		}
		return "assign.jsp";
	}
	
	@RequestMapping("/m/{chapter}/0553/{lessonNum}")
	public String lessons(Model model,
			@PathVariable("lessonNum") String lesson
			) {
		if(lesson.equals("0733")) {
			model.addAttribute("content", "Fortran Setting up your servers placeholder");
		}
		else if(lesson.equals("0342")){
			model.addAttribute("content", "Fortran Punch Cards placeholder");
		}
		else {
			model.addAttribute("content", "Advanced Fortran Intro placeholder");
		}
		return "lesson.jsp";
	}
}
