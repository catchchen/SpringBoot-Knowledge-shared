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
    /**
     *    分类id
     */
    private Integer id;
    /**
     *    分类名称
     */

    private String name;

    //分类描述
    private String description;
    private Integer parentId;
//    private List<Integer> articles;

    /**
     *         if (description == null) {
     *             description = "";
     *         }
     *
     *         if (parentId == null || parentId < 0) {
     *             parentId = 0;
     *         }
     */
}
