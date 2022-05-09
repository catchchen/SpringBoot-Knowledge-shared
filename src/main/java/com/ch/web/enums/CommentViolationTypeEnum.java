package com.ch.web.enums;

import lombok.Getter;

@Getter
public enum CommentViolationTypeEnum {
    NORMAL(0),
    /**
     * 评论过于频繁
     */
    FREQUENTLY(1),
    /**
     * 评论违规类型
     */
    STOP(2);

    private final int type;
    CommentViolationTypeEnum(int type) {
        this.type = type;
    }
}
