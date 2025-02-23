package com.jake.demo.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class Resturant {

    private String name;
    private String cuisine;

    public Resturant(String name, String cuisine) {
        this.name = name;
        this.cuisine = cuisine;
    }

    public void setId(String id) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }
}
