package com.zhaoyubo.jianshu.rpc.iface;

import com.zhaoyubo.jianshu.rpc.item.ArticleItem;
import com.zhaoyubo.jianshu.rpc.param.ArticleParam;

import java.util.List;

public interface ArticleService {
    List<ArticleItem> findArticleByUserId(ArticleParam param);
    List<ArticleItem> findArticleByUserIdAndHeat(ArticleParam param);
    List<ArticleItem> findArticleByUserIdAndCommentTime(ArticleParam param);
    Integer countArticleByUserId(Long id);
    ArticleItem findArticleById(Long id);
    Integer countArticleWordCountsByUserId(Long id);

}
