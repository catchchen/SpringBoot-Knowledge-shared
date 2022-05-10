package com.ch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserTest {
    private int uid;
    private String username; //用户名称
    private String password; //用户密码
    private String avatar; // 用户头像地址

//    private String familyName;
//    private String givenName;
    private String description; // 描述自己
    private String email; //用户EMAIL
    private Boolean isForbidden;   //用户是否被禁言禁止发表

}
