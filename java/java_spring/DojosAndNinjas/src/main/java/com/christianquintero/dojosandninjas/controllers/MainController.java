package com.christianquintero.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.christianquintero.dojosandninjas.models.Dojo;
import com.christianquintero.dojosandninjas.models.Ninja;
import com.christianquintero.dojosandninjas.services.MainService;

@Controller
public class MainController {
	@Autowired
	private MainService mainServ;
	
	// Displays form to add a dojo
	@RequestMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("dojoObj") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	// Processes form and sends dojo information to the DB
	@PostMapping("/dojos/create")
	public String createDojo(@Valid @ModelAttribute("dojoObj") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		} else {
			mainServ.saveDojo(dojo);
			return "redirect:/dojos/new";			
		}
	}
	
	// Displays form to add a ninja
	@RequestMapping("/ninjas/new")
	public String newNinja(@Valid @ModelAttribute("ninjaObj") Ninja ninja, Model model) {
		List<Dojo> dojos = mainServ.allDojos();
		model.addAttribute("dojos", dojos);
		return "newNinja.jsp";
	}
	
	// Processes form and sends ninja information to the DB
	@PostMapping("/ninjas/create")
	public String createNinja(@Valid @ModelAttribute("ninjaObj") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/ninjas/new";
		} else {
			mainServ.saveNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	
	// Shows information of one dojo
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = mainServ.findDojo(id);
		model.addAttribute("dojo", dojo);
		List<Ninja> ninjas = mainServ.findDojo(id).getNinjas();
		model.addAttribute("ninjas", ninjas);
		return "showDojo.jsp";
	}
}
