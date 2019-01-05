package com.ouyang.cloudprovider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "hystrixMethod")//注解熔断器 一旦出现异常，则执行回调方法
    public Customer get(@PathVariable("id") Integer id){
        Customer customer = customerService.get(id);
        if (customer == null) {
            throw new NullPointerException("没有没有对应的信息");
        }
        return customer;
    }


    public Customer hystrixMethod(@PathVariable("id") Integer id){
        Customer customer = new Customer(id,"该用户不存在","email是空的","数据库没有该数据");
        return customer;
    }

    /**
     * 如果直接调用该服务 需要用@RequestMapping,这里@PostMapping是让其他地方引用调用
     * @param customer
     * @return
     */
    @RequestMapping(value="/customer/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Customer customer){
        return customerService.add(customer);
    }

    @GetMapping(value = "/customer/list")
    public List<Customer>list(){
        return customerService.list();
    }

}
