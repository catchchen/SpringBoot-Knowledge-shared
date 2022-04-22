package com.ch.service.user;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.ResetPasswordParam;
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

    boolean passwordMatch(@NonNull User user, @NonNull String plainPassword);

    void setPassword(@NonNull User user, @NonNull String plainPassword);
}
