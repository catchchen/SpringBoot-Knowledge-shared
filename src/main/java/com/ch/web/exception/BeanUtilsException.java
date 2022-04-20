package com.ch.web.exception;

import com.ch.web.AbstractException;
import org.springframework.http.HttpStatus;

/**
 * @author chenk
 * @date 2022/3/20 10:15
 * @description
 */
public class BeanUtilsException extends AbstractException {

    public BeanUtilsException(String message) {
        super(message);
    }

    public BeanUtilsException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}
