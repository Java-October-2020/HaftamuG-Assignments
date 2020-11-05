package com.haftamu.language.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haftamu.language.models.Language;
import com.haftamu.language.repositories.LanguageRepositories;

@Service
public class LanguageService{
	
	@Autowired
	private  LanguageRepositories lRepo;
	    
	
	public List<Language> allLangs(){
		return lRepo.findAll();
	}
	
	public Language findLanguage(Long id) {
		Language language = lRepo.findById(id).orElse(null);
			return language;
	}
	
	public Language createLang(Language lang) {
		return lRepo.save(lang);
	}
	
	public Language update(Language lang) {
		return lRepo.save(lang);
	}
	
	public void deleteLang(long id) {
		lRepo.deleteById(id);
	}
}