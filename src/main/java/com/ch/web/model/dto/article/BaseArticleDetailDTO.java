package com.ch.web.model.dto.article;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * index content 的文章显示界面
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class BaseArticleDetailDTO extends BaseArticleSimpleDTO {
    private String originalContent;

    private String formatContent;

    private Long commentCount;
}
