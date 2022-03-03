package com.ch.controller;

import com.ch.pojo.User;
import com.ch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:30
 * @description 用户控制器类
 */
@Controller
public class UserController {
    // 依赖注入//注解注入
    @Autowired
    private UserService userService;
    /**
     * 用户登录
     */
    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(String username,String password, Model model,
                        HttpSession session) {
        // 通过账号和密码查询用户
        User user = userService.findUser(username, password);
        if(user != null){
            // 将用户对象添加到Session
            session.setAttribute("USER_SESSION", user);
            // 跳转到主页面
            return "redirect:category/list.action";
        }
        model.addAttribute("msg", "账号或密码错误，请重新输入！");
        // 返回到登录页面
        return "login";
    }
    /**
     * 退出登录
     */
    @RequestMapping(value = "/logout.action")
    public String logout(HttpSession session) {
        // 清除Session
        session.invalidate();
        // 重定向到登录页面的跳转方法
        return "redirect:login.action";
    }
    /**
     * 向用户登陆页面跳转
     */
    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/user/userlist.action", method = RequestMethod.GET)
    public String userlist(Model model) {
        List list=userService.getUserlist();
        model.addAttribute("userlist", list);
        return "user_list1";
    }


    @RequestMapping(value = "/user/userlist723.action")
    public String list( Model model) {
        List list = userService.getUserlist723();
        //System.out.println("==="+list.size());
        model.addAttribute("ulist",list);

        return "user_list_723";
    }

    /**
     * 通过id获取用户信息
     */
    @RequestMapping("/user/getUserById.action")
    @ResponseBody
    public User getUserById723(String userid) {
// System.out.println("=="+userid);
        User user = userService.getUser(userid);
//  System.out.println("==="+user);
        return user;
    }


    /**
     * 删除用户信息
     */
    @RequestMapping(value = "/user/userUpdate.action")
//@ResponseBody
    public String userUpdate(User user) {

        //System.out.println("====UserControll"+user);
        int rows = userService.update(user);
        System.out.println();
        if(rows > 0){
            return "redirect:category/list.action";
        }else{
            return "FAIL"; //修改失败的页面
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
