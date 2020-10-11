package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.CommentDomain;

public interface CommentDao {
    int deleteByPrimaryKey(Long id);

    int insert(CommentDomain record);

    int insertSelective(CommentDomain record);

    CommentDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentDomain record);

    int updateByPrimaryKey(CommentDomain record);
}