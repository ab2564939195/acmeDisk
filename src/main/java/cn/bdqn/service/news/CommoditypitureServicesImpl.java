package cn.bdqn.service.news;

import cn.bdqn.dao.news.CommoditypictureMapper;
import cn.bdqn.entity.Commoditypicture;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/20 0020.
 */
@Service
public class CommoditypitureServicesImpl implements CommoditypitureServices {
    @Resource
    private CommoditypictureMapper commoditypictureMapper;
    @Override
    public List<Commoditypicture> queryPictureByParentid(int parentid) {
        return commoditypictureMapper.queryPictureByParentid(parentid);
    }
}
