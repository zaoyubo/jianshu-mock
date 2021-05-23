package com.zhaoyubo.jianshu.rpc.rpcServiceImpl;

import com.zhaoyubo.jianshu.rpc.dao.FollowUserDao;
import com.zhaoyubo.jianshu.rpc.dao.LikeArticleDao;
import com.zhaoyubo.jianshu.rpc.iface.ArticleService;
import com.zhaoyubo.jianshu.rpc.iface.OperationService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0.0", interfaceClass = OperationService.class)
public class OperationServiceImpl implements OperationService {

    @Autowired
    FollowUserDao followUserDao;

    @Autowired
    LikeArticleDao likeArticleDao;


    @Override
    public List<Long> findFolloweeByUserId(Long userId, Integer currentPage, Integer pageSize) {
        int offset = (currentPage - 1) * pageSize;
        int limit = pageSize;
        return followUserDao.findFolloweeByUserId(userId, offset, limit);
    }

    @Override
    public Integer countFolloweeByUserId(Long userId) {
        return followUserDao.countFolloweeByUserId(userId);
    }

    @Override
    public List<Long> findFollowerByUserId(Long userId, Integer currentPage, Integer pageSize) {
        int offset = (currentPage - 1) * pageSize;
        int limit = pageSize;
        return followUserDao.findFollowerByUserId(userId, offset, limit);
    }

    @Override
    public Integer countFollowerByUserId(Long userId) {
        return followUserDao.countFollowerByUserId(userId);
    }

    @Override
    public Integer countLikedByUserId(Long userId) {
        return likeArticleDao.countLikedByUserId(userId);
    }

}
