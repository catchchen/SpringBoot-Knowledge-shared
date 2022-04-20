package com.ch.web.model.dto.tag;

import lombok.Data;

import java.util.Date;
@Data
public class TagDTO {

    private Integer id;

    private String name;

    private String slug;

    private String thumbnail;

    private Date createTime;

    private String fullPath;

}
