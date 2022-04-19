package com.ch.web.enums;

public enum PostStatus implements ValueEnum<Integer>{
    /**
     * Published status.
     */
    PUBLISHED(0),

    /**
     * Draft status.
     */
    DRAFT(1),

    /**
     * Recycle status.
     */
    RECYCLE(2),

    /**
     * private status
     */
    PRIVATE(3);

    private final int value;

    PostStatus(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
