package com.ch.web.model.dto;

import com.ch.pojo.entity.Attachment;
import lombok.Data;

import java.util.Date;

/**
 * @author chenk
 */
@Data
public class AttachmentDTO implements OutputConverter<AttachmentDTO, Attachment>{
    private Integer id;

    private String name;

    private String path;

    private Date createTime;

    private String suffix;

    private Integer width;

    private Integer height;

    private Long size;
}
