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
    <title>个人信息详情</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
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
</head>
<body>
<%--按钮start--%>
<br>
<c:if test="${1 eq ePersonEdit.isEdit||null eq ePersonEdit.isEdit}">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="<%=request.getContextPath()%>/personal/toEditPersonalInfo.action"
       class="button button-primary button-rounded button-small">编辑</a>
</c:if>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">修改密码</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>

<%--表单start--%>
<form action="" method="POST" id="personalInfoForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <h1 class="title-h1">个人信息详情</h1>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;基本信息（注：标<label class="required">*</label>的为必填项）&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <c:if test="${0 eq ePersonEdit.isEdit||!null eq ePersonEdit.isEdit}">
            <tr>
                <td class="right">注意事项：</td>
                <td colspan="8" class="ibg">
                    1. 带有<label class="required">（待确认修改为XXXX）</label>字样的信息为提交编辑但未完成审核的内容！<br>
                    2. 在此期间无法再次编辑个人信息！请确认修改后尽快联系目标学院的学院管理员，完成审核！
                </td>
            </tr>
        </c:if>
        <tr>
            <td class="right">工号：</td>
            <td colspan="6" class="ibg">
                &nbsp;&nbsp;${personInfo.workNum}
            </td>
            <td class="right left" colspan="2" rowspan="6" style="text-align: center;padding-left: 60px">
                <div id="preview">
                    <img id="imghead" width=100% height=auto border=0 src="">暂无照片
                </div>
            </td>
        </tr>
        <tr>
            <td class="right left">姓名：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.workName}
                <c:if test="${ePersonEdit.workName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.workName}</label>&nbsp;&nbsp;）</label>
                </c:if>
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
            <td class="right">职称：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.titleTypeName}
                <c:if test="${ePersonEdit.titleTypeName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.titleTypeName}</label>&nbsp;&nbsp;）</label>
                </c:if>
                &nbsp;&nbsp;&nbsp;&nbsp;${personInfo.titleLevelName}
                <c:if test="${ePersonEdit.titleLevelName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.titleLevelName}</label>&nbsp;&nbsp;）</label>
                </c:if>
            </td>
        </tr>
        <tr>
            <td class="right left">绩效岗位：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.postTypeName}
                <c:if test="${ePersonEdit.postTypeName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.postTypeName}</label>&nbsp;&nbsp;）</label>
                </c:if>
                &nbsp;&nbsp;${personInfo.postLevelName}
                <c:if test="${ePersonEdit.postLevelName != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.postLevelName}</label>&nbsp;&nbsp;）</label>
                </c:if>
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.subjectTypeName}
            </td>
        </tr>
        <tr>
            <td class="right left">一级学科：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.subjectFirstName}
            </td>
        </tr>
        <tr>
            <td class="right">二级学科：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.subjectSecondName}
            </td>
        </tr>
        <tr>
            <td class="right">三级学科：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.subjectThirdName}
            </td>
        </tr>
        <tr>
            <td class="right">科研所属部门：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${personInfo.college2Name}
                <c:if test="${ePersonEdit.collegeName2 != null}">
                    <label>（待确认修改为&nbsp;&nbsp;<label class="required">${ePersonEdit.collegeName2}</label>&nbsp;&nbsp;）</label>
                </c:if>
            </td>
            <td class="right left">所在教研室：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${personInfo.department2Name}
            </td>
        </tr>
        <tr>
            <td class="right">荣誉称号：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.honoraryTitle}
            </td>
        </tr>
    </table>

    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;margin-top: 20px">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;拓展信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>

    <table style="table-layout:fixed;margin-bottom: 50px">
        <tr>
            <td class="right">性别：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${personInfo.sex}
            </td>
        </tr>
        <tr>
            <td class="right">出生日期：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${ds.format(personInfo.birthday)}
            </td>
        </tr>
        <tr>
            <td class="right">国籍：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${personInfo.countryName}
            </td>
            <td class="right left">民族：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${personInfo.nationName}
            </td>
        </tr>
        <tr>
            <td class="right">邮箱：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.email}
            </td>
        </tr>
        <tr>
            <td class="right">办公电话：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${personInfo.officeTel}
            </td>
            <td class="right left">手机号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${personInfo.phone}
            </td>
        </tr>
        <tr>
            <td class="right">导师类型：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.tutorTypeName}
                </select>
            </td>
        </tr>
        <tr>
            <td class="right left">研究方向：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.researchArea}
            </td>
        </tr>
        <tr>
            <td class="right">最后学历：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${personInfo.educationName}
            </td>
            <td class="right left">最后学位：</td>
            <td colspan="5" class="ibg">
                &nbsp;&nbsp;${personInfo.degreeName}
            </td>
        </tr>
        <tr>
            <td class="right">进修情况：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.learningSituation}
            </td>
        </tr>
        <tr>
            <td class="right">学术兼职：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.partTimeAcademic}
            </td>
        </tr>
        <tr>
            <td class="right">学术特长：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personInfo.academicSpeciality}
            </td>
        </tr>
    </table>
</form>
<%--表单end--%>
</body>
</html>
