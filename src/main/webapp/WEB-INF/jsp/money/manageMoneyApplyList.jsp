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
    <title>科研管理费申请列表</title>
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
<div id="content">
    <form action="#" method="get" class="form-horizontal">
        <div id="content-header">
            <%--按钮start--%>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="<%=request.getContextPath()%>/manageMoney/toAddApply.action"
               class="button button-primary button-rounded button-small">新增</a>
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
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">科研管理费申请列表，共有&nbsp;&nbsp;${manageMoneyApplyList.size()}&nbsp;&nbsp;条数据</label>
                            <%-- <label style="float:right;padding-top: 7px;padding-right: 30px;"><input type="radio" name="radio" value="yes">已审核</label>
                             <label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="no">待审核&nbsp;&nbsp;&nbsp;&nbsp;</label>
                             <label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="all" checked="checked">
                             全部&nbsp;&nbsp;&nbsp;&nbsp;
                             </label>
                             <label style="float:right;padding-top: 7px;"> 请选择状态：&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 20%;">申请编号</th>
                                    <th style="text-align: center;width: 10%;">申请类型</th>
                                    <th style="text-align: center;width: 7%;">申请金额</th>
                                    <th style="text-align: center;width: 10%;">申请时间</th>
                                    <th style="text-align: center;width: 15%;">申请事由</th>
                                    <th style="text-align: center;width: 10%;">审核状态</th>
                                    <th style="text-align: center;width: 7%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <c:forEach items="${manageMoneyApplyList}" var="manageMoneyApply">
                                    <tr class="gradeX">
                                        <td><a href="<%=request.getContextPath()%>/manageMoney/toApplyInfo.action?applyId=${manageMoneyApply.applyId}">${manageMoneyApply.applyId}</a></td>
                                        <td>${manageMoneyApply.applyTypeName}</td>
                                        <td>${manageMoneyApply.applyMoney}</td>
                                        <td>${ds.format(manageMoneyApply.applyTime)}</td>
                                        <td>${manageMoneyApply.applyReason}</td>
                                        <td>${manageMoneyApply.auditStatusName}</td>
                                        <td>
                                            <c:choose>
                                                <c:when test="${manageMoneyApply.isEdit eq 1}">
                                                    <a href="<%=request.getContextPath()%>/manageMoney/toEditApply.action?applyId=${manageMoneyApply.applyId}">编辑</a>
                                                    &nbsp;&nbsp;<a href="javascript:void(0)" onclick="deleteApply('${manageMoneyApply.applyId}')">删除</a>
                                                </c:when>
                                                <c:otherwise>
                                                    当前无法操作
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
    function deleteApply(applyId) {
        if (confirm("确定删除该申请吗？")) {
            location.href = "<%=request.getContextPath()%>/manageMoney/deleteApply.action?applyId=" + applyId + "";
        }
    }
</script>
</body>
</html>

