package com.example.test_for_myself.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test_for_myself.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(final String email);

}