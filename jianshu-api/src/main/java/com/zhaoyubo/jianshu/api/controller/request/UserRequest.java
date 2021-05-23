package com.zhaoyubo.jianshu.api.controller.request;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class UserRequest {
    @NotNull(message = "must exist phone")
    private Long phone;
    @NotBlank(message = "must exist password")
    private String password;
    @NotBlank(message = "must exist nickname")
    private String nickname;
}
