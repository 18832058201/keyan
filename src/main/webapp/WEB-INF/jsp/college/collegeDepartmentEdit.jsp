<%--
  Created by IntelliJ IDEA.
  User: ZHT
  Date: 2017/7/24
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教研室信息编辑</title>
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
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">提交</a>&nbsp;&nbsp;
<br>
<br>
<%--按钮end--%>

<%--表单start--%>
<form>
    <h1 class="title-h1">编辑教研室信息</h1>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;基本信息（注：标<label class="required">*</label>的为必填项）&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right left">所属学院：</td>
            <td colspan="8" class="ibg">
                登录人所在学院
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right left">系室名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="" value="" style="width: 500px;" >
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right left">是否教学单位：</td>
            <td colspan="8" class="ibg">
                <label>是<input type="radio" name="radio" value="yes"></label>
                <label>否<input type="radio" name="radio" value="no"></label>
                <label class="required">*（注：教学单位会显示在科研所属教研室列表中，非教学单位不会显示）</label>
            </td>
        </tr>
        <tr>
            <td class="right left">是否有效：</td>
            <td colspan="8" class="ibg">
                <label>是<input type="radio" name="radio" value="yes"></label>
                <label>否<input type="radio" name="radio" value="no"></label>
                <label class="required">*（注：有效则会显示，无效则不显示在任何列表中）</label>
            </td>
        </tr>
        <tr>
            <td class="right">系主任：</td>
            <td colspan="8" class="ibg">
                <input list="dean" name="dean" style="width: 180px;" value="测试人员（00001）"/>
                <datalist id="dean">
                    <option value="测试人员（00001）"/>
                    <option value="测试人员（00002）"/>
                    <option value="测试人员啊（00023）"/>
                    <option value="测试人员（00003）"/>
                </datalist>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">电话：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;">
            </td>
            <td class="right left">邮编：</td>
            <td colspan="5" class="ibg">
                <input type="text" name="" value="" style="width: 180px;">
            </td>
        </tr>
        <tr>
            <td class="right">网址：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" >
            </td>
            <td class="right left">传真：</td>
            <td colspan="5" class="ibg">
                <input type="email" name="" value="" style="width: 180px;" >
            </td>
        </tr>
        <tr>
            <td class="right">成立时间：</td>
            <td colspan="2" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 180px;" name=""  required="required"/>
            </td>
            <td class="right left">邮编：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" >
            </td>
            <td class="right left">地址：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" >
            </td>
        </tr>
        <tr>
            <td class="right left">简介：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="" value="" style="width: 895px;" >
            </td>
        </tr>
    </table>
</form>
<%--表单end--%>
</body>
</html>
