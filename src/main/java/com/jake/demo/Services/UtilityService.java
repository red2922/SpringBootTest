package com.jake.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jake.demo.Repository.UtilityRepository;
import com.jake.demo.dto.Utility;

@Service
public class UtilityService {

    @Autowired
    private UtilityRepository utilityRepository;

    public Utility updateUtilityData(String name) {
        utilityRepository.findAndIncrementByName(name);
        return utilityRepository.findUtilityByName(name);
    }
}
