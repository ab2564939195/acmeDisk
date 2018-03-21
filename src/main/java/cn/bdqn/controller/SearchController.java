package cn.bdqn.controller;

import cn.bdqn.entity.searchPOJO.SearchInfo;
import cn.bdqn.service.searchServices.DoSearchServicesForMysql;
import cn.bdqn.util.Message;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created by Shinelon on 2018/3/20.
 */@Controller
@RequestMapping("search")
public class SearchController {
@Autowired
private DoSearchServicesForMysql doSearchServicesForMysql;

     @RequestMapping("doSearch")
    public String doSearch( @RequestParam String searchInfo, Map<String,Object> map){
         System.out.println("search start 搜索字段为:" + searchInfo);
         map.put("searchString",searchInfo);
         PageInfo<SearchInfo> pageInfo=this.doSearchServicesForMysql.doSearchBySearchString(searchInfo,16,1);
         List<SearchInfo> list=pageInfo.getList();
         map.put("pageInfo",pageInfo);
         if(list.size()>0) {

             map.put("searchResult", list);
             return "search/searchResult";
         }
         map.put("search/searchError", Message.searchError());
         return "search/searchResult";
     }


    @RequestMapping("doSearchPage")
    public String doSearchPage( @RequestParam String searchInfo,@RequestParam int pageNum, Map<String,Object> map){
        System.out.println("search start 搜索字段为:" + searchInfo);
        map.put("searchString",searchInfo);
        PageInfo<SearchInfo> pageInfo=this.doSearchServicesForMysql.doSearchBySearchString(searchInfo,16,1);
        List<SearchInfo> list=pageInfo.getList();
        map.put("pageInfo",pageInfo);
        if(list.size()>0) {

            map.put("searchResult", list);
            return "search/searchResult";
        }
        map.put("search/searchError", Message.searchError());
        return "search/searchResult";
    }



}
