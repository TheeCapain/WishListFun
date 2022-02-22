package com.example.wishlistfun.controller;

import com.example.wishlistfun.model.Wishlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishRESTController {

    @Autowired
    WishRepository wishRepository;


}
