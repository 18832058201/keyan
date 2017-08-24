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
    <title>科研管理费申请详情</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${((applyInfo.auditStatusId eq 1)&&(activeUser.workNameAndNum eq applyInfo.auditPersonId1))||((applyInfo.auditStatusId eq 2)&&(activeUser.workNameAndNum eq applyInfo.auditPersonId2))||((applyInfo.auditStatusId eq 4)&&(activeUser.workNameAndNum eq applyInfo.auditPersonId3))}">
    <a href="javascript:agree()" class="button button-primary button-rounded button-small">审核通过</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="javascript:refuse()" class="button button-primary button-rounded button-small">审核不通过</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="<%=request.getContextPath()%>/manageMoney/toEditAuditApply.action?applyId=${applyInfo.applyId}"
       class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<c:if test="${(((applyInfo.auditStatusId eq 2)||(applyInfo.auditStatusId eq 3))&&(activeUser.workNameAndNum eq applyInfo.auditPersonId1))||(((applyInfo.auditStatusId eq 4)||(applyInfo.auditStatusId eq 5))&&(activeUser.workNameAndNum eq applyInfo.auditPersonId2))||(((applyInfo.auditStatusId eq 6)||(applyInfo.auditStatusId eq 7))&&(activeUser.workNameAndNum eq applyInfo.auditPersonId3))}">
    <a href="javascript:revoke()" class="button button-primary button-rounded button-small">撤销审核</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">科研管理费申请详情</h1>
<%--表单start--%>
<form action="" method="post" class="form-horizontal" id="subForm">
    <input type="hidden" id="auditOpinion" name="auditOpinion">  <%--设置审核意见隐藏域--%>
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
<%--按钮end--%>
<script>
    //通过审核
    function agree() {
        var auditOpinion = prompt("审核意见", '审核通过');    //设置审核意见
        if (auditOpinion) {  //确定审核操作
            $("#auditOpinion").val(auditOpinion);                                  //设置审核意见隐藏域的值
            $("#subForm").attr("action", "<%=request.getContextPath()%>/manageMoney/submitAuditApply.action?operation=agree&auditObjectId=${applyInfo.applyId}");   //修改提交路径
            $("#subForm").submit();                                                //提交表单
        } else {
            alert("提示：您已取消“审核通过”操作");
        }
    }

    //审核不通过
    function refuse() {
        var auditOpinion = prompt("审核意见", '审核不通过');    //设置审核意见
        if (auditOpinion) {  //确定审核操作
            $("#auditOpinion").val(auditOpinion);
            $("#subForm").attr("action", "<%=request.getContextPath()%>/manageMoney/submitAuditApply.action?operation=refuse&auditObjectId=${applyInfo.applyId}");   //修改提交路径
            $("#subForm").submit();                                                //提交表单
        } else {
            alert("提示：您已取消“审核不通过”操作");
        }
    }
    //撤销审核
    function revoke() {
        //至少勾选了一项才能提交审核
        if (confirm("提示：撤销审核后项目将重新进入待审核状态，确定撤销吗？")) {
            $("#subForm").attr("action", "<%=request.getContextPath()%>/manageMoney/submitAuditApply.action?operation=revoke&auditObjectId=${applyInfo.applyId}");   //修改提交路径
            $("#subForm").submit();//提交表单
        }
        else {
            alert("提示：您已取消“撤销审核”操作");
        }
    }
</script>
</body>
</html>
