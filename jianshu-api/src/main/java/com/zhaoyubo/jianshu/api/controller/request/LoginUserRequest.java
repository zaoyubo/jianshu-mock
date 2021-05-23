package com.zhaoyubo.jianshu.api.controller.request;

import lombok.Data;

@Data
public class LoginUserRequest {
    private boolean rememberMe = false;
    private String password;
    /**
     * username 对应 登陆表单填写的username（可能是邮箱、手机号、用户名等其中一种）
     */
    private String username;
}
