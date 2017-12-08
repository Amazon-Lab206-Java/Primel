package com.rimelp.lookify.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rimelp.lookify.models.Song;
import com.rimelp.lookify.repositories.SongRepository;

@Service
public class SongService {
	private SongRepository songRepository;
	List<Song> songs = new ArrayList<Song>(Arrays.asList());
	
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	public List<Song> allSongs(){
		return songRepository.findAll();
	}
	
	public Song findById(Long id) {
		return songRepository.findOne(id);
	}
	
	public List<Song> findByArtist(String artist){
		return songRepository.findByArtistContaining(artist);
	}
	
	public List<Song> findTopTen(){
		return songRepository.findTop10ByOrderByRatingDesc();
	}
	
	public void addSong(Song song) {
		songRepository.save(song);
	}
	public void deleteSong(Long id) {
		songRepository.delete(id);
	}
}

