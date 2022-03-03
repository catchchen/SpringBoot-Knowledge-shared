package com.ch.service.impl;

import com.ch.pojo.User;
import com.ch.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:33
 * @description
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findUser(String username, String password) {
        return null;
    }

    @Override
    public List getUserlist() {
        return null;
    }

    @Override
    public List getUserlist723() {
        return null;
    }

    @Override
    public User getUser(String userid) {
        return null;
    }

    @Override
    public int update(User user) {
        return 0;
    }
}
