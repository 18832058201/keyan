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
    <title>编辑鉴定成果</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/js/common.js"></script>
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
<a href="javascript:void(0)" onclick="submitIdentifyResult()"
   class="button button-primary button-rounded button-small">提交</a>&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="saveIdentifyResult()"
   class="button button-primary button-rounded button-small">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">编辑鉴定成果</h1>
<%--表单start--%>
<form action="" method="POST" id="identifyResultForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" id="projectName" name="projectName" value="${identifyResultVO.projectName}" style="width: 300px;" required
                       onblur="nameIsExisted(this.value,'<%=request.getContextPath()%>/result/identifyResult/identifyNameIsExisted.action?identifyId=${identifyResultVO.identifyId}')">
                <input type="hidden" value="${identifyResultVO.identifyId}" name="identifyId">
                <label class="required">*（此处只显示科研院审核通过的本人参与的内容）${exceptionMessage}</label>
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                <select name="subjectTypeId" class="select-min" onchange="subjectTypeChange(this.value)" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectTypeList}" var="subjectType">
                        <option value="${subjectType.subjectTypeId}" ${subjectType.subjectTypeId eq identifyResultVO.subjectTypeId ? "selected='selected'":""}>${subjectType.subjectTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                <select name="subjectFirstId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectFirstList}" var="subjectFirst">
                        <option value="${subjectFirst.subjectFirstId}" ${subjectFirst.subjectFirstId eq identifyResultVO.subjectFirstId ? "selected='selected'":""}>${subjectFirst.subjectFirstName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                <input type="text" name="projectNumber" style="width: 200px;" value="${identifyResultVO.projectNumber}" required>
                <label class="required">*</label>
            </td>
            <td class="right left">项目来源：</td>
            <td colspan="4" class="ibg">
                <select name="projectSourceId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${projectSourceList}" var="projectSource">
                        <option value="${projectSource.projectSourceId}" ${projectSource.projectSourceId eq identifyResultVO.projectSourceId ? "selected='selected'":""}>${projectSource.projectSourceName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目类型：</td>
            <td colspan="8" class="ibg">
                <select name="projectType1Id" required class="select-min" onchange="projectType1Change(this.value)">
                    <option value="">--请选择--</option>
                    <c:forEach items="${projectType1List}" var="projectType1">
                        <option value="${projectType1.projectType1Id}" ${identifyResultVO.projectType1Id eq projectType1.projectType1Id ? 'selected="selected"':""}>${projectType1.projectType1Name}</option>
                    </c:forEach>
                </select>
                <select name="projectType2Id" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${projectType2List}" var="projectType2">
                        <option value="${projectType2.projectType2Id}" ${identifyResultVO.projectType2Id eq projectType2.projectType2Id ? 'selected="selected"':""}>${projectType2.projectType2Name}</option>
                    </c:forEach>
                </select>
                <label class="required">*(下拉框无选项可不填)</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究起始时间：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(identifyResultVO.startDate)}"
                       style="width: 200px;" name="startDate" required/>
                <label class="required">*</label>
            </td>
            <td class="right left">研究终止时间：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(identifyResultVO.expectEndDate)}"
                       style="width: 200px;" name="expectEndDate" required/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">鉴定单位：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="identifyUnit" style="width: 500px;" value="${identifyResultVO.identifyUnit}" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">鉴定形式：</td>
            <td colspan="3" class="ibg">
                <select name="formId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${idenFormList}" var="idenForm">
                        <option value="${idenForm.formId}" ${identifyResultVO.formId eq idenForm.formId? 'selected = "selected"':""}  >${idenForm.formName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">鉴定时间：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(identifyResultVO.identifyDate)}"
                       style="width: 200px;" name="identifyDate" required/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">鉴定水平：</td>
            <td colspan="3" class="ibg">
                <select name="idenLevelId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${idenLevelList}" var="idenLevel">
                        <option value="${idenLevel.idenLevelId}" ${idenLevel.idenLevelId eq identifyResultVO.idenLevelId?'selected = "selected"':"" }>${idenLevel.idenLevelName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">鉴定证书编号：</td>
            <td colspan="4" class="ibg">
                <input type="text" name="idenCertificateNum" style="width: 200px;" value="${identifyResultVO.idenCertificateNum}" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">完成单位：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="finishUnit" style="width: 500px;" value="${identifyResultVO.finishUnit}" required>
                <label class="required">*（按照排名顺序填写，多个单位之间使用,(逗号)隔开）</label>
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
            <td class="right">成果简介：</td>
            <td colspan="8" class="ibg">
                <textarea name="remark" style="width:80%;height: 100px;resize: none;" required>${identifyResultVO.remark}</textarea>
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
                        <%--设置登记人姓名，与上边人员列表无关--%>
                        <%--<input type="hidden" name="registrant" value="${activeUser.username}(${activeUser.userInfo.workNum})"/>--%>
                        <c:forEach items="${personList}" var="person">
                            <tr>
                                <td colspan="2" class="align-center">
                                    <c:choose>
                                        <c:when test="${person.personType eq 1}">${person.workName}(${person.workNum})</c:when>
                                        <c:otherwise>${person.workName}</c:otherwise>
                                    </c:choose>
                                    <input type="hidden" name="personType" value="${person.personType}"/>
                                    <input type="hidden" name="workNum" value="${person.workNum}"/>
                                    <input type="hidden" name="workName" value="${person.workName}"/>
                                    <input type="hidden" name="collegeId" value="${person.collegeId}"/>
                                    <input type="hidden" name="collegeName" value="${person.collegeName}"/>
                                </td>
                                <td colspan="3" class="left align-center">${person.collegeName}</td>
                                <td colspan="2" class="left align-center">
                                    <a href="javascript:void (0)" onclick="moveUp(this)">上调</a>&nbsp;
                                    <a href="javascript:void(0)" onclick="moveDown(this)">下调</a>
                                </td>
                                <td class="left align-center" >
                                    <c:choose>
                                        <c:when test="${person.workNum eq activeUser.userInfo.workNum}"><label class="required">登记人无法删除</label></c:when>
                                        <c:otherwise><a href="javascript:void(0)" onclick="del(this)">删除</a></c:otherwise>
                                    </c:choose>
                                </td>
                            </tr>
                        </c:forEach>
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
<script>
    /**
     * 改变学科门类时更改与其关联的项
     * @param subjectTypeId  学科门类编号
     */
    function subjectTypeChange(subjectTypeId) {
        //选择的学科门类为空 即-1时，初始化级联的下拉框
        if ("" === subjectTypeId) {
            $("select[name='subjectFirstId']").html('<option value="">--请选择--</option>');
            $("select[name='projectSourceId']").html('<option value="">--请选择--</option>');
            $("select[name='projectType1Id']").html('<option value="">--请选择--</option>');
            $("select[name='projectType2Id']").html('<option value="">--请选择--</option>');
            $("select[name='idenLevelId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/result/identifyResult/subjectTypeChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {subjectTypeId: subjectTypeId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                for (var key in resultData) {            //遍历返回json数据中存放的map集合

                    //获取到后台返回的对应的所属学科内容并改变下拉框中的值
                    if (key === 'subjectFirstList') {
                        var subjectFirst = $("select[name='subjectFirstId']");               //获取到所数学科选择框
                        var subjectFirstHtml = '<option value="">--请选择--</option>';     //初始化下拉框内容
                        var subjectFirstList = resultData['subjectFirstList'];               //从json中得到subjectFirstList集合
                        for (var i = 0; i < subjectFirstList.length; i++) {
                            subjectFirstHtml += '<option value="' + subjectFirstList[i].subjectFirstId + '">' + subjectFirstList[i].subjectFirstName + '</option>';
                        }
                        subjectFirst.html(subjectFirstHtml);                              //设置所属学科中的内容
                    }

                    //获取到后台返回的对应的 项目来源 内容并改变下拉框中的值
                    if (key === 'projectSourceList') {
                        var projectSource = $("select[name='projectSourceId']");               //获取到项目来源选择框
                        var projectSourceHtml = '<option value="">--请选择--</option>';        //初始化下拉框内容
                        var projectSourceList = resultData['projectSourceList'];               //从json中得到projectSourceList集合
                        for (var i = 0; i < projectSourceList.length; i++) {
                            projectSourceHtml += '<option value="' + projectSourceList[i].projectSourceId + '">' + projectSourceList[i].projectSourceName + '</option>';
                        }
                        projectSource.html(projectSourceHtml);                              //设置 项目来源 中的内容
                    }

                    //获取到后台返回的对应的项目类型1并将值设置到下拉框中
                    if (key === 'projectType1List') {
                        var projectType1 = $("select[name='projectType1Id']");               //获取到项目类型1下拉框
                        var projectType1Html = '<option value="">--请选择--</option>';      //初始化下拉框内容
                        var projectType1List = resultData['projectType1List'];               //从json中获取到项目类型1集合数据
                        for (var i = 0; i < projectType1List.length; i++) {                         //遍历projectType1List集合中的数据
                            projectType1Html += '<option value="' + projectType1List[i].projectType1Id + '">' + projectType1List[i].projectType1Name + '</option>';
                        }
                        projectType1.html(projectType1Html);                                 //设置项目类型1下拉框中的内容
                    }

                    //获取到后台返回的对应的鉴定水平并将值设置到下拉框中
                    if (key === 'idenLevelList') {
                        var idenLevel = $("select[name='idenLevelId']");               //获取到鉴定水平下拉框
                        var idenLevelHtml = '<option value="">--请选择--</option>';      //初始化下拉框内容
                        var idenLevelList = resultData['idenLevelList'];               //从json中获取到鉴定水平集合数据
                        for (var i = 0; i < idenLevelList.length; i++) {                         //遍历idenLevelList集合中的数据
                            idenLevelHtml += '<option value="' + idenLevelList[i].idenLevelId + '">' + idenLevelList[i].idenLevelName + '</option>';
                        }
                        idenLevel.html(idenLevelHtml);                                 //设置鉴定水平下拉框中的内容
                    }
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }

    /**
     * 改变项目类型1时级联项目类型2
     * @param projectType1Id  项目类型1id
     */
    function projectType1Change(projectType1Id) {
        //选择的项目类型1为空 即-1时，初始化级联的下拉框
        if ("" === projectType1Id) {
            $("select[name='projectType2Id']").html('<option value="">--请选择--</option>');
            return true;
        }

        $.ajax({
            type: "POST",
            url: "/result/identifyResult/proProjectType1Change.action",
            dataType: "json",
            data: {projectType1Id: projectType1Id},
            success: function (resultData) {
                var projectType2 = $("select[name='projectType2Id']");            //获取下拉框元素
                var projectType2Html = '<option value="">--请选择--</option>';   //初始化下拉框HTML内容
                for (var i = 0; i < resultData.length; i++) {
                    projectType2Html += '<option value="' + resultData[i].projectType2Id + '">' + resultData[i].projectType2Name + '</option>';
                }
                projectType2.html(projectType2Html);                              //设置内容到下拉框中
            },
            error: function (msg) {
                alert("服务器异常");
            }
        });
    }

    //保存著作成果
    function saveIdentifyResult() {
        //保存时屏蔽必填验证
        $(":input").attr("required", false);
        if (confirm("确认保存该成果信息吗？")) {
            //修改提交地址为 save
            $("#identifyResultForm").attr("action", "<%=request.getContextPath()%>/result/identifyResult/updateIdentifyResult.action?submitType=save");
            $("#subForm").click();  //触发按钮提交事件
        }
    }
    //提交 著作成果
    function submitIdentifyResult() {
        //调用时间检查函数，有时间为空是函数值为true，此时需要组织表单提交
        if (checkDate()) {
            return;
        }
        if (confirm("确定提交该成果信息吗？")) {
            //修改提交地址为 submit
            $("#identifyResultForm").attr("action", "<%=request.getContextPath()%>/result/identifyResult/updateIdentifyResult.action?submitType=submit");
            $("#subForm").click(); //触发按钮提交事件
        }
    }
</script>
</body>
</html>
