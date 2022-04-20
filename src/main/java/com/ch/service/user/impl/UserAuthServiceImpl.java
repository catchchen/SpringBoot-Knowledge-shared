package com.ch.service.user.impl;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import com.ch.service.user.AuthenticateService;
import org.springframework.util.Assert;

import java.util.Optional;

public class UserAuthServiceImpl implements AuthenticateService {
    /**
     *
     * @param userLogin 登录的参数
     * @return 返回User pojo类
     */
    @Override
    public User authenticate(UserLoginParam userLogin) {
        Assert.notNull(userLogin, "Login param must not be null");

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
        return null;
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
        return Optional.empty();
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
