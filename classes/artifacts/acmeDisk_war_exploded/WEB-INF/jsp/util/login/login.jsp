<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/19
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="../basic.jsp"%>
    <%@include file="../easyUIBasic.jsp"%>
    <%@include file="loginBasic.jsp"%>
    <script type="text/javascript">
        $(function () {
            var result=${result};
            if(result!=null&result!=""){
                alert(result);
            }
//            if(!window.localStorage){
//                alert("浏览器支持localstorage");
//                return false;
//            }else{
//                //主逻辑业务
//                alert("主逻辑业务");
//            }
            $("#loginId").click(function () {
                var userName=$("#userNameId").val();
                var password=$("#passwordId").val();
                if(userName==null|userName==""){
                    alert("请填写用户名");
                    return false;
                }else if(password==null|password==""){
                    alert("请填写密码");
                    return false;
                }
                    return true;
            })

        })
        function VerificationCode(){

            var rad = Math.floor(Math.random() * Math.pow(10, 8));

            //uuuy是随便写的一个参数名称，后端不会做处理，作用是避免浏览器读取缓存的链接

            $("#randCodeImage").attr("src", "VerificationCode/generate.action?uuuy="+rad);

        }

    </script>
</head>
<body>
<%@include file="top.jsp"%>
<div   class="login_wrapper" >
    <div class="animate form login_form">
        <form class="form-horizontal" action="${pageContext.request.contextPath}/login/doLogin">
        <div class="form-group">
            <label class="col-sm-2 control-label">用户名:</label>
            <div class="col-xs-4">
                <input type="text" name="userName" class="form-control" id="userNameId">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">密码:</label>
            <div class="col-xs-4">
                <input type="password" name="password" class="form-control" id="passwordId" placeholder="Password">
            </div>
        </div>
            <div class="form-group">
                验证码：<input type="text" size="10px"  name="VerificationCode" placeholder="请输入验证码"  id="VerificationCode"/>
                <span  style="padding: 0px;">
                <a href="javascript:void(0);" onclick="VerificationCode()">
                    <img id="randCodeImage" src="VerificationCode/generate.action"/></a>
                </span>
            </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <input type="submit" value="登录" id="loginId" class="btn btn-default"></input>
            </div>
        </div>
    </form>
    </div>
</div>
<%@include file="bottom.jsp"%>
</body>
</html>
