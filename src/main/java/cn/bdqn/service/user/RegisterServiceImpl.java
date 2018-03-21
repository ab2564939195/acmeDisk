package cn.bdqn.service.user;

import cn.bdqn.dao.user.RegisterMapper;
import cn.bdqn.entity.TUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20.
 */
@Service
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterMapper registerMapper;
    @Override
    public Integer doRegister(TUser tUser) {
        return registerMapper.doRegister(tUser);
    }
}
