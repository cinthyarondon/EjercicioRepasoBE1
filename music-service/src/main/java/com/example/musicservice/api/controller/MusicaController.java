package com.example.musicservice.api.controller;

import com.example.musicservice.api.service.MusicService;
import com.example.musicservice.domain.model.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MusicaController {

	@Autowired
	private MusicService service;

	@GetMapping("/{genre}")
	ResponseEntity<List<Music>> getMusicaByGenre(@PathVariable String genre) {
		return ResponseEntity.ok().body(service.findByGenre(genre));
	}

	@PostMapping("/save")
	ResponseEntity<Music> saveMusica(@RequestBody Music musica) {
		return ResponseEntity.ok().body(service.save(musica));
	}
}
