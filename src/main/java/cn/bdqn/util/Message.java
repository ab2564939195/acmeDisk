package cn.bdqn.util;

/**
 * Created by samsung on 2018/2/24.
 */
public class Message {
    private String msg;
    private String core;

    public static Message success(){
        Message message = new Message();
        message.setCore("0000");
        message.setMsg("操作成功");
        return message;
    }
    public static Message error(){
        Message message = new Message();
        message.setCore("0001");
        message.setMsg("操作失败");
        return message;
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public static Message searchError(){
        Message message=new Message();
        message.setCore("0021");
        message.setMsg("没有搜索到内容，正在为您展示热销商品");
        return message;
    }


}
