package com.ch;

import net.bytebuddy.matcher.StringMatcher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author chenk
 * @date 2022/2/26 17:22
 * @description
 */
@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public ModelAndView Hello(@PathVariable(value = "name") String name){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("username",name);
        // BD操作
        return mv;
    }

    @GetMapping("/hello")
    public String Hi(){
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("just");
        objects.add("for");
        objects.add("test");
        return objects.stream().map(str -> {
            str +=" ";
            return str;
        }).collect(Collectors.toList()).toString();
    }

    @GetMapping("user/toReg")
    public String toRegisterPage(){
//        跳转页面
        return "register";
    }
}
