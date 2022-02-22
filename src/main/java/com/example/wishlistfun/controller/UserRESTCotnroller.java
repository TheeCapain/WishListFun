package com.example.wishlistfun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRESTCotnroller {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public login() {
        return;
    }
}
