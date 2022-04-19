package com.ch.web;

import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * @author chenk
 * @date 2022/3/19 23:18
 * @description
 */
public abstract class AbstractException extends RuntimeException {
    /**
     * error data
     */
    private Object errorData;

    public AbstractException(String message){super(message);}

    public AbstractException(String message, Throwable cause){super(message, cause);}

    @NonNull
    public abstract HttpStatus getStatus();

    @Nullable
    public Object getErrorData() {
        return errorData;
    }

    @NonNull
    public AbstractException setErrorData(@Nullable Object errorData) {
        this.errorData = errorData;
        return this;
    }
}
