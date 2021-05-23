package com.zhaoyubo.jianshu.rpc.param;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleParam implements Serializable {
    Long userId;
    Integer pageSize;
    Integer currentPage;
}
