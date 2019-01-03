package com.ouyang.consumer.controller;

import com.ouyang.cloudapi.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CustomerConsumerController {

    //private static final String REST_URL_PROFIX = "http://localhost:8001";
    private static final String REST_URL_PROFIX = "http://CLOUD-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/customer/add")
    public boolean add(Customer customer){
        return restTemplate.postForObject(REST_URL_PROFIX+"/customer/add",customer,Boolean.class);
    }

    @GetMapping(value="/consumer/customer/get/{id}")
    public Customer get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PROFIX+"/customer/get/"+id,Customer.class);
    }

    @GetMapping(value="/consumer/customer/list")
    public List<Customer> list(){
        return restTemplate.getForObject(REST_URL_PROFIX+"/customer/list",List.class);
    }

}
