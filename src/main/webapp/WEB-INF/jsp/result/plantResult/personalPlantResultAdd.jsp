<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>新增植物新品种</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <script src="<%=request.getContextPath()%>/js/common.js"></script>
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
<a href="javascript:void(0)" class="button button-primary button-rounded button-small" onclick="submitResult()">提交</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:void(0)" class="button button-primary button-rounded button-small" onclick="saveResult()">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">新增植物新品种</h1>
<%--表单start--%>
<form action="" method="POST" id="plantResultForm" enctype="multipart/form-data">
    <input type="submit" style="display: none" id="subForm">
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">品种名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" value="" name="plantName" style="width: 500px;"
                       onblur="nameIsExisted(this.value,'<%=request.getContextPath()%>/result/plantResult/plantNameIsExisted.action')"
                       required>
                <label class="required">*${exceptionMessage}</label>
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                <select name="subjectTypeId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${subjectTypeList}" var="subjectType">
                        <option value="${subjectType.subjectTypeId}">${subjectType.subjectTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">品种级别：</td>
            <td colspan="4" class="ibg">
                <select name="plantGradeId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${plantGradeList}" var="plantGrade">
                        <option value="${plantGrade.plantGradeId}">${plantGrade.plantGradeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">生物种类：</td>
            <td colspan="3" class="ibg">
                <select name="plantTypeId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${plantTypeList}" var="plantType">
                        <option value="${plantType.plantTypeId}">${plantType.plantTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">属或种：</td>
            <td colspan="4" class="ibg">
                <select name="plantGenusId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${plantGenusList}" var="plantGenus">
                        <option value="${plantGenus.plantGenusId}">${plantGenus.plantGenusName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">品种权人：</td>
            <td colspan="3" class="ibg">
                <input type="text" style="width: 200px;" name="breedOwner" required>
                <label class="required">*</label>
            </td>
            <td class="right left">品种权号：</td>
            <td colspan="4" class="ibg">
                <input type="text" style="width: 200px;" name="breedNumber" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">培育人：</td>
            <td colspan="3" class="ibg">
                <input type="text" style="width: 200px;" name="foster" required>
                <label class="required">*</label>
            </td>
            <td class="right left">证书号：</td>
            <td colspan="4" class="ibg">
                <input type="text" style="width: 200px;" name="certificateNumber" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">申请日期：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="applyDate" required="required"/>
                <label class="required">*</label>
            </td>
            <td class="right left">授权日期：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="empowerDate" required="required"/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">相关附件：</td>
            <td colspan="8" class="ibg">
                <input type="file" name="file" style="border: 1px solid #1f262d">
                <label class="required">（如有多个附件请打包后上传）</label>
            </td>
        </tr>
        <tr>
            <td class="right">简介：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" required name="remark"></textarea>
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
                            <label><input type="radio" name="type" onclick="changePersonType(1)"
                                          checked="checked">本校职工</label>
                            <label><input type="radio" name="type" onclick="changePersonType(2)">本校学生</label>
                            <label><input type="radio" name="type" onclick="changePersonType(3)">校外人员</label>
                        </td>
                    </tr>

                    <!--本校职工-->
                    <tr style="border: 1px dashed #ccc;" id="teacher">
                        <td class="right">选择院部：</td>
                        <td colspan="2" class="ibg">
                            <select class="select-min" id="teacherCollege" onchange="collegeChange(this.value)">
                                <option selected="selected" value="-1">--请选择--</option>
                                <c:forEach items="${collegeList}" var="college">
                                    <option value="${college.collegeId}">${college.collegeName}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td class="right left">选择系室：</td>
                        <td colspan="2" class="ibg">
                            <select class="select-min" id="teacherDepartment" onchange="departmentChange(this.value)">
                                <option selected="selected" value="-1">--请选择--</option>
                            </select>
                        </td>
                        <td class="right left">选择人员：</td>
                        <td colspan="2" class="ibg">
                            <select name="" class="select-min" id="teacherName" onchange="addTeacher()">
                                <option selected="selected" value="-1">--请选择--</option>
                            </select>
                        </td>
                    </tr>

                    <!--本校学生-->
                    <tr style="border: 1px dashed #ccc;display: none" id="student">
                        <td class="right width-100">选择院部：</td>
                        <td colspan="2" class="ibg">
                            <select name="" class="select-min" id="studentCollege">
                                <option selected="selected" value="-1">--请选择--</option>
                                <c:forEach items="${collegeList}" var="college">
                                    <option value="${college.collegeId}">${college.collegeName}</option>
                                </c:forEach>
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
                            <td colspan="2" class="align-center">${activeUser.username}(${activeUser.userId})
                                <input type="hidden" name="personType" value="1"/>
                                <input type="hidden" name="workNum" value="${activeUser.userId}"/>
                                <input type="hidden" name="workName" value="${activeUser.username}"/>
                                <input type="hidden" name="collegeId" value="${activeUser.userInfo.collegeId2}"/>
                                <input type="hidden" name="collegeName" value="${activeUser.userInfo.college2Name}"/>
                                <%--设置登记人姓名，与上边人员列表无关--%>
                                <input type="hidden" name="registrant"
                                       value="${activeUser.username}(${activeUser.userInfo.workNum})"/>
                            </td>
                            <td colspan="3" class="left align-center">${activeUser.userInfo.college2Name}</td>
                            <td colspan="2" class="left align-center"><a href="javascript:void (0)"
                                                                         onclick="moveUp(this)">上调</a>
                                &nbsp;<a href="javascript:void(0)" onclick="moveDown(this)">下调</a></td>
                            <td class="left align-center"><label class="required">登记人无法删除</label></td>
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
<script>
    //保存著作成果
    function saveResult() {
        //保存时屏蔽必填验证
        $(":input").attr("required", false);
        if (confirm("确认保存该著作成果信息吗？")) {
            //修改提交地址为 save
            $("#plantResultForm").attr("action", "<%=request.getContextPath()%>/result/plantResult/insertPlantResult.action?submitType=save");
            $("#subForm").click();  //触发按钮提交事件
        }
    }
    //提交 著作成果
    function submitResult() {
        //调用时间检查函数，有时间为空是函数值为true，此时需要组织表单提交
        if (checkDate()) {
            return;
        }
        if (confirm("确定提交该著作成果信息吗？")) {
            //修改提交地址为 submit
            $("#plantResultForm").attr("action", "<%=request.getContextPath()%>/result/plantResult/insertPlantResult.action?submitType=submit");
            $("#subForm").click(); //触发按钮提交事件
        }
    }
</script>
</body>
</html>
