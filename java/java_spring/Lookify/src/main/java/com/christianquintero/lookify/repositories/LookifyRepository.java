package com.christianquintero.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christianquintero.lookify.models.Lookify;

@Repository
public interface LookifyRepository extends CrudRepository<Lookify, Long> {
	// this method retrieves all the songs from the database
	List<Lookify> findAll();
	
	
	// this method finds songs with titles containing the search string
	List<Lookify> findByArtistContaining(String search);
	
	
	// this method counts how many titles contain a certain string
	Long countByTitleContaining(String search);
	
	
	// this method deletes a language that starts with a specific title
	void deleteByTitleStartingWith(String search);
	
	
	// Orders all songs by their rating
	List<Lookify> findByOrderByRatingDesc();
}