package cn.bdqn.service.news;

import cn.bdqn.entity.Commoditypicture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CommoditypitureServicesTest {
    @Resource
    private CommoditypitureServices commoditypitureServices;
    @Test
    public void queryPictureByParentid() throws Exception {
        for (Commoditypicture commoditypicture : commoditypitureServices.queryPictureByParentid(-1)) {
            System.out.println(commoditypicture);
        }
    }

}