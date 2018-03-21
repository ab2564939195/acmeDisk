package cn.bdqn.dao.news;

import cn.bdqn.entity.Commoditypicture;

import java.util.List;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
public interface CommoditypictureMapper {
    //查看中间的广告图片parentid=-1的
    List<Commoditypicture> queryPictureByParentid(int parentid);
}
