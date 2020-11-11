package com.ouyang.cloudapi.service;

import com.ouyang.cloudapi.entity.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 客户端实现服务降级（服务关闭后访问处理）
 * fallbackFactory = 一个实现了FallbackFactory接口的类CustomerClientServiceFallbackFactory
 * 这边是消费端 使用feign 整合的ribbon调取不到服务，就会直接调用fallbackFactory方法
 */
@FeignClient(value = "CLOUD-PROVIDER", fallbackFactory = CustomerClientServiceFallbackFactory.class)
public interface CustomerService {

    @GetMapping(value = "/customer/geta/{id}")
    public Customer get(@PathVariable("id") Integer id);

    @RequestMapping(value = "/customer/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Customer customer);

    @GetMapping(value = "/customer/list")
    public List<Customer> list();
}
