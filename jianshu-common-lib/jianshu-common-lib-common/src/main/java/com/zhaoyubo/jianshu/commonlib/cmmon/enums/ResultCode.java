package com.zhaoyubo.jianshu.commonlib.cmmon.enums;


import lombok.Getter;

@Getter
public enum ResultCode {

    /**
     * 用于 Result 的 code 和 msg
     */
    SUCCESS(1000, "操作成功"),

    FAILED(1001, "响应失败"),

    VALIDATE_FAILED(1002, "参数校验失败"),

    OTHER_ERROR(4000, "其他错误");


    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}