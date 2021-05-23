package com.zhaoyubo.jianshu.commonlib.cmmon.result;

import com.zhaoyubo.jianshu.commonlib.cmmon.enums.ResultCode;
import lombok.Getter;

@Getter
public class RestResult<T> {
    private int code;

    private String msg;

    private T data;

    public RestResult(T data){
        this(ResultCode.SUCCESS, data);
    }

    public RestResult(ResultCode resultCode, T data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }
}
