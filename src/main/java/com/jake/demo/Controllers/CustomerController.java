package com.jake.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jake.demo.Repository.CustomerRepository;
import com.jake.demo.dto.Customer;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customer/{name}")
    public Customer getGreetingUser(@PathVariable String name) {
        if (name != null) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        return customerRepository.findCustomerByName(name);
    }
}
