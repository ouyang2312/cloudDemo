package com.ouyang.cloudprovider.controller;

import com.ouyang.cloudapi.entity.Customer;
import com.ouyang.cloudprovider.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customer/get/{id}")
    public Customer get(@PathVariable("id") Integer id) {
        return customerService.get(id);
    }


    /**
     * 如果直接调用该服务 需要用@RequestMapping,这里@PostMapping是让其他地方引用调用
     *
     * @param customer
     * @return
     */
    @RequestMapping(value = "/customer/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Customer customer) {
        return customerService.add(customer);
    }

    @GetMapping(value = "/customer/list")
    public List<Customer> list() {
        return customerService.list();
    }

}
