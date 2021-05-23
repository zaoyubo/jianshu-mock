package com.zhaoyubo.jianshu.api.advice;

import com.zhaoyubo.jianshu.api.common.exception.ApiException;
import com.zhaoyubo.jianshu.commonlib.cmmon.enums.ResultCode;
import com.zhaoyubo.jianshu.commonlib.cmmon.result.RestResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RestResult<String> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return new RestResult<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }

    @ExceptionHandler(ApiException.class)
    public RestResult<String> apiExceptionHandler(ApiException e) {
        return new RestResult<>(e.getResultCode(), e.getData());
    }


}