package com.christianquintero.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.christianquintero.languages.models.Language;
import com.christianquintero.languages.services.LanguageService;

public class LanguagesApi {
	private final LanguageService languageService;
	
	public LanguagesApi(LanguageService languageService) {
		this.languageService = languageService;
	}
	
    @RequestMapping("/api/languages")
    public List<Language> index() {
        return languageService.allLanguages();
    }
    
    @RequestMapping(value="/api/languages", method=RequestMethod.POST)
    public Language create(@RequestParam(value="name") String name, @RequestParam(value="creator") String creator, @RequestParam(value="currentVersion") String currentVersion) {
    	Language language = new Language(name, creator, currentVersion);
        return languageService.createLanguage(language);
    }
    
    @RequestMapping("/api/languages/{id}")
    public Language show(@PathVariable("id") Long id) {
    	Language language = languageService.findLanguage(id);
        return language;
    }
    
    @RequestMapping("/api/languages/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
    	languageService.deleteLanguage(id);
    	return "redirect:/api/languages";
    }
    
//    @RequestMapping("/api/languages/{id}/update")
//    public String update(@PathVariable("id") Long id) {
//    	languageService.updateLanguage(2, "Harry Potter", "A wizard boy saves the world", "English", 530);
//    	return "redirect:/api/books";
//    }
}
