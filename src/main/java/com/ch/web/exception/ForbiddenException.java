package com.ch.web.exception;

import com.ch.web.AbstractException;
import org.springframework.http.HttpStatus;

/**
 * @author chenk
 * @date 2022/3/20 10:15
 * @description
 */
public class ForbiddenException extends AbstractException {

    public ForbiddenException(String message) {
        super(message);
    }

    public ForbiddenException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.FORBIDDEN;
    }
}
