package com.christianquintero.dojosurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DojoSurvey {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submit(@RequestParam(value="name") String name, @RequestParam(value="dojo_location") String dojo_location,
			@RequestParam(value="favorite_language") String favorite_language, @RequestParam(value="comment") String comment, 
			Model model, RedirectAttributes redirect) {
		model.addAttribute("name", name);
		model.addAttribute("dojo_location", dojo_location);
		model.addAttribute("favorite_language", favorite_language);
		model.addAttribute("comment", comment);
		
		redirect.addFlashAttribute("name", name);
		redirect.addFlashAttribute("dojo_location", dojo_location);
		redirect.addFlashAttribute("favorite_language", favorite_language);
		redirect.addFlashAttribute("comment", comment);
		return "redirect:/result";
	}
	
	@RequestMapping("/result")
	public String result() {
		return "result.jsp";
	}
}
