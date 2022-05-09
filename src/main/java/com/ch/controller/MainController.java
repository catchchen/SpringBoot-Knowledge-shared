package com.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chenk
 * @date 2022/4/22 23:14
 * @description
 */
@Controller
public class MainController {
    /**
     * Index redirect uri.
     */
    private static final String INDEX_REDIRECT_URI = "user/index.html/#login";
    private static final String ADMIN_REDIRECT_URI = "admin/index.html";
    @GetMapping("login")
    public void login(HttpServletResponse response) throws IOException {
        response.sendRedirect(INDEX_REDIRECT_URI);
    }
    @GetMapping("admin/login")
    public void admin(HttpServletResponse response) throws IOException {
        response.sendRedirect(ADMIN_REDIRECT_URI);
    }
}
