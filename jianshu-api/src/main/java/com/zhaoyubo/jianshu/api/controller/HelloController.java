package com.zhaoyubo.jianshu.api.controller;

import com.zhaoyubo.jianshu.api.common.constant.JwtConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "/test")
    public String dosomething(HttpServletRequest request, HttpServletResponse response)  throws IOException {
        log.info("hello controller");
        response.setHeader(JwtConst.TOKEN_HEADER, "dsfsdfdsf");
        return "hello";
    }
}
