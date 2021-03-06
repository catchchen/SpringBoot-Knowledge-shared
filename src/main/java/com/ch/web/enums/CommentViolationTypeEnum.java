package com.ch.web.enums;

import lombok.Getter;

@Getter
public enum CommentViolationTypeEnum {
    /**
     * 评论违规类型
     */
    NORMAL(0),
    /**
     * 评论过于频繁
     */
    FREQUENTLY(1);
    private final int type;
    CommentViolationTypeEnum(int type) {
        this.type = type;
    }
}
