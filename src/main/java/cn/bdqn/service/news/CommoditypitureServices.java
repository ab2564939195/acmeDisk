package cn.bdqn.service.news;

import cn.bdqn.entity.Commoditypicture;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
public interface CommoditypitureServices {
    List<Commoditypicture> queryPictureByParentid(int parentid);

}
