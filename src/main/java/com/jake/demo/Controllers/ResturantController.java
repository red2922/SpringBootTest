package com.jake.demo.Controllers;

import com.jake.demo.dto.Resturant;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jake.demo.Services.ResturantService;

@RestController
@RequestMapping("/api")
public class ResturantController {

    @Autowired
    private ResturantService dataService;

    @GetMapping("/getResturants")
    public List<Resturant> getAllResturants() {
        return dataService.getAllResturants();
    }

    @GetMapping("/resturant/{name}")
    public Resturant getSpecificResturant(@PathVariable String name) {
        return dataService.getResturantByName(name);
    }

}
