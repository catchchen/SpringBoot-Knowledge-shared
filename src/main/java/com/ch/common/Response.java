package com.ch.common;

import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * @author chenk
 * @date 2022/3/19 22:47
 * @description
 */
@Setter
public class Response<T> {
    private Integer status;

    private String message;
    /**
     * Response data
     */
    private T data;

    public Response(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    @NonNull
    public static <T> Response<T> ok(@Nullable String message, @Nullable T data){
        return new Response<>(HttpStatus.OK.value(), message, data);
    }
    @NonNull
    public static <T> Response ok(@Nullable String message){
       return ok(message,null);
    }
    /**
     * Creates an ok result with data only. (Default message is OK, status is 200)
     *
     * @param data data to response
     * @param <T> data type
     * @return base response with data
     */
    public static <T> Response ok(@Nullable T data){
        return new Response(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), data);
    }
    public static <T> Response fail(){
        return new Response(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null);
    }

    public static <T> Response fail(@Nullable String message){
        return new Response(HttpStatus.BAD_REQUEST.value(), message, null);
    }
}
