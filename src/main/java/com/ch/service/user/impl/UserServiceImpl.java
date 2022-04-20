package com.ch.service.user.impl;

import com.ch.dao.UserDao;
import com.ch.pojo.entity.User;

import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.service.user.UserService;

import com.ch.web.exception.BadRequestException;
import com.ch.web.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:33
 * @description Userd
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public User userLogin(UserLoginParam user) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUser(Integer uid) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int changeUserInfo(User user) {
        return 0;
    }

    @Override
    public int removeUser(Integer uid) {
        return 0;
    }

    @Override
    public boolean resetPassword(ResetPasswordParam param) {
        User user = BeanUtils.transformFrom(param, User.class);
        int i = userDao.updateUser(user);
        if(i > 0){
            return true;
        }else{
            throw new BadRequestException("修改失败");
        }
    }


}
