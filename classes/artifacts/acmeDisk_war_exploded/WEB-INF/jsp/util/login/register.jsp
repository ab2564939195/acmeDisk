<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <%@include file="../basic.jsp"%>
    <%@include file="../easyUIBasic.jsp"%>
    <%@include file="loginBasic.jsp"%>
    <script type="text/javascript">
        $(function () {
            $("#registerId").click(function () {
                var realName=$("#realNameId").val();//姓名
                var gender=$('input:radio:checked').val();//性别
                var cordID=$("#cordID").val();//身份证号
                var userName=$("#userNameId").val();//用户名
                var userNick=$("#userNickId").val();//昵称
                var pwd1=$("#pwd1").val();//密码
                var pwd2=$("#pwd2").val();
                var phone=$("#phoneId").val();//phoneId
                var email=$("#emailId").val();//取出email
                if(realName==null|realName==""){
                    alert("请填写姓名");
                    return false;
                }else if(gender==null|gender==""){
                    alert("请选择性别");
                    return false;
                }else if(cordID==null|cordID==""){
                    alert("请填写身份证号");
                    return false;
                }else if(cordID.length<18){
                    alert("身份证号长度有误");
                    return false;
                }else if(isNaN(cordID)){
                    alert("身份证号必须为数字");
                    return false;
                }else if(userName==null|userName==""){
                    alert("请填写用户名");
                    return false;
                }else if(userNick==null|userNick==""){
                    alert("请填写昵称");
                    return false;
                }else if(pwd1==""|pwd1==null|pwd2==""|pwd2==null){
                    alert("请填写密码");
                    return false;
                }if(pwd1!=pwd2){
                    alert("密码不一致");
                    return false;
                }else if(phone==""|phone==null){
                    alert("请填写电话号码");
                    return false;
                }else if(email==null|email==""){
                    alert("请填写邮箱");
                    return false;
                }
                return true;
            })
        })
    </script>
</head>
<body>
    <%@include file="top.jsp"%>

        <div class="position:fixed;left:0px;right:0px;width:706px;margin-left:auto;margin-right:auto;top:100px">
            <form action="${pageContext.request.contextPath}/register/doRegister" method="post">

                <div class="form-group">
                    <label>姓名：</label>
                    <input type="text" class="form-control" name="realName" id="realNameId"  placeholder="姓名">
                </div>
                <div class="form-group">
                    <label>性别：</label>
                    <%--<input type="text" class="form-control" name="gender" placeholder="性别">--%>
                    <input type="radio" name="gender" value="boy"/>男
                    <input type="radio" name="gender" value="girl"/>女
                </div>

                <div class="form-group">
                    <label>身份证号：</label>
                    <input type="text" class="form-control" name="cordID" id="cordID"  placeholder="身份证号">
                </div>
                <div class="form-group">
                    <label>用户名：</label>
                    <input type="text" class="form-control" name="userName" id="userNameId" placeholder="用户名">
                </div>
                <div class="form-group">
                    <label>昵称：</label>
                    <input type="text" class="form-control" name="userNick" id="userNickId" placehder="昵称">
                </div>
                <div class="form-group">
                    <label>密码：</label>
                    <input type="password" class="form-control"  id="pwd1" placeholder="密码">
                </div>
                <div class="form-group">
                    <label>重复密码：</label>
                    <input type="password" class="form-control" name="password" id="pwd2" placeholder="重复密码">
                </div>
                <div class="form-group">
                    <label>手机号：</label>
                    <input type="text" class="form-control" name="phone" id="phoneId" placeholder="手机号">
                </div>
                <div class="form-group">
                    <label>邮箱：</label>
                    <input type="email" class="form-control" name="email" id="emailId" placeholder="Email">
                </div>
                    <input type="submit" id="registerId" value="注册" >
            </form>
        </div>
</body>
</html>
