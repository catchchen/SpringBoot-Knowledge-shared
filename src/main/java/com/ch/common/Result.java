package com.ch.common;

/**
 * @author chenk
 * @date 2022/3/2 21:56
 * @description
 */
public class Result<T> {

    private String status; // 响应状态码

    private String msg;

    private T data; // 查询结果

    public Result setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    /**
     * request success 响应结果
     * @return
     */
    public static Result success(){
        return new Result().setStatus("SUCCESS_CODE");
    }

    /**
     * request failure 的结果
     * @return
     */
    public static Result failure(){
        return new Result().setStatus("FAILURE_CODE");
    }
}
