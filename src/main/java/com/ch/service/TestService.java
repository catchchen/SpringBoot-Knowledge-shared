package com.ch.service;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import org.springframework.lang.NonNull;

public interface TestService {

    /**
     * Expired seconds.
     */
    int ACCESS_TOKEN_EXPIRED_SECONDS = 24 * 3600;

    int REFRESH_TOKEN_EXPIRED_DAYS = 30;

    String LOG_PATH = "logs/spring.log";

    /**
     * Authenticates username password.
     *
     * @param loginParam login param must not be null
     * @return User
     */
    @NonNull
    User authenticate(@NonNull UserLoginParam loginParam);

    /**
     * Check authCode and build authToken.
     *
     * @param loginParam login param must not be null
     * @return User
     */
    @NonNull
    AuthToken authCodeCheck(@NonNull UserLoginParam loginParam);

    /**
     * Clears authentication.
     */
    void clearToken();

    /**
     * Send reset password code to administrator's email.
     *
     * @param param param must not be null
     */
    void sendResetPasswordCode(@NonNull ResetPasswordParam param);

    /**
     * Reset password by code.
     *
     * @param param param must not be null
     */
    void resetPasswordByCode(@NonNull ResetPasswordParam param);


    /**
     * Refreshes token.
     *
     * @param refreshToken refresh token must not be blank
     * @return authentication token
     */
    @NonNull
    AuthToken refreshToken(@NonNull String refreshToken);


}
