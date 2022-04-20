package com.ch.pojo.params;

import lombok.Data;
import lombok.ToString;

/**
 * @author chenk
 * @date 2022/3/20 11:58
 * @description 注册用户的参数类
 */
@Data
@ToString
public class UserParam {

    private String username;
    private String nickname;
    private String email;
    private String password;

}
