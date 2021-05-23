package com.zhaoyubo.jianshu.api.service;

import com.zhaoyubo.jianshu.rpc.item.UserItem;

public interface UserService {
    UserItem findUserByPhone(Long phone);
}
