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
    <title>个人信息编辑</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <style type="text/css">
        /*hr标签样式*/
        .hrLine {
            vertical-align: middle;
            display: inline-block;
        }

        #preview {
            width: 120px;
            height: 168px;
            border: 1px dotted #ccc;
            overflow: hidden;
        }

        #imghead {
            filter: progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=image);
        }
    </style>
    <script type="text/javascript">
        //图片上传预览    IE是用了滤镜。
        function previewImage(file) {
            var MAXWIDTH = 120;
            var MAXHEIGHT = 168;
            var div = document.getElementById('preview');
            if (file.files && file.files[0]) {
                div.innerHTML = '<img id=imghead>';
                var img = document.getElementById('imghead');
                img.onload = function () {
                    var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
                    img.width = rect.width;
                    img.height = rect.height;
//                 img.style.marginLeft = rect.left+'px';
                    img.style.marginTop = rect.top + 'px';
                }
                var reader = new FileReader();
                reader.onload = function (evt) {
                    img.src = evt.target.result;
                }
                reader.readAsDataURL(file.files[0]);
            }
            else //兼容IE
            {
                var sFilter = 'filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src="';
                file.select();
                var src = document.selection.createRange().text;
                div.innerHTML = '<img id=imghead>';
                var img = document.getElementById('imghead');
                img.filters.item('DXImageTransform.Microsoft.AlphaImageLoader').src = src;
                var rect = clacImgZoomParam(MAXWIDTH, MAXHEIGHT, img.offsetWidth, img.offsetHeight);
                status = ('rect:' + rect.top + ',' + rect.left + ',' + rect.width + ',' + rect.height);
                div.innerHTML = "<div id=divhead style='width:" + rect.width + "px;height:" + rect.height + "px;margin-top:" + rect.top + "px;" + sFilter + src + "\"'></div>";
            }
        }
        function clacImgZoomParam(maxWidth, maxHeight, width, height) {
            var param = {top: 0, left: 0, width: width, height: height};
            if (width > maxWidth || height > maxHeight) {
                rateWidth = width / maxWidth;
                rateHeight = height / maxHeight;

                if (rateWidth > rateHeight) {
                    param.width = maxWidth;
                    param.height = Math.round(height / rateWidth);
                } else {
                    param.width = Math.round(width / rateHeight);
                    param.height = maxHeight;
                }
            }
            param.left = Math.round((maxWidth - param.width) / 2);
            param.top = Math.round((maxHeight - param.height) / 2);
            return param;
        }
    </script>
</head>
<body style="background-color: #EEEEEE">
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="submitPersonInfo()"
   class="button button-primary button-rounded button-small">提交</a>
<br>
<br>
<%--按钮end--%>

