package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.UserDomain;

public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserDomain record);

    int insertSelective(UserDomain record);

    UserDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDomain record);

    int updateByPrimaryKey(UserDomain record);

    UserDomain selectByPhone(Long phone);
}