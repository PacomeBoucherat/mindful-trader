package com.example.test_for_myself.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test_for_myself.models.Notes;

public interface NotesRepository extends JpaRepository<Notes, Long> {
	
	Notes findByTitle(final String title);
}