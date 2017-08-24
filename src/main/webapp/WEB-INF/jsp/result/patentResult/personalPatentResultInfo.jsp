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
    <title>专利成果详情</title>
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
<jsp:include page="../../fileUpload.jsp"/>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${(activeUser.workNameAndNum eq EPatentCustom.registrant)&&(EPatentCustom.isEdit eq 1)}">
    <a href="<%=request.getContextPath()%>/result/patentResult/toEditPatentResult.action?patentId=${EPatentCustom.patentId}" class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">专利成果详情</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">专利名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.patentName}
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.subjectTypeName}
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.subjectFirstName}
            </td>
        </tr>
        <tr>
            <td class="right">专利类型：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.patTypeName}
            </td>
        </tr>
        <tr>
            <td class="right">专利权人：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.patentee}
            </td>
        </tr>
        <tr>
            <td class="right">申请号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.applyNumber}
            </td>
            <td class="right left">专利号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.patentNumber}
            </td>
        </tr>
        <tr>
            <td class="right">证书编号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.patCertificateNum}
            </td>
            <td class="right left">证书日期：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(EPatentCustom.certificateDate)}
            </td>
        </tr>
        <tr>
            <td class="right">专利申请日期：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${ds.format(EPatentCustom.patApplyDate)}
            </td>
            <td class="right left">授权公告日：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(EPatentCustom.empowerDate)}
            </td>
        </tr>
        <tr>
            <td class="right">奖励金额：</td>
            <td colspan="8" class="ibg">
                ${EPatentCustom.bonus}
                <label class="required">（元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">专利简介：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.remark}
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">${EPatentCustom.leader}</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">${EPatentCustom.registrant}</td>
        </tr>
        <tr>
            <td class="right">所属二级单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personList[0].collegeName}
            </td>
        </tr>
        <tr>
            <td class="right">年度考核得分：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${EPatentCustom.score}
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">
                <c:if test="${(activeUser.workNameAndNum eq EPatentCustom.registrant)&&(EPatentCustom.isEdit eq 1)}">
                    <c:if test="${empty EPatentCustom.attachment}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${EPatentCustom.patentId}')">上传</a>
                    </c:if>
                </c:if>
                <c:if test="${!empty EPatentCustom.attachment}">
                    <c:if test="${(activeUser.workNameAndNum eq EPatentCustom.registrant)&&(EPatentCustom.isEdit eq 1)}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${EPatentCustom.patentId}')">重传</a><br>
                    </c:if>
                    <a href="javascript:void(0)"
                       onclick="fileDownload('${EPatentCustom.attachment}')">下载</a>
                </c:if>
            </td>
        </tr>
        <!--start :人员选择--->
        <tr>
            <td class="right">人员列表：</td>
            <td colspan="8" class="ibg">
                <div class="table-container">
                    <table style="border: 1px solid black;width: 100%;table-layout:fixed;" id="personTable">
                        <thead>
                        <tr>
                            <th colspan="2">姓名（工号）</th>
                            <th colspan="3" class="left">所属单位</th>
                            <th colspan="2" class="left">人员类别</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach items="${personList}" var="personal">
                            <tr>
                                <td colspan="2" class="align-center">${personal.workName}</td>
                                <td colspan="3" class="left align-center">${personal.collegeName}</td>
                                <td colspan="2" class="left align-center">
                                    <c:if test="${personal.personType eq 1}">本校职工</c:if>
                                    <c:if test="${personal.personType eq 2}">本校学生</c:if>
                                    <c:if test="${personal.personType eq 3}">校外人员</c:if>
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
</body>
</html>
