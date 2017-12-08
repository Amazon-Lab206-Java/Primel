package com.rimelp.overflow.services;

import org.springframework.stereotype.Service;

import com.rimelp.overflow.models.Tag;
import com.rimelp.overflow.repositories.TagRepository;

@Service
public class TagService {

	private final TagRepository tagRepo;
	
	public TagService(TagRepository tagRepo) {
		this.tagRepo = tagRepo;
	}
	
	public Tag addTag(String subj) {
		Tag tagByName = tagRepo.findBySubject(subj);
		if(tagByName == null) {
			Tag tag = new Tag();
			tag.setSubject(subj);
			return tagRepo.save(tag);
		}
		else {
			return tagByName;
		}
		
	}
}
