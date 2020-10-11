package com.zhaoyubo.jianshu.rpc.domain;

import java.util.Date;

public class CommentDomain {
    private Long id;

    private Date gmtCreate;

    private Long superiorCommentId;

    private Long userId;

    private Long articleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getSuperiorCommentId() {
        return superiorCommentId;
    }

    public void setSuperiorCommentId(Long superiorCommentId) {
        this.superiorCommentId = superiorCommentId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", superiorCommentId=").append(superiorCommentId);
        sb.append(", userId=").append(userId);
        sb.append(", articleId=").append(articleId);
        sb.append("]");
        return sb.toString();
    }
}