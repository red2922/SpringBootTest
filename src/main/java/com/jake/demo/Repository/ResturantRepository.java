package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jake.demo.dto.Resturant;

public interface ResturantRepository extends MongoRepository<Resturant, String> {

}