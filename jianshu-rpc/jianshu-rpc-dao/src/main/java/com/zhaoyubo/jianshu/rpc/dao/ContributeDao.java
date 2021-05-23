package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.ContributeDomain;

public interface ContributeDao {
    int deleteByPrimaryKey(Long id);

    int insert(ContributeDomain record);

    int insertSelective(ContributeDomain record);

    ContributeDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContributeDomain record);

    int updateByPrimaryKey(ContributeDomain record);
}