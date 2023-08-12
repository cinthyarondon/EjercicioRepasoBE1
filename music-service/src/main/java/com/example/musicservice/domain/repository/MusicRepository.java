package com.example.musicservice.domain.repository;

import com.example.musicservice.domain.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> {

//	@Query("SELECT m FROM Music m WHERE m.genre = ?1")
	List<Music> findByGenre(String genre);
}
