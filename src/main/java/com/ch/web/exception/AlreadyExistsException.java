package com.ch.web.exception;

/**
 * @author chenk
 * @date 2022/3/20 10:15
 * @description
 */
public class AlreadyExistsException extends BadRequestException{
    public AlreadyExistsException(String message) {
        super(message);
    }

    public AlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}
