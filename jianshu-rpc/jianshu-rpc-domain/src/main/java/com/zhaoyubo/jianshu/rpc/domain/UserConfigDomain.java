package com.zhaoyubo.jianshu.rpc.domain;

public class UserConfigDomain {
    private Long id;

    private Byte editorType;

    private Byte language;

    private Byte messgeType;

    private Byte notificationType;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getEditorType() {
        return editorType;
    }

    public void setEditorType(Byte editorType) {
        this.editorType = editorType;
    }

    public Byte getLanguage() {
        return language;
    }

    public void setLanguage(Byte language) {
        this.language = language;
    }

    public Byte getMessgeType() {
        return messgeType;
    }

    public void setMessgeType(Byte messgeType) {
        this.messgeType = messgeType;
    }

    public Byte getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(Byte notificationType) {
        this.notificationType = notificationType;
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
        sb.append(", editorType=").append(editorType);
        sb.append(", language=").append(language);
        sb.append(", messgeType=").append(messgeType);
        sb.append(", notificationType=").append(notificationType);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}