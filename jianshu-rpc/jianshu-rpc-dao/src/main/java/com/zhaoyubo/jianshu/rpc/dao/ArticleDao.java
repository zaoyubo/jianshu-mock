package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.ArticleDomain;

import java.util.List;

public interface ArticleDao {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleDomain record);

    int insertSelective(ArticleDomain record);

    ArticleDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleDomain record);

    int updateByPrimaryKey(ArticleDomain record);

    List<ArticleDomain> selectByUserId(Long userId, Integer offset, Integer limit);

    List<ArticleDomain> selectByUserIdAndHeat(Long userId, Integer offset, Integer limit);
    List<ArticleDomain> selectByUserIdAndCommentTime(Long userId, Integer offset, Integer limit);

    Integer countArticleByUserId(Long userId);

    Integer countArticleWordCountsByUserId(Long userId);
}