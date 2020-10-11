package com.zhaoyubo.jianshu.rpc.domain;

import java.util.Date;

public class NoteBookDomain {
    private Long id;

    private Date gmtCreate;

    private Date gmtModified;

    private Long lastOperator;

    private Byte isPermitContribute;

    private Byte isNeedVerify;

    private String title;

    private String description;

    private Byte isPublic;

    private Byte type;

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

    public Byte getIsPermitContribute() {
        return isPermitContribute;
    }

    public void setIsPermitContribute(Byte isPermitContribute) {
        this.isPermitContribute = isPermitContribute;
    }

    public Byte getIsNeedVerify() {
        return isNeedVerify;
    }

    public void setIsNeedVerify(Byte isNeedVerify) {
        this.isNeedVerify = isNeedVerify;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Byte isPublic) {
        this.isPublic = isPublic;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
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
        sb.append(", isPermitContribute=").append(isPermitContribute);
        sb.append(", isNeedVerify=").append(isNeedVerify);
        sb.append(", title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", isPublic=").append(isPublic);
        sb.append(", type=").append(type);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}