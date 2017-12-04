package com.rimelp.grouplanguages.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.grouplanguages.models.Language;

@Service
public class LanguageService {
	List<Language> languages = new ArrayList<Language>(Arrays.asList());
	
	public List<Language> allLanguages() {
		return languages;
	    }
	
	public Language findLangByIndex(int index) {
    	if (index < languages.size()) {
    		return languages.get(index);
    	}
    	else {
    		return null;
    	}
    }
    
    public void addLang(Language language) {
    	languages.add(language);
    }
    
    public void updateLang(int id, Language language) {
    	if (id < languages.size()) {
    		languages.set(id, language);
    	}
    }
    
    public void deleteLang(int id) {
    	if (id < languages.size()) {
    		languages.remove(id);
    	}
    }
}
