<%@page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="announce_top cf"><h3>关注趣购<span><a href="#">更多</a></span></h3></div>

<div class="announce_cont">
    <ul>
        <c:forEach items="${pageInfo}" var="news">
        <li><a href="#">${news.newsTatle}</a></li>
        </c:forEach>
    </ul>
</div>
