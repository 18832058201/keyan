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
    <title>横向项目预算调整-个人</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <style type="text/css">
        .table-container {
            overflow: auto;
            display: block;
        }
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
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">提交</a>&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">横向项目预算调整</h1>
<br>
<div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    &nbsp;&nbsp;&nbsp;&nbsp;第一部分：项目基本信息&nbsp;&nbsp;&nbsp;&nbsp;
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
</div>
<br>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;自科
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;所属学科
            </td>
        </tr>
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;测试项目
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;ABCDEF20170616
            </td>
            <td class="right left">项目性质：</td>
            <td colspan="4" class="ibg">&nbsp;&nbsp;横向项目</td>
        </tr>
        <tr>
            <td class="right">项目来源：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;测试
            </td>
            <td class="right left">批准经费：</td>
            <td colspan="4" class="ibg">
                1500
                <label class="required">（单位：元）</label>
            </td>
        </tr>
    </table>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第二部分：经费预算信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">出版/文献/信息传播/知识产权事务费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">材料费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">测试化验加工费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">燃料动力费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">差旅费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">会议费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">国际合作与交流费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">设备费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">劳务费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">专家咨询费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">资料费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">数据采集费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">印刷费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">管理费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">其他经费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">学校科研管理费：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;500
                <label class="required">（单位：元）（注：间接经费，自动扣除）</label>
            </td>
        </tr>
        <tr>
            <td class="right">绩效支出：</td>
            <td colspan="8" class="ibg">
                <input type="number" name="" value="500">
                <label class="required">*（单位：元）（注：间接经费，项目管理员填写，项目组成员最多申请两次！）</label>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
