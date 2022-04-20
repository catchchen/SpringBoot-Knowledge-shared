package com.ch.controller.context.api;

import com.ch.dao.UserDao;
import com.ch.pojo.entity.User;
import com.ch.pojo.params.UserLoginParam;
import com.ch.pojo.params.UserParam;
import com.ch.service.UserService;
import com.ch.web.exception.AlreadyExistsException;
import com.ch.web.model.vo.UserVo;
import com.ch.web.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @author chenk
 * @date 2022/2/23 21:30
 * @description 用户控制只用于拦截请求 ，逻辑写入UserService中
 */
@Controller
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
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
        mv.setViewName("/index");

        UserVo userVo =
                BeanUtils.transformFrom(userService.getUser(1),UserVo.class);
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
    @GetMapping("")
    public String register(UserParam userParams) {
    // 判断前台传过来的用户名是否重复
        if(true){
            throw new AlreadyExistsException("用户已经存在");
        }


//        User userResult=userService.getUserByUserName(userParams.getUserName);


        User user = userService.getUser(1);
        System.out.println(user.getEmail()+user.getUsername());
//        System.out.println(user);
        // BAD_REQUEST

    //        if(userResult==null) {
    //            //可以注册
    //service 层
    //        int result = userService.addUser(user);
    //        if(result==1) {
    //            //数据库插入成功
    //            jsonResult=new JsonResult(JsonResult.STATE_SUCCESS,"注册成功",null);
    //        }else {
    //            //数据库插入失败
    //
    //        }
    //
    //    }else {
    //        //存在相同的用户名，不可以注册
    //        jsonResult=new JsonResult(JsonResult.STATE_ERROR,"存在重复的用户名",null);
    //
    //    }
    //
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


    /**
     * 通过id获取用户信息
     */
    @RequestMapping("/user/get/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer uid) {
// System.out.println("=="+userid);
        // User user = userService.
        return userService.getUser(uid);
    }


    /**
     * 用户信息
     */
    @RequestMapping(value = "/changeUser")
//@ResponseBody
    public String userUpdate(User user) {

        //System.out.println("====UserControll"+user);
        int rows = userService.changeUserInfo(user);
        System.out.println();
        if(rows > 0){
            return "redirect:";// 重定向 到
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
