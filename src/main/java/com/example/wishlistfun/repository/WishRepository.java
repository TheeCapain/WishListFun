package com.example.wishlistfun.repository;

import com.example.wishlistfun.model.Wish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishRepository extends JpaRepository<Wish, Integer> {
}
