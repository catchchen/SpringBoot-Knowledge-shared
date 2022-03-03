package com.ch.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenk
 * @date 2022/2/26 17:22
 * @description
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello(){

        // BD操作
        return "hello hello";
    }
}
