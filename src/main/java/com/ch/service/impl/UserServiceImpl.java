package com.ch.service.impl;

import com.ch.dao.UserDao;
import com.ch.pojo.entity.User;

import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import com.ch.service.UserService;

import com.ch.web.exception.BadRequestException;
import com.ch.web.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Optional;

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

    public boolean checkUserByUsername(String username) {
        User user = userDao.selectUserByUsername(username);
        if(user!=null){
            return true;
        }
        return false;
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

    /**
     *
     * @param userLogin 登录的参数
     * @return 返回User pojo类
     */
    @Override
    public User authenticate(UserLoginParam userLogin) {
        Assert.notNull(userLogin,"Login param must not be null");

//        String username = userLogin.getUsername();

//        User login = userDao.selectUserByUsernameAndPassword(userLogin);

//        final User user;
//        user = Validator.isEmail(username)?
//                userDao.getByEmail(username) :
//                userDao.getByUsername(username);
//        log.info("user login:"+userLogin.getUsername());
//
//        if (!userDao.passwordMatch(user,userLogin.getPassword())){
//            // 用户密码不匹配
////            log.warn("");
//            throw new BadRequestException(Constants.MISS_MATCH_TIP);
//        }






        return new User();
    }

    @Override
    public AuthToken authUsernameCheck(UserLoginParam loginParam) {
        return null;
    }

    @Override
    public void clearToken() {

    }

    @Override
    public AuthToken refreshToken(String refreshToken) {
        return null;
    }

    @Override
    public Optional<User> getByUserName(String username) {
        return userDao.selectByUsername(username);
    }

    @Override
    public User getByUserNameOfNonNull(String username) {
        return getByUserName(username)
                .orElseThrow(()-> new IllegalArgumentException("This user does not exit!"));
    }

    @Override
    public Optional<User> getByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public User getByEmailOfNonNull(String email) {
        return null;
    }
}
