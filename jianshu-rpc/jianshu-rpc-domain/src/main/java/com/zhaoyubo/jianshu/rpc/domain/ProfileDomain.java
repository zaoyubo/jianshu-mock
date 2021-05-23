package com.zhaoyubo.jianshu.rpc.domain;

public class ProfileDomain {
    private Long id;

    private Byte gender;

    private String description;

    private String
            personalWebsite;

    private String weixinQrcodeUrl;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getpersonalWebsite() {
        return
                personalWebsite;
    }

    public void setpersonalWebsite(String
                                           personalWebsite) {
        this.
                personalWebsite =
                personalWebsite == null ? null :
                        personalWebsite.trim();
    }

    public String getWeixinQrcodeUrl() {
        return weixinQrcodeUrl;
    }

    public void setWeixinQrcodeUrl(String weixinQrcodeUrl) {
        this.weixinQrcodeUrl = weixinQrcodeUrl == null ? null : weixinQrcodeUrl.trim();
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
        sb.append(", gender=").append(gender);
        sb.append(", description=").append(description);
        sb.append(", personalWebsite=").append(personalWebsite);
        sb.append(", weixinQrcodeUrl=").append(weixinQrcodeUrl);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}