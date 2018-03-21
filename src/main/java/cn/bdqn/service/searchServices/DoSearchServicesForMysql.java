package cn.bdqn.service.searchServices;

import cn.bdqn.entity.searchPOJO.SearchInfo;
import com.github.pagehelper.PageInfo;

/**
 * Created by Shinelon on 2018/3/20.
 */
public interface DoSearchServicesForMysql {
    PageInfo<SearchInfo> doSearchBySearchString( String SearchString,int pageNum,int pageSize);

}
