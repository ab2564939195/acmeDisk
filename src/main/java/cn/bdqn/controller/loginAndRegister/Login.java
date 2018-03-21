package cn.bdqn.controller.loginAndRegister;

import cn.bdqn.entity.TUser;
import cn.bdqn.service.user.UserService;
import cn.bdqn.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/3/19.
 */
@Controller
@RequestMapping("login")
public class Login {

    @Resource
    private UserService userService;
    @RequestMapping("toLogin")
    public String login(){
        return "login";
    }
    @RequestMapping("doLogin")
    public String doLogin(HttpSession session, TUser tUser , Model model){
        if(tUser.getPassword()!=null){
            try {
                String newPassword=MD5Util.EncoderByMd5(tUser.getPassword());
                tUser.setPassword(newPassword);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("tuser.getPassword===password为空");
        }

        TUser newtuser=userService.login(tUser);
        if(newtuser!=null){
            session.setAttribute("user",newtuser);
            model.addAttribute("success","用户名或密码有误");
            return "../../index";
        }else{
            model.addAttribute("error","用户名或密码有误");
            return "login";
        }
    }
}
