package com.ch.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author chenk
 * @date 2022/2/23 21:20
 * @description
 */
@Data
@TableName("posts")
public class Article {
    private int id;
    /**
     * 访问的链接
     */
    private String slug;
    private int type;
    // 转化 生成的html
    private String formatContent;
    // 文章 源
    private String originalContent;
    private String summary;
    // 私有
//    private Boolean isPrivate;
    private Date createDate;
    private Date updateDate;
    private Date editDate;
    // 是否禁止评论 default 0
    private byte disallowComment;

    private int status;
    private Integer topPriority;
    /**
     * 封面缩略图
     */
    private String thumbnail;
    private String title;
    private String template;
    private String url;
    private long like;
    private long visits;
    private long wordCount;
}
