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
    <title>编辑著作成果</title>
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
<a href="" class="button button-primary button-rounded button-small">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">编辑著作成果</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">著作名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 500px;" value="测试数据">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="" selected="selected">自科</option>
                    <option value="">社科</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="" selected="selected">与学科门类相关</option>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">著作类型：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">专著</option>
                    <option value="" selected="selected">教科书</option>
                    <option value="">编著</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">ISBN：</td>
            <td colspan="4" class="ibg">
                <input type="text" style="width: 200px;" value="123466">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>

        </tr>
        <tr>
            <td class="right">著作总字数：</td>
            <td colspan="3" class="ibg">
                <input type="text" style="width: 200px;" value="123456">
                <label class="required">*</label>
            </td>
            <td class="right left">撰写总字数：</td>
            <td colspan="4" class="ibg">
                <input type="text" style="width: 200px;" value="120000">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">出版单位：</td>
            <td colspan="3" class="ibg">
                <input type="text" style="width: 200px;" value="测试">
                <label class="required">*</label>
            </td>
            <td class="right left">出版地：</td>
            <td colspan="4" class="ibg">
                <input type="text" style="width: 200px;" value="测试">
                <label class="required">*</label>
            </td>

        </tr>
        <tr>
            <td class="right">出版日期：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="2010-01-01"
                       style="width: 200px;" name="" required="required"/>
                <label class="required">*</label>
            </td>
            <td class="right left">出版社类型：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">权威出版社</option>
                    <option value="" selected="selected">行业出版社</option>
                    <option value="">其他出版社</option>
                </select>
                <label class="required">*（注：与考核相关）</label>
            </td>
        </tr>
        <tr>
            <td class="right">奖励金额：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="" style="width: 200px;" value="">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">备注：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" required>无</textarea>
                <label class="required">*（200字以内）</label>
            </td>
        </tr>
        <!--start :人员选择--->
        <tr>
            <td class="right">添加人员：</td>
            <td colspan="8" class="ibg">
                <table style="border: 1px solid black;width: 100%">
                    <tr style="border: 1px dashed #ccc;">
                        <td colspan="9" style="text-align: left;">
                            <label class="required">提示：由于本校教职工信息资料库尚不完善，若找不到相应的职工，请通知他（她）登陆本系统，完善其个人资料</label>
                        </td>
                    </tr>
                    <tr style="border: 1px dashed #ccc;">
                        <td class="right width-100">人员类别：</td>
                        <td colspan="8" class="ibg">
                            <label><input type="radio" name="personType" onclick="changePersonType(1)" checked="checked">本校职工</label>
                            <label><input type="radio" name="personType" onclick="changePersonType(2)">本校学生</label>
                            <label><input type="radio" name="personType" onclick="changePersonType(3)">校外人员</label>
                        </td>
                    </tr>

                    <!--本校职工-->
                    <tr style="border: 1px dashed #ccc;" id="teacher">
                        <td class="right">选择院部：</td>
                        <td colspan="2" class="ibg">
                            <select name="" class="select-min" id="teacherCollege">
                                <option selected="selected" value="-1">--请选择--</option>
                                <option value="">信息与电气工程学院</option>
                            </select>
                        </td>
                        <td class="right left">选择系室：</td>
                        <td colspan="2" class="ibg">
                            <select name="" class="select-min" id="teacherDepartment">
                                <option selected="selected" value="-1">--请选择--</option>
                                <option value="">计算机系</option>
                            </select>
                        </td>
                        <td class="right left">选择人员：</td>
                        <td colspan="2" class="ibg">
                            <select name="" class="select-min" id="teacherName" onchange="addTeacher()">
                                <option selected="selected" value="-1">--请选择--</option>
                                <option value="00001">测试人员</option>
                            </select>
                        </td>
                    </tr>

                    <!--本校学生-->
                    <tr style="border: 1px dashed #ccc;display: none" id="student">
                        <td class="right width-100">选择院部：</td>
                        <td colspan="2" class="ibg">
                            <select name="" class="select-min" id="studentCollege">
                                <option selected="selected" value="-1">--请选择--</option>
                                <option value="">信息与电气工程学院</option>
                            </select>
                        </td>
                        <td class="right left">姓名：</td>
                        <td colspan="5" class="ibg">
                            <input type="text" class="width-150" id="studentName">
                            <a style="margin-left: 50px" href="javascript:void(0)" onclick="addStudent()">新增</a>
                        </td>
                    </tr>

                    <!--校外人员-->
                    <tr style="border: 1px dashed #ccc;display: none" id="outsidePerson">
                        <td class="right width-100">所在单位：</td>
                        <td colspan="2" class="ibg">
                            <input type="text" class="width-200" id="outsideDepartment">
                        </td>
                        <td class="right left">姓名：</td>
                        <td colspan="5" class="ibg">
                            <input type="text" class="width-150" id="outsideName">
                            <a style="margin-left: 50px" href="javascript:void(0)" onclick="addOutsidePeople()">新增</a>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>

        <tr>
            <td class="right">人员列表：</td>
            <td colspan="8" class="ibg">
                <div class="table-container">
                    <table style="border: 1px solid black;width: 100%;table-layout:fixed;" id="personTable">
                        <thead>
                        <tr>
                            <th colspan="2">姓名（工号）</th>
                            <th colspan="3" class="left">所属单位</th>
                            <th colspan="2" class="left">排名调整</th>
                            <th class="left">删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td colspan="2" class="align-center">测试人员（00002）</td>
                            <td colspan="3" class="left align-center" >信息与电气工程学院</td>
                            <td colspan="2" class="left align-center" ><a href="javascript:void (0)" onclick="moveUp(this)">上调</a>
                                &nbsp;<a href="javascript:void(0)" onclick="moveDown(this)">下调</a></td>
                            <td class="left align-center" ><label class="required">登记人无法删除</label></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
        <!--功能相关js-->
        <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/addPerson.js"></script>
        <!--end :人员选择--->
    </table>
</form>
<%--按钮end--%>
</body>
</html>
