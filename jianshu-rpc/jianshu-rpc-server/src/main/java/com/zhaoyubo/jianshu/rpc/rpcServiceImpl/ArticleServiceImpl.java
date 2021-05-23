package com.zhaoyubo.jianshu.rpc.rpcServiceImpl;

import com.zhaoyubo.jianshu.rpc.dao.ArticleDao;
import com.zhaoyubo.jianshu.rpc.domain.ArticleDomain;
import com.zhaoyubo.jianshu.rpc.iface.ArticleService;
import com.zhaoyubo.jianshu.rpc.item.ArticleItem;
import com.zhaoyubo.jianshu.rpc.param.ArticleParam;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service(version = "1.0.0", interfaceClass = ArticleService.class)
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    @Override
    public List<ArticleItem> findArticleByUserId(ArticleParam articleParam) {
        Integer limit = articleParam.getPageSize();
        Integer offset = (articleParam.getCurrentPage() - 1) * articleParam.getPageSize();
        List<ArticleDomain> articleDomains = articleDao.selectByUserId(articleParam.getUserId(), offset, limit);
        return articleDomains.stream().map(this::buildArticleItem).collect(Collectors.toList());
    }

    @Override
    public List<ArticleItem> findArticleByUserIdAndHeat(ArticleParam articleParam) {
        Integer limit = articleParam.getPageSize();
        Integer offset = (articleParam.getCurrentPage() - 1) * articleParam.getPageSize();
        List<ArticleDomain> articleDomains = articleDao.selectByUserIdAndHeat(articleParam.getUserId(), offset, limit);
        return articleDomains.stream().map(this::buildArticleItem).collect(Collectors.toList());
    }

    @Override
    public List<ArticleItem> findArticleByUserIdAndCommentTime(ArticleParam articleParam) {
        Integer limit = articleParam.getPageSize();
        Integer offset = (articleParam.getCurrentPage() - 1) * articleParam.getPageSize();
        List<ArticleDomain> articleDomains = articleDao.selectByUserIdAndCommentTime(articleParam.getUserId(), offset, limit);
        return articleDomains.stream().map(this::buildArticleItem).collect(Collectors.toList());
    }

    @Override
    public Integer countArticleByUserId(Long userId) {
        Integer cnt = articleDao.countArticleByUserId(userId);
        return cnt;
    }

    @Override
    public ArticleItem findArticleById(Long id) {
        ArticleDomain articleDomain = articleDao.selectByPrimaryKey(id);
        ArticleItem articleItem = buildArticleItem(articleDomain);
        // TODO 评论数等信息
        return articleItem;
    }

    @Override
    public Integer countArticleWordCountsByUserId(Long userId) {
        Integer cnt = articleDao.countArticleWordCountsByUserId(userId);
        return cnt;
    }


    private ArticleItem buildArticleItem(ArticleDomain articleDomain) {
        ArticleItem articleItem = new ArticleItem();
        articleItem.setId(articleDomain.getId());
        articleItem.setGmtCreate(articleDomain.getGmtCreate());
        articleItem.setGmtModified(articleDomain.getGmtModified());
        articleItem.setLastOperator(articleDomain.getLastOperator());
        articleItem.setViewCount(articleDomain.getViewCount());
        articleItem.setWordCount(articleDomain.getWordCount());
        articleItem.setHeat(articleDomain.getHeat());
        articleItem.setTitle(articleDomain.getTitle());
        articleItem.setContentId(articleDomain.getContentId());
        articleItem.setIsFree(articleDomain.getIsFree());
        articleItem.setState(articleDomain.getState());
        articleItem.setFreeContentId(articleDomain.getFreeContentId());
        articleItem.setIsCommentable(articleDomain.getIsCommentable());
        articleItem.setIsRewardable(articleDomain.getIsRewardable());
        articleItem.setUserId(articleDomain.getUserId());
        return articleItem;
    }

}
