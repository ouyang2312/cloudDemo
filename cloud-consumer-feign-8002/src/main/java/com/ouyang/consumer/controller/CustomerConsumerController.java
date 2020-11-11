package com.ouyang.consumer.controller;

import com.ouyang.cloudapi.entity.Customer;
import com.ouyang.cloudapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerConsumerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "ceshi")
    public Customer ceshi() {
        return new Customer(1, "2", "2s", "aa");
    }

    @RequestMapping(value = "/consumer/customer/add")
    public boolean add(Customer customer) {
        return customerService.add(customer);
    }

    @GetMapping(value = "/consumer/customer/get/{id}")
    public Customer get(@PathVariable("id") Integer id) {
        return customerService.get(id);
    }

    @GetMapping(value = "/consumer/customer/list")
    public List<Customer> list() {
        return customerService.list();
    }

}
