package com.ouyang.cloudapi.service;

import com.ouyang.cloudapi.entity.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(value = "CLOUD-PROVIDER")
public interface CustomerService {

    @GetMapping(value = "/customer/get/{id}")
    public Customer get(@PathVariable("id") Integer id);

    @RequestMapping(value="/customer/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Customer customer);

    @GetMapping(value = "/customer/list")
    public List<Customer> list();
}
