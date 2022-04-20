package com.ch.filter.base;

import com.ch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

//@Component
public class AuthFilterRegistrationBean {
//    @Autowired
//    private UserService userService;
//
//    @Override
//    public Filter getFilter() {
//        setOrder(10);
//        return new AuthFilter();
//    }
//     class AuthFilter implements Filter {
//
//         @Override
//         public void init(FilterConfig filterConfig) throws ServletException {
//             Filter.super.init(filterConfig);
//         }
//
//         @Override
//         public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//
//         }
//
//         @Override
//         public void destroy() {
//             Filter.super.destroy();
//         }
//     }
}
