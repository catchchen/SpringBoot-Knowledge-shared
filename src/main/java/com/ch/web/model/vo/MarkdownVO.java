package com.ch.web.model.vo;

import lombok.Data;
import lombok.ToString;

/**
 * @author chenk
 * @date 2022/4/19 23:05
 * @description
 */
@Data
@ToString
public class MarkdownVO {
    private String title;

    private String slug;

    private String originalContent;

    private String frontMatter;
}
