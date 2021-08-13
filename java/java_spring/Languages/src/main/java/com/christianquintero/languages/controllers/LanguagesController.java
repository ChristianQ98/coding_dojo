package com.christianquintero.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.christianquintero.languages.models.Language;
import com.christianquintero.languages.services.LanguageService;

@Controller
public class LanguagesController {
	private final LanguageService languageService;
		
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("languageObj") Language language) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@PostMapping("/languages/create")
	public String createLanguage(@Valid @ModelAttribute ("languageObj") Language language, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Language> languages = languageService.allLanguages();
			model.addAttribute("languages", languages);
			return "index.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping("/languages/{id}")
	public String showLanguage(@PathVariable("id") Long language_id, Model model) {
		Language oneLanguage = languageService.findLanguage(language_id);
		model.addAttribute("language", oneLanguage);
		return "language.jsp";
	}
	
	@RequestMapping("/languages/edit/{id}")
	public String editLanguage(@PathVariable("id") Long language_id, Model model, @ModelAttribute ("languageObj") Language languages) {
		Language language = languageService.findLanguage(language_id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}
	
	@RequestMapping("/languages/update/{id}")
	public String updateLanguage(@PathVariable("id") Long language_id,
			@RequestParam("name") String name,
			@RequestParam("creator") String creator,
			@RequestParam("currentVersion") String currentVersion
		) {
		languageService.updateLanguage(language_id, name, creator, currentVersion);
		return "redirect:/languages";
	}
	
	@RequestMapping("/languages/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long language_id) {
		languageService.deleteLanguage(language_id);
		return "redirect:/languages";
	}
}
