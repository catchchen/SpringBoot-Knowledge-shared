package com.ch.web.enums;

public enum AttachmentType implements ValueEnum<Integer> {
    /**
     * 服务器
     */
    LOCAL(0);
    private final Integer value;
    AttachmentType(Integer value){
        this.value = value;
    }
    @Override
    public Integer getValue() {
        return value;
    }
}
