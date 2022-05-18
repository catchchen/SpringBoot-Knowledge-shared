package com.ch.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableId
    private Integer id;
    /**
     * 访问的链接
     */
    private String slug;
    private Integer type;
    // 转化 生成的html
    private String formatContent;
    // 文章 源
    private String originalContent;
    private String summary;
    // 私有
//    private Boolean isPrivate;
    @TableField("create_time")
    private Date createDate;
    @TableField("update_time")
    private Date updateDate;
    private Date editTime;
    // 是否禁止评论 default 0
    private byte disallowComment;
    // 文章状态
    private int status;
    // 置顶
    private Integer topPriority;
    /**
     * 封面缩略图
     */
    private String thumbnail;
    private String title;
    private String template;
    private String url;
    private long likes;
    private long visits;
    private long wordCount;
}
