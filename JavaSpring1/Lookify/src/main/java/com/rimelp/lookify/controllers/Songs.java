package com.rimelp.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rimelp.lookify.models.Song;
import com.rimelp.lookify.services.SongService;

@Controller
public class Songs {
	
	private final SongService songService;
	
	public Songs(SongService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "Dashboard.jsp";
	}
	
	@RequestMapping(path="/search", method=RequestMethod.POST)
	public String search(@RequestParam(value="artist") String artist) {
		return "redirect:/search/".concat(artist);
	}
	
	@RequestMapping("/search/{artist}")
	public String searchResults(Model model, @PathVariable("artist") String artist) {
		model.addAttribute("artist", artist);
		model.addAttribute("byArtist", songService.findByArtist(artist));
		return "searchResults.jsp";
	}
	
	@RequestMapping("/search/topTen")
	public String topTen(Model model) {
		model.addAttribute("topTen", songService.findTopTen());
		return "top10.jsp";
	}
	
	@RequestMapping("/songs/{id}")
	public String songInfo(Model model, @PathVariable("id") Long id) {
		model.addAttribute("song", songService.findById(id));
		return "songInfo.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong(@ModelAttribute("song") Song song) {
		return "newSong.jsp";
	}
	
	@PostMapping("/songs/new")
	public String addSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if (result.hasErrors()) {
			return "newSong.jsp";
		}
		else {
			songService.addSong(song);
			return "redirect:/dashboard";
		}
	}
	
	@RequestMapping(value="/songs/delete/{id}")
	public String deleteSong(@PathVariable("id") Long id) {
		songService.deleteSong(id);
		return "redirect:/dashboard";
	}
}
