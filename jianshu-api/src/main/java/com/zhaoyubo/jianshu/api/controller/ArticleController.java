package com.zhaoyubo.jianshu.api.controller;


import io.netty.util.internal.StringUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.zhaoyubo.jianshu.rpc.iface.ArticleService;
import com.zhaoyubo.jianshu.rpc.item.ArticleItem;
import com.zhaoyubo.jianshu.rpc.param.ArticleParam;
import com.zhaoyubo.jianshu.api.controller.request.ArticleRequest;

@RequestMapping("/api/article")
@RestController
@Validated
public class ArticleController {

    @Reference(version = "${dubbo.service.version}")
    private ArticleService articleService;

    /**  分页查询某作者的文章
     * @param req
     * @return
     */
    @GetMapping
    public List<ArticleItem> listArticle( @Validated ArticleRequest req){
        ArticleParam articleParam = new ArticleParam();
        articleParam.setUserId(req.getUserId());
        articleParam.setPageSize(req.getPageSize());
        articleParam.setCurrentPage(req.getCurrentPage());
        String type = req.getType();
        List<ArticleItem> articleItems = null;
        if (StringUtils.isBlank(type)){
            articleItems = articleService.findArticleByUserId(articleParam);
        } else if ("hot".equals(type)){
            articleItems = articleService.findArticleByUserIdAndHeat(articleParam);
        } else if("comment".equals(type)){
            articleItems =articleService.findArticleByUserIdAndCommentTime(articleParam);
        }
        return articleItems;
    }

    @GetMapping("/{articleId}")
    public ArticleItem getArticle(@PathVariable Long articleId){
        return articleService.findArticleById(articleId);
    }

    @RequestMapping(value = "/{articleId}", method = RequestMethod.PATCH)
    public void patchArticle(){

    }

    @RequestMapping(value = "/{articleId}", method = RequestMethod.DELETE)
    public void deleteArticle(@PathVariable Long articleId){

    }

//    @PostMapping
//    public void postArticle(@RequestBody @Validated ArticleRequest para){
//
//    }



}
