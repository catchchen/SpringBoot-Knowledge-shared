package com.ch.controller.admin.api;

import com.ch.service.AdminService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenk
 * @date 2022/2/23 21:30
 * @description admin Login 控制
 */
@RequestMapping("/api/admin")
@RestController
public class AdminLoginController {


    private AdminService adminService;

    public AdminLoginController(AdminService AdminService){
        this.adminService = AdminService;
    }

    /**
     * 用户登录
     */
    // @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public Result<Object> login(UserLoginParam loginParam , HttpSession session) {
//        // 通过账号和密码查询用户
//
//        if(login == null){
//            return Result.builder()
//                    .msg("输入账号或密码有误")
//                    .status(HttpStatus.OK.value())
//                    .build();
//        }
//        if(login != null){
//            session.setAttribute("isAdmin",login.getIsAdmin());
//            return Result.builder()
//                    .msg("")
//                    .status(HttpStatus.OK.value())
//                    .build();
//        }
//            throw new RuntimeException();
//    }
    /**
     * 退出登录
     */
//    @RequestMapping(value = "/logout")
//    public String logout(HttpSession session) {
        // 清除token
// logout        session.invalidate();
//        // 重定向到登录页面的跳转方法
//        return "redirect:login.action";


    /**
     * 通过id获取用户信息
     */



    /**
     * 删除用户信息
     */



}
