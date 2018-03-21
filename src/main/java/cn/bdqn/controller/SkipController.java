package cn.bdqn.controller;

import cn.bdqn.service.news.CommoditypitureServices;
import cn.bdqn.service.news.NewsServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/19 0019.
 */
@Controller
public class SkipController {
    @Resource
    private CommoditypitureServices commoditypitureServices;
    @Resource
    private NewsServices newsServices;
    @RequestMapping("toIndex")
    public String toIdex(int parentid,Model model) {
        model.addAttribute("picture", commoditypitureServices.queryPictureByParentid(parentid));
            model.addAttribute("pageInfo",newsServices.queryNewsPicture());
            return "index";
    }
}
