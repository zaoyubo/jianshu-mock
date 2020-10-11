package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.TimelineDomain;

public interface TimelineDao {
    int deleteByPrimaryKey(Long id);

    int insert(TimelineDomain record);

    int insertSelective(TimelineDomain record);

    TimelineDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TimelineDomain record);

    int updateByPrimaryKey(TimelineDomain record);
}