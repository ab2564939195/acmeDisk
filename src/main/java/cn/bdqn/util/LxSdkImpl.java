package cn.bdqn.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 
 * @author 动力思维
 * 动力思维短信接口实现类
 *
 */
public class LxSdkImpl {
	
	/**
	 * 用来格式化seed参数
	 */
	private static final String dateFormatStr="yyyyMMddHHmmss";
	
	
	public static void main(String[] args) {
			//输出发送结果
			System.out.println(LxSdkImpl.sendSms("accName", "accPwd", "mobies", "content",""));
			//输出查询报告结果
			System.out.println(LxSdkImpl.qryReport("accName", "accPwd"));
			//输出查询余额结果
			System.out.println(LxSdkImpl.qryBalance("accName", "accPwd"));
			//输出查询上行短信的结果
			System.out.println(LxSdkImpl.receiveSms("accName", "accPwd"));
	}
	
	
	/**
	 * 发送短信
	 * @param accName 用户名
	 * @param accPwd 密码
	 * @param mobies 手机号多个手机号之间英文半角逗号隔开
	 * @param content 内容后加签名：内容【签名】
	 * @param schTime 定时时间格式如：2010-01-01 08:00:00
	 * @return 服务端返回的结果 ok:业务id 或者 错误代码
	 */
	public  static String sendSms(String accName,String accPwd,String mobies,String content,String schTime){
		StringBuffer sb = new StringBuffer("http://sdk.lx198.com/sdk/send2?");
		try {
			String seed=new SimpleDateFormat(dateFormatStr).format(new Date());
			sb.append("&accName="+accName); 
			sb.append("&seed="+seed);
			sb.append("&accPwd="+MD5.getMd5String(MD5.getMd5String(accPwd)+seed)); 
			sb.append("&aimcodes="+mobies);
			sb.append("&schTime="+URLEncoder.encode(schTime,"UTF-8")); //空格标点符号做encode转换
			sb.append("&content="+URLEncoder.encode(content,"UTF-8")); //中文做encode转换
			URL url = new URL(sb.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			return in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 查询余额
	 * @param accName 用户名
	 * @param accPwd 原始密码
	 * @return 服务端返回的结果 ok:业务id 或者 错误代码
	 */
	public  static String qryBalance(String accName,String accPwd){
		StringBuffer sb = new StringBuffer("http://www.lx598.com/send2");
		try {
			String seed=new SimpleDateFormat(dateFormatStr).format(new Date());
			sb.append("&accName="+accName); 
			sb.append("&seed="+seed);
			sb.append("&accPwd="+MD5.getMd5String(MD5.getMd5String(accPwd)+seed)); 
			URL url = new URL(sb.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			return in.readLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 查询绘制报告
	 * @param accName 用户名
	 * @param accPwd 原始密码
	 * @return 返回的查询报告结果 格式为：业务id,手机号,状态;业务id,手机号,状态   状态1表示成功；0表示失败
	 */
	public  static String qryReport(String accName,String accPwd){
		StringBuffer sb = new StringBuffer("http://sdk.lx198.com/sdk/qryReport2?");
		try {
			String seed=new SimpleDateFormat(dateFormatStr).format(new Date());
			sb.append("&accName="+accName); 
			sb.append("&seed="+seed);
			sb.append("&accPwd="+MD5.getMd5String(MD5.getMd5String(accPwd)+seed)); 
			URL url = new URL(sb.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			return in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 查询上行短信
	 * @param accName 用户名
	 * @param accPwd 密码
	 * @return 返回的上行短信信息格式为：签名$$$$上行手机号$$$$上行内容$$$$上行时间####签名$$$$上行手机号$$$$上行内容$$$$上行时间
	 */
	public  static String receiveSms(String accName,String accPwd){
		StringBuffer sb = new StringBuffer("http://sdk.lx198.com/sdk/receiveSms2?");
		try {
			String seed=new SimpleDateFormat(dateFormatStr).format(new Date());
			sb.append("&accName="+accName); 
			sb.append("&seed="+seed);
			sb.append("&accPwd="+MD5.getMd5String(MD5.getMd5String(accPwd)+seed)); 
			URL url = new URL(sb.toString());
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
			return in.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
