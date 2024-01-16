package com.test.fullstackbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.test.fullstackbackend.repository.UserRepository;
import com.test.fullstackbackend.model.User;

@RestController
public class UserController {
    @Autowired
    private UserRepository UserRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return UserRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return UserRepository.findAll();
    }

}
