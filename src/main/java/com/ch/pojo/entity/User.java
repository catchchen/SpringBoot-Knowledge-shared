package com.ch.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private Date createTime;
    private Date updateTime;
    // 头像地址
    private String avatar;
    private String email;
    private String username;
    private String password;
    private long grade;
    private String nickname;
    // 能否发布状态 default 1 true
    private boolean expire;
    private String sign;
    // 能否发言
    private boolean state;
    // 额外字段
    private String attr3;
}
