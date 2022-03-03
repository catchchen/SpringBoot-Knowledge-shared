package com.ch.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:16
 * @description
 */
@Data
public class Sort {

    private int sid;// 分类id
    private String sortName;// 分类名称
    private List<Integer> arts; //

}
