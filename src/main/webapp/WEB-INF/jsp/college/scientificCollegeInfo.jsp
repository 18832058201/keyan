<%--
  Created by IntelliJ IDEA.
  User: ZHT
  Date: 2017/7/24
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学院信息-科研院查看</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <style type="text/css">
        /*hr标签样式*/
        .hrLine {
            vertical-align: middle;
            display: inline-block;
        }
    </style>
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="scientificCollegeEdit.jsp" class="button button-primary button-rounded button-small" >编辑</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>

<%--表单start--%>
<form>
    <h1 class="title-h1">学院信息详情</h1>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;基本信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right left">学院名称：</td>
            <td colspan="8" class="ibg">信息与电气工程学院</td>
        </tr>
        <tr>
            <td class="right left">学院状态：</td>
            <td colspan="8" class="ibg">教学单位/非教学单位/无效</td>
        </tr>
        <tr>
            <td class="right">院长：</td>
            <td colspan="2" class="ibg">测试人员</td>
            <td class="right left">科研工作院长：</td>
            <td colspan="2" class="ibg">测试人员</td>
            <td class="right left">科研秘书：</td>
            <td colspan="2" class="ibg">测试人员</td>
        </tr>
        <tr>
            <td class="right">应有在职人数：</td>
            <td colspan="2" class="ibg">100</td>
            <td class="right left">入库人数：</td>
            <td colspan="5" class="ibg">100</td>
        </tr>
        <tr>
            <td class="right">本单位人员：</td>
            <td colspan="2" class="ibg">100</td>
            <td class="right left">离职人员：</td>
            <td colspan="5" class="ibg">100</td>
        </tr>
        <tr>
            <td class="right">教授：</td>
            <td colspan="2" class="ibg">100</td>
            <td class="right left">副教授：</td>
            <td colspan="2" class="ibg">100</td>
            <td class="right left">讲师：</td>
            <td colspan="2" class="ibg">100</td>
        </tr>
        <tr>
            <td class="right">助教：</td>
            <td colspan="2" class="ibg">100</td>
            <td class="right left">初级：</td>
            <td colspan="2" class="ibg">100</td>
            <td class="right left">其他人员：</td>
            <td colspan="2" class="ibg">100</td>
        </tr>
        <tr>
            <td class="right">联系电话：</td>
            <td colspan="2" class="ibg">0311-123456789</td>
            <td class="right left">电子邮箱：</td>
            <td colspan="5" class="ibg">123456789@qq.com</td>
        </tr>
        <tr>
            <td class="right">网址：</td>
            <td colspan="2" class="ibg">www.123456789.com</td>
            <td class="right left">微信：</td>
            <td colspan="5" class="ibg">123456789@qq.com</td>
        </tr>
        <tr>
            <td class="right">科研考核分：</td>
            <td colspan="2" class="ibg">100</td>
            <td class="right left">排名：</td>
            <td colspan="5" class="ibg">1</td>
        </tr>
        <tr>
            <td class="right">成立时间：</td>
            <td colspan="2" class="ibg">1990-08-11</td>
            <td class="right left">邮编：</td>
            <td colspan="2" class="ibg">123456789</td>
            <td class="right left">地址：</td>
            <td colspan="2" class="ibg">第三教学楼</td>
        </tr>
        <tr>
            <td class="right left">简介：</td>
            <td colspan="8" class="ibg">简介的内容</td>
        </tr>
    </table>
</form>
<%--表单end--%>
</body>
</html>