<%--表单start--%>
<form action="" method="POST" id="personalInfoForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <c:if test="${personInfo.informationStatus eq 0}">
        <input type="hidden" name="submitType" value="firstLogin">
    </c:if>
    <h1 class="title-h1">个人信息编辑${personInfo.informationStatus eq 0 ?"（提示：初次登录必须完善个人信息才能使用本系统）":""}</h1>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;基本信息（注：标<label class="required">*</label>的为必填项）&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">注意事项：</td>
            <td colspan="8" class="ibg">
                1. 若<label class="required">标红内容</label>有所变动，个人信息将交由变更后部门的学院管理员审核，审核通过则修改成功，审核不通过则修改失败！<br>
                2. 在此期间无法再次编辑个人信息！请确认修改后尽快联系目标学院的学院管理员，完成审核！
            </td>
        </tr>
        <tr>
            <td class="right">工号：</td>
            <td colspan="6" class="ibg">
                &nbsp;&nbsp;${personInfo.workNum}
                <input type="hidden" name="workNum" value="${personInfo.workNum}">
            </td>
            <td class="right left" colspan="2" rowspan="6" style="text-align: center;padding-left: 60px">
                <label>
                    <div id="preview">
                        <img id="imghead" width=100% height=auto border=0>
                        上传照片<br/><label class="required">（注：上传图片分辨率建议295*413，图片大小不超过2M）点击上传</label>
                    </div>
                    <input type="file" onchange="previewImage(this)" class="width-200" style="display: none"/>
                </label>
            </td>
        </tr>
        <tr>
            <td class="right left"><label class="required">姓名</label>：</td>
            <td colspan="5" class="ibg">
                <input type="text" name="workName" value="${personInfo.workName}" style="width: 150px;" required>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right left">在职状态：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.jobStatusName}
                <label class="required">（注：若在职状态有变化，请联系所在学院的学院管理员进行修改！）</label>
            </td>
        </tr>
        <tr>
            <td class="right"><label class="required">职称</label>：</td>
            <td colspan="5" class="ibg">
                <select name="titleTypeId" id="titleTypeId" class="select-min" onchange="titleTypeChange(this.value)"
                        required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${titleTypeList}" var="titleType">
                        <option value="${titleType.titleTypeId}" ${titleType.titleTypeId eq personInfo.titleTypeId ? "selected='selected'":""}>${titleType.titleTypeName}</option>
                    </c:forEach>
                </select>
                <select name="titleLevelId" id="titleLevelId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${titleLevelList}" var="titleLevel">
                        <option value="${titleLevel.titleLevelId}" ${titleLevel.titleLevelId eq personInfo.titleLevelId ? "selected='selected'":""}>${titleLevel.titleLevelName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right left"><label class="required">绩效岗位</label>：</td>
            <td colspan="5" class="ibg">
                <select name="postTypeId" id="postTypeId" class="select-min" onchange="postTypeChange(this.value)"
                        required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${postTypeList}" var="postType">
                        <option value="${postType.postTypeId}" ${postType.postTypeId eq personInfo.postTypeId ? "selected='selected'":""}>${postType.postTypeName}</option>
                    </c:forEach>
                </select>
                <select name="postLevelId" id="postLevelId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${postLevelList}" var="postLevel">
                        <option value="${postLevel.postLevelId}" ${postLevel.postLevelId eq personInfo.postLevelId ? "selected='selected'":""}>${postLevel.postLevelName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="5" class="ibg">
                <select name="subjectTypeId" id="subjectTypeId" class="select-min"
                        onchange="subjectTypeChange(this.value)" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectTypeList}" var="subjectType">
                        <option value="${subjectType.subjectTypeId}" ${subjectType.subjectTypeId eq personInfo.subjectTypeId ? "selected='selected'":""}>${subjectType.subjectTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right left">一级学科：</td>
            <td colspan="8" class="ibg">
                <select name="subjectFirstId" id="subjectFirstId" class="select-min"
                        onchange="subjectFirstChange(this.value)" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectFirstList}" var="subjectFirst">
                        <option value="${subjectFirst.subjectFirstId}" ${subjectFirst.subjectFirstId eq personInfo.subjectFirstId ? "selected='selected'":""}>${subjectFirst.subjectFirstName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">二级学科：</td>
            <td colspan="8" class="ibg">
                <select name="subjectSecondId" id="subjectSecondId" class="select-min"
                        onchange="subjectSecondChange(this.value)" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectSecondList}" var="subjectSecond">
                        <option value="${subjectSecond.subjectSecondId}" ${subjectSecond.subjectSecondId eq personInfo.subjectSecondId ? "selected='selected'":""}>${subjectSecond.subjectSecondName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">三级学科：</td>
            <td colspan="8" class="ibg">
                <select name="subjectThirdId" id="subjectThirdId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${subjectThirdList}" var="subjectThird">
                        <option value="${subjectThird.subjectThirdId}" ${subjectThird.subjectThirdId eq personInfo.subjectThirdId ? "selected='selected'":""}>${subjectThird.subjectThirdName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right"><label class="required">科研所属部门</label>：</td>
            <td colspan="3" class="ibg">
                <select name="collegeId2" id="collegeId2" class="select-min" onchange="college2Change(this.value)"
                        required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${college2List}" var="college2">
                        <option value="${college2.collegeId}" ${college2.collegeId eq personInfo.collegeId2 ? "selected='selected'":""}>${college2.collegeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">所在教研室：</td>
            <td colspan="4" class="ibg">
                <select name="departmentId2" id="departmentId2" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${departmentList}" var="department">
                        <option value="${department.departmentId}" ${department.departmentId eq personInfo.departmentId2 ? "selected='selected'":""}>${department.departmentName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">荣誉称号：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="honoraryTitle" class="width-500" value="${personInfo.honoraryTitle}">
                <label class="required">（注：若有多个请用逗号分隔！）</label>
            </td>
        </tr>
    </table>
    <div style="width:100%; text-align:center; margin-left:15px; margin-right:15px;margin-top: 20px">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;拓展信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;margin-bottom: 50px">
        <tr>
            <td class="right">性别：</td>
            <td colspan="4" class="ibg">
                <label><input type="radio" name="sex" value="男" ${personInfo.sex eq "男"?'checked="checked"':""}>男</label>
                <label><input type="radio" name="sex" value="女" ${personInfo.sex eq "女"?'checked="checked"':""}>女</label>
            </td>
        </tr>
        <tr>
            <td class="right">出生日期：</td>
            <td colspan="8" class="ibg">
                <input type="text" class="Wdate" readonly="readonly" onclick="WdatePicker()"
                       value="${ds.format(personInfo.birthday)}"
                       style="width: 200px;" name="birthday"/>
            </td>
        </tr>
        <tr>
            <td class="right">国籍：</td>
            <td colspan="3" class="ibg">
                <select name="countryId" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${countryList}" var="country">
                        <option value="${country.countryId}" ${country.countryId eq personInfo.countryId ? "selected='selected'":""}>${country.countryName}</option>
                    </c:forEach>
                </select>
            </td>
            <td class="right left">民族：</td>
            <td colspan="4" class="ibg">
                <select name="nationId" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${nationList}" var="nation">
                        <option value="${nation.nationId}" ${nation.nationId eq personInfo.nationId ? "selected='selected'":""}>${nation.nationName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td class="right">邮箱：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="email" id="email" value="${personInfo.email}" style="width: 200px;">
            </td>
        </tr>
        <tr>
            <td class="right">办公电话：</td>
            <td colspan="3" class="ibg">
                <input type="text" name="officeTel" class="width-200" value="${personInfo.officeTel}">
            </td>
            <td class="right left">手机号：</td>
            <td colspan="4" class="ibg">
                <input type="text" name="phone" class="width-200" value="${personInfo.phone}">
            </td>
        </tr>
        <tr>
            <td class="right">导师类型：</td>
            <td colspan="8" class="ibg">
                <select name="tutorTypeId" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${tutorTypeList}" var="tutorType">
                        <option value="${tutorType.tutorTypeId}" ${tutorType.tutorTypeId eq tutorType.tutorTypeId ? "selected='selected'":""}>${tutorType.tutorTypeName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td class="right left">研究方向：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="researchArea" class="width-500" value="${personInfo.researchArea}">
            </td>
        </tr>
        <tr>
            <td class="right">最后学历：</td>
            <td colspan="2" class="ibg">
                <select name="educationId" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${educationList}" var="education">
                        <option value="${education.educationId}" ${education.educationId eq personInfo.educationId ? "selected='selected'":""}>${education.educationName}</option>
                    </c:forEach>
                </select>
            </td>
            <td class="right left">最后学位：</td>
            <td colspan="5" class="ibg">
                <select name="nationId" class="select-min">
                    <option value="">--请选择--</option>
                    <c:forEach items="${degreeList}" var="degree">
                        <option value="${degree.degreeId}" ${degree.degreeId eq personInfo.degreeId ? "selected='selected'":""}>${degree.degreeName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td class="right">进修情况：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="learningSituation" class="width-500" value="${personInfo.learningSituation}">
            </td>
        </tr>
        <tr>
            <td class="right">学术兼职：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="partTimeAcademic" class="width-500" value="${personInfo.partTimeAcademic}">
            </td>
        </tr>
        <tr>
            <td class="right">学术特长：</td>
            <td colspan="8" class="ibg">
                <input type="text" name="academicSpeciality" class="width-500" value="${personInfo.academicSpeciality}">
            </td>
        </tr>
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
            $("select[name='subjectSecondId']").html('<option value="">--请选择--</option>');
            $("select[name='subjectThirdId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/personal/subjectTypeChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {subjectTypeId: subjectTypeId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                var subjectFirst = $("select[name='subjectFirstId']");               //获取到一级学科选择框
                var subjectFirstHtml = '<option value="">--请选择--</option>';     //初始化下拉框内容
                for (var i = 0; i < resultData.length; i++) {
                    subjectFirstHtml += '<option value="' + resultData[i].subjectFirstId + '">' + resultData[i].subjectFirstName + '</option>';
                }
                subjectFirst.html(subjectFirstHtml);                              //设置一级学科中的内容
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }
    /**
     * 改变一级学科时更改二级学科
     * @param subjectFirstId  一级学科编号
     */
    function subjectFirstChange(subjectFirstId) {
        //选择的学科门类为空 即-1时，初始化级联的下拉框
        if ("" === subjectFirstId) {
            $("select[name='subjectSecondId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/personal/subjectFirstChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {subjectFirstId: subjectFirstId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                var subjectSecond = $("select[name='subjectSecondId']");               //获取到一级学科选择框
                var subjectSecondHtml = '<option value="">--请选择--</option>';     //初始化下拉框内容
                for (var i = 0; i < resultData.length; i++) {
                    subjectSecondHtml += '<option value="' + resultData[i].subjectSecondId + '">' + resultData[i].subjectSecondName + '</option>';
                }
                subjectSecond.html(subjectSecondHtml);                              //设置二级学科中的内容
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }
    /**
     * 改变二级学科时更改三级学科
     * @param subjectSecondId  二级学科编号
     */
    function subjectSecondChange(subjectSecondId) {
        //选择的学科门类为空 即-1时，初始化级联的下拉框
        if ("" === subjectSecondId) {
            $("select[name='subjectThirdId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/personal/subjectSecondChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {subjectSecondId: subjectSecondId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                var subjectThird = $("select[name='subjectThirdId']");               //获取到三级学科选择框
                var subjectThirdHtml = '<option value="">--请选择--</option>';     //初始化下拉框内容
                for (var i = 0; i < resultData.length; i++) {
                    subjectThirdHtml += '<option value="' + resultData[i].subjectThirdId + '">' + resultData[i].subjectThirdName + '</option>';
                }
                subjectThird.html(subjectThirdHtml);                              //设置二级学科中的内容
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }

    /**
     * 改变 职称类型 时更改 职称级别
     * @param titleTypeId  职称类型 id
     */
    function titleTypeChange(titleTypeId) {
        //选择的 职称类型 为空 即-1时，初始化级联的下拉框
        if ("" === titleTypeId) {
            $("select[name='titleLevelId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/personal/titleTypeChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {titleTypeId: titleTypeId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                var titleLevel = $("select[name='titleLevelId']");//获取到目标选择看
                var titleLevelHtml = '<option value="">--请选择--</option>';//初始化
                for (var i = 0; i < resultData.length; i++) {
                    titleLevelHtml += '<option value="' + resultData[i].titleLevelId + '">' + resultData[i].titleLevelName + '</option>';
                }
                titleLevel.html(titleLevelHtml);//设置目标选择框内容
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        })
        ;
    }

    /**
     * 改变 科研所属单位 时更改 所在教研室
     * @param college2Id  科研所属单位 id
     */
    function college2Change(collegeId2) {
        //选择的 科研所属单位 为空 即-1时，初始化级联的下拉框
        if ("" === collegeId2) {
            $("select[name='departmentId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/personal/college2Change.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {collegeId2: collegeId2},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                var department = $("select[name='departmentId2']");//获取到目标选择看
                var departmentHtml = '<option value="">--请选择--</option>';//初始化
                for (var i = 0; i < resultData.length; i++) {
                    departmentHtml += '<option value="' + resultData[i].departmentId + '">' + resultData[i].departmentName + '</option>';
                }
                department.html(departmentHtml);//设置目标选择框内容
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }

    /**
     * 改变 绩效类型 时更改 绩效级别
     * @param postTypeId  绩效类型 id
     */
    function postTypeChange(postTypeId) {
        //选择的 职称类型 为空 即-1时，初始化级联的下拉框
        if ("" === postTypeId) {
            $("select[name='postLevelId']").html('<option value="">--请选择--</option>');
            return true;
        }
        //通过ajax改变对应下拉框的内容
        $.ajax({
            type: "POST",                              //请求的方式
            url: '/personal/postTypeChange.action',  //ajax请求的地址
            dataType: "json",                          //数据类型为json
            data: {postTypeId: postTypeId},      //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (resultData) {           //服务器执行成功调用此方法，data为服务器返回的数据
                var postLevel = $("select[name='postLevelId']");//获取到目标选择看
                var postLevelHtml = '<option value="">--请选择--</option>';//初始化
                for (var i = 0; i < resultData.length; i++) {
                    postLevelHtml += '<option value="' + resultData[i].postLevelId + '">' + resultData[i].postLevelName + '</option>';
                }
                postLevel.html(postLevelHtml);//设置目标选择框内容
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }
    //提交
    function submitPersonInfo() {
        if (confirm("确定保存个人信息吗？")) {
            $("#personalInfoForm").attr("action", "<%=request.getContextPath()%>/personal/updatePersonInfo.action");
            $("#subForm").click(); //触发按钮提交事件
        }
    }
</script>
</body>
</html>
