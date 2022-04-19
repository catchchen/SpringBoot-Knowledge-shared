package com.ch.common;

import lombok.Builder;
import lombok.Data;

/**
 * @author chenk
 * @date 2022/3/2 21:56
 * @description
 */
@Data
@Builder
public class Result<T> {
    // 响应状态码
    private int status;
    // 响应信息
    private String msg;
    // 查询结果
    private T data;
}
