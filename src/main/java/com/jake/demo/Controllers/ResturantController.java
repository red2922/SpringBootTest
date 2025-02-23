package com.jake.demo.Controllers;

import com.jake.demo.dto.Resturant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jake.demo.Repository.ResturantRepository;

@RestController
public class ResturantController {

    @Autowired
    private ResturantRepository restRepo;

    @GetMapping("/getResturants")
    public List<Resturant> getAllResturants() {
        return restRepo.findAll();
    }
}
