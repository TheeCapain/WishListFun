package com.example.wishlistfun.controller;

import com.example.wishlistfun.model.Wishlist;
import com.example.wishlistfun.repository.WishlistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishlistRESTController {

    @Autowired
    WishlistRepository wishlistRepository;

    @GetMapping("wishlists") {
        return wishlistRepository;
    }

    @GetMapping("wishlist/{wishlistID}")
    public Wishlist showWishlist() {
        return wishlist;
    }
}
