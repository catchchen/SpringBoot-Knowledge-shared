package com.ch.web.model.dto;

import com.ch.pojo.entity.User;
import lombok.Data;

/**
 * User output dto.
 * 用户传输对象 跨表数据
 */
@Data
public class UserParam implements InputConverter<User>{

    // 用户名称
    private String username;
    // 用户昵称
    private String nickname;
    // 邮件
    private String email;
    // 个性签名
    private String sign;

}
