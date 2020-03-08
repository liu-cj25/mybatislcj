package com.mybatis.mapper;

import com.mybatis.po.Customer;

import java.util.List;

/**
 * @auther：lcj
 * @date 2020/3/4 下午 12:45
 */
public interface CustomerMapper {
    Customer findById(int  id);
    List<Customer> findAll();
    int updateCustomerById(Customer customer);
    int deleteCustomer(Customer customer);
    int insertCustomer(Customer customer);
    List<Customer> IfSelectByName(Customer customer);
    List<Customer> ChooseSelect(Customer customer);
}
