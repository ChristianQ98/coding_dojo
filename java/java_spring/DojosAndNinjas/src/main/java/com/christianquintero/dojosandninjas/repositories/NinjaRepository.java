package com.christianquintero.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christianquintero.dojosandninjas.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	// Retrieves all ninjas
	List<Ninja> findAll();
	
	List<Ninja> findByIdEquals(Long id);
}
