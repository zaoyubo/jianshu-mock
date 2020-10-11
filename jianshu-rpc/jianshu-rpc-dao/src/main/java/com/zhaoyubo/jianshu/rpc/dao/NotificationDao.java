package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.NotificationDomain;

public interface NotificationDao {
    int deleteByPrimaryKey(Long id);

    int insert(NotificationDomain record);

    int insertSelective(NotificationDomain record);

    NotificationDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NotificationDomain record);

    int updateByPrimaryKey(NotificationDomain record);
}