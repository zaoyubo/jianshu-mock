package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.FollowNotebookDomain;

public interface FollowNotebookDao {
    int deleteByPrimaryKey(Long id);

    int insert(FollowNotebookDomain record);

    int insertSelective(FollowNotebookDomain record);

    FollowNotebookDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FollowNotebookDomain record);

    int updateByPrimaryKey(FollowNotebookDomain record);
}