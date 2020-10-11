package com.zhaoyubo.jianshu.rpc.dao;

import com.zhaoyubo.jianshu.rpc.Tester;
import com.zhaoyubo.jianshu.rpc.domain.ArticleDomain;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.Assert.*;


public class ArticleDaoTest extends Tester {

    @Autowired
    ArticleDao articleDao;

    @org.junit.Test
    public void deleteByPrimaryKey() {
    }

    @org.junit.Test
    public void insert() {

    }

    @org.junit.Test
    public void insertSelective() {
        ArticleDomain record = new ArticleDomain();
        record.setId(1111L);
        record.setLastOperator(0L);
        record.setViewCount(0);
        record.setWordCount(0);
        record.setHeat(new BigDecimal(0.1));
        record.setTitle("ttt");
        record.setContentId(1L);
        record.setIsFree((byte) 0);
        record.setState((byte) 0);
        record.setFreeContentId(0L);
        record.setIsCommentable((byte) 1);
        record.setIsRewardable((byte) 1);
        record.setUserId(1L);
        articleDao.insertSelective(record);
    }

    @org.junit.Test
    public void selectByPrimaryKey() {
    }

    @org.junit.Test
    public void updateByPrimaryKeySelective() {
    }

    @org.junit.Test
    public void updateByPrimaryKey() {
    }
}