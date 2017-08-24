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
    <title>编辑论文成果</title>
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
<a href="javascript:void(0)" onclick="submitPaperResult()"
   class="button button-primary button-rounded button-small">提交</a>&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="savePaperResult()"
   class="button button-primary button-rounded button-small">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">编辑论文成果</h1>
<%--表单start--%>
<form action="" method="POST" id="paperResultForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">论文题目：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 500px;" value="${paperResult.paperName}" id="paperName"
                       name="paperName" required
                       onblur="nameIsExisted(this.value,'<%=request.getContextPath()%>/result/paperResult/paperNameIsExisted.action?paperId=${paperResult.paperId}')">
                <input type="hidden" value="${paperResult.paperId}" name="paperId">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                <select name="subjectTypeId" class="select-min" required onchange="subjectTypeChange(this.value)">
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectTypeList}" var="subjectType">
                        <option value="${subjectType.subjectTypeId}" ${subjectType.subjectTypeId eq paperResult.subjectTypeId ? "selected='selected'" : ""}>${subjectType.subjectTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                <select name="subjectFirstId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectFirstList}" var="subjectFirst">
                        <option value="${subjectFirst.subjectFirstId}" ${subjectFirst.subjectFirstId eq paperResult.subjectFirstId ? "selected='selected'":""}>${subjectFirst.subjectFirstName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">研究类型：</td>
            <td colspan="3" class="ibg">
                <select name="researchTypeId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${researchTypeList}" var="researchType">
                        <option value="${researchType.researchTypeId}" ${researchType.researchTypeId eq paperResult.researchTypeId ? "selected='selected'" : ""}>${researchType.researchTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">署名情况：</td>
            <td colspan="4" class="ibg">
                <select name="signId" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${signList}" var="sign">
                        <option value="${sign.signId}" ${sign.signId eq paperResult.signId ? "selected='selected'" : ""}>${sign.signName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">刊物名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 500px;" name="publishName" value="${paperResult.publishName}">
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">刊物类型：</td>
            <td colspan="3" class="ibg">
                <select name="publishTypeId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${publishTypeList}" var="publishType">
                        <option value="${publishType.publishTypeId}" ${publishType.publishTypeId eq paperResult.publishTypeId ? "selected='selected'" : ""}>${publishType.publishTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">刊物等级：</td>
            <td colspan="4" class="ibg">
                <select name="publishLevelId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${publishLevelList}" var="publishLevel">
                        <option value="${publishLevel.publishLevelId}" ${publishLevel.publishLevelId eq paperResult.publishLevelId ? "selected='selected'" : ""}>${publishLevel.publishLevelName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">发表范围：</td>
            <td colspan="8" class="ibg">
                <select name="publishRangeId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${publishRangeList}" var="publishRange">
                        <option value="${publishRange.publishRangeId}" ${publishRange.publishRangeId eq paperResult.publishRangeId ? "selected='selected'" : ""}>${publishRange.publishRangeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">ISSN号：</td>
            <td colspan="3" class="ibg">
                <input type="text" style="width: 200px;" name="issn" required value="${paperResult.issn}">
            </td>
            <td class="right left">CN号：</td>
            <td colspan="4" class="ibg">
                <input type="text" style="width: 200px;" name="cn" required value="${paperResult.cn}">
            </td>
        </tr>
        <tr>
            <td class="right">卷号：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 200px;" name="reelNumber" value="${paperResult.reelNumber}">
                <label class="required">*（填写数字，如第26卷，则填写“26”，若没有卷号则填写“无”）</label>
            </td>
        </tr>
        <tr>
            <td class="right">期号：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 200px;" value="5" name="issue" value="${paperResult.issue}">
                <label class="required">*（填写当年期号数字，如2016年第五期，则填写“5”，若没有期号则填写“无”）</label>
            </td>
        </tr>
        <tr>
            <td class="right">页码范围：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 200px;" value="${paperResult.pageNumber}" name="pageNumber">
                <label class="required">*（格式如150-200）</label>
            </td>
        </tr>
        <tr>
            <td class="right">出版时间：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()"
                       value="${ds.format(paperResult.publishDate)}"
                       style="width: 200px;" name="publishDate" required/>
                <label class="required">*</label>
            </td>
            <td class="right left">通讯作者：</td>
            <td colspan="4" class="ibg">
                <input list="contactAuthor" name="contactAuthor" style="width: 200px;" required
                       value="${paperResult.contactAuthor}"/>
                <datalist id="contactAuthor">
                    <c:forEach items="${allPersonList}" var="allPerson">
                        <option value="${allPerson.workName}(${allPerson.workNum})">${allPerson.workName}(${allPerson.workNum})</option>
                    </c:forEach>
                </datalist>
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
                <textarea style="width:80%;height: 100px;resize: none;" required>${paperResult.remark}</textarea>
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
                                <td class="left align-center">
                                    <c:choose>
                                        <c:when test="${person.workNum eq activeUser.userInfo.workNum}"><label
                                                class="required">登记人无法删除</label></c:when>
                                        <c:otherwise><a href="javascript:void(0)"
                                                        onclick="del(this)">删除</a></c:otherwise>
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
        <script src="<%=request.getContextPath()%>/js/addPerson.js"></script>
        <!--end :人员选择--->
        <!--start:论文收录-->
        <!--start:新增论文收录-->
        <tr>
            <td class="right">新增论文收录：</td>
            <td colspan="8" class="ibg">
                <table style="border: 1px solid black;width: 100%">
                    <!--本校学生-->
                    <tr style="border: 1px dashed #ccc;">
                        <td class="right width-100">收录时间：</td>
                        <td colspan="2" class="ibg">
                            <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()"
                                   style="width: 200px;" id="includeTime"/>
                        </td>
                        <td class="right width-100">收录工具：</td>
                        <td colspan="2" class="ibg">
                            <select class="select-min" id="includeTool">
                                <option selected="selected" value="">--请选择--</option>
                                <c:forEach items="${includeToolList}" var="includeTool">
                                    <option value="${includeTool.includeToolId}">${includeTool.includeToolName}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td class="right left">收录号：</td>
                        <td colspan="5" class="ibg">
                            <input type="text" class="width-150" id="includeNum">
                            <a style="margin-left: 50px" href="javascript:void(0)" onclick="addInclude()">新增</a>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <!--end:新增论文收录-->
        <!--start:论文收录列表-->
        <tr>
            <td class="right">论文收录列表：</td>
            <td colspan="8" class="ibg">
                <div class="table-container">
                    <table style="border: 1px solid black;width: 100%;table-layout:fixed;" id="includeTable">
                        <thead>
                        <tr>
                            <th colspan="2">收录时间</th>
                            <th colspan="2" class="left">收录工具</th>
                            <th colspan="2" class="left">收录号</th>
                            <th colspan="2" class="left">审核状态</th>
                            <th class="left">操作</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${includeList}" var="include">
                            <tr>
                                <td colspan="2" class="align-center">${ds.format(include.includeDate)}
                                    <!--设置隐藏域-->
                                    <input type="hidden" name="includeDate" value="${ds.format(include.includeDate)}">
                                    <input type="hidden" name="includeToolId" value="${include.includeToolId}">
                                    <input type="hidden" name="includeToolName" value="${include.includeToolName}">
                                    <input type="hidden" name="includeNumber" value="${include.includeNumber}">
                                    <input type="hidden" name="statusId" value="${include.auditStatusId}">
                                </td>
                                <td colspan="2" class="left align-center">${include.includeToolName}</td>
                                <td colspan="2" class="left align-center">${include.includeNumber}</td>
                                <td colspan="2" class="left align-center">${include.auditStatusName}</td>
                                <td class="left align-center">
                                    <c:choose>
                                        <c:when test="${include.isEdit eq 1}"><a href="javascript:void(0)"
                                                                                 onclick="delInclude(this)">删除</a></c:when>
                                        <c:otherwise><label class="required">当前无法操作</label></c:otherwise>
                                    </c:choose>
                                </td>
                            </tr>
                        </c:forEach>
                        <tr></tr>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
        <!--end:论文收录列表-->
        <script src="<%=request.getContextPath()%>/js/addPaperInclude.js"></script>
        <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
        <%--end：论文收录--%>
    </table>
</form>
<%--表单end--%>
<script>
    /**
     * 改变学科门类时更改与其关联的项
     * @param subjectTypeId  学科门类编号
     */
    function subjectTypeChange(subjectTypeId) {
        //选择的学科门类为空 即-1时，初始化级联的下拉框
        if ("" === subjectTypeId) {
            $("select[name='subjectFirstId']").html('<option value="">--请选择--</option>');
            $("select[name='researchTypeId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/result/paperResult/subjectTypeChange.action',  //ajax请求的地址
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

                    //获取到后台返回的对应的研究类型并将值设置到下拉框中
                    if (key === 'researchTypeList') {
                        var researchType = $("select[name='researchTypeId']");               //获取到研究类型下拉框
                        var researchTypeHtml = '<option value="">--请选择--</option>';      //初始化下拉框内容
                        var researchTypeList = resultData['researchTypeList'];               //从json中获取到研究类型集合数据
                        for (var i = 0; i < researchTypeList.length; i++) {                         //遍历researchTypeList集合中的数据
                            researchTypeHtml += '<option value="' + researchTypeList[i].researchTypeId + '">' + researchTypeList[i].researchTypeName + '</option>';
                        }
                        researchType.html(researchTypeHtml);                                 //设置研究类型下拉框中的内容
                    }
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }
    //保存著作成果
    function savePaperResult() {
        //保存时屏蔽必填验证
        $(":input").attr("required", false);
        if (confirm("确认保存该成果信息吗？")) {
            //修改提交地址为 save
            $("#paperResultForm").attr("action", "<%=request.getContextPath()%>/result/paperResult/updatePaperResult.action?submitType=save");
            $("#subForm").click();  //触发按钮提交事件
        }
    }
    //提交 著作成果
    function submitPaperResult() {
        //调用时间检查函数，有时间为空是函数值为true，此时需要组织表单提交
        if (checkDate()) {
            return;
        }
        if (confirm("确定提交该成果信息吗？")) {
            //修改提交地址为 submit
            $("#paperResultForm").attr("action", "<%=request.getContextPath()%>/result/paperResult/updatePaperResult.action?submitType=submit");
            $("#subForm").click(); //触发按钮提交事件
        }
    }
</script>
</body>
</html>
