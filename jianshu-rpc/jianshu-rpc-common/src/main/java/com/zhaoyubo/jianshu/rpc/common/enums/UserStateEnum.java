package com.zhaoyubo.jianshu.rpc.common.enums;

import com.zhaoyubo.jianshu.commonlib.cmmon.enums.CodeUniqueness;

public enum UserStateEnum implements CodeUniqueness {
    NORMAL(1, "账户正常"),
    ABNORMAL(2, "账户异常"),
    FREEZON(3, "账户冻结")
    ;

    private String name;
    private int code;

    UserStateEnum(int code, String name) {
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getName() {
        return name;
    }
}
