package com.rimelp.overflow.services;

import org.springframework.stereotype.Service;

import com.rimelp.overflow.models.Answer;
import com.rimelp.overflow.repositories.AnswerRepository;

@Service
public class AnswerService {

	private final AnswerRepository answerRepo;
	
	public AnswerService(AnswerRepository answerRepo) {
		this.answerRepo = answerRepo;
	}
	
	public Answer addAnswer(Answer answer) {
		return answerRepo.save(answer);
	}
}
