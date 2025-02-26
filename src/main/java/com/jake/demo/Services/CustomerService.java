package com.jake.demo.Services;

//Remember that the service handles the Buisness Logic
import java.util.List;
import com.jake.demo.dto.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jake.demo.Repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerByName(String name) {
        if (name != null) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        return customerRepository.findCustomerByName(name);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

}
