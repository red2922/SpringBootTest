package com.test.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
