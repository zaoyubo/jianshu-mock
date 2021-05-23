package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.DislikeArticleDomain;

public interface DislikeArticleDao {
    int deleteByPrimaryKey(Long id);

    int insert(DislikeArticleDomain record);

    int insertSelective(DislikeArticleDomain record);

    DislikeArticleDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DislikeArticleDomain record);

    int updateByPrimaryKey(DislikeArticleDomain record);
}