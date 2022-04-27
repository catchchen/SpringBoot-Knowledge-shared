package com.ch.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("users")
public class User {
    private int id; //用户id
    private Date createTime;
    private Date updateTime;
    // 头像地址
    private String avatar;
    private String email;
    private String username;
    private String password;
    private String nickname;
    private long grade;
    private String sign;
}
