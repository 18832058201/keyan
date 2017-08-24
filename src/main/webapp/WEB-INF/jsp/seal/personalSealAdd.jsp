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
    <title>新增公章申请</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">提交</a>&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">新增公章申请</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">用印类型：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">学院公章</option>
                    <option value="">学校公章</option>
                    <option value="">科研院公章</option>
                    <option value="">技术转移中心公章</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">申请用印单位：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">信息与电气工程学院</option>
                    <option value="">建筑与艺术学院</option>
                    <option value="">生命安全学院</option>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">用印事由：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">项目结题类</option>
                    <option value="">外协合同类</option>
                    <option value="">技术合同类</option>
                    <option value="">知识产权类</option>
                    <option value="">其他</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">用印数量：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="" style="width: 200px;"/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">用印说明：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" required></textarea>
                <label class="required">*（200字以内）</label>
            </td>
        </tr>
        <tr>
            <td class="right">申请人所在学院：</td>
            <td colspan="3" class="ibg">信息与电气工程学院</td>
            <td class="right left">申请人姓名（工号）：</td>
            <td colspan="4" class="ibg">测试人员（00001）</td>
        </tr>
    </table>
</form>
<%--表单end--%>
</body>
</html>
