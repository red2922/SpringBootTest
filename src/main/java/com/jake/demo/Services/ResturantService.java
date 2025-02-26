package com.jake.demo.Services;

import java.util.List;
import com.jake.demo.dto.Resturant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jake.demo.Repository.ResturantRepository;

@Service
public class ResturantService {

    @Autowired
    private ResturantRepository resturantRepository;

    public List<Resturant> getAllResturants() {
        return resturantRepository.findAll();
    }

    public Resturant getResturantByName(String name) {
        return resturantRepository.findRestaurantByName(name);
    }

}
