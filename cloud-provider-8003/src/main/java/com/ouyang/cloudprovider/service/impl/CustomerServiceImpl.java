package com.ouyang.cloudprovider.service.impl;

import com.ouyang.cloudapi.entity.Customer;
import com.ouyang.cloudprovider.dao.CustomerDao;
import com.ouyang.cloudprovider.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public boolean add(Customer customer) {
        return customerDao.addCustomer(customer);
    }

    @Override
    public Customer get(Integer id) {
        return customerDao.findById(id);
    }

    @Override
    public List<Customer> list() {
        return customerDao.findAll();
    }
}
