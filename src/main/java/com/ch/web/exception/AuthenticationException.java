package com.ch.web.exception;

import com.ch.web.AbstractException;
import org.springframework.http.HttpStatus;

/**
 * @author chenk
 * @date 2022/3/20 10:15
 * @description
 */
public class AuthenticationException extends AbstractException {
    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.UNAUTHORIZED;
    }
}
