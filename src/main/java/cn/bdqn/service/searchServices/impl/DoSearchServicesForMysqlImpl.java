package cn.bdqn.service.searchServices.impl;

import cn.bdqn.dao.Search.SearchInfoDao;
import cn.bdqn.entity.searchPOJO.SearchInfo;
import cn.bdqn.service.searchServices.DoSearchServicesForMysql;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Shinelon on 2018/3/20.
 */@Service("DoSearchServicesForMysql")
public class DoSearchServicesForMysqlImpl implements DoSearchServicesForMysql {
     @Autowired
     private SearchInfoDao searchInfoDao;
    @Override
    public PageInfo<SearchInfo> doSearchBySearchString ( String SearchString ,int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<SearchInfo> list= this.searchInfoDao.queryByName(SearchString);
        PageInfo<SearchInfo> pageInfo=new PageInfo(list);
        return  pageInfo;
    }


}
