package com.ch.dao;

import com.ch.pojo.entity.User;
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

    @Select("select * from users where username = #{username}")
    Optional<User> selectByUsername(@Param("username") String username);

    @Insert("insert into `users` " +
            "values (null,#{createTime},#{updateTime},null,#{email},null,#{password},#{username},#{nickname},#{sign})")
    int insertUser(User user);

    List<User> selectUsersSortByGrade();

    User selectUserById(@Param("id") Integer userId);

    User selectUserByUsername(@Param("username") String username);

    int updateUser(User user);
}
