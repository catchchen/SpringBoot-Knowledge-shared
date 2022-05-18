package com.ch.service.user.impl;

import cn.hutool.core.lang.Validator;
import cn.hutool.crypto.digest.BCrypt;
import com.ch.dao.UserDao;
import com.ch.pojo.entity.User;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import com.ch.service.user.AuthenticateService;
import com.ch.web.exception.BadRequestException;
import com.ch.web.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserAuthServiceImpl implements AuthenticateService {

    private final UserDao userDao;
    /**
     * @param userLogin 登录的参数
     * @return 返回User pojo类
     */
    @Override
    public User authenticate(UserLoginParam userLogin) {
        Assert.notNull(userLogin, "Login param must not be null");
        String userAccount = userLogin.getUsername();

        String mismatchTip = "当前用户名不存在";
        final User user;

        try{
            user = Validator.isEmail(userAccount)?getByEmail(userAccount):
                    getByUserName(userAccount);
        }catch (NotFoundException e) {
            log.error("Failed to find user by name: " + userAccount);
            log.warn("登陆失败,账号："+userLogin.getUsername()+",密码："+userLogin.getPassword());
            throw new BadRequestException(mismatchTip);
        }
        //利用BCrypt加密算法,验证输入密码和数据库中的密码是否相同
        if (!passwordMatch(user, userLogin.getPassword())) {
            // If the password is mismatch
            throw new BadRequestException(mismatchTip);
        }
//        session.setAttribute("username", user.getUsername());
        return user;
    }

    @Override
    public boolean authUsernameCheck(UserLoginParam loginParam) {
        User u = userDao.selectByUsername(loginParam.getUsername());
        if(u == null){
            return true;
        }
        return false;
    }

//    @Override
//    public void clearToken() {
//
//    }

    @Override
    public AuthToken refreshToken(String refreshToken) {
        return null;
    }

    @Override
    public User getByUserName(String username) {
        return userDao.selectByUsername(username);
    }
    @Override
    public User getByEmail(String email) {
        return userDao.selectByEmail(email);
    }
    @Override
    public boolean passwordMatch(User user, String plainPassword) {
        Assert.notNull(user, "User must not be null");
        // 非对称加密 BCrypt 加密工具
        return !StringUtils.isBlank(plainPassword)
                && BCrypt.checkpw(plainPassword, user.getPassword());
    }
    @Override
    public void setPassword(User user, String plainPassword) {
        Assert.notNull(user, "User must not be null");
        Assert.hasText(plainPassword, "Plain password must not be blank");
        // 加盐加密
        user.setPassword(BCrypt.hashpw(plainPassword, BCrypt.gensalt()));
    }
}
