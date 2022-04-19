package com.ch.dao.admin;

import com.ch.pojo.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author chenk
 * @date 2022/4/7
 * @description 功能
 */
public interface AdminMapper {

    @Select("select * from users")
    List<User> selectUserList();

}
