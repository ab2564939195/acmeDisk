<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-2">
            <h4>共：${pageInfo.total}条记录 共${pageInfo.pages}页</h4>
        </div>
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <%--首页--%>
                    <c:if test="${pageInfo.isFirstPage}">
                        <li class="disabled"><span >首页</span></li>
                    </c:if>
                    <c:if test="${pageInfo.isFirstPage==false}">
                        <li><a href="#" no="1">首页</a></li>
                    </c:if>

                    <%--上一页--%>
                        <c:if test="${pageInfo.hasPreviousPage}">
                            <li>
                                <a href="#" aria-label="Previous" no="${pageInfo.prePage}">
                                    <span aria-hidden="true">&laquo;</span>
                                </a>
                            </li>
                        </c:if>
                        <c:if test="${pageInfo.hasPreviousPage==false}">
                            <li class="disabled">
                                <span href="#" aria-label="Previous">
                                    <span aria-hidden="true">&laquo;</span>
                                </span>
                            </li>
                        </c:if>

                    <c:forEach items="${pageInfo.navigatepageNums}" var="page">

                        <li <c:if test="${page==pageInfo.pageNum}">class="active"</c:if>><a href="#"no="${page}">${page}</a></li>
                    </c:forEach>
                    <%--下一页--%>
                        <c:if test="${pageInfo.hasNextPage==false}">
                            <li class="disabled">
                                <span href="#" aria-label="Next">
                                    <span aria-hidden="true">&raquo;</span>
                                </span>
                            </li>
                        </c:if>
                        <c:if test="${pageInfo.hasNextPage}">
                            <li>
                                <a href="#" aria-label="Next" no="${pageInfo.nextPage}">
                                    <span aria-hidden="true">&raquo;</span>
                                </a>
                            </li>
                        </c:if>
                    <%--尾页--%>
                        <c:if test="${pageInfo.isLastPage}">
                            <li class="disabled"><span >尾页</span></li>
                        </c:if>
                        <c:if test="${pageInfo.isLastPage==false}">
                            <li><a href="#"no="${pageInfo.pages}">尾页</a></li>
                        </c:if>
                </ul>
            </nav>
        </div>
    </div>
</div>
<script>
    $(function () {
        $("li>a").click(function () {
            var no = $(this).attr("no");
            var url=location.href.split("?")[0]+"?pageNum="+no+"&pageSize=2";
            location.href=url;
        })
    })
</script>
