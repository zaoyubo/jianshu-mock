package com.zhaoyubo.jianshu.api.service.impl;

import com.zhaoyubo.jianshu.api.Tester;
import com.zhaoyubo.jianshu.api.service.UserService;
import com.zhaoyubo.jianshu.rpc.item.UserItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceImplTest extends Tester {

    @Autowired
    UserService userService;

    @Test
    public void findUserByPhone() {
        UserItem userItem = userService.findUserByPhone(15680777646L);
        System.out.println(userItem);
    }
}