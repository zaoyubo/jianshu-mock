package com.zhaoyubo.jianshu.api.vo;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class UserIndexVO {
    private Long id;
    private Long phone;
    private String nickname;
    private String avatarUrl;
    private Byte state;
    private Integer followeeCount;
    private Integer followerCount;
    private Integer articleCount;
    private Integer wordCount;
    private Integer likeCount;
    private Integer assetsCount;
    private String description;
}
