package com.ch.controller.user;

import com.ch.pojo.entity.User;

import com.ch.service.user.UserService;
import com.ch.service.user.AuthenticateService;
import com.ch.web.exception.AlreadyExistsException;

import com.ch.web.exception.ServiceException;
import com.ch.web.model.dto.UserParam;
import com.ch.web.model.vo.UserVo;
import com.ch.web.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Slf4j
@Controller
@RequestMapping("/user")
@RequiredArgsConstructor

public class UserMainController {

    private final AuthenticateService authenticateService;
    private final UserService userService;

//    @GetMapping(value = "login")
//    public String test(){
//        return "";
//    }
    /**
     * 用户登录
     */
    @CrossOrigin
    @PostMapping(value = "login")
    public String login() {
        // 通过账号和密码查询用户
//        User login = userService.userLogin(user);

        ModelAndView mv = new ModelAndView();
//        mv.setViewName("context/home");
//        if(true) httpStatus = HttpStatus.OK.value();
//        else httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();
//        model.addAttribute("username",user.getUsername());
//        model.addAttribute("pic",user.getEmail());
//        session.setAttribute("admin",getIsAdmin());
        UserVo userVo =
                BeanUtils.transformFrom(authenticateService.getByEmail("test@test.com"),UserVo.class);

//        mv.setViewName();
        // 重定向
//        return "";
        return "redirect:http://localhost:8080/";
    }
    @CrossOrigin
    @GetMapping("login")
    public String lo(){
        return "redirect:http://localhost:8080/";
    }
    /**
     *
     * @param  userParams 用户注册表单
     * @return  index 页面
     *
     */
    @PostMapping("register")
    public String register(UserParam userParams) {
        // 判断前台传过来的用户名是否重复
        log.info("用户:{}，进入注册",userParams.getUsername());
        User exists = authenticateService
                .getByUserName(userParams.getUsername());
//                .orElseThrow(()-> new AlreadyExistsException("用户名已经存在"));
        if(exists != null){
            throw new AlreadyExistsException("用户名已经存在");
        }
        log.info("用户{}注册,邮箱:{}",userParams.getUsername(),userParams.getEmail());

        int i = userService.createBy(userParams);
        if(i < 0){
            throw new ServiceException("用户创建失败");
        }
        return "redirect:/index";

    }

    /**
     * 退出登录
     */
//    @RequestMapping(value = "/logout")
//    public String logout(HttpSession session) {
    // 清除Session
// logout        session.invalidate();
//        // 重定向到登录页面的跳转方法
//        return "redirect:login.action";
}
