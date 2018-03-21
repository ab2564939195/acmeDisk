package cn.bdqn.dao.Search;

import cn.bdqn.entity.searchPOJO.SearchInfo;

import java.util.List;

/**
 * Created by Shinelon on 2018/3/20.
 */
public interface SearchInfoDao {
    List<SearchInfo> queryByName(String searchString);
}
