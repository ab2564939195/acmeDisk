package cn.bdqn.service.news;

import cn.bdqn.entity.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class NewsServicesTest {
    @Resource
    private NewsServices newsServices;
    @Test
    public void queryNewsTatle() throws Exception {
        for (News news : newsServices.queryNewsTatle(2, 2).getList()) {
            System.out.println(news);
        }
    }

}