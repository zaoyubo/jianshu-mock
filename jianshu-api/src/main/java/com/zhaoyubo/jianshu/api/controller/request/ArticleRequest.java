package com.zhaoyubo.jianshu.api.controller.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static com.zhaoyubo.jianshu.api.common.constant.Constant.DEFAULT_PAGE_SIZE;

@Data
public class ArticleRequest {
    @Min(0L)
    @NotNull(message = "must exist userid")
    Long userId;
    @Min(0)
    Integer pageSize = DEFAULT_PAGE_SIZE;
    @Min(1)
    Integer currentPage = 1;
    /**
     * hot: 热门
     * comment: 最新评论
     */
    String type;

}
