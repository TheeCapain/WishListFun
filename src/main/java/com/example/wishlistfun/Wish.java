package com.example.wishlistfun;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wish {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int wishID;
    private String name;
    private double price;
    private String description;
    private String link;

    public Wish(String name, double price, String description, String link) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.link = link;
    }

    public Wish(){

    }

    public int getWishID() {
        return wishID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
