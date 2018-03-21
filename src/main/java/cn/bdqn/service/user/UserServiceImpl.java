package cn.bdqn.service.user;

import cn.bdqn.dao.user.UserMapper;
import cn.bdqn.entity.TUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public TUser login(TUser tUser) {
        return userMapper.login(tUser);
    }
}
