package com.zhaoyubo.jianshu.api.service.impl;

import com.google.common.collect.Lists;
import com.zhaoyubo.jianshu.api.service.UserService;
import com.zhaoyubo.jianshu.rpc.item.UserItem;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Long phone = NumberUtils.toLong(s);
        UserItem userItem = userService.findUserByPhone(phone);
        User user = new User(userItem.getPhone().toString(), userItem.getPassword(), Lists.newArrayList());
        return user;
    }
}
