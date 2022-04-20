package com.ch.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Validator;
import com.ch.dao.UserDao;
import com.ch.pojo.entity.User;

import com.ch.pojo.params.UserLoginParam;
import com.ch.service.UserService;

import com.ch.web.utils.DateUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.beans.Transient;
import java.text.DateFormat;
import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:33
 * @description User
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {


    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }
    /**
     *
     * @param userLogin 登录的参数
     * @return 返回User pojo类
     */
    @Override
    public User userLogin(UserLoginParam userLogin) {
        Assert.notNull(userLogin,"Login param must not be null");

        String username = userLogin.getUsername();

//        User login = userDao.(userLogin);

        final User user;
        user = Validator.isEmail(username)?
                userDao.selectByUsername(username).get() :
                userDao.selectByEmail(username).get();
        log.info("user login:"+userLogin.getUsername());
//
//        if (!userDao.passwordMatch(user,userLogin.getPassword())){
//            // 用户密码不匹配
////            log.warn("");
//            throw new BadRequestException(Constants.MISS_MATCH_TIP);
//        }
        return new User();
    }

    @Override
    public List<User> getUsers() {
        // page 分页
        return null;
    }

    @Override
    public User getUser(Integer id) {
        // 返回前台的绝对不为空

        return new User();
    }

    @Override
    @Transient
    public int addUser(User user) {

        user.setGrade(1000l);
        System.out.println("service "+ user);
//        return userDao.insertUser(user);
        return 1;
    }

    @Override
    public int changeUserInfo(User user) {
        return 0;
    }

    @Override
    public int removeUser(Integer uid) {
        return 0;
    }

}
