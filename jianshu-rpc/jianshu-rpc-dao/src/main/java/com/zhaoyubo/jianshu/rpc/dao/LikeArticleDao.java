package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.LikeArticleDomain;

public interface LikeArticleDao {
    int deleteByPrimaryKey(Long id);

    int insert(LikeArticleDomain record);

    int insertSelective(LikeArticleDomain record);

    LikeArticleDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LikeArticleDomain record);

    int updateByPrimaryKey(LikeArticleDomain record);

    Integer countLikedByUserId(Long userId);
}