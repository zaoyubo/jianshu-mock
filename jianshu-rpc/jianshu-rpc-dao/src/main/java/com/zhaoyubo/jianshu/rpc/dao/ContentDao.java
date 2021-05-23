package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.domain.ContentDomain;

public interface ContentDao {
    int deleteByPrimaryKey(Long id);

    int insert(ContentDomain record);

    int insertSelective(ContentDomain record);

    ContentDomain selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ContentDomain record);

    int updateByPrimaryKeyWithBLOBs(ContentDomain record);
}