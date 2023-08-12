package com.example.musicservice.domain.data;

import com.example.musicservice.domain.model.Music;
import com.example.musicservice.domain.repository.MusicRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

	private MusicRepository repository;

	public DataLoader (MusicRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run (ApplicationArguments args) throws Exception {
		repository.save(new Music(1L, "Djavan", "MPB", "what"));
		repository.save(new Music(2L, "Kevinho", "Funk", "what"));
		repository.save(new Music(3L, "Slipknot", "Rock", "what"));
		repository.save(new Music(4L, "Anitta", "Pop", "what"));
		repository.save(new Music(5L, "Djonga", "Hip Hop", "what"));
		repository.save(new Music(6L, "MD Chefe", "Trap", "what"));
		repository.save(new Music(7L, "Alok", "Eletronica", "what"));
		repository.save(new Music(8L, "Ivete Sangalo", "Axé", "what"));
	}
}
