package com.ch.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:16
 * @description
 */
@Data
@TableName("categories")
public class Category {
    /**
     *    分类id
     */
    @TableId
    private Integer id;
    /**
     *    分类名称
     */
    private String name;
    //分类描述
    private String description;
    // default 0
    private int parentId;
    private String slug;
    private String slugName;
    private String thumbnail;
}
