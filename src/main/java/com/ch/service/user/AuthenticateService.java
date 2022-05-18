package com.ch.service.user;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import org.springframework.lang.NonNull;

import java.util.Optional;

public interface AuthenticateService {

    /**
     * Authenticates username password.
     * 认证 用户名和密码
     * @param loginParam login param must not be null
     * @return User
     */
    @NonNull
    User authenticate(@NonNull UserLoginParam loginParam);

    /**
     * Check userName and build authToken.
     *
     * @param loginParam login param must not be null
     * @return AuthToken
     */
    @NonNull
    boolean authUsernameCheck(@NonNull UserLoginParam loginParam);

//    /**
//     * Clears authentication.
//     * 退出登录
//     */
//    void clearToken();
    /**
     * Refreshes token.
     * 刷新token
     * @param refreshToken refresh token must not be blank
     * @return authentication token
     */
    @NonNull
    AuthToken refreshToken(@NonNull String refreshToken);

    /**
     * 用于注册时候 检测是否 能使用该账号密码
     * @param username
     * @return
     */
    User getByUserName(@NonNull String username);

    User getByEmail(@NonNull String email);
    /**
     * 密码验证
     * @param user
     * @param plainPassword
     * @return
     */
    boolean passwordMatch(@NonNull User user, @NonNull String plainPassword);
    void setPassword(@NonNull User user, @NonNull String plainPassword);
}
