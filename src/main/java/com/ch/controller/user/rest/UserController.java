package com.ch.controller.user.rest;

import com.ch.pojo.entity.User;

import com.ch.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenk
 * @date 2022/2/23 21:30
 * @description 用户控制器类
 */
@Slf4j
@Controller
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    /**
     * 通过id获取用户信息
     */
    @RequestMapping("/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer uid) {
// System.out.println("=="+userid);
        User user = userService.getById(uid);
        return new User();
    }


    /**
     * 删除用户信息
     */
    @PutMapping(value = "/")
//@ResponseBody
    public String userUpdate(User user) {

        log.info("update userId:{}",user.getId());

        if(userService.saveOrUpdate(user)){
            return "redirect:/success";// 重定向 到
        }else{
            return "FAIL"; // 修改失败的页面
        }
    }

    /**
     * 修改用户信息
     */

//    @RequestMapping(value = "/user/userUpdate.action")
//    public String userUpdate(User user) {
//
//        //System.out.println("====UserControll"+user);
//
//        int rows = userService.update(user);
//        System.out.println();
//        if(rows > 0){
//            return "redirect:userlist723.action";
//        }else{
//            return "FAIL"; //修改失败的页面
//        }
//    }

}
