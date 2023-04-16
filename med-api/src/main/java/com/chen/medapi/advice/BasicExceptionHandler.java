package com.chen.medapi.advice;

import base.Result;
import exception.RetrievalException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author chen
 * @date 2023.04.10 11:45
 */
@Slf4j
@RestControllerAdvice
public class BasicExceptionHandler {

    @ExceptionHandler(value = RetrievalException.class)
    public Result handleRetrievalException(RetrievalException exception){
        return Result.fail(exception.getRetrivalErrorCode());
    }

}
