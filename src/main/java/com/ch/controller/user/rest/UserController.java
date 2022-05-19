package com.ch.controller.user.rest;

import com.ch.common.Response;
import com.ch.pojo.entity.User;

import com.ch.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.apache.ibatis.annotations.Delete;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:30
 * @description 用户控制器类
 */
@Slf4j
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
// 访问 api/ users 需要拦截器  这是管理员的权限token放入headers中
    private final UserService userService;
    /**
     * 通过id获取用户信息
     */
    @RequestMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        User user = userService.getById(id);
        log.info("get userId:{},username:{}",user.getId(),user.getUsername());
        return user;
    }


    /**
     * 更新或添加用户信息
     */
    @PutMapping(value = "/{id}")
    public String userUpdate(User user) {
        log.info("update userId:{}",user.getId());
        if(userService.saveOrUpdate(user)){
            return "jiayou";
        }else{
            return "FAIL"; // 修改失败的页面
        }

    }




    /**
     * 批量删除用户信息
     */
    @Delete(value = "/")
    public Response<String> deleteBy(List ids) {
        boolean b = userService.removeBatchByIds(ids);
        if(b){
            log.warn("delete users success!");
            return Response.ok("success");
        }
        log.warn("delete users fail!");
        return Response.fail("delete users fail");
    }

}
