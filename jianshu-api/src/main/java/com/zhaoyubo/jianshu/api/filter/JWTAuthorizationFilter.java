package com.zhaoyubo.jianshu.api.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhaoyubo.jianshu.api.common.constant.JwtConst;
import com.zhaoyubo.jianshu.api.common.util.JwtTokenUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JWTAuthorizationFilter extends BasicAuthenticationFilter {

    public JWTAuthorizationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws IOException, ServletException {

        String tokenHeader = request.getHeader(JwtConst.TOKEN_HEADER);
        // 如果请求头中没有Authorization信息则直接放行了
        if (tokenHeader == null || !tokenHeader.startsWith(JwtConst.TOKEN_PREFIX)) {
            chain.doFilter(request, response);
            return;
        }
        // 如果请求头中有token，则进行解析，并且设置认证信息
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = getAuthentication(tokenHeader);
        if (usernamePasswordAuthenticationToken != null){
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
        } else {
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            String reason = "统一处理，原因：" + "token 无效";
            response.getWriter().write(new ObjectMapper().writeValueAsString(reason));
            response.getWriter().flush();
            return;
        }

        super.doFilterInternal(request, response, chain);
    }

    // 这里从token中获取用户信息并新建一个token
    private UsernamePasswordAuthenticationToken getAuthentication(String tokenHeader)  {
        String token = tokenHeader.replace(JwtConst.TOKEN_PREFIX, "");
        boolean valid = JwtTokenUtil.validateToken(token);
        if(valid){
            String username = JwtTokenUtil.getUsername(token);
//            String role = JwtTokenUtil.getUserRole(token);
            String role = "api just one role";
            if (username != null) {
                return new UsernamePasswordAuthenticationToken(username, null,
                        Collections.singleton(new SimpleGrantedAuthority(role))
                );
            }
        }
        return null;
    }
}