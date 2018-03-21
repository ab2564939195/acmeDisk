package cn.bdqn.service.user;

import cn.bdqn.entity.TUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {
    @Resource
    private UserService userService;
    @Test
    public void login() throws Exception {
        TUser tuser=new TUser();
        tuser.setUserName("user");
        tuser.setPassword("123456789");
        System.out.println(userService.login(tuser));

    }

}