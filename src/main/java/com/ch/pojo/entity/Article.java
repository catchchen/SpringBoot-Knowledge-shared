package com.ch.pojo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author chenk
 * @date 2022/2/23 21:20
 * @description
 */
@Data
public class Article {
    private Long id;
    private int uid; // 所属用户
    private String artTitle; //
    // 转化 生成的html
    private String formatContent;
    private String originalContent;
    // 页面中展示的概略内容
    private String summary;
    private Boolean isPrivate;
    private Date createDate; // 日期
    private Date updateDate; // 日期
    private Date editDate; // 日期
    // 是否禁止评论
    private boolean disallowComment;

    private long like;

    private String picture; // 照片在服务器中的地址
    private long visits;
}
