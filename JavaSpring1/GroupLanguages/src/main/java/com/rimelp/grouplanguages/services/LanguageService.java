package com.rimelp.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.grouplanguages.models.Language;
import com.rimelp.grouplanguages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository languageRepository;
	List<Language> languages = new ArrayList<Language>(Arrays.asList());
	
	public List<Language> allLanguages() {
		return (List<Language>) languageRepository.findAll();
	    }
	
	public Language findLangById(Long index) {
    	return languageRepository.findOne(index);
    }
    
    public void addLang(Language language) {
    	languageRepository.save(language);
    }
    
    public void updateLang(Language language) {
    	languageRepository.save(language);
    }
    
    public void deleteLang(Long id) {
    	languageRepository.delete(id);
    }
    
    public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
}
