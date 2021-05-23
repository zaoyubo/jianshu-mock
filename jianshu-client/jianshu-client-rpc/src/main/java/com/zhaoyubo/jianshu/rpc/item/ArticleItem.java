package com.zhaoyubo.jianshu.rpc.item;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class ArticleItem implements Serializable {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long lastOperator;

    private Integer viewCount;

    private Integer wordCount;

    private BigDecimal heat;

    private String title;

    private Long contentId;

    private Byte isFree;

    private Byte state;

    private Long freeContentId;

    private Byte isCommentable;

    private Byte isRewardable;

    private Long userId;
}
