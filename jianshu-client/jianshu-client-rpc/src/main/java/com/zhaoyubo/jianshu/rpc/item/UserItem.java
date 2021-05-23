package com.zhaoyubo.jianshu.rpc.item;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
public class UserItem implements Serializable {
    private Long id;

    @Tolerate
    public UserItem() {
    }

    private Long phone;

    private String password;

    private String nickname;

    private String avatarUrl;

    private Long qq;

    private String weibo;

    private String weixin;

    private Byte state;

    private Date gmtCreate;

    private Date gmtModified;

    private Long lastOperator;
}
