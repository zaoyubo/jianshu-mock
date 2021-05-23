package com.zhaoyubo.jianshu.rpc.rpcServiceImpl;

import com.zhaoyubo.jianshu.rpc.Tester;
import com.zhaoyubo.jianshu.rpc.item.ArticleItem;
import com.zhaoyubo.jianshu.rpc.param.ArticleParam;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class ArticleServiceImplTest extends Tester {

    @Resource
    ArticleServiceImpl articleService;

    @Test
    public void findArticleByUserId() {
        ArticleParam articleParam = new ArticleParam();
        articleParam.setUserId(2L);
        articleParam.setPageSize(10);
        articleParam.setCurrentPage(1);
        List<ArticleItem> articleItems = articleService.findArticleByUserId(articleParam);
        System.out.println(articleItems);
    }
}