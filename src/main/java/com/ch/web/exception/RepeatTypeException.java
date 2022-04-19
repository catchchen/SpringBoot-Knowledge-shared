package com.ch.web.exception;

/**
 * @author chenk
 * @date 2022/3/20 10:15
 * @description
 */
public class RepeatTypeException extends ServiceException{
    public RepeatTypeException(String message) {
        super(message);
    }

    public RepeatTypeException(String message, Throwable cause) {
        super(message, cause);
    }
}
