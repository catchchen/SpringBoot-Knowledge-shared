package com.ch.service.admin;

import com.ch.pojo.entity.User;
import com.ch.security.AuthToken;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

public interface AdminService {



    /**
     * Check authCode and build authToken.
     *
     * @param loginParam login param must not be null
     * @return User
     */
    /**
     *  Get user by email
     * @param email
     * @return optional user
     */
    Optional<User> getByEmail(@NonNull String email);


    /**
     * Updates admin assets.
     */
    void updateAdminAssets();

    /**
     * 获取日志的内容 查看日志功能
     *
     * @param lines lines
     * @return logs content.
     */
    String getLogFiles(@NonNull Long lines);

    // 查询到所有用户


}