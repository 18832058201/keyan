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
    <title>成果转化项目结题信息编辑-个人</title>
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
<a href="" class="button button-primary button-rounded button-small">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">成果转化项目结题信息编辑</h1>
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
            <td class="right left">项目来源：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;测试
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
            <td colspan="4" class="ibg">&nbsp;&nbsp;成果转化项目</td>
        </tr>

    </table>
    <br>
    <div style="width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第二部分：成果转化项目结题信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">验收单位：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="" value="河北工程大学" style="width: 500px;">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">验收形式：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">书面审核验收</option>
                    <option value="">会议验收</option>
                    <option value="">函审验收</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">验收时间：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="2017-06-16"
                       style="width: 200px;" name="" required="required"/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">完成人员：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 500px;" value="测试人员1,测试人员2,测试人员3,测试人员4">
                <label class="required">*(按照排名顺序填写，多个人员之间使用,(逗号)隔开)</label>
            </td>
        </tr>
        <tr>
            <td class="right">最终成果形式：</td>
            <td colspan="8" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">论文</option>
                    <option value="">软件著作</option>
                </select>
                <input type="text" name="" value="论文*3" style="width: 300px;">
                <label class="required">*（注：可填写数量，如三篇论文，可填写 论文*3）</label>
            </td>
        </tr>
        <tr>
            <td class="right">验收结果：</td>
            <td colspan="8" class="ibg">
                验收通过<input type="radio" name="radio" value="yes">
                验收不通过<input type="radio" name="radio" value="no">
                &nbsp;&nbsp;
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">完成单位：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="" style="width: 500px;" value="信息与电气工程学院,机械装备制造学院">
                <label class="required">*（按照排名顺序填写，多个单位之间使用,(逗号)隔开）</label>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
