package com.ch.web.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;

/**
 * @author chenk
 * @date 2022/4/5 14:25
 * @description http 上下文工具类
 */
public class HttpContextUtils {
    private HttpContextUtils(){}

    public static HttpServletRequest getHttpServletRequest(){
        return ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
    }
    public static String getDomain(){
            HttpServletRequest request = getHttpServletRequest();
            StringBuffer url = request.getRequestURL();
            return url.delete(url.length() - request.getRequestURI().length(),url.length())
                    .toString();
    }
    // 获取HttpServletRequest的origin
    public static String getOrigin(){
            HttpServletRequest request = getHttpServletRequest();
            return request.getHeader("Origin");
    }
}