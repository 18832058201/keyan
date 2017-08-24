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
    <title>学院信息编辑</title>
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

<%--表单start--%>
<form>
    <h1 class="title-h1">学院信息详情</h1>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;基本信息（注：标<label class="required">*</label>的为必填项）&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right left">学院名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="" value="" style="width: 500px;" >
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">院长：</td>
            <td colspan="2" class="ibg">
                <input list="dean" name="dean" style="width: 180px;"/>
                <datalist id="dean">
                    <option value="测试人员（00001）"/>
                    <option value="测试人员（00002）"/>
                    <option value="测试人员啊（00023）"/>
                    <option value="测试人员（00003）"/>
                </datalist>
                <label class="required">*</label>
            </td>
            <td class="right left">科研工作院长：</td>
            <td colspan="2" class="ibg">
                <input list="resp_dean" name="resp_dean" style="width: 180px;"/>
                <datalist id="resp_dean">
                    <option value="测试人员（00001）"/>
                    <option value="测试人员（00002）"/>
                    <option value="测试人员啊（00023）"/>
                    <option value="测试人员（00003）"/>
                </datalist>
                <label class="required">*</label>
            </td>
            <td class="right left">科研秘书：</td>
            <td colspan="2" class="ibg">
                <input list="secretary" name="secretary" style="width: 180px;"/>
                <datalist id="secretary">
                    <option value="测试人员（00001）"/>
                    <option value="测试人员（00002）"/>
                    <option value="测试人员啊（00023）"/>
                    <option value="测试人员（00003）"/>
                </datalist>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">应有在职人数：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;">
            </td>
            <td class="right left">入库人数：</td>
            <td colspan="5" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
        </tr>
        <tr>
            <td class="right">本单位人员：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;">
            </td>
            <td class="right left">离职人员：</td>
            <td colspan="5" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
        </tr>
        <tr>
            <td class="right">教授：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
            <td class="right left">副教授：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
            <td class="right left">讲师：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
        </tr>
        <tr>
            <td class="right">助教：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
            <td class="right left">初级：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
            <td class="right left">其他人员：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
        </tr>
        <tr>
            <td class="right">联系电话：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" >
            </td>
            <td class="right left">电子邮箱：</td>
            <td colspan="5" class="ibg">
                <input type="email" name="" value="" style="width: 180px;" >
            </td>
        </tr>
        <tr>
            <td class="right">网址：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" >
            </td>
            <td class="right left">微信：</td>
            <td colspan="5" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" >
            </td>
        </tr>
        <tr>
            <td class="right">科研考核分：</td>
            <td colspan="2" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
            </td>
            <td class="right left">排名：</td>
            <td colspan="5" class="ibg">
                <input type="text" name="" value="" style="width: 180px;" disabled="disabled">
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
