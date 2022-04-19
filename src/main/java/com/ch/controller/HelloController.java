package com.ch.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * @author chenk
 * @date 2022/2/26 17:22
 * @description
 */
@RequiredArgsConstructor
@RestController
public class HelloController {

    private final RedisTemplate redisTemplate;

    @GetMapping("/hello/{name}")
    public ModelAndView Hello(@PathVariable(value = "name") String name){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("username",name);
        // BD操作
        return mv;
    }

//    @GetMapping("/hello")
//    public String Hi(){
//        ArrayList<Object> objects = new ArrayList<>();
//        objects.add("just");
//        objects.add("for");
//        objects.add("test");
//        return objects.stream().map(str -> {
//            str +=" ";
//            return str;
//        }).collect(Collectors.toList()).toString();
//    }

    @GetMapping("/redis/get/{key}")
    public Object redis(@PathVariable String key){
        ArrayList<Object> objects = new ArrayList<>();

        return "";
    }
}
