package com.christianquintero.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.christianquintero.lookify.models.Lookify;
import com.christianquintero.lookify.services.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService lookifyService;
	
	public LookifyController(LookifyService lookifyService) {
		this.lookifyService = lookifyService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model, @ModelAttribute("songObj") Lookify song) {
		List<Lookify> songs = lookifyService.allSongs();
		model.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("songObj") Lookify song) {
		return "new.jsp";
	}
	
	@PostMapping("/songs/create")
	public String create(@Valid @ModelAttribute("songObj") Lookify song, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "new.jsp";
		} else {
			lookifyService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/songs/{id}")
	public String show(@PathVariable("id") Long song_id, Model model) {
		Lookify song = lookifyService.findSong(song_id);
		model.addAttribute("song", song);
		return "song.jsp";
	}
	
	@RequestMapping("/songs/edit/{id}")
	public String edit(@PathVariable("id") Long song_id, Model model, @ModelAttribute("songObj") Lookify song, BindingResult results) {
		// Used to get the song information in order to pre-populate the edit form
		Lookify one_song = lookifyService.findSong(song_id);
		model.addAttribute("song", one_song);
		return "edit.jsp";
	}
	
	@PutMapping("/songs/update/{id}")
	public String update(@PathVariable("id") Long song_id, @Valid @ModelAttribute("songObj") Lookify song, BindingResult results) {
		if(results.hasErrors()) {
			return "edit.jsp";
		} else {
			lookifyService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping("/songs/delete/{id}")
	public String delete(@PathVariable("id") Long song_id) {
		lookifyService.deleteSong(song_id);
		return "redirect:/dashboard";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Model model, @RequestParam(value="artist", required = false) String searchQuery) {
		System.out.println(searchQuery);
		List<Lookify> allSongs = lookifyService.allSongsByArtist(searchQuery);
		model.addAttribute("artist", searchQuery);
		model.addAttribute("songs", allSongs);
		return "search.jsp";
	}
	
	@RequestMapping("/songs/topTen")
	public String topTen(Model model) {
		List<Lookify> topTen = lookifyService.topSongs();
		model.addAttribute("topSongs", topTen);
		return "top_songs.jsp";
	}
}
