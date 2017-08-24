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
    <title>编辑纵向项目</title>
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
<a href="javascript:void(0)" onclick="saveProject()()" class="button button-primary button-rounded button-small">仅保存</a>&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="saveAndAuditProject()" class="button button-primary button-rounded button-small">保存并审核通过</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">编辑纵向项目</h1>
<br>
<div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    &nbsp;&nbsp;&nbsp;&nbsp;第一部分：项目基本信息&nbsp;&nbsp;&nbsp;&nbsp;
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
</div>
<br>
<%--表单start--%>
<form id="projectForm" method="post" action="" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
        <input type="hidden" id="auditOpinion" name="auditOpinion">  <%--设置审核意见隐藏域--%>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                <select name="subjectTypeId" required class="select-min" onchange="subjectTypeChange(this.value)">
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectTypeList}" var="subjectType">
                        <option value="${subjectType.subjectTypeId}" ${subjectType.subjectTypeId eq projectInfo.subjectTypeId ? "selected='selected'":""}>${subjectType.subjectTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                <select name="subjectFirstId" required class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectFirstList}" var="subjectFirst">
                         <option value="${subjectFirst.subjectFirstId}" ${projectInfo.subjectFirstId eq subjectFirst.subjectFirstId ? "selected='selected'" :""}>${subjectFirst.subjectFirstName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="projectName" required value="${projectInfo.projectName}" style="width: 500px;" onblur="projectNameIsExisted(this.value,'${projectInfo.projectId}')">
                <input type="hidden" value="${projectInfo.projectId}" name="projectId">  <%--将项目id设到隐藏域中--%>
                <label class="required">*${error}</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                <input type="text" name="projectNumber" required value="${projectInfo.projectNumber}" style="width: 200px;">
                <label class="required">*</label>
            </td>
            <td class="right left">项目性质：</td>
            <td colspan="4" class="ibg">&nbsp;&nbsp;纵向项目<label class="required">*</label></td>
        </tr>
        <tr>
            <td class="right">项目来源：</td>
            <td colspan="3" class="ibg">
                <select name="projectSourceId" required class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${ProProjectSourceList}" var="projectSource">
                        <option value="${projectSource.projectSourceId}" ${projectInfo.projectSourceId eq projectSource.projectSourceId ? 'selected="selected"':""}>${projectSource.projectSourceName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">批准时间：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(projectInfo.approveDate)}"
                       style="width: 200px;" name="approveDate" required="required"/>
            </td>
        </tr>
        <tr>
            <td class="right">项目类型：</td>
            <td colspan="8" class="ibg">
                <select name="projectType1Id" required class="select-min" onchange="projectType1Change(this.value)">
                    <option value="">--请选择--</option>
                    <c:forEach items="${projectType1List}" var="projectType1">
                        <option value="${projectType1.projectType1Id}" ${projectInfo.projectType1Id eq projectType1.projectType1Id ? 'selected="selected"':""}>${projectType1.projectType1Name}</option>
                    </c:forEach>
                </select>
                <select name="projectType2Id" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${projectType2List}" var="projectType2">
                        <option value="${projectType2.projectType2Id}" ${projectInfo.projectType2Id eq projectType2.projectType2Id ? 'selected="selected"':""}>${projectType2.projectType2Name}</option>
                    </c:forEach>
                </select>
                <label class="required">*(没有二级类型可不选)</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究类别：</td>
            <td colspan="3" class="ibg">
                <select name="researchTypeId" required class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${researchTypeList}" var="researchType">
                       <option value="${researchType.researchTypeId}" ${projectInfo.researchTypeId eq researchType.researchTypeId ?'selected="selected"':""}>${researchType.researchTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">组织形式：</td>
            <td colspan="4" class="ibg">
                <select name="organizationFormId" required class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${organizationFormList}" var="organizationForm">
                        <option value="${organizationForm.organizationFormId}" ${projectInfo.organizationFormId eq organizationForm.organizationFormId ?'selected="selected"':""}>${organizationForm.organizationFormName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <c:if test="${projectInfo.subjectTypeId eq 2}">
            <tr>
                <td class="right">社会经济目标：</td>
                <td colspan="8" class="ibg">
                    <select name="economicsTargetId" required class="select-min">
                        <option value="">--请选择--</option>
                        <c:forEach items="${economicsTargetList}" var="economicsTarget">
                            <option value="${economicsTarget.economicsTargetId}" ${projectInfo.economicsTargetId eq economicsTarget.economicsTargetId ?'selected="selected"':""}>${economicsTarget.economicsTargetName}</option>
                        </c:forEach>
                    </select>
                    <label class="required">*（社科类字段）</label>
                </td>
            </tr>
        </c:if>

        <c:if test="${projectInfo.subjectTypeId eq 1}">
            <tr>
                <td class="right">独立/合作研究：</td>
                <td colspan="8" class="ibg">
                    <select name="cooperationTypeId" required class="select-min">
                        <option value="">--请选择--</option>
                        <c:forEach items="${cooperationTypeList}" var="cooperationType">
                            <option value="${cooperationType.cooperationTypeId}" ${projectInfo.cooperationTypeId eq cooperationType.cooperationTypeId ? 'selected="selected"':""}>${cooperationType.cooperationTypeName}</option>
                        </c:forEach>
                    </select>
                    <label class="required">*（自科类字段）</label>
                </td>
            </tr>
        </c:if>

        <tr>
            <td class="right">协作单位：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="cooperationUnit" required value="${projectInfo.cooperationUnit}" style="width: 500px;">
                <label class="required">*（多个单位之间用 , 隔开）</label>
            </td>
        </tr>
        <tr>
            <td class="right">服务的国民经济行业：</td>
            <td colspan="8" class="ibg">
                <select name="economicsIndustry1Id" required class="select-min" onchange="economicsIndustry1Change(this.value)">
                    <option value="">--请选择--</option>
                    <c:forEach items="${economicsIndustry1List}" var="economicsIndustry1">
                        <option value="${economicsIndustry1.economicsIndustry1Id}" ${projectInfo.economicsIndustry1Id eq economicsIndustry1.economicsIndustry1Id ? 'selected="selected"':""}> ${economicsIndustry1.economicsIndustry1Name}</option>
                    </c:forEach>
                </select>
                <select name="economicsIndustry2Id" required class="select-min" onchange="economicsIndustry2Change(this.value)">
                    <option value="">--请选择--</option>
                    <c:forEach items="${economicsIndustry2List}" var="economicsIndustry2">
                        <option value="${economicsIndustry2.economicsIndustry2Id}" ${projectInfo.economicsIndustry2Id eq economicsIndustry2.economicsIndustry2Id ? 'selected="selected"':""}>${economicsIndustry2.economicsIndustry2Name}</option>
                    </c:forEach>
                </select>
                <select name="economicsIndustry3Id" required class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${economicsIndustry3List}" var="economicsIndustry3">
                        <option value="${economicsIndustry3.economicsIndustry3Id}" ${projectInfo.economicsIndustry3Id eq economicsIndustry3.economicsIndustry3Id ? 'selected="selected"':""}>${economicsIndustry3.economicsIndustry3Name}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">预期成果形式：</td>
            <td colspan="8" class="ibg">
                <select class="select-min" id="resultForm" onchange="resultFormSelect(this)">
                    <option value="">--请选择--</option>
                    <c:forEach items="${proResultFormList}" var="proResultForm">
                        <option value="${proResultForm.resultFormId}">${proResultForm.resultFormName}</option>
                    </c:forEach>
                </select>
                <input type="text" name="resultForm" required value="${projectInfo.resultForm}" style="width: 300px;">
                <label class="required">*（注：可填写数量，如三篇论文，可填写  论文*3）</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究起始时间：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(projectInfo.startDate)}"
                       style="width: 200px;" name="startDate" required="required"/>
                <label class="required">*</label>
            </td>
            <td class="right left">预期终止时间：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(projectInfo.expectEndDate)}"
                       style="width: 200px;" name="expectEndDate" required="required"/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">批准经费：</td>
            <td colspan="8" class="ibg">
                <input type="number" required  name="approveMoney" value="${projectInfo.approveMoney}">
                <label class="required">*（单位：元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">是否已中期检查：</td>
            <td colspan="8" class="ibg">
                是<input type="radio" name="inspect" value="1" ${projectInfo.inspect eq 1 ?'checked="checked"':""} >
                否<input type="radio" name="inspect" value="0" ${projectInfo.inspect eq 0 ?'checked="checked"':""}>
            </td>
        </tr>
        <tr>
            <td class="right">项目所属类型：</td>
            <td colspan="3" class="ibg">
                <select name="projectDomainId" required class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${projectDomainList}" var="projectDomain">
                        <option value="${projectDomain.projectDomainId}" ${projectInfo.projectDomainId eq projectDomain.projectDomainId ? 'selected="selected"':""}>${projectDomain.projectDomainName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right">项目等级：</td>
            <td colspan="4" class="ibg">
                <select name="projectGradeId" required class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${projectGradeList}" var="projectGrade">
                        <option value="${projectGrade.projectGradeId}" ${projectInfo.projectGradeId eq projectGrade.projectGradeId ? 'selected="selected"':""}>${projectGrade.projectGradeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">是否重点项目：</td>
            <td colspan="8" class="ibg">
                是<input type="radio" name="important" value="1" ${projectInfo.important eq 1 ? 'checked="checked"':""}>
                否<input type="radio" name="important" value="0" ${projectInfo.important eq 0 ? 'checked="checked"':""}>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">项目相关附件：</td>
            <td colspan="8" class="ibg">
                <input type="file" name="file" style="border: 1px solid #1f262d">
                <label class="required">${empty projectInfo.attachment ? "您还没有上传附件" : "您已上传过附件，如需重传请选择附件"}</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究要点及目标：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" name="remark">${projectInfo.remark}</textarea>
                <label class="required">（必填，200字以内）</label>
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
                        <input type="hidden" name="registrant" value="${projectInfo.registrant}"/>
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
                                    <c:when test='${person.workName eq ds.getName(projectInfo.registrant)}'><label class="required">登记人无法删除</label></c:when>
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
                    <input type="number" name="publishTotal" required value="${budgetMoney.publishTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
                <td class="right left">材料费：</td>
                <td colspan="4" class="ibg">
                    <input type="number" name="materialsTotal" required value="${budgetMoney.materialsTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
            </tr>
            <tr>
                <td class="right">测试化验加工费：</td>
                <td colspan="3" class="ibg">
                    <input type="number" name="testTotal" required value="${budgetMoney.testTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
                <td class="right left">燃料动力费：</td>
                <td colspan="4" class="ibg">
                    <input type="number" name="fuelTotal" required value="${budgetMoney.fuelTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
            </tr>
            <tr>
                <td class="right">差旅费：</td>
                <td colspan="3" class="ibg">
                    <input type="number" name="travelTotal" required value="${budgetMoney.travelTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
                <td class="right left">会议费：</td>
                <td colspan="4" class="ibg">
                    <input type="number" name="meetTotal" required value="${budgetMoney.meetTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
            </tr>
            <tr>
                <td class="right">国际合作与交流费：</td>
                <td colspan="3" class="ibg">
                    <input type="number" name="internationalTotal" required value="${budgetMoney.internationalTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
                <td class="right left">设备费：</td>
                <td colspan="4" class="ibg">
                    <input type="number" name="facilityTotal" required value="${budgetMoney.facilityTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
            </tr>
            <tr>
                <td class="right">劳务费：</td>
                <td colspan="3" class="ibg">
                    <input type="number" name="labourTotal" required value="${budgetMoney.labourTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
                <td class="right left">专家咨询费：</td>
                <td colspan="4" class="ibg">
                    <input type="number" name="expertTotal" required value="${budgetMoney.expertTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
            </tr>
            <tr>
                <td class="right">资料费：</td>
                <td colspan="3" class="ibg">
                    <input type="number" name="datumTotal" required value="${budgetMoney.datumTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
                <td class="right left">数据采集费：</td>
                <td colspan="4" class="ibg">
                    <input type="number" name="dataTotal" required value="${budgetMoney.dataTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
            </tr>
            <tr>
                <td class="right">印刷费：</td>
                <td colspan="3" class="ibg">
                    <input type="number" name="printTotal" required value="${budgetMoney.printTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
                <td class="right">其他经费：</td>
                <td colspan="4" class="ibg">
                    <input type="number" name="otherTotal" required value="${budgetMoney.otherTotal}">
                    <label class="required">*（单位：元）</label>
                </td>
            </tr>
            <tr>
                <td class="right">科研管理费：</td>
                <td colspan="8" class="ibg">
                    <input type="number" name="manageTotal" required value="${budgetMoney.manageTotal}">
                    <label class="required">（单位：元）（注：间接经费，自动扣除）</label>
                </td>
            </tr>
            <tr>
                <td class="right">绩效支出：</td>
                <td colspan="8" class="ibg">
                    <input type="number" name="postTotal" required value="${budgetMoney.postTotal}">
                    <label class="required">*（单位：元）（注：间接经费，项目管理员填写，项目组成员最多申请两次！）</label>
                </td>
            </tr>
        </table>
</form>
<%--按钮end--%>
<script>
    /**
     * 改变学科门类时更改与其关联的项
     * @param subjectTypeId  学科门类编号
     */
    function subjectTypeChange(subjectTypeId) {
        //选择的学科门类为空 即-1时，初始化级联的下拉框
        if("" === subjectTypeId){
            $("select[name='subjectFirstId']").html('<option value="">--请选择--</option>');
            $("select[name='projectSourceId']").html('<option value="">--请选择--</option>');
            $("select[name='projectType1Id']").html('<option value="">--请选择--</option>');
            $("select[name='researchTypeId']").html('<option value="">--请选择--</option>');
            $("select[name='projectType2Id']").html('<option value="">--请选择--</option>');
            return true;
        }

        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/project/subjectTypeChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {subjectTypeId: subjectTypeId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                for(var key in resultData){            //遍历返回json数据中存放的map集合

                    //获取到后台返回的对应的所属学科内容并改变下拉框中的值
                    if(key==='subjectFirstList'){
                        var subjectFirst = $("select[name='subjectFirstId']");               //获取到学科门类选择框
                        var subjectFirstHtml =  '<option value="">--请选择--</option>';     //初始化下拉框内容
                        var subjectFirstList = resultData['subjectFirstList'];               //从json中得到subjectFirstList集合
                        for(var i=0;i<subjectFirstList.length;i++){
                            subjectFirstHtml += '<option value="'+subjectFirstList[i].subjectFirstId+'">'+subjectFirstList[i].subjectFirstName+'</option>';
                        }
                        subjectFirst.html(subjectFirstHtml);                              //设置所属学科中的内容
                    }

                    //获取到后台返回的对应的所属学科内容并并将值设置到下拉框中
                    if(key==='ProProjectSourceList'){
                        var proProjectSource = $("select[name='projectSourceId']");         //获取到项目来源下拉框
                        var proProjectSourceHtml = '<option value="">--请选择--</option>'; //初始化下拉框内容
                        var proProjectSourceList = resultData['ProProjectSourceList'];      //从json中得到ProProjectSourceList
                        for(var i=0;i<proProjectSourceList.length;i++){
                            proProjectSourceHtml += '<option value="'+proProjectSourceList[i].projectSourceId+'">'+proProjectSourceList[i].projectSourceName+'</option>';
                        }
                        proProjectSource.html(proProjectSourceHtml);                        //设置项目来源下拉框中的内容
                    }

                    //获取到后台返回的对应的项目类型1并将值设置到下拉框中
                    if(key==='projectType1List'){
                        var projectType1 = $("select[name='projectType1Id']");               //获取到项目类型1下拉框
                        var projectType1Html = '<option value="">--请选择--</option>';      //初始化下拉框内容
                        var projectType1List = resultData['projectType1List'];               //从json中获取到项目类型1集合数据
                        for (var i=0;i<projectType1List.length;i++){                         //遍历projectType1List集合中的数据
                            projectType1Html += '<option value="'+projectType1List[i].projectType1Id+'">'+projectType1List[i].projectType1Name+'</option>';
                        }
                        projectType1.html(projectType1Html);                                 //设置项目类型1下拉框中的内容
                    }

                    //获取研究类别并设置到下拉框中
                    if(key==='researchTypeList'){
                        var researchType = $("select[name='researchTypeId']");                //获取到下拉框对象
                        var researchTypeHtml = '<option value="">--请选择--</option>';       //初始化下拉框内容
                        var researchTypeList = resultData['researchTypeList'];                //从json中获取研究类别数据
                        for(var i=0;i<researchTypeList.length;i++){
                            researchTypeHtml += '<option value="'+researchTypeList[i].researchTypeId+'">'+researchTypeList[i].researchTypeName+'</option>';
                        }
                        researchType.html(researchTypeHtml);                                  //设置研究类别中的数据
                    }
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });

        //显示/隐藏相关标签
        var economicsTargetTR =  $("select[name='economicsTargetId']").parent().parent();
        var cooperationTypeTR =  $("select[name='cooperationTypeId']").parent().parent();

        if(subjectTypeId==='1'){
            economicsTargetTR.hide();
            $("select[name='economicsTargetId']").attr("required", false);//屏蔽必填验证
            cooperationTypeTR.show();
            $("select[name='cooperationTypeId']").attr("required", true);//启用必填验证
        }else{
            economicsTargetTR.show();
            $("select[name='economicsTargetId']").attr("required", true);//启用必填验证
            cooperationTypeTR.hide();
            $("select[name='cooperationTypeId']").attr("required", false);//屏蔽必填验证
        }
    }

    /**
     * 改变项目类型1时级联项目类型2
     * @param projectType1Id  项目类型1id
     */
    function projectType1Change(projectType1Id) {
        //选择的项目类型1为空 即-1时，初始化级联的下拉框
        if("" === projectType1Id){
            $("select[name='projectType2Id']").html('<option value="">--请选择--</option>');
            return true;
        }
        $.ajax({
            type: "POST",
            url: "/project/proProjectType1Change.action",
            dataType: "json",
            data:{projectType1Id:projectType1Id},
            success:function (resultData) {
                var projectType2 = $("select[name='projectType2Id']");            //获取下拉框元素
                var projectType2Html = '<option value="">--请选择--</option>';   //初始化下拉框HTML内容
                for (var i=0;i<resultData.length;i++){
                    projectType2Html += '<option value="'+resultData[i].projectType2Id+'">'+resultData[i].projectType2Name+'</option>';
                }
                projectType2.html(projectType2Html);                              //设置内容到下拉框中
            },
            error:function (msg) {
                alert("服务器异常");
            }
        });
    }

    /**
     * 改变国民经济行业一级时级联经济行业二级
     * @param economicsIndustry1Id 经济行业一级id
     */
    function economicsIndustry1Change(economicsIndustry1Id) {
        if("" === economicsIndustry1Id){
            $("select[name='economicsIndustry2Id']").html('<option value="">--请选择--</option>');
            $("select[name='economicsIndustry3Id']").html('<option value="">--请选择--</option>');
            return true;
        }
        $.ajax({
            type: "POST",
            url: "/project/proEconomicsIndustry1Change.action",
            dataType: "json",
            data:{economicsIndustry1Id:economicsIndustry1Id},
            success:function (resultData) {
                var economicsIndustry2 = $("select[name='economicsIndustry2Id']");          //获取下拉框元素
                var economicsIndustry2Html = '<option value="">--请选择--</option>';       //初始化
                for (var i=0;i<resultData.length;i++){
                    economicsIndustry2Html += '<option value="'+resultData[i].economicsIndustry2Id+'">'+resultData[i].economicsIndustry2Name+'</option>';
                }
                economicsIndustry2.html(economicsIndustry2Html);                            //设置下拉框
            },
            error:function (msg) {
                alert("服务器异常")
            }
        });

        //由于必须选中二级才能选三级，在改变一级时这里就必须也同时初始化经济行业三级
        var economicsIndustry3 = $("select[name='economicsIndustry3Id']");            //获取下拉框元素
        var economicsIndustry3Html = '<option value="">--请选择--</option>';         //初始化
        economicsIndustry3.html(economicsIndustry3Html);                              //设置下拉框
    }

    /**
     * 改变国民经济行业二级时级联经纪行业三级
     * @param economicsIndustry2Id 经济行业二级id
     */
    function economicsIndustry2Change(economicsIndustry2Id) {
        if("" === economicsIndustry2Id){
            $("select[name='economicsIndustry3Id']").html('<option value="">--请选择--</option>');
            return true;
        }
        $.ajax({
            type: "POST",
            url: "/project/proEconomicsIndustry2Change.action",
            dataType: "json",
            data:{economicsIndustry2Id:economicsIndustry2Id},
            success:function (resultData) {
                var economicsIndustry3 = $("select[name='economicsIndustry3Id']");            //获取下拉框元素
                var economicsIndustry3Html = '<option value="">--请选择--</option>';         //初始化
                for (var i=0;i<resultData.length;i++){
                    economicsIndustry3Html += '<option value="'+resultData[i].economicsIndustry3Id+'">'+resultData[i].economicsIndustry3Name+'</option>';
                }
                economicsIndustry3.html(economicsIndustry3Html);                              //设置下拉框
            },
            error:function (msg) {
                alert("服务器异常")
            }
        });
    }


    /**
     * 通过ajax验证同名情况
     * @param validateName  需要验证的名字
     * @param projectId  项目id
     */
    function projectNameIsExisted(validateName, projectId) {
        $.ajax({
            type: "POST",                   //请求的方式
            url: "/project/editIsExistedLengthWaysProject.action",  //ajax请求的地址
            dataType: "json",                  //数据类型为json
            data: {validateName: validateName,projectId:projectId}, //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的name
            success: function (data) {         //服务器执行成功调用此方法，data为服务器返回的数据
                if (data) {
                    alert("提示：该名称已存在，请重新输入！");
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }

    //追加预期成果形式
    function resultFormSelect(obj) {
        var resultForm = $("input[name='resultForm']").val();
        resultForm += $(obj).find("option:selected").text();
        $("input[name='resultForm']").val(resultForm + ", ");
        $(obj).find("option:selected").remove();
    }

    //仅保存项目
    function saveProject() {
        //保存时屏蔽必填验证
        $(":input").attr("required", false);
        if(confirm("提示：确定保存吗？")){
            //修改提交地址为 save
            $("#projectForm").attr("action","<%=request.getContextPath()%>/audit/updateLengthWaysProjectAtAudit.action?submitType=onlySave");
            $("#subForm").click();  //触发按钮提交事件
        }
    }
    //保存并审核通过项目
    function saveAndAuditProject() {
        //调用时间检查函数，有时间为空是函数值为true，此时需要组织表单提交
        if(checkDate()){
            return;
        }

        var auditOpinion = prompt("审核意见", '通过审核');    //设置审核意见
        if(auditOpinion){  //确定审核操作
            $("#auditOpinion").val(auditOpinion);                                  //设置审核意见隐藏域的值
            $("#projectForm").attr("action","<%=request.getContextPath()%>/audit/updateLengthWaysProjectAtAudit.action?submitType=saveAndAudit&operation=agree");   //修改提交路径
            $("#subForm").click(); //触发按钮提交事件                                                //提交表单
        }else {
            alert("提示：您已取消审核操作");
        }

        <%--if(confirm("提示：确认吗？")){--%>
            <%--//修改提交地址为 submit--%>
            <%--$("#projectForm").attr("action","<%=request.getContextPath()%>/audit/updateLengthWaysProjectAtAudit.action.action?submitType=saveAndAudit");--%>
            <%--$("#subForm").click(); //触发按钮提交事件--%>
        <%--}--%>
    }

    //异常信息提示
    $(function () {
        if(${!empty error}){
            alert('${error}');
        }
    });
</script>
<br><br>
</body>
</html>
