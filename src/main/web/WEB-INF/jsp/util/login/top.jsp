<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/19
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="s_tbar">
    <div class="s_hd">
        <div class="tbar_lft">您好，欢迎来到一号店！<a href="${pageContext.request.contextPath}/login/toLogin">请登录</a> |
            <a href="${pageContext.request.contextPath}/register/toRegister">免费注册</a></div>
        <div class="tbar_rgt">
            <ul>
                <li class="first"><a href="#">我的订单</a></li>
                <li><a href="#">我的一号店</a></li>
                <li><a href="#">帮助中心</a></li>
                <li><a href="#">联系客服</a></li>
                <li><a href="#">加入收藏</a></li>
                <li class="s_tel_str">服务热线：</li>
                <li class="s_tel">400-8823-823</li>
            </ul>
        </div>
    </div>
</div><!--s_tbar end-->

<div class="s_hd nav">
    <div id="s_logo"><a href="#"><img src="images/logo.jpg" border="0" /></a></div>
    <div id="s_nav">
        <ul>
            <li class="first cur"><a href="#">首页</a><span></span></li>
            <li><a href="#">积分兑换</a><span></span></li>
            <li><a href="#">抢购</a><span></span></li>
            <li class="last"><a href="#">礼品</a><span></span></li>
        </ul>
    </div>
</div>
</body>
</html>
