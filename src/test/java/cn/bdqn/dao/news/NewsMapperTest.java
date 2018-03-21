package cn.bdqn.dao.news;

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
public class NewsMapperTest {
    @Test
    public void queryNewsPicture() throws Exception {
        for (News news : newsMapper.queryNewsPicture()) {
            System.out.println(news);
        }
    }


    @Resource
    private NewsMapper newsMapper;
    @Test
    public void queryNewsTatle() throws Exception {
        for (News news : newsMapper.queryNewsTatle()) {
            System.out.println(news);
        }
    }

}