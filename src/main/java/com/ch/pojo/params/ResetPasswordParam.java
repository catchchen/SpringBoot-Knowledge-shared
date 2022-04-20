package com.ch.pojo.params;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResetPasswordParam {
// "用户名或邮箱的字符长度不能超过 {max}"
    private String username;

//"用户密码字符长度不能超过 {max}"
    private String password;

    private String auth;

}
