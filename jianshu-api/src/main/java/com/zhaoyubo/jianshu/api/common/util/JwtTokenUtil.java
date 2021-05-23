package com.zhaoyubo.jianshu.api.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;

import static com.zhaoyubo.jianshu.api.common.constant.JwtConst.*;

@Component
public class JwtTokenUtil {

    // 角色的key
    private static final String ROLE_CLAIMS = "role";

    // 创建token
    public static String createToken(String username, String role, boolean rememberMe) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(ROLE_CLAIMS, role);
        long expiration = rememberMe ? REMEMBER_ME_EXPIRATION : DEFAULT_EXPIRATION;
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .setClaims(map)
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .compact();
    }

    // 从token中获取用户名
    public static String getUsername(String token) {
        return getTokenBody(token).getSubject();
    }

    // 获取用户角色
    public static String getUserRole(String token) {
        return (String) getTokenBody(token).get(ROLE_CLAIMS);
    }

    public static boolean validateToken(String token){
        try {
            return getTokenBody(token).getExpiration().after(new Date());
        } catch (Exception e){
            return false;
        }
    }

    private static Claims getTokenBody(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();
    }

}
