package com.zhaoyubo.jianshu.api.common.constant;

public class JwtConst {
    // 以毫秒ms计
    public static final long DEFAULT_EXPIRATION = 60 * 60 * 1000;
    public static final long REMEMBER_ME_EXPIRATION = 7 * 24 * 60 * 60 * 1000;
    // JWT密码
    public static final String SECRET = "8Zz5tw0Ionm3XPZZfN0NOml3z9FMfmpgXwovR9fp6ryDIoGRM8EPHAB6iHsc0fb";
    // Token前缀
    public static final String TOKEN_PREFIX = "Bearer ";
    // 存放Token的Header Key
    public static final String TOKEN_HEADER = "Authorization";
}
