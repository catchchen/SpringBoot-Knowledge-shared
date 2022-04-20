package com.ch.pojo.entity;

import com.ch.web.enums.AttachmentType;
import lombok.Data;

/**
 * @author chenk
 * @date 2022/3/19 22:38
 * @description
 */
@Data
public class Attachment {
    private Integer id;
    /**
     *     附件名称
     */
    private String name;
    /**
     * Attachment access path.
     */
    private String path;
    /**
     *      缩略图
     */
    private String thumbPath;
// Attachment suffix,such as png, zip, mp4, jpge.
    private String suffix;
    /**
     * Attachment width,height and size
     */
    private String fileKey;
    private AttachmentType type;
    private Integer width;
    private Integer height;
    private Long size;
}
