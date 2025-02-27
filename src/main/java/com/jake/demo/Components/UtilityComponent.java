package com.jake.demo.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jake.demo.Repository.UtilityRepository;
import com.jake.demo.dto.Utility;

@Component
public class UtilityComponent {

    @Autowired
    private UtilityRepository utilityRepository;

    public Utility updateUtilityData(String name) {
        utilityRepository.findAndIncrementByName(name);
        return utilityRepository.findUtilityByName(name);
    }
}
