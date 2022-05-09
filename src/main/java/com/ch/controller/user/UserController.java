package com.ch.controller.user;


import com.ch.pojo.entity.User;
import com.ch.pojo.params.ResetPasswordParam;
import com.ch.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author chenk
 * @date 2022/2/23 21:30
 * @description 用于用户登录注册的类
 */
@RequiredArgsConstructor
@RequestMapping("/user")
@Controller
public class UserController {

   private final UserService userService;

    /**
     * 通过id获取用户信息
     */
    @RequestMapping("/user/{id}")
    @ResponseBody
    public User getUserById(@PathVariable("id") Integer uid) {
// System.out.println("=="+userid);
        // User user = userService.
//        return userService.getUser(uid);
        return new User();
    }


    /**
     * 用户信息
     */
    @RequestMapping(value = "/User")
    public String userUpdate(ResetPasswordParam restPassword) {
        //System.out.println("====UserControll"+user);
        String password = restPassword.getPassword();
        String oldPassword = restPassword.getOldPassword();
        int b = userService.updatePassword(oldPassword, password,1);
        System.out.println();
        if(b>0){
            return "redirect:500";// 重定向 到bad request
        }else{
            return "FAIL"; // 修改失败的页面 点击重定向 到
        }
    }

    /**
     * 修改用户信息
     */

//    @RequestMapping(value = "/user/userUpdate")
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
