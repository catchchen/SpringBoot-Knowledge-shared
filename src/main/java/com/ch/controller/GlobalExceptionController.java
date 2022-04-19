package com.ch.controller;

import com.ch.web.exception.AlreadyExistsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@ControllerAdvice
public class GlobalExceptionController {

    private static final String NOT_FOUND_TEMPLATE = "404.html";

    private static final String INTERNAL_ERROR_TEMPLATE = "500.html";

    private static final String ERROR_TEMPLATE = "error.html";

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException ex){
        return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(AlreadyExistsException.class)
//    public  handleRuntimeException
}
