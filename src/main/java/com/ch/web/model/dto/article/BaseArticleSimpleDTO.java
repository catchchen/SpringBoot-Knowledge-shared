package com.ch.web.model.dto.article;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * 用于 index content 展示
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class BaseArticleSimpleDTO extends BaseArticleMinimalDTO {
    private String summary;

    private String thumbnail;

    private Long visits;

    private Boolean disallowComment;

    private String password;

    private String template;

    private Integer topPriority;

    private Long likes;

    private Long wordCount;

    public boolean isTopped() {
        return this.topPriority != null && this.topPriority > 0;
    }
}
