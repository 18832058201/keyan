<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-08
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>个人信息-职称-系统维护</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/uniform.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/select2.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-media.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableListStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" />
</head>
<body>
<div id="content">
    <form action="<%=request.getContextPath()%>/insertPerTitle.action" class="form-horizontal" method="post"
          id="insertForm">
        <div id="content-header">
            <%--按钮start--%>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">导出到Excel</a>
            <%--按钮end--%>
        </div>
        <br>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title" style="line-height: 36px;"><span class="icon"><i class="icon-th"></i></span>
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">职称列表，共有&nbsp;&nbsp;${perTitleCount}&nbsp;&nbsp;条数据</label>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 10%;">编号</th>
                                    <th style="text-align: center;width: 30%;">职称类别</th>
                                    <th style="text-align: center;width: 20%;">职称等级</th>
                                    <th style="text-align: center;width: 15%;">倍率</th>
                                    <th style="text-align: center;width: 15%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <%--数据库中查询的数据--%>
                                <c:forEach items="${perTitleLevelList}" var="perTitleLevel">
                                    <tr class="gradeX">
                                        <td>${perTitleLevel.titleLevelId}</td>
                                        <td>
                                            <c:forEach items="${perTitleTypeList}" var="perTitleType">
                                                <c:if test="${perTitleType.titleTypeId eq perTitleLevel.titleTypeId}">
                                                    ${perTitleType.titleTypeName}
                                                </c:if>
                                            </c:forEach>
                                            <input type="hidden" value="${ perTitleLevel.titleTypeId}"/>
                                        </td>
                                        <td>${perTitleLevel.titleLevelName}</td>
                                        <td>${perTitleLevel.rate}</td>
                                        <td>
                                            <a href="javascript:void(0)" onclick="toEdit(this)">编辑</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>

<script src="<%=request.getContextPath()%>/js/jquery_dialog.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.uniform.js"></script>
<script src="<%=request.getContextPath()%>/js/select2.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js"></script>
<%--实现表格数据的排序等功能--%>
<script src="<%=request.getContextPath()%>/js/matrix.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.tables.js"></script>
<%--实现表格的分页等功能--%>
<script src="<%=request.getContextPath()%>/js/common.js"></script>

<script>
    //编辑
    function toEdit(obj){
        //获取到编辑按钮当前的行元素
        var tr = $(obj).parent().parent();  //$(obj)为a标签对象，父元素是td，再父元素就是tr对象
        if($(obj).html()==="编辑"){
            $(obj).html("保存");  //点击编辑后将按钮设置为保存
            //获取到第四列元素
            var td4 = tr.find("td").eq(3);
            td4.html('<input type="text" name="rate" style="width: 80%;height:30px" value="'+td4.html()+'">');
        }else{
            var titleLevelId = tr.find("td").eq(0).html(); //职称等级id
            var rate = tr.find("td").eq(3).find("input").eq(0).val();   //获取倍率
            location.href ="/updatePerTitleLevel.action?titleLevelId="+titleLevelId+"&rate="+rate+"";
        }
    }
</script>
<%--返回异常信息--%>
<c:if test="${!empty exceptionMessage}">
    <script>
        alert('${exceptionMessage}');
    </script>
</c:if>
</body>
</html>
