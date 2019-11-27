package com.rafal.AJiOconverter.controller;

import com.rafal.AJiOconverter.model.User;
import com.rafal.AJiOconverter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/saveUser")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
