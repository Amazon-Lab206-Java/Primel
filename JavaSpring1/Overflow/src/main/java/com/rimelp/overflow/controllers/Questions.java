package com.rimelp.overflow.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomCollectionEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rimelp.overflow.models.Answer;
import com.rimelp.overflow.models.Question;
import com.rimelp.overflow.models.Tag;
import com.rimelp.overflow.services.QuestionService;
import com.rimelp.overflow.services.TagService;

@Controller
public class Questions {

	private final QuestionService qService;
	private final TagService tagService;
	
	public Questions(QuestionService qService, TagService tagService) {
		this.qService = qService;
		this.tagService = tagService;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(List.class, "tags", new CustomCollectionEditor(List.class) {                
	                  
	        public void setAsText(String element) {
	        	// information coming from the form
	        	String[] listOfTagString = element.split(", ");
	        	List<Tag> listOfTags = new ArrayList<Tag>();
	        	
	        	int maxLength = listOfTagString.length > 2 ? 3 : listOfTagString.length;
	        	
	        	for(int i = 0; i < maxLength; i++) {
	        		listOfTags.add(tagService.addTag(listOfTagString[i]));
	        	}
	        	
	        	// set the value of the element to be a list of tags
	        	setValue(listOfTags);
	        }
        }); 
	}
	
	@RequestMapping("/questions")
	public String questions(Model model) {
		model.addAttribute("questions", qService.getQs());
		return "dashboard.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String newQ(@ModelAttribute("newQuestion") Question question) {
		return "newQuestion.jsp";
	}
	
	@PostMapping("/questions/new")
	public String createQ(@Valid @ModelAttribute("newQuestion") Question question, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "newQuestion.jsp";
		}
		else {
			qService.createQ(question);
			String qId = Long.toString(question.getId());
			return "redirect:/questions/".concat(qId);
		}
		
	}
	
	@RequestMapping("/questions/{id}")
	public String qInfo(@PathVariable("id") Long id, @ModelAttribute("newAnswer") Answer answer, Model model) {
		model.addAttribute("question", qService.getQ(id));
		return "questionInfo.jsp";
	}
	
}
