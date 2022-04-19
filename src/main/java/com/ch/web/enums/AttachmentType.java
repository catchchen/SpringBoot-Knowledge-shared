package com.ch.web.enums;

public enum AttachmentType implements ValueEnum<Integer> {
    /**
     * 服务器
     */
    LOCAL(0),
    /**
     * 阿里云
     */
    ALIOSS(4),

    /**
     * 百度云
     */
    BAIDUBOS(5);
    private final Integer value;
    AttachmentType(Integer value){
        this.value = value;
    }
    @Override
    public Integer getValue() {
        return value;
    }
}
