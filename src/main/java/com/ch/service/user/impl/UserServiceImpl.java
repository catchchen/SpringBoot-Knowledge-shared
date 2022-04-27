package com.ch.service.user.impl;

import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ch.dao.UserDao;
import com.ch.pojo.entity.User;

import com.ch.pojo.params.UserLoginParam;
import com.ch.service.user.AuthenticateService;
import com.ch.service.user.UserService;

import com.ch.web.exception.BadRequestException;
import com.ch.web.model.dto.UserParam;
import com.ch.web.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:33
 * @description Userd
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements UserService {

    private final UserDao userDao;
    private final AuthenticateService authenticateService;
    @Override
    public User getById(Integer uid) {
        return userDao.selectById(uid);
    }

    @Override
    public User getByEmail(String email) {
        return authenticateService.getByEmailOfNonNull(email);
    }

    @Override
    public User createBy(UserParam registerParam) {
        return null;
    }

    @Override
    public int updatePassword(String oldPassword, String newPassword, Integer userId) {
//        User user = BeanUtils.transformFrom(param, User.class);
//    转化DTO
        Assert.hasText(oldPassword, "Old password must not be blank");
        Assert.hasText(newPassword, "New password must not be blank");
        Assert.notNull(userId, "User id must not be blank");

        if (oldPassword.equals(newPassword)) {
            throw new BadRequestException("新密码和旧密码不能相同");
        }

        // Get the user
        User user = getById(userId);

        // Check the user old password
        if (!BCrypt.checkpw(oldPassword, user.getPassword())) {
            throw new BadRequestException("旧密码错误").setErrorData(oldPassword);
        }

        // Set new password
        authenticateService.setPassword(user, newPassword);

        // Update this user
        int update = userDao.updateById(user);

        return update;
    }

//    public int create(User user) {
//        return 0;
//    }

    @Override
    public int removeUser(Integer uid) {
        return 0;
    }



}
