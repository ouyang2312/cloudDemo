package com.ouyang.cloudapi.service;

import com.ouyang.cloudapi.entity.Customer;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *  针对消费者通过feign 不能访问服务 采取的响应
 */
@Component
public class CustomerClientServiceFallbackFactory implements FallbackFactory<CustomerService> {
    @Override
    public CustomerService create(Throwable throwable) {
        return new CustomerService(){

            @Override
            public Customer get(Integer id) {
                Customer customer = new Customer(id,"没有该用户","邮箱是空的","目前数据无法访问");
                return customer;
            }

            @Override
            public boolean add(Customer customer) {
                return false;
            }

            @Override
            public List<Customer> list() {
                return null;
            }
        };
    }
}
