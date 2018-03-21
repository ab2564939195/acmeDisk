package cn.bdqn.dao.news;

import cn.bdqn.entity.News;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
public interface NewsMapper {
    //查看新闻所有
    List<News> queryNewsTatle();

    //查看新闻和图片
    List<News> queryNewsPicture();

}
