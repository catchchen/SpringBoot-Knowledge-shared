package com.ch.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @author chenk
 * @date 2022/2/23 21:20
 * @description
 */
@Data
public class Article {
    private Long aid;
    private Integer uid; // 所属用户
    private String artTitle; //
    private String context; // 内容
    private Integer goods_stock; // 库存
    private Boolean isPrivate;
    private Date createDate; // 日期
    private Date updateDate; // 日期
    private Integer goods_sales; // 出售人
    private String articlePic; // 照片在服务器中的地址
//
//    private Integer start;            // 起始行
//    private Integer rows;             // 所取行数

}