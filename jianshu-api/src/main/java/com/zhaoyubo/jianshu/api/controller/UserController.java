package com.zhaoyubo.jianshu.api.controller;

import com.zhaoyubo.jianshu.api.common.exception.ApiException;
import com.zhaoyubo.jianshu.api.controller.request.UserRequest;
import com.zhaoyubo.jianshu.api.vo.UserIndexVO;
import com.zhaoyubo.jianshu.commonlib.cmmon.result.RestResult;
import com.zhaoyubo.jianshu.rpc.iface.ArticleService;
import com.zhaoyubo.jianshu.rpc.iface.OperationService;
import com.zhaoyubo.jianshu.rpc.iface.UserService;
import com.zhaoyubo.jianshu.rpc.item.ArticleItem;
import com.zhaoyubo.jianshu.rpc.item.UserItem;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
@Validated
public class UserController {

    @Reference(version = "${dubbo.service.version}")
    private UserService userService;

    @Reference(version = "${dubbo.service.version}")
    private OperationService operationService;

    @Reference(version = "${dubbo.service.version}")
    private ArticleService articleService;

    /**
     * 目前直接放在过滤器里面处理登录，返回jwt
     */
    public void login(){

    }

    @PostMapping
    public String register(@RequestBody @Validated UserRequest req){
        try {
            String encodedPwd = new BCryptPasswordEncoder().encode(req.getPassword());
            UserItem userItem = UserItem.builder().nickname(req.getNickname()).phone(req.getPhone()).password(encodedPwd).build();
            userService.insertUser(userItem);
            return "注册成功";
        } catch (Exception e) {
            throw new ApiException(e.toString());
        }
    }
    @GetMapping("/{userId}/index")
    public UserIndexVO getUser(@PathVariable Long userId){
        UserItem userItem = userService.findUserById(userId);
        Integer followeeCount = operationService.countFolloweeByUserId(userId);
        Integer followerCount = operationService.countFollowerByUserId(userId);
        Integer articleCount = articleService.countArticleByUserId(userId);
        Integer wordCount = articleService.countArticleWordCountsByUserId(userId);
        Integer likeCount = operationService.countLikedByUserId(userId);
        return UserIndexVO.builder().id(userId).phone(userItem.getPhone()).avatarUrl(userItem.getAvatarUrl()).nickname(userItem.getNickname()).articleCount(articleCount).followeeCount(followeeCount).followerCount(followerCount).wordCount(wordCount == null ? 0 : wordCount).likeCount(likeCount).assetsCount(0).build();
    }

}
