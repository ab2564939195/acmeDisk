package cn.bdqn.controller.loginAndRegister;

import cn.bdqn.entity.TUser;
import cn.bdqn.service.user.RegisterService;
import cn.bdqn.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Calendar;

/**
 * Created by Administrator on 2018/3/20.
 */
@Controller
@RequestMapping("register")
public class Register {
    @Resource
    private RegisterService registerService;

    @RequestMapping("toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping(value = "doRegister" ,method = RequestMethod.POST,produces = {"application/json;charset=utf-8"})
    public String doRegister(TUser tUser){
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改

        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);
        String newdate=year + "-" + month + "-" + date + " " +hour + ":" +minute + ":" + second;
        System.out.println("系统当前时间"+newdate);
        tUser.setLoginTime(newdate);



        //MD5加密password
        String MD5password;
        if(tUser.getPassword()!=null){
            try {
                MD5password=MD5Util.EncoderByMd5(tUser.getPassword());
                tUser.setPassword(MD5password);
                System.out.println("newPassword=="+MD5password);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            System.out.println("！！password为空");
        }


        //取出身份证的出生年份，计算出年龄
        if(tUser.getCordID()!=null){
             String Cardyear =tUser.getCordID().substring(6,10);
            //获取当前的年份
            Calendar calendar=Calendar.getInstance();
            int newYear=calendar.get(Calendar.YEAR);
            int age=year-Integer.parseInt(Cardyear);
            //把年龄放进对象
            tUser.setAge(String.valueOf(age));
        }


        //默认“积分”选项赋值为零
        int integral=0;
        tUser.setIntegral(integral);


        //把注册信息写进sql
        int rows=registerService.doRegister(tUser);
        if(rows>0){
            return "login";
        }else{
            return "register";
        }
    }
}
