package com.study.api.controller;

import com.study.api.entity.Customer;
import com.study.api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerApi {


    @Autowired
    private CustomerRepository custRepos;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return custRepos.findAll();
    }

    @PostMapping("/")
    public Customer createCustomer( @RequestBody Customer customer) {
        return custRepos.save(customer);
    }


}
