package com.jake.demo.dto;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "restaurants")
public class Resturant {

    private String restaurant_id;
    private String name;
    private String cuisine;

    public Resturant(String restaurant_id, String name, String cuisine) {
        this.restaurant_id = restaurant_id;
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

    public String getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(String restaurant_id) {
        this.restaurant_id = restaurant_id;
    }
}
