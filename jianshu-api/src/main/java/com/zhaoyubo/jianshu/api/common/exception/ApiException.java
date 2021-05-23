package com.zhaoyubo.jianshu.api.common.exception;

import com.zhaoyubo.jianshu.commonlib.cmmon.enums.ResultCode;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {
    private ResultCode resultCode;
    private String data;

    public ApiException(ResultCode resultCode, String data) {
        this.resultCode = resultCode;
        this.data = data;
    }

    public ApiException(String data) {
        this(ResultCode.OTHER_ERROR, data);
    }
}
