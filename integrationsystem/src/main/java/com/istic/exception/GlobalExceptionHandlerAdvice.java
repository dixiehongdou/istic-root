package com.istic.exception;


import com.istic.base.BaseService;
import com.istic.base.Result;
import org.springframework.stereotype.Component;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by hch on 2019/1/4.
 */
@ControllerAdvice
@Component
public class GlobalExceptionHandlerAdvice extends BaseService {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public Result handler(MethodArgumentNotValidException ex) {
        StringBuilder errorMsg = new StringBuilder();
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();
        allErrors.stream().forEach(x -> errorMsg.append(x.getDefaultMessage()).append(";"));
        return error(errorMsg.toString());
    }
}
