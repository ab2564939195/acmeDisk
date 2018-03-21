package cn.bdqn.service.news;

import cn.bdqn.entity.News;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
public interface NewsServices {
    PageInfo<News> queryNewsTatle(int pageNum,int pageSize);
    List<News> queryNewsPicture();
}
