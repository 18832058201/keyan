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
    <title>标准成果列表-个人</title>
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
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" rel="stylesheet"/>
</head>
<body>
<%--引入文件上传相关内容--%>
<jsp:include page="../../fileUpload.jsp"/>
<div id="content">
    <form action="#" method="get" class="form-horizontal">
        <div id="content-header">
            <%--按钮start--%>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="<%=request.getContextPath()%>/result/standardResult/toAddStandardResult.action" class="button button-primary button-rounded button-small">新增</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">导出到Excel</a>
            <%--按钮end--%>
        </div>
        <br>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title" style="line-height: 36px;"><span class="icon"><i class="icon-th"></i></span>
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">标准成果列表，共有&nbsp;&nbsp;${standardList.size()}&nbsp;&nbsp;条数据</label>
                            <%--<label style="float:right;padding-top: 7px;padding-right: 30px;"><input type="radio"--%>
                                                                                                    <%--name="radio"--%>
                                                                                                    <%--value="yes">已审核</label>--%>
                            <%--<label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="no">待审核&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                            <%--<label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="all"--%>
                                                                                <%--checked="checked">全部&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                            <%--<label style="float:right;padding-top: 7px;"> 请选择状态：&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 20%;">标准号</th>
                                    <th style="text-align: center;width: 10%;">学科门类</th>
                                    <th style="text-align: center;width: 10%;">作者</th>
                                    <th style="text-align: center;width: 10%;">标准状态</th>
                                    <th style="text-align: center;width: 10%;">行业分类</th>
                                    <th style="text-align: center;width: 10%;">有效时间</th>
                                    <th style="text-align: center;width: 10%;">审核状态</th>
                                    <th style="text-align: center;width: 5%;">附件</th>
                                    <th style="text-align: center;width: 10%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <c:forEach items="${standardList}" var="standard">
                                    <tr class="gradeX">
                                        <td>
                                            <a href="<%=request.getContextPath()%>/result/standardResult/personalStandardResultInfo.action?standardId=${standard.standardId}">${standard.standNumber}</a>
                                        </td>
                                        <td>${standard.subjectTypeName}</td>
                                        <td>${standard.personList}</td>
                                        <td>${standard.standStateName}</td>
                                        <td>${standard.standBusinessName}</td>
                                        <td>${ds.format(standard.implementDate)}</td>
                                        <td>${standard.auditStatusName}</td>
                                        <td>
                                                <%--先判断有无上传权限--%>
                                            <c:if test="${(activeUser.workNameAndNum eq standard.registrant)&&(standard.isEdit eq 1)}">
                                                <c:if test="${empty standard.attachment}">
                                                    <a href="javascript:void(0)" data-reveal-id="myModal"
                                                       data-animation="fade"
                                                       onclick="fileUpload('${standard.standardId}')">上传</a>
                                                </c:if>
                                            </c:if>
                                            <c:if test="${!empty standard.attachment}">
                                                <c:if test="${(activeUser.workNameAndNum eq standard.registrant)&&(standard.isEdit eq 1)}">
                                                    <a href="javascript:void(0)" data-reveal-id="myModal"
                                                       data-animation="fade"
                                                       onclick="fileUpload('${standard.standardId}')">重传</a><br>
                                                </c:if>
                                                <a href="javascript:void(0)"
                                                   onclick="fileDownload('${standard.attachment}')">下载</a>
                                            </c:if>
                                        </td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${(activeUser.workNameAndNum eq standard.registrant)&&(standard.isEdit eq 1)}">
                                                    <a href="<%=request.getContextPath()%>/result/standardResult/toEditStandardResult.action?standardId=${standard.standardId}">编辑</a>
                                                    <br>
                                                    <a href="javascript:void(0)"
                                                       onclick="deleteStandardResult('${standard.standardId}')">删除</a>
                                                </c:when>
                                                <c:otherwise>
                                                    无权操作
                                                </c:otherwise>
                                            </c:choose>
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
<script src="<%=request.getContextPath()%>/js/matrix.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.tables.js"></script>
<script>
    function deleteStandardResult(standardId) {
        if (confirm("确定删除该标准管理吗？")) {
            location.href = "<%=request.getContextPath()%>/result/standardResult/deleteStandardResult.action?standardId=" + standardId + "";
        }
    }
</script>
</body>
</html>

