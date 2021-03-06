package com.ch.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author chenk
 * @date 2022/2/1 21:14
 * @description 用户实体类
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id; //用户id
    private Date createTime;
    private Date updateTime;
    private String avatar;
    private String email;
    private String username;
    private String password;
    private String nickname;
    private Integer expire;// 失效
    private long grade;
}
