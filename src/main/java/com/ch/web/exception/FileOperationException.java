package com.ch.web.exception;

/**
 * @author chenk
 * @date 2022/3/20 10:15
 * @description
 */
public class FileOperationException extends ServiceException {

    public FileOperationException(String message) {
        super(message);
    }

    public FileOperationException(String message, Throwable cause) {
        super(message, cause);
    }
}
