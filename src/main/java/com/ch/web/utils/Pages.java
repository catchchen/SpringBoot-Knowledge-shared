package com.ch.web.utils;

import lombok.Data;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:38
 * @description 分页插件
 */
@Data
public class Pages<T> {
    private int total;    // 总条数
    private int page;     // 当前页
    private int size;     // 每页数

    private List<T> rows; // 结果集

    /**
     use test;

     create table `user`(

     uid int PRIMARY KEY AUTO_INCREMENT comment '主键,默认自增',
     username varchar(36) not null comment '用户名',
     `password` varchar(20) not null comment '密码',
     pic varchar(100) comment '头像在服务器中的位置',
     is_admin tinyint(1) DEFAULT 0 comment '默认0，不是管理者',
     is_forbidden tinyint(1) DEFAULT 0 comment '默认0，代表false没有被禁止',
     attr1 VARCHAR(100) DEFAULT null comment '扩展字段1',
     attr2 varchar(100) DEFAULT null comment '扩展字段2',
     attr3 varchar(100) DEFAULT null comment '扩展字段3',
     attr4 varchar(100) DEFAULT null comment '扩展字段4'
     )


     */
}
