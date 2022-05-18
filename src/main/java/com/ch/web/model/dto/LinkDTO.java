package com.ch.web.model.dto;

import com.ch.pojo.entity.Link;
import lombok.Data;

@Data
public class LinkDTO implements OutputConverter<LinkDTO, Link> {

    private String name;

    private String url;

    private String logo;

    private String description;

    private String team;

    private Integer priority;

}
