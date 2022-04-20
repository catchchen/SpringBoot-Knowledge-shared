package com.ch.pojo.params;

import lombok.Data;
import lombok.ToString;

/**
 * @author chenk
 * @date 2022/3/20 11:58
 * @description
 */
@Data
@ToString
public class UserResetParam {

    private String username;
    private String nickname;
    private String newPassword;
    private String oldPassword;

}
