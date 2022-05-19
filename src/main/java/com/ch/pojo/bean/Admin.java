package com.ch.pojo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("admin")
public class Admin {
    private String username;
    private String password;
}