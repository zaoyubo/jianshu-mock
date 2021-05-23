package com.zhaoyubo.jianshu.rpc.rpcServiceImpl;

import com.zhaoyubo.jianshu.rpc.common.enums.UserStateEnum;
import com.zhaoyubo.jianshu.rpc.dao.UserDao;
import com.zhaoyubo.jianshu.rpc.domain.UserDomain;
import com.zhaoyubo.jianshu.rpc.iface.UserService;
import com.zhaoyubo.jianshu.rpc.item.UserItem;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

@Service(version = "1.0.0", interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserItem findUserByPhone(Long phone) {
        UserDomain userDomain =  userDao.selectByPhone(phone);
        UserItem userItem = new UserItem();
        if (Objects.isNull(userDomain)){
            return userItem;
        }
        BeanUtils.copyProperties(userDomain, userItem);
        return userItem;
    }

    @Override
    public int insertUser(UserItem userItem) {
        UserDomain userDomain = new UserDomain();
        userDomain.setPhone(userItem.getPhone());
        userDomain.setPassword(userItem.getPassword());
        userDomain.setNickname(userItem.getNickname());
        userDomain.setState((byte) UserStateEnum.NORMAL.getCode());
        return userDao.insertSelective(userDomain);
    }

    @Override
    public UserItem findUserById(Long userId) {
        UserDomain  userDomain = userDao.selectByPrimaryKey(userId);
        UserItem userItem = new UserItem();
        if (Objects.isNull(userDomain)){
            return userItem;
        }
        BeanUtils.copyProperties(userDomain, userItem);
        userItem.setPassword(null);
        return userItem;
    }

}
