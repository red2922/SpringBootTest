package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.jake.demo.dto.Resturant;

public interface ResturantRepository extends MongoRepository<Resturant, String> {

    @Query("{name:'?0'}")
    Resturant findRestaurantByName(String name);

}