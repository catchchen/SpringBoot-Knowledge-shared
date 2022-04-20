package com.ch.interceptor;

import com.ch.pojo.entity.User;
import com.ch.service.UserService;
import com.ch.web.utils.HttpContextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Integer id = request.getIntHeader("user_id");
        String token = request.getHeader("token");

        if(StringUtils.isEmpty(token)){
            setReturn(response,403,"未登录");
            return false;
        }
        System.out.println(id);
        User user = userService.getUser(id);
        //        使用加密token的方法再生成一份token看是否相同
        // 校验token能否解密出来用户信息来获取访问者
        // 2.token是否已经过期
        return true;
    }


    public static void setReturn(HttpServletResponse response, Integer code, String msg){
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-control-Allow-Credentials", "true");
        httpServletResponse.setHeader("Access-control-Allow-Origin", HttpContextUtils.getOrigin());

    }
}
