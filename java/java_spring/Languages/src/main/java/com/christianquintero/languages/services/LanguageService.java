package com.christianquintero.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.christianquintero.languages.models.Language;
import com.christianquintero.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepo;
	
	public LanguageService(LanguageRepository languageRepo) {
		this.languageRepo = languageRepo;
	}
	
	// Returns all the languages
	public List<Language> allLanguages() {
		return (List<Language>) languageRepo.findAll();
	}
	
	// Add a language
	public Language createLanguage(Language lang) {
		return languageRepo.save(lang);
	}
	
	// Retrieves a language
	public Language findLanguage(Long id) {
		Optional<Language> language = languageRepo.findById(id);
		if(language.isPresent()) {
			return language.get();
		} else {
			return null;
		}
	}
	
	// Deletes a language
	public void deleteLanguage(Long id) {
		languageRepo.deleteById(id);
	}
	// Updates a language
	public Language updateLanguage(Long id, String name, String creator, String currentVersion) {
		Language language = languageRepo.findById(id).get();
		language.setName(name);
		language.setCreator(creator);
		language.setCurrentVersion(currentVersion);
		languageRepo.save(language);
		return language;
	}
}
