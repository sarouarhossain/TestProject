package com.example.application.controllers;

import com.example.application.models.User;
import com.example.application.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/user")
public class AccountController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public Flux<User> get(){
        return userRepository.findAll();
    }
}
