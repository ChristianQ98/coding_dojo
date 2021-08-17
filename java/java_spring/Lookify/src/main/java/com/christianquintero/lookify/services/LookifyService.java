package com.christianquintero.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.christianquintero.lookify.models.Lookify;
import com.christianquintero.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	private final LookifyRepository lookifyRepo;
	
	public LookifyService(LookifyRepository lookifyRepo) {
		this.lookifyRepo = lookifyRepo;
	}
	
	// Returns all the songs
	public List<Lookify> allSongs() {
		return (List<Lookify>) lookifyRepo.findAll();
	}
	
	// Add a song
	public Lookify createSong(Lookify song) {
		return lookifyRepo.save(song);
	}
	
	// Retrieves a song
	public Lookify findSong(Long id) {
		Optional<Lookify> song = lookifyRepo.findById(id);
		if(song.isPresent()) {
			return song.get();
		} else {
			return null;
		}
	}
	
	// Deletes a song
	public void deleteSong(Long id) {
		lookifyRepo.deleteById(id);
	}
	
	// Updates a song
	public Lookify updateSong(Long id, String title, String artist, int rating) {
		Lookify song = lookifyRepo.findById(id).get();
		song.setTitle(title);
		song.setArtist(artist);
		song.setRating(rating);
		lookifyRepo.save(song);
		return song;
	}
	
	// Search for artist
	public List<Lookify> allSongsByArtist(String search) {
		return (List<Lookify>) lookifyRepo.findByArtistContaining(search);
	}
	
	// Orders all the songs in the database by their rating
	public List<Lookify> topSongs() {
		return (List<Lookify>) lookifyRepo.findByOrderByRatingDesc();
	}
}
