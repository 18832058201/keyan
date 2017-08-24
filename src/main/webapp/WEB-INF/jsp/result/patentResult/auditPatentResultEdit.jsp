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
    <title>编辑专利成果</title>
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
<a href="javascript:void(0)" onclick="saveIdentify()()" class="button button-primary button-rounded button-small">仅保存</a>&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="saveAndAuditIdentify()" class="button button-primary button-rounded button-small">保存并审核通过</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">编辑专利成果</h1>
<%--表单start--%>
<form action="" method="POST" id="updatePatentResultForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <input type="hidden" id="auditOpinion" name="auditOpinion">  <%--设置审核意见隐藏域--%>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">专利名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 500px;" value="${patentResult.patentName}" name="patentName"
                       onblur="nameIsExisted(this.value,'<%=request.getContextPath()%>/result/patentResult/patentNameIsExisted.action?patentId=${patentResult.patentId}')"
                       required>
                <input type="hidden" name="patentId" value="${patentResult.patentId}">
                <label class="required">*${exceptionMessage}</label>
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                <select name="subjectTypeId" class="select-min" onchange="subjectTypeChange(this.value)" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${subjectTypeList}" var="subjectType">
                        <option value="${subjectType.subjectTypeId}">${subjectType.subjectTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                <select name="subjectFirstId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${subjectFirstList}" var="subjectFirst">
                        <option value="${subjectFirst.subjectTypeId}">${subjectFirst.subjectFirstName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">专利类型：</td>
            <td colspan="8" class="ibg">
                <select name="patTypeId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${patentTypeList}" var="patType">
                        <option value="${patType.patTypeId}">${patType.patTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">专利权人：</td>
            <td colspan="8" class="ibg">
                <input type="text" style="width: 300px;" value="${patentResult.patentee}" name="patentee" required>
                <label class="required">*（如果是职务发明，请填写单位名称；如果是非职务发明，请填写个人姓名）</label>
            </td>
        </tr>
        <tr>
            <td class="right">申请号：</td>
            <td colspan="3" class="ibg">
                <input type="text" style="width: 200px;" value="${patentResult.applyNumber}" name="applyNumber" required>
                <label class="required">*</label>
            </td>
            <td class="right left">专利号：</td>
            <td colspan="4" class="ibg">
                <input type="text" style="width: 200px;" value="${patentResult.patentNumber}" name="patentNumber" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">证书编号：</td>
            <td colspan="3" class="ibg">
                <input type="text" style="width: 200px;" value="${patentResult.patCertificateNum}" name="patCertificateNum" required>
                <label class="required">*</label>
            </td>
            <td class="right left">证书日期：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(patentResult.certificateDate)}"
                       style="width: 200px;" name="certificateDate" required="required"/>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">专利申请日期：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(patentResult.patApplyDate)}"
                       style="width: 200px;" name="patApplyDate" required="required"/>
                <label class="required">*</label>
            </td>
            <td class="right left">授权公告日：</td>
            <td colspan="4" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value="${ds.format(patentResult.empowerDate)}"
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
            <td class="right">专利简介：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" required name="remark">${patentResult.remark}</textarea>
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
                                        <c:when test="${person.workName eq ds.getName(patentResult.registrant)}">
                                            <label class="required">登记人无法删除</label>
                                        </c:when>
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
        <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/addPerson.js"></script>
        <!--end :人员选择--->
    </table>
</form>
<%--按钮end--%>
<script>
    function subjectTypeChange(subjectTypeId) {
        //选择的学科门类为空 即-1时，初始化级联的下拉框
        if ("" === subjectTypeId) {
            $("select[name='subjectFirstId']").html('<option value="">--请选择--</option>');
            $("select[name='patentId']").html('<option value="">--请选择--</option>');
            return true;
        }

        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/result/patentResult/subjectTypeChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {subjectTypeId: subjectTypeId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                for (var key in resultData) {            //遍历返回json数据中存放的map集合

                    //获取到后台返回的对应的所属学科内容并改变下拉框中的值
                    if (key === 'subjectFirstList') {
                        var subjectFirst = $("select[name='subjectFirstId']");               //获取到学科门类选择框
                        var subjectFirstHtml = '<option value="">--请选择--</option>';     //初始化下拉框内容
                        var subjectFirstList = resultData['subjectFirstList'];               //从json中得到subjectFirstList集合
                        for (var i = 0; i < subjectFirstList.length; i++) {
                            subjectFirstHtml += '<option value="' + subjectFirstList[i].subjectFirstId + '">' + subjectFirstList[i].subjectFirstName + '</option>';
                        }
                        subjectFirst.html(subjectFirstHtml);                              //设置所属学科中的内容
                    }
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }

    function saveIdentify() {
        //保存时屏蔽必填验证
        $(":input").attr("required", false);
        if (confirm("提示：确认保存吗？")) {
            //修改提交地址为 save
            $("#updatePatentResultForm").attr("action", "<%=request.getContextPath()%>/audit/updatePatentResultAtAudit.action??submitType=onlySave");
            $("#subForm").click();  //触发按钮提交事件
        }
    }
    //保存并审核通过
    function saveAndAuditIdentify() {
        //调用时间检查函数，有时间为空是函数值为true，此时需要组织表单提交
        if (checkDate()) {
            return;
        }
        var auditOpinion = prompt("审核意见", '通过审核');    //设置审核意见
        if(auditOpinion){  //确定审核操作
            $("#auditOpinion").val(auditOpinion);
            $("#updatePatentResultForm").attr("action", "<%=request.getContextPath()%>/audit/updatePatentResultAtAudit.action?submitType=saveAndAudit&operation=agree");
            $("#subForm").click(); //触发按钮提交事件
        }else {
            alert("提示：您已取消审核操作");
        }
    }
</script>
</body>
</html>
