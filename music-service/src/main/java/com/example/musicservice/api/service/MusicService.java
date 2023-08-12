package com.example.musicservice.api.service;

import com.example.musicservice.domain.model.Music;
import com.example.musicservice.domain.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

	@Autowired
	private MusicRepository repository;

	public List<Music> findByGenre(String genre) {
		return repository.findByGenre(genre);
	}

	public Music save(Music musica) {
		return repository.save(musica);
	}
}
