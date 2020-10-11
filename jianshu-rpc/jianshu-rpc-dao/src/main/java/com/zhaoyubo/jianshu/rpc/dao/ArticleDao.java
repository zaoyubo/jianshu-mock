package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.ArticleDomain;

/**
 * @author zaoyu
 */
public interface ArticleDao {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleDomain record);

    int insertSelective(ArticleDomain record);

    ArticleDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleDomain record);

    int updateByPrimaryKey(ArticleDomain record);
}