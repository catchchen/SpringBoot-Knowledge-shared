package com.ch.web.model.vo;

import lombok.Data;

import java.util.List;

/**
 * @author chenk
 * @date 2022/3/20 22:23
 * @description   User 视图对象
 */
@Data
public class UserVo {

    private String email;
    private String username; //用户名称
    private String avatar; // 用户头像
    private String nickname;
    private long grade; // 用户积分

}
