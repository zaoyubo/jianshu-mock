package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.FollowUserDomain;

import java.util.List;

public interface FollowUserDao {
    int deleteByPrimaryKey(Long id);

    int insert(FollowUserDomain record);

    int insertSelective(FollowUserDomain record);

    FollowUserDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FollowUserDomain record);

    int updateByPrimaryKey(FollowUserDomain record);

    List<Long> findFolloweeByUserId(Long userId, Integer offset, Integer limit);

    Integer countFolloweeByUserId(Long userId);

    List<Long> findFollowerByUserId(Long userId, Integer offset, Integer limit);

    Integer countFollowerByUserId(Long userId);
}