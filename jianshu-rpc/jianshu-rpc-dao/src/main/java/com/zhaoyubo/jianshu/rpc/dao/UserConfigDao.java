package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.UserConfigDomain;

public interface UserConfigDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserConfigDomain record);

    int insertSelective(UserConfigDomain record);

    UserConfigDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserConfigDomain record);

    int updateByPrimaryKey(UserConfigDomain record);
}