package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.NoteBookDomain;

public interface NoteBookDao {
    int deleteByPrimaryKey(Long id);

    int insert(NoteBookDomain record);

    int insertSelective(NoteBookDomain record);

    NoteBookDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NoteBookDomain record);

    int updateByPrimaryKey(NoteBookDomain record);
}