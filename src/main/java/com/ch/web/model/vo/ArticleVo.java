package com.ch.web.model.vo;

import lombok.Data;

@Data
public class ArticleVo {

    private String title; // 文章标题
    private String originalContent; // 内容
    private String url; // 照片在服务器中的地址

}
