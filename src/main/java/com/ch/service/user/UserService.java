package com.ch.service.user;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ch.pojo.entity.User;
import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.security.AuthToken;
import com.ch.web.model.dto.UserParam;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

/**
 * @author chenk
 * @date 2022/2/23
 * @description 功能
 */

public interface UserService extends IService<User> {

    // 通过uid拿到用户
    User getById(Integer uid);
    User getByEmail(String email);
    // 数据库中添加用户

    User createBy(@NonNull UserParam registerParam);

    // 用户更新操作

    int updatePassword(@NonNull String oldPassword,@NonNull String newPassword,@NonNull Integer userId);

    int removeUser(Integer uid);


}
