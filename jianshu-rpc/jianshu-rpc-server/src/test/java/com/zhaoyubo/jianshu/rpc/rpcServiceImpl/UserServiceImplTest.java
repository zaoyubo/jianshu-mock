package com.zhaoyubo.jianshu.rpc.rpcServiceImpl;

import com.zhaoyubo.jianshu.rpc.Tester;
import com.zhaoyubo.jianshu.rpc.iface.UserService;
import com.zhaoyubo.jianshu.rpc.item.UserItem;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceImplTest extends Tester {

    @Autowired
    UserService userService;

    @Test
    public void insertUser() {
        userService.insertUser(UserItem.builder().phone(123L).password("2").nickname("qqq").build());
    }
}