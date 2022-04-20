package com.ch.service.user;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

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

    boolean resetPassword(@NonNull ResetPasswordParam param);
}
