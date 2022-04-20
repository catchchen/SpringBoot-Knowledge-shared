package com.ch.config;

import org.springframework.web.servlet.config.annotation.*;

/**
 * @author chenk
 * @date 2022/2/26 16:58
 * @description
 */
//@Configuration
//@EnableAutoConfiguration
public class MyMvcConfiguration extends WebMvcConfigurationSupport {
    // 设置配置 首页 welcome页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/**")
                .addResourceLocations("classpath:/user");
//        registry.
//                addResourceHandler(
//                        "/user/css/**",
//                        "/user/js/**",
//                        "/user/**");
    }

    // 添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new AuthInterceptor());
//                .addPathPatterns("/user/login");
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/api/**")
//                .excludePathPatterns("/api/login");
    }
}
