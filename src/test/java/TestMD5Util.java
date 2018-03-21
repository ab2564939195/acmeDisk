import cn.bdqn.util.LxSdkImpl;
import cn.bdqn.util.MD5Util;
import org.junit.Test;

/**
 * Created by Administrator on 2018/3/19.
 */
public class TestMD5Util {
    @Test
    public void test(){
        String vo="abcdabcd4123";
        String vo1="";
        try {
            vo1=MD5Util.EncoderByMd5(vo);
            System.out.println(vo1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        String var=LxSdkImpl.sendSms("13011889861","354371","15737327959","您的验证码是：12345，一分钟有效，天猫商城","new Date()");
        System.out.println("返回的值是："+var);
    }
}
