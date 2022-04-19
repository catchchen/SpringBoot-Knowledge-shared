package com.ch.service;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import org.springframework.lang.NonNull;

import java.util.Optional;

/**
 * @author chenk
 * @date 2022/2/23
 * @description 功能
 */
public interface UserService {

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
    AuthToken authUsernameCheck(@NonNull UserLoginParam loginParam);

    /**
     * Clears authentication.
     * 退出登录
     */
    void clearToken();

    /**
     * Refreshes token.
     * 刷新token
     * @param refreshToken refresh token must not be blank
     * @return authentication token
     */
    @NonNull
    AuthToken refreshToken(@NonNull String refreshToken);

    /**
     * get User by Username
     * @param username
     * @return Optional User
     */
    Optional<User> getByUserName(@NonNull String username);

    User getByUserNameOfNonNull(@NonNull String username);

    Optional<User> getByEmail(@NonNull String email);

    User getByEmailOfNonNull(@NonNull String email);

    /**
     * reset password code
     * 更新用户密码
     * @param param param must not be null
     * @return
     */
    boolean resetPassword(@NonNull ResetPasswordParam param);

}
