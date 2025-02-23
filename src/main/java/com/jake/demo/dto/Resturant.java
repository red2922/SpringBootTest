package com.jake.demo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Resturant {
    @Id
    private String Id;
    private String name;
    private String cuisine;

    public Resturant(String id, String name, String cuisine) {
        Id = id;
        this.name = name;
        this.cuisine = cuisine;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
