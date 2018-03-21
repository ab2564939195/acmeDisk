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
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class RegisterServiceImplTest {
    @Resource
    private RegisterService registerService;
    @Test
    public void doRegister() throws Exception {
        TUser tUser=new TUser();
        tUser.setUserName("userName1");
        tUser.setUserNick("userNick1");
        tUser.setRealName("realName1");
        tUser.setCordID("cordId");
        tUser.setPassword("password1");
        tUser.setEmail("email1");
        tUser.setPhone("phone1");
        tUser.setLoginTime("2018-01-1");
        tUser.setGender("gender");
        tUser.setAge("12");
        tUser.setIntegral(12);
        int rows=registerService.doRegister(tUser);
        System.out.println(rows);
    }

}