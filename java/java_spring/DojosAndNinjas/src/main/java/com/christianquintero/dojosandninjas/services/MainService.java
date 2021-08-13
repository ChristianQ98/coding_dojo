package com.christianquintero.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christianquintero.dojosandninjas.models.Dojo;
import com.christianquintero.dojosandninjas.models.Ninja;
import com.christianquintero.dojosandninjas.repositories.DojoRepository;
import com.christianquintero.dojosandninjas.repositories.NinjaRepository;

@Service
public class MainService {
	@Autowired
	private NinjaRepository ninjaRepo;
	
	@Autowired
	private DojoRepository dojoRepo;
	
	// Save dojo
	public Dojo saveDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
	// Returns all ninjas
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
	
	// Returns all dojos
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}
	
	// Save ninja
	public Ninja saveNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepo.findById(id);
		if(dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
	
//	public Ninja findNinja(Long id) {
//		Optional<Ninja> ninja = ninjaRepo.findById(id);
//		if(ninja.isPresent()) {
//			return ninja.get();
//		} else {
//			return null;
//		}
//	}
	
	//
	public List<Ninja> getNinjasFromDojo(Long id) {
		return ninjaRepo.findByIdEquals(id);
	}
	
}
