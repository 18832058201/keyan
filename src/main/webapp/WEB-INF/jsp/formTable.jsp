<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-15
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表格样式</title>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <style type="text/css">
        /*标题信息*/
        h1 {
            color: #666666;
            font-size: 18px;
            float: none;
            text-shadow: 0 1px 0 #ffffff;
            padding-top: 3px;
            padding-bottom: 3px;
            position: relative;
            border-bottom: 2px solid #EE7600;
            margin: 0 20px 10px 20px;
        }

        table {
            font-size: 14px;
            width: 95%;
            background: #f7f7f7;
            margin: 0 auto;
            border-collapse: collapse;
        }

        table tr {
            border: 1px dashed #ccc;
        }

        table td {
            padding: 2px 3px;
            text-align: center;
        }

        /*td标签右边框*/
        .right {
            border-right: 1px dotted #ccc;
        }

        /*td标签左边框*/
        .left {
            border-left: 1px dotted #ccc;
        }

        .ibg {
            text-align: left;
        }

        .select-min {
            min-width: 150px;
        }

        font {
            color: red;
            font-size: 14px;
            font-family: 华文仿宋;
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="widget-title"><span class="icon"> <i class="icon-align-justify"></i> </span>
    <h5>学校公章申请详情</h5>
</div>
<form>
    <table class="table">
        <tr>
            <td width="100px" class="right">用印类型：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">学院公章</option>
                    <option value="">学校公章</option>
                    <option value="">科研院公章</option>
                    <option value="">技术转移中心公章</option>
                </select>
                <font>（必选）</font>
            </td>
            <td class="right left">申请用印单位：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">信息与电气工程学院</option>
                    <option value="">建筑与艺术学院</option>
                    <option value="">生命安全学院</option>
                </select>
                <font>（必填）</font>
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
                <font>（必填）</font>
            </td>
            <td class="right left">申请用印单位：</td>
            <td colspan="4" class="ibg">
                <font>（必填）</font>
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="8" class="ibg"><input name="" type="text"><font>（必填）</font></td>
        </tr>
        <tr>
            <td class="right">项目性质：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">学院公章</option>
                    <option value="">学校公章</option>
                    <option value="">科研院公章</option>
                    <option value="">技术转移中心公章</option>
                </select>
                <font>（必选）</font>
            </td>
            <td class="right left">项目来源：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">学院公章</option>
                    <option value="">学校公章</option>
                    <option value="">科研院公章</option>
                    <option value="">技术转移中心公章aaaaaaaaaaaaaaaaaaaa</option>
                </select>
                <font>（必选）</font>
            </td>
        </tr>
        <tr>
            <td class="right">项目类型：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                </select>
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                </select>
                <font>（必选）</font>
            </td>
            <td class="right left">批准时间：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="" id="approveTime" required="required"/>
                <font>（必选）</font>
            </td>
        </tr>
        <tr>
            <td class="right">研究类别：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                </select>
                <font>（必选）</font>
            </td>
            <td class="right left">独立/合作研究：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                </select>
                <font>（必选）</font>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
