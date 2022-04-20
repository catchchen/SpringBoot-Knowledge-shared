package com.ch.pojo.params;

import lombok.Data;

/**
 * @author chenk
 * @date 2022/3/19 17:31
 * @description
 */
@Data
public class UserLoginParam {

//    @NotBlank(message = "用户名或邮箱不能为空")
//    @Size(max = 255, message = "用户名或邮箱的字符长度不能超过 {max}")
    private String username;

//    @NotBlank(message = "登录密码不能为空")
//    @Size(max = 100, message = "用户密码字符长度不能超过 {max}")
    private String password;

}
