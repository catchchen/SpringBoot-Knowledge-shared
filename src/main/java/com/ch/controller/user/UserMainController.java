package com.ch.controller.user;

import com.ch.pojo.entity.User;
import com.ch.pojo.params.UserLoginParam;
import com.ch.service.UserService;
import com.ch.web.exception.AlreadyExistsException;
import com.ch.web.model.dto.UserParam;
import com.ch.web.model.vo.UserVo;
import com.ch.web.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@Slf4j
public class UserMainController {

    private final UserService userService;

    /**
     * 用户登录
     */
    @PostMapping(value = "/user-login")
    public ModelAndView login(@RequestBody UserLoginParam userLoginParam) {
        // 通过账号和密码查询用户
//        User login = userService.userLogin(user);
        System.out.println(userLoginParam.getUsername()+":密码"+userLoginParam.getPassword()+"");

//        AuthToken token;

//        if(login != null) httpStatus = HttpStatus.OK.value();
//        if(true) httpStatus = HttpStatus.OK.value();
//        else httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();
//        model.addAttribute("username",user.getUsername());
//        model.addAttribute("pic",user.getEmail());
//        session.setAttribute("admin",getIsAdmin());
        ModelAndView mv = new ModelAndView();
        log.warn("登陆失败,账号："+userLoginParam.getUsername()+",密码："+userLoginParam.getPassword());
        mv.setViewName("/index");

        UserVo userVo =
                BeanUtils.transformFrom(userService.getByEmail("test@test.com"),UserVo.class);
        System.out.println(userVo);
        mv.addObject("user",userVo);
        // 重定向"redirect:/index"
        return mv;
    }

    /**
     *
     * @param  userParams 用户注册表单
     * @return
     *
     */
    @PostMapping("/user-register")
    public String register(UserParam userParams) {
        // 判断前台传过来的用户名是否重复
//        boolean exists = userService.getByUserName(userParams.getUsername())
//        .orElseThrow()()->throw new AlreadyExistsException("用户名已经存在"));
        if(true){
            throw new AlreadyExistsException("用户名已经存在");
        }
        log.info(userParams.convertTo().getUsername()+"密码:"+userParams.convertTo().getPassword());

//        userService.(userParams.convertTo());


//        User user = userService.getByEmail("");
//        System.out.println(user.getEmail()+user.getUsername());
//        System.out.println(user);
        // BAD_REQUEST


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
