package com.example.test_for_myself.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test_for_myself.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByRole(final String role);

}