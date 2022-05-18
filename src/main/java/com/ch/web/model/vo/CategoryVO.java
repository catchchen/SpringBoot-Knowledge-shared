package com.ch.web.model.vo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author chenk
 * @date 2022/4/19 23:07
 * @description
 */
@Data
@ToString
public class CategoryVO {
    private int id;
    private Date createTime;
    private String description;
    private String slug;
    private String slugName;
    private String thumbnail;
}
