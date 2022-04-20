package com.ch.dao;

import com.ch.pojo.entity.User;
import com.ch.web.model.vo.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

/**
 * @author chenk
 * @date 2022/3/2
 * @description 功能
 */
@Mapper
public interface UserDao {

    List<User> selectUserList();

    List<User> selectUsersSortByGradle();

    @Select("select * from users where id = 1")
    Optional<User> selectTestUser();

    @Select("select * from users where id = #{userId}")
    Optional<User> selectById(@Param("id") Integer userId);

    @Select("select * from users where username = #{username}")
    Optional<User> selectByUsername(String username);

    @Select("select * from users where email = #{email}")
    Optional<User> selectByEmail(String email);

    int insertUser(User user);
}
