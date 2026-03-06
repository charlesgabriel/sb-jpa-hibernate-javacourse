package com.dev.sb_jpa_hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.sb_jpa_hibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
