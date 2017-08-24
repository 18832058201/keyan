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
    <title>编辑成果转化项目</title>
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
<h1 class="title-h1">编辑成果转化项目</h1>
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
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">自科</option>
                    <option value="">社科</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="" value="" style="width: 500px;">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                <input type="text" name="" value="" style="width: 200px;">
            </td>
            <td class="right left">合同类型：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">技术成果转让</option>
                    <option value="">技术服务</option>
                    <option value="">技术开发（合作开发）</option>
                    <option value="">技术开发（委托开发）</option>
                    <option value="">技术咨询</option>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究类别：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">基础研究</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">合同签订时间：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="" required="required"/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">受让单位：</td>
            <td colspan="8" class="ibg">
                <input style="width: 500px;" type="text" name="" value="河北工程大学.....">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">服务的国民经济行业：</td>
            <td colspan="8" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">农、林、牧、渔业</option>
                </select>
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">农业</option>
                </select>
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option>谷物及其他作物的种植</option>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">预期成果形式：</td>
            <td colspan="8" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">论文</option>
                    <option value="">软件著作</option>
                </select>
                <input type="text" name="" value="论文" style="width: 300px;">
                <label class="required">*（注：可填写数量，如三篇论文，可填写 论文*3）</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究起始时间：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="" required="required"/>
                <label class="required">*</label>
            </td>
            <td class="right left">预期终止时间：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="" required="required"/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">是否已中期检查：</td>
            <td colspan="8" class="ibg">
                <label>是<input type="radio" name="radio" value="yes"></label>
                <label>否<input type="radio" name="radio" value="no"></label>
            </td>
        </tr>
        <tr>
            <td class="right">登记时间：</td>
            <td colspan="8" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="" required="required"/>
                <label class="required">*（注：此登记时间目的为记录非本年但本年度尚未登记的）</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目所属类型：</td>
            <td colspan="3" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">普通项目</option>
                    <option value="">医科</option>
                    <option value="">人文社科项目</option>
                    <option value="">软科学</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right">项目等级：</td>
            <td colspan="4" class="ibg">
                <select name="" class="select-min">
                    <option selected="selected" value="">--请选择--</option>
                    <option value="">国家级项目</option>
                    <option value="">省级项目</option>
                    <option value="">市厅级项目</option>
                    <option value="">学校项目</option>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">是否重点项目：</td>
            <td colspan="8" class="ibg">
                <label>是<input type="radio" name="radio1" value="yes"></label>
                <label>否<input type="radio" name="radio1" value="no"></label>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究要点及目标：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" required></textarea>
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
    <br>
    <div style="width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第二部分：经费预算信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">出版/文献/信息传播/知识产权事务费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">材料费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">测试化验加工费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">燃料动力费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">差旅费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">会议费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">国际合作与交流费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">设备费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">劳务费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">专家咨询费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">资料费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">数据采集费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">印刷费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
            <td class="right left">管理费：</td>
            <td colspan="4" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">其他经费：</td>
            <td colspan="3" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">科研管理费：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;500
                <label class="required">（单位：元）（注：间接经费，自动扣除）</label>
            </td>
        </tr>
        <tr>
            <td class="right">绩效支出：</td>
            <td colspan="8" class="ibg">
                <input type="number" name="" value="200">
                <label class="required">*（单位：元）（注：间接经费，项目管理员填写，项目组成员最多申请两次！）</label>
            </td>
        </tr>
    </table>
</form>
<%--按钮end--%>
</body>
</html>
