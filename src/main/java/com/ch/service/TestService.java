package com.ch.service;

import cn.hutool.crypto.digest.BCrypt;
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

/**************************UserService*************/
    /**
     * set user password
     * @param user
     * @param password
     */
    //
    void setPassword(@NonNull User user,@NonNull String password);

    /**
     * 更新用户密码
     * @param oldPassword
     * @param newPassword
     * @param uid
     * @return
     */
    @NonNull
    User updatePassword(@NonNull String oldPassword,@NonNull String newPassword, @NonNull Integer uid);

    //Assert.hasText(oldPassword, "Old password must not be blank");        Assert.hasText(newPassword, "New password must not be blank");
    // Assert.notNull(userId, "User id must not be blank");
// if (oldPassword.equals(newPassword)) {            throw new BadRequestException("新密码和旧密码不能相同");        }

    //Check the user old password
//    if(BCrypt..checkpw(oldPassword, user.getPassword())) {            throw new BadRequestException("旧密码错误").setErrorData(oldPassword);        }
    // Set new password        setPassword(user, newPassword);
    //// Update this user        User updatedUser = update(user);
    /****************************************************/

}
