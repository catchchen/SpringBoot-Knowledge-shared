package com.ch.service;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.UserLoginParam;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23
 * @description 功能
 */
public interface UserService {
    // 通过账号和密码查询用户
    User userLogin(UserLoginParam user);

    // 查询到所有用户
    List<User> getUsers();

    // 通过uid拿到用户
    User getUser(Integer uid);

    // 数据库中添加用户

    int addUser(User user);

    // 用户更新操作
    int changeUserInfo(User user);

    int removeUser(Integer uid);

//	public
//
//	// 更新客户
//	public int updateCustomer(Customer customer);
//	// 删除客户
}
