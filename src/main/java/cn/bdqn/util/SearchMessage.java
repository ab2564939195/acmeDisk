package cn.bdqn.util;

/**
 * Created by Shinelon on 2018/3/20.
 */
public class SearchMessage {
    public static String getResultInfo ( ) {
        return resultInfo;
    }

    public static void setResultInfo ( String resultInfo ) {
        SearchMessage.resultInfo = resultInfo;
    }

    static String resultInfo;
}
