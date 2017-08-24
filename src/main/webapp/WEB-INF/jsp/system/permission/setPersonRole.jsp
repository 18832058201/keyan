<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
    <title>设置角色</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <style type="text/css">
        .table-container {
            overflow: auto;
            display: block;
        }
    </style>
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="saveRoleSettings()" class="button button-primary button-rounded button-small">保存设置</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/system/permission/resetPassword.action?workNum=${userInfo.workNum}" class="button button-primary button-rounded button-small">重置密码</a>
<br>
<br>
<h1 class="title-h1">人员角色设置</h1>
<%--表单start--%>
<form id="subForm" action="<%=request.getContextPath()%>/system/permission/saveRoleSettings.action" method="post">
    <table style="table-layout:fixed;">
        <tr>
            <td >当前操作对象：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${userInfo.workName}(${userInfo.workNum})
                <input type="hidden" name="workNum" value="${userInfo.workNum}">
            </td>
        </tr>
        <tr>
            <td colspan="9" class="ibg">
                &nbsp;&nbsp;&nbsp;&nbsp;<label class="required">说明：请勾选对应的角色进行设置，如有多个角色请勾选多个</label>
            </td>
        </tr>
        <tr>
        </tr>
        <tr>
            <td ></td>
            <td colspan="2" class="ibg">
                &nbsp;&nbsp;角色名称
            </td>
            <td colspan="6" class="ibg left">
                &nbsp;&nbsp;角色说明
            </td>
        </tr>
        <c:forEach items="${allRoleList}" varStatus="i" var="role">
            <c:if test="${!('superAdmin' eq role.roleCode)}">
                <tr>
                    <td >
                        <label><input type="checkbox" name="roleId" ${fn:contains(personRole,role.roleCode )?'checked="checked"':''} value="${role.roleId}"></label>
                    </td>
                    <td colspan="2" class="ibg">
                        &nbsp;&nbsp;${role.roleName}
                    </td>
                    <td colspan="6" class="ibg left">
                        &nbsp;&nbsp;${role.roleRemark}
                    </td>
                </tr>
            </c:if>
        </c:forEach>

    </table>
</form>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script>
    /**
     * 保存角色设置
     */
    function saveRoleSettings() {
        if(confirm("提示：确认保存设置吗？")){
            $("#subForm").submit();
        }
    }

</script>
</body>
</html>
