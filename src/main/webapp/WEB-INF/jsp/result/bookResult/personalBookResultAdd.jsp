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
    <title>新增著作成果</title>
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
<a href="javascript:void(0)" onclick="submitBookResult()"
   class="button button-primary button-rounded button-small">提交</a>&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="saveBookResult()" class="button button-primary button-rounded button-small">保存</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">新增著作成果</h1>
<%--表单start--%>
<form action="" method="POST" id="bookResultForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">著作名称：</td>
            <td colspan="8" class="ibg">
                <input type="text" value="" name="bookName" style="width: 500px;"
                       onblur="nameIsExisted(this.value,'<%=request.getContextPath()%>/result/bookResult/bookNameIsExisted.action')"
                       required>
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
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">著作类型：</td>
            <td colspan="3" class="ibg">
                <select name="bookTypeId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">ISBN：</td>
            <td colspan="4" class="ibg">
                <input type="text" name="isbn" style="width: 200px;" value="" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">著作总字数：</td>
            <td colspan="3" class="ibg">
                <input type="text" name="totalNum" value="" style="width: 200px;" required>
                <label class="required">*</label>
            </td>
            <td class="right left">撰写总字数：</td>
            <td colspan="4" class="ibg">
                <input type="text" value="" name="writeNum" style="width: 200px;" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">出版单位：</td>
            <td colspan="3" class="ibg">
                <input type="text" value="" name="publishUnit" style="width: 200px;" required>
                <label class="required">*</label>
            </td>
            <td class="right left">出版地：</td>
            <td colspan="4" class="ibg">
                <input type="text" value="" name="publishPlace" style="width: 200px;" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">出版日期：</td>
            <td colspan="3" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()" value=""
                       style="width: 200px;" name="publishDate" required/>
                <label class="required">*</label>
            </td>
            <td class="right left">出版社类型：</td>
            <td colspan="4" class="ibg">
                <select name="pressTypeId" class="select-min" required>
                    <option selected="selected" value="">--请选择--</option>
                    <c:forEach items="${bookPressTypeList}" var="bookPressType">
                        <option value="${bookPressType.pressTypeId}">${bookPressType.pressTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*（注：与考核相关）</label>
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
            <td class="right">备注：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" name="remark" required></textarea>
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
            $("select[name='bookTypeId']").html('<option value="">--请选择--</option>');
            return true;
        }

        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/result/bookResult/subjectTypeChange.action',  //ajax请求的地址
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

                    //获取到后台返回的对应的 著作类型 内容并改变下拉框中的值
                    if (key === 'bookTypeList') {
                        var bookType = $("select[name='bookTypeId']");               //获取到学科门类选择框
                        var bookTypeHtml = '<option value="">--请选择--</option>';     //初始化下拉框内容
                        var bookTypeList = resultData['bookTypeList'];               //从json中得到bookTypeList集合
                        for (var i = 0; i < bookTypeList.length; i++) {
                            bookTypeHtml += '<option value="' + bookTypeList[i].bookTypeId + '">' + bookTypeList[i].bookTypeName + '</option>';
                        }
                        bookType.html(bookTypeHtml);                              //设置 著作类型 中的内容
                    }
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }

    //保存著作成果
    function saveBookResult() {
        //保存时屏蔽必填验证
        $(":input").attr("required", false);
        if (confirm("确认保存该著作成果信息吗？")) {
            //修改提交地址为 save
            $("#bookResultForm").attr("action", "<%=request.getContextPath()%>/result/bookResult/insertBookResult.action?submitType=save");
            $("#subForm").click();  //触发按钮提交事件
        }
    }
    //提交 著作成果
    function submitBookResult() {
        //调用时间检查函数，有时间为空是函数值为true，此时需要组织表单提交
        if (checkDate()) {
            return;
        }
        if (confirm("确定提交该著作成果信息吗？")) {
            //修改提交地址为 submit
            $("#bookResultForm").attr("action", "<%=request.getContextPath()%>/result/bookResult/insertBookResult.action?submitType=submit");
            $("#subForm").click(); //触发按钮提交事件
        }
    }
</script>
</body>
</html>
