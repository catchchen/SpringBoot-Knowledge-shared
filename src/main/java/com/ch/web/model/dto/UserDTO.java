package com.ch.web.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * User output dto.
 * 网络传输对象显示到网页上的对象
 */
@Data
public class UserDTO {

    // 发表的文章数量
    private Integer articleCount;
    // 称号
    private String called;
    // 积分
    private Integer grade;
     //
    private String username; //用户名称

    private Integer id;


    private String nickname;

    private String email;

    private String avatar;

    private String description;


    private Date createTime;

    private Date updateTime;
}
