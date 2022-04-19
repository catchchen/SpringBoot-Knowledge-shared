package com.ch.pojo.params;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResetPasswordParam {
    // "用户名 不能 少于3超过18"
    private String email;
    private String username;
    //"用户密码字符长度不能超过 {max}"
    private String password;
    // 认证
    private String auth;

}
