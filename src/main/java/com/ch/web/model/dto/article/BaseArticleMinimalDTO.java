package com.ch.web.model.dto.article;

import com.ch.web.enums.PostEditorType;
import com.ch.web.enums.PostStatus;
import com.ch.web.model.dto.OutputConverter;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode
public class BaseArticleMinimalDTO implements OutputConverter {

    private Integer id;

    private String title;

    private PostStatus status;

    private String slug;

    private Date updateTime;

    private Date createTime;

    private Date editTime;
//
    private String fullPath;
}
