package com.ouyang.cloudprovider.dao;

import com.ouyang.cloudapi.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerDao {

    public boolean addCustomer(Customer dept);

    public Customer findById(Integer id);

    public List<Customer> findAll();

}
