package com.rimelp.overflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.overflow.models.Question;
import com.rimelp.overflow.repositories.QuestionRepository;

@Service
public class QuestionService {

	private final QuestionRepository qRepo;
	
	public QuestionService(QuestionRepository qRepo) {
		this.qRepo = qRepo;
	}
	
	public List<Question> getQs(){
		return qRepo.findAll();
	}
	
	public Question createQ(Question q) {
		return qRepo.save(q);
	}
	
	public Question getQ(Long id) {
		return qRepo.findOne(id);
	}
	
}
