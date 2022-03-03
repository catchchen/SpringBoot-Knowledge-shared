package com.ch.web.utils;

import lombok.Data;

import java.util.List;

/**
 * @author chenk
 * @date 2022/2/23 21:38
 * @description
 */
@Data
public class Pages<T> {
    private int total;    // 总条数
    private int page;     // 当前页
    private int size;     // 每页数

    private List<T> rows; // 结果集
}
