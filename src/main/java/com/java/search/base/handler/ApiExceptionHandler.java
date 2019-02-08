package com.java.search.base.handler;

import com.java.search.base.ApiResponse;
import com.java.search.base.exception.CustomizeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * restful api全局异常处理器
 *
 * @author xzmeasy
 * @version 1.0
 * @since 星期日 二月,2019
 */
@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(CustomizeException.class)
    @ResponseBody
    public ApiResponse<Object> resolveException(CustomizeException exception) {
        return ApiResponse.error(exception.getCode(), exception.getMessage());
    }

}
