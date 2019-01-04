package com.ouyang.cloudprovider.service;

import com.ouyang.cloudapi.entity.Customer;

import java.util.List;

public interface CustomerService {

    public boolean add(Customer customer);

    public Customer get(Integer id);

    public List<Customer> list();

}
