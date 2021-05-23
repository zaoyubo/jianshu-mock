package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.ProfileDomain;

public interface ProfileDao {
    int deleteByPrimaryKey(Long id);

    int insert(ProfileDomain record);

    int insertSelective(ProfileDomain record);

    ProfileDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProfileDomain record);

    int updateByPrimaryKey(ProfileDomain record);
}