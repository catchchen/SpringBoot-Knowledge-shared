package com.ch.controller.user;


import com.ch.pojo.entity.User;
import com.ch.pojo.params.ResetPasswordParam;
import com.ch.pojo.params.UserLoginParam;
import com.ch.web.model.dto.UserParam;
import com.ch.service.UserService;
import com.ch.web.exception.AlreadyExistsException;
import com.ch.web.model.vo.UserVo;
import com.ch.web.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


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
    @RequestMapping("/user/get/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer uid) {
// System.out.println("=="+userid);
        // User user = userService.
//        return userService.getUser(uid);
        return new User();
    }


    /**
     * 用户信息
     */
    @RequestMapping(value = "/User")
//@ResponseBody
    public String userUpdate(ResetPasswordParam restPassword) {
        //System.out.println("====UserControll"+user);
        boolean b = userService.resetPassword(restPassword);
        System.out.println();
        if(b){
            return "redirect:/";// 重定向 到
        }else{
            return "FAIL"; // 修改失败的页面 点击重定向 到
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
