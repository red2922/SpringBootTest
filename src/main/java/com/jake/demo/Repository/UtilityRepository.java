package com.jake.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import com.jake.demo.dto.Utility;

public interface UtilityRepository extends MongoRepository<Utility, String> {
    @Query("{name:'?0'}")
    Utility findUtilityByName(String name);

    @Update("{ '$inc' : { 'sum' : 1 } }")
    long findAndIncrementByName(String utilName);
}
