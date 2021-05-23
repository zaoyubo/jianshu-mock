package com.zhaoyubo.jianshu.rpc.iface;

import java.util.List;

public interface OperationService {
    /**
     * 分页查找某作者关注的用户
     *
     * @param userId
     * @param pageSize
     * @param currentPage
     * @return
     */
    List<Long> findFolloweeByUserId(Long userId, Integer pageSize, Integer currentPage);

    /**
     * 某作者关注的用户总数
     *
     * @param userId
     * @return
     */
    Integer countFolloweeByUserId(Long userId);

    /** 分页查找某作者的粉丝
     * @param userId
     * @param pageSize
     * @param currentPage
     * @return
     */
    List<Long> findFollowerByUserId(Long userId, Integer pageSize, Integer currentPage);

    /** 某作者的粉丝总数
     * @param userId
     * @return
     */
    Integer countFollowerByUserId(Long userId);


    /** 收获喜欢
     * @param userId
     * @return
     */
    Integer countLikedByUserId(Long userId);
}
