package cn.bdqn.service.SiGeHot;

import cn.bdqn.entity.Commodity;

import java.util.List;

/**
 * Created by Administrator on 2018/3/19/019.
 */
public interface CommodityService {
    public List<Commodity> querySiGeHotToQiangGou();
    //查询限时抢购第一条信息
    public Commodity queryCommodityById(int id);
    //查询品牌精选 ,labelID 为9的字段
    public List<Commodity> queryPaiBylabelID();
    //查询热卖推荐,labelID 为8的字段
    public List<Commodity> queryHotTop();
    //查询新品上市,labelID为7的字段
    public List<Commodity> queryNewTop();
    //修改字段表现crud , 实现假删除和添加;
    public int updateLabelID(int labelID,int commodityID);
}
