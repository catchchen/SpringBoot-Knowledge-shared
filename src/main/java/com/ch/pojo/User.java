package com.ch.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenk
 * @date 2022/2/23 21:14
 * @description
 */
@Data
public class User {
    private Integer uid; //用户id
    private String username; //用户名称
    private String password; //用户密码

    private String userEmail; //用户EMAIL
    private Boolean is;   //用户是否被
}
