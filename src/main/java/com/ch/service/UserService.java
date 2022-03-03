package com.ch.service;

import com.ch.pojo.User;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23
 * @description 功能
 */
public interface UserService {
    // 通过账号和密码查询用户
    User findUser(String username, String password);

    List getUserlist();

    List getUserlist723();

    User getUser(String userid);

    int update(User user);


//	public int createCustomer(Customer customer);
//
//	// 通过id查询客户
//	public Customer getCustomerById(Integer id);
//	// 更新客户
//	public int updateCustomer(Customer customer);
//	// 删除客户
//	public int deleteCustomer(Integer id);
//art列表
}
