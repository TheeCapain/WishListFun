package com.example.wishlistfun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Wishlist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int wishlistID;
    private String name;
    private ArrayList<Wish> wishes;

    public Wishlist(String name, ArrayList<Wish> wishes) {
        this.name = name;
        this.wishes = wishes;
    }

    public Wishlist(){

    }

    public int getWishlistID() {
        return wishlistID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Wish> getWishes() {
        return wishes;
    }

    public void setWishes(ArrayList<Wish> wishes) {
        this.wishes = wishes;
    }
}
