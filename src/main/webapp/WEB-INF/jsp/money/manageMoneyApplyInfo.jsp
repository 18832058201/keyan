<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/10
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增科研管理费申请</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${applyInfo.isEdit eq 1}">
    <a href="<%=request.getContextPath()%>/manageMoney/toEditApply.action?applyId=${applyInfo.applyId}"
       class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">科研管理费申请详情</h1>
<%--表单start--%>
<form action="" method="POST" id="applyForm" enctype="multipart/form-data">
    <table style="table-layout:fixed;">
        <tr>
            <td class="right" style="padding-top: 5px;">姓名（工号）：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${applyInfo.workName}（${applyInfo.workNum}）
            </td>
            <td class="right left">申请时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(applyInfo.applyTime)}
            </td>
        </tr>
        <tr>
            <td class="right">申请类型：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${applyInfo.applyTypeName}
            </td>
            <td class="right left">申请年份：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${applyInfo.applyYear}
            </td>
        </tr>
        <tr>
            <td class="right">申请金额：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${applyInfo.applyMoney}
            </td>
            <td class="right left">审核状态：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${applyInfo.auditStatusName}
            </td>
        </tr>
        <tr>
            <td class="right">一级审核人：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${applyInfo.auditPersonId1}
            </td>
            <td class="right left">审批意见：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${applyInfo.auditPoinion1}
            </td>
        </tr>
        <tr>
            <td class="right">二级审核人：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${applyInfo.auditPersonId2}
            </td>
            <td class="right left">审批意见：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${applyInfo.auditPoinion2}
            </td>
        </tr>
        <tr>
            <td class="right">三级审核人：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${applyInfo.auditPersonId3}
            </td>
            <td class="right left">审批意见：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${applyInfo.auditPoinion3}
            </td>
        </tr>
        <tr>
            <td class="right">申请事由：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${applyInfo.applyReason}
            </td>
        </tr>
        <tr>
            <td class="right">备注：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${applyInfo.remark}
            </td>
        </tr>
    </table>
    <br><br>
</form>
</body>
</html>
