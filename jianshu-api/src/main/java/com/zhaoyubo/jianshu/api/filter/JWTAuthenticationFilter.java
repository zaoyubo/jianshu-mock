package com.zhaoyubo.jianshu.api.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhaoyubo.jianshu.api.common.constant.JwtConst;
import com.zhaoyubo.jianshu.api.common.util.JwtTokenUtil;
import com.zhaoyubo.jianshu.api.controller.request.LoginUserRequest;
import com.zhaoyubo.jianshu.commonlib.cmmon.utils.JacksonJsonUtil;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static com.zhaoyubo.jianshu.api.common.constant.JwtConst.TOKEN_HEADER;
import static com.zhaoyubo.jianshu.api.common.log.CommonLogger.INFO_LOGGER;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
        super.setFilterProcessesUrl("/auth/login");
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response) throws AuthenticationException {

        // 从输入流中获取到登录的信息
        try {
            LoginUserRequest loginUser = new ObjectMapper().readValue(request.getInputStream(), LoginUserRequest.class);
            Map<String,Object> map = new HashMap<>();
            map.put("rememberMe", loginUser.isRememberMe());
            AbstractAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(loginUser.getUsername(), loginUser.getPassword(), null);
            authentication.setDetails(map);
            return authenticationManager.authenticate(authentication);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // 成功验证后调用的方法
    // 如果验证成功，就生成token并返回
    @Override
    protected void successfulAuthentication(HttpServletRequest request,
                                            HttpServletResponse response,
                                            FilterChain chain,
                                            Authentication authResult) throws IOException {

        User jwtUser = (User) authResult.getPrincipal();
        String role = "";
        boolean rememberMe = (boolean) ((Map)(authResult.getDetails())).get("rememberMe");
        String token = JwtTokenUtil.createToken(jwtUser.getUsername(), role, rememberMe);
        response.setHeader(TOKEN_HEADER, JwtConst.TOKEN_PREFIX + token);
        INFO_LOGGER.info("successfulAuthentication,user:{},rememberMe:{},token{}", jwtUser, rememberMe, token);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException {
        response.getWriter().write("authentication failed, reason: " + failed.getMessage());
    }
}