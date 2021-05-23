package com.zhaoyubo.jianshu.api.service.impl;

import com.zhaoyubo.jianshu.rpc.iface.UserService;
import com.zhaoyubo.jianshu.rpc.item.UserItem;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements com.zhaoyubo.jianshu.api.service.UserService {

    @Reference(version = "${dubbo.service.version}")
    private UserService userService;

    @Override
    public UserItem findUserByPhone(Long phone) {
        return userService.findUserByPhone(phone);
    }
}
