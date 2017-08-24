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
    <title>审核个人信息详情</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:agree()" class="button button-primary button-rounded button-small">审核通过</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:refuse()" class="button button-primary button-rounded button-small">审核不通过</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>

<%--表单start--%>
<form action="" method="post" class="form-horizontal" id="subForm">
    <input type="hidden" id="auditOpinion" name="auditOpinion"> <%--设置审核意见隐藏域--%>
    <h1 class="title-h1">审核个人信息详情</h1>
    <br>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">注意事项：</td>
            <td colspan="8" class="ibg">
                1. 带有<label class="required">（待确认修改为XXXX）</label>字样的信息为提交编辑但未完成审核的内容！<br>
                2. 审核完成后无法撤销审核，请学院管理员确认之后再进行操作！
            </td>
        </tr>
        <tr>
            <td class="right">工号：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.workNum}
            </td>
        </tr>
        <tr>
            <td class="right left">姓名：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.workName}
                <c:if test="${ePersonEdit.workName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label
                            class="required">${ePersonEdit.workName}</label>&nbsp;&nbsp;）</label>
                </c:if>
            </td>
        </tr>
        <tr>
            <td class="right">职称：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.titleTypeName}
                <c:if test="${ePersonEdit.titleTypeName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.titleTypeName}</label>&nbsp;&nbsp;）</label>
                </c:if>
                &nbsp;&nbsp;&nbsp;&nbsp;${personInfo.titleLevelName}
                <c:if test="${ePersonEdit.titleLevelName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.titleLevelName}</label>&nbsp;&nbsp;）</label>
                </c:if>
            </td>
        </tr>
        <tr>
            <td class="right left">绩效岗位：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.postTypeName}
                <c:if test="${ePersonEdit.postTypeName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label
                            class="required">${ePersonEdit.postTypeName}</label>&nbsp;&nbsp;）</label>
                </c:if>
                &nbsp;&nbsp;${personInfo.titleTypeName}
                <c:if test="${ePersonEdit.postLevelName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.titleTypeName}</label>&nbsp;&nbsp;）</label>
                </c:if>
            </td>
        </tr>
        <tr>
            <td class="right">科研所属部门：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.college2Name}
                <c:if test="${ePersonEdit.collegeName2 != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label
                            class="required">${ePersonEdit.collegeName2}</label>&nbsp;&nbsp;）</label>
                </c:if>
            </td>
        </tr>
    </table>
</form>
<script>
    //通过审核
    function agree() {
        var auditOpinion = prompt("审核意见", '审核通过');    //设置审核意见
        if (auditOpinion) {  //确定审核操作
            $("#auditOpinion").val(auditOpinion);                                  //设置审核意见隐藏域的值
            $("#subForm").attr("action", "<%=request.getContextPath()%>/personal/submitAuditPersonalInfo.action?operation=agree&auditObjectId=${ePersonEdit.personEditId}");   //修改提交路径
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
            $("#subForm").attr("action", "<%=request.getContextPath()%>/personal/submitAuditPersonalInfo.action?operation=refuse&auditObjectId=${ePersonEdit.personEditId}");   //修改提交路径
            $("#subForm").submit();                                                //提交表单
        } else {
            alert("提示：您已取消“审核不通过”操作");
        }
    }
</script>
<%--表单end--%>
</body>
</html>
