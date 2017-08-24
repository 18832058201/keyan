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
    <title>公章申请信息详情</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<%--<a href="javascript:void (0)" onclick="window.showModalDialog('personalSealEdit.jsp','newwindow','dialogWidth=1000px;dialogHeight=500px,center=yes')" class="button button-primary button-rounded button-small">编辑</a>--%>
<a href="personalSealEdit.jsp" class="button button-primary button-rounded button-small">编辑</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">公章申请信息详情</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">用印类型：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;学院公章
            </td>
            <td class="right left">申请用印单位：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;信息与电气工程学院
            </td>
        </tr>
        <tr>
            <td class="right">用印事由：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;项目结题类
            </td>
            <td class="right left">用印数量：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;5
            </td>
        </tr>
        <tr>
            <td class="right">用印说明：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;测试
            </td>
        </tr>
        <tr>
            <td class="right">申请人所在学院：</td>
            <td colspan="3" class="ibg">信息与电气工程学院</td>
            <td class="right left">申请人姓名（工号）：</td>
            <td colspan="4" class="ibg">测试人员（00001）</td>
        </tr>
        <tr style="border-top: 2px solid black">
            <td class="right">审核状态：</td>
            <td colspan="3" class="ibg">待学院审核</td>
            <td class="right">审核人员：</td>
            <td colspan="4" class="ibg">测试人员</td>
        </tr>
        <tr>
            <td class="right">审核时间：</td>
            <td colspan="3" class="ibg">2017-06-16</td>
            <td class="right left">审批意见：</td>
            <td colspan="4" class="ibg">审核通过，可使用</td>
        </tr>
        <tr>
            <td class="right">印章使用状态：</td>
            <td colspan="3" class="ibg">未使用/已使用</td>
            <td class="right left">使用日期：</td>
            <td colspan="4" class="ibg">2017-06-16</td>
        </tr>
    </table>
</form>
<%--按钮end--%>
</body>
</html>
