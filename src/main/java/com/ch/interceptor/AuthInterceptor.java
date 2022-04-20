package com.ch.interceptor;

import com.ch.controller.context.api.UserController;
import com.ch.pojo.entity.User;
import com.ch.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Slf4j
public class AuthInterceptor implements HandlerInterceptor {
    @Autowired
    UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("pre authenticate {}...",request.getRequestURI());
        try {
            authenticateByHeader(request);
        }catch(RuntimeException e){
            log.info("login by authorization header failed", e);
        }
        return true;
    }

    private void authenticateByHeader(HttpServletRequest req) {
        String authHeader = req.getHeader("Authorization");
        if (authHeader != null && authHeader.startsWith("Basic ")) {
            log.info("try authenticate by authorization header...");
            String up = new String(Base64.getDecoder().decode(authHeader.substring(6)), StandardCharsets.UTF_8);
            int pos = up.indexOf(':');
            if (pos > 0) {
                String email = null;
                try {
                    email = URLDecoder.decode(up.substring(0, pos), String.valueOf(StandardCharsets.UTF_8));
                    String password = URLDecoder.decode(up.substring(pos + 1), String.valueOf(StandardCharsets.UTF_8));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
//                User user = userService.signin(email, password);// 登录验证
//                req.getSession().setAttribute(UserController.KEY_USER, user);
                log.info("user {} login by authorization header ok.", email);
            }
        }
    }

}
