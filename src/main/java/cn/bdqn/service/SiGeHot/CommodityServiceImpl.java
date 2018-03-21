package cn.bdqn.service.SiGeHot;

import cn.bdqn.dao.SiGeHot.CommodityMapper;
import cn.bdqn.entity.Commodity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/19/019.
 */
@Service
public class CommodityServiceImpl implements CommodityService {
    @Resource
    private CommodityMapper commodityMapper;

    @Override
    public Commodity queryCommodityById(int id) {
        return commodityMapper.queryCommodityById(id);
    }

    //查询品牌精选 ,labelID 为9的字段
    @Override
    public List<Commodity> queryPaiBylabelID() {
        return commodityMapper.queryPaiBylabelID();
    }

    @Override
    public List<Commodity> queryHotTop() {

        return commodityMapper.queryHotTop();
    }

    @Override
    public List<Commodity> queryNewTop() {
        return commodityMapper.queryNewTop();
    }

    @Override
    public int updateLabelID(int labelID, int commodityID) {
        return commodityMapper.updateLabelID(labelID,commodityID);
    }


    @Override
    public List<Commodity> querySiGeHotToQiangGou() {
        return commodityMapper.querySiGeHotToQiangGou();
    }
}
