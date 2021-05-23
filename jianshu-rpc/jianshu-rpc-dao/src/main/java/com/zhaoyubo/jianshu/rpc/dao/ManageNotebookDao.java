package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.ManageNotebookDomain;

public interface ManageNotebookDao {
    int deleteByPrimaryKey(Long id);

    int insert(ManageNotebookDomain record);

    int insertSelective(ManageNotebookDomain record);

    ManageNotebookDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ManageNotebookDomain record);

    int updateByPrimaryKey(ManageNotebookDomain record);
}