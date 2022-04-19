package com.ch.pojo.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class Link {
    private Integer id;

    private String name;

    private String url;

    private String logo;

    private String description;
// sort 分类
    private Integer priority;
}
