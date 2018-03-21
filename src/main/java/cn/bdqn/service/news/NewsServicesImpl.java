package cn.bdqn.service.news;

import cn.bdqn.dao.news.NewsMapper;
import cn.bdqn.entity.News;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Service
public class NewsServicesImpl implements NewsServices {
    @Resource
    private NewsMapper newsMapper;
    @Override
    public PageInfo<News> queryNewsTatle(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return new PageInfo<>(newsMapper.queryNewsTatle());
    }

    @Override
    public List<News> queryNewsPicture() {
        return newsMapper.queryNewsPicture();
    }
}
