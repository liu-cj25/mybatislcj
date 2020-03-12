package com.mybatis.mapper;

import com.mybatis.po.Customer;

import java.util.List;
import java.util.Map;

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
    void UpdateCustomerSet(Customer customer);

    /**
     * 基本类型 单参数list的
     * @param idssad
     * @return
     */
    List<Customer> selectForEach(List<Integer> idssad);
    List<Customer> ForEachArray(int[] arr);
    List<Customer> forEachMap(Map<String, Object> obMap);
    List<Customer> bindSelect(Customer customer);
}
