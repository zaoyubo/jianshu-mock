package com.zhaoyubo.jianshu.rpc.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ArticleDomain {
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

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getLastOperator() {
        return lastOperator;
    }

    public void setLastOperator(Long lastOperator) {
        this.lastOperator = lastOperator;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getWordCount() {
        return wordCount;
    }

    public void setWordCount(Integer wordCount) {
        this.wordCount = wordCount;
    }

    public BigDecimal getHeat() {
        return heat;
    }

    public void setHeat(BigDecimal heat) {
        this.heat = heat;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Byte getIsFree() {
        return isFree;
    }

    public void setIsFree(Byte isFree) {
        this.isFree = isFree;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Long getFreeContentId() {
        return freeContentId;
    }

    public void setFreeContentId(Long freeContentId) {
        this.freeContentId = freeContentId;
    }

    public Byte getIsCommentable() {
        return isCommentable;
    }

    public void setIsCommentable(Byte isCommentable) {
        this.isCommentable = isCommentable;
    }

    public Byte getIsRewardable() {
        return isRewardable;
    }

    public void setIsRewardable(Byte isRewardable) {
        this.isRewardable = isRewardable;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", lastOperator=").append(lastOperator);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", wordCount=").append(wordCount);
        sb.append(", heat=").append(heat);
        sb.append(", title=").append(title);
        sb.append(", contentId=").append(contentId);
        sb.append(", isFree=").append(isFree);
        sb.append(", state=").append(state);
        sb.append(", freeContentId=").append(freeContentId);
        sb.append(", isCommentable=").append(isCommentable);
        sb.append(", isRewardable=").append(isRewardable);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}