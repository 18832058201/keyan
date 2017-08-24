<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-09
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表格测试</title>
    <style type="text/css">
        .zhuce{font-size: 14px;width: 90%;margin: 0 auto;background: #f7f7f7;}
        .zhuce td{border: 1px dotted #ccc;padding: 2px 3px;text-align: right; }
        .zhuce .ibg{text-align: left;}
        .zhuce .bbg{padding: 20px 0;font-size: 13px;}
        .select-min{min-width:150px;}
    </style>
</head>
<body>
    <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
        <h5>学校公章申请详情</h5>
    </div>
    <form>
        <table  class="zhuce">
            <tr>
                <td width="100">参会者</td>
                <td colspan="2" class="ibg"><input name="txtName" type="text" class="input-min"></td>
                <td>职务</td>
                <td colspan="3" class="ibg"><input name="txtZhiwu" type="text" style="width: 200px"></td>
            </tr>
            <tr>
                <td>2</td>
                <td colspan="8" class="ibg"><input name="" type="text" style="width: 500px;"></td>
            </tr>
            <tr>
                <td>E-mail</td>
                <td colspan="3" class="ibg"><input name="" type="text" style="width: 200px;"></td>
                <td>国家</td>
                <td class="ibg">
                    <select name="" class="select-min">
                        <option selected="selected" value="">中国</option>
                        <option value="">中国</option>
                        <option value="">中国</option>
                        <option value="">中国</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="200">参会者</td>
                <td colspan="4" class="ibg"><input name="txtName" type="text" style="width: 200px"></td>
                <td>职务</td>
                <td colspan="3" class="ibg"><input name="txtZhiwu" type="text" style="width: 200px"></td>
            </tr>
            <tr>
                <td>2</td>
                <td colspan="8" class="ibg"><input name="" type="text" style="width: 500px;"></td>
            </tr>
            <tr>
                <td>E-mail</td>
                <td colspan="4" class="ibg"><input name="" type="text" style="width: 200px;"></td>
                <td>国家</td>
                <td class="ibg">
                    <select name=""  class="select-min">
                        <option selected="selected" value="">中国</option>
                        <option value="">中国--------------------</option>
                        <option value="">中国</option>
                        <option value="">中国</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="100">参会者</td>
                <td colspan="4" class="ibg"><input name="txtName" type="text" style="width: 200px"></td>
                <td>职务</td>
                <td colspan="3" class="ibg"><input name="txtZhiwu" type="text" style="width: 200px"></td>
            </tr>
            <tr>
                <td>2</td>
                <td colspan="8" class="ibg"><input name="" type="text" style="width: 500px;"></td>
            </tr>
            <tr>
                <td>E-mail</td>
                <td colspan="4" class="ibg"><input name="" type="text" style="width: 200px;"></td>
                <td>国家</td>
                <td class="ibg">
                    <select name="" class="select-min">
                        <option selected="selected" value="">中国</option>
                        <option value="">中国</option>
                        <option value="">中国</option>
                        <option value="">中国</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td width="100">参会者</td>
                <td colspan="4" class="ibg"><input name="txtName" type="text" style="width: 200px"></td>
                <td>职务</td>
                <td colspan="3" class="ibg"><input name="txtZhiwu" type="text" style="width: 200px"></td>
            </tr>
            <tr>
                <td>2</td>
                <td colspan="8" class="ibg"><input name="" type="text" style="width: 500px;"></td>
            </tr>
            <tr>
                <td>E-mail</td>
                <td colspan="4" class="ibg"><input name="" type="text" style="width: 200px;"></td>
                <td>国家</td>
                <td class="ibg">
                    <select name=""  class="select-min">
                        <option selected="selected" value="">中国</option>
                        <option value="">中国13213132131313132dsadsadsadadsa</option>
                        <option value="">中国</option>
                        <option value="">中国</option>
                    </select>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
