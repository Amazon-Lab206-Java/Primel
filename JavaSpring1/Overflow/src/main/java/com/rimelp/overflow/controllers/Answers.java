package com.rimelp.overflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rimelp.overflow.models.Answer;
import com.rimelp.overflow.services.AnswerService;

@Controller
public class Answers {

	private final AnswerService answerService;
	
	public Answers(AnswerService answerService) {
		this.answerService = answerService;
	}
	
	@PostMapping("/answers/add")
	public String addAnswer(@Valid @ModelAttribute("newAnswer") Answer answer, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("question", answer.getQuestion());
			return "questionInfo.jsp";
		}
		else {
			answerService.addAnswer(answer);
			String qId = Long.toString(answer.getQuestion().getId());
			
			return "redirect:/questions/".concat(qId);
		}
	}
}
