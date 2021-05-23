package com.zhaoyubo.jianshu.rpc.iface;

import com.zhaoyubo.jianshu.rpc.item.UserItem;

public interface UserService {
    UserItem findUserByPhone(Long phone);
    int insertUser(UserItem userItem);
    UserItem findUserById(Long id);
}
