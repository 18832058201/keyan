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
    <title>鉴定成果详情</title>
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
<%--引入文件上传相关内容--%>
<jsp:include page="../../fileUpload.jsp"/>
<br>
<%--按钮start--%>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${(activeUser.workNameAndNum eq identifyResultInfo.registrant)&&(identifyResultInfo.isEdit eq 1)}">
    <a href="<%=request.getContextPath()%>/result/identifyResult/toEditIdentifyResult.action?identifyId=${identifyResultInfo.identifyId}"
       class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">鉴定成果详情</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectName}
            </td>
        </tr>
        <tr>
            <td class="right">校内编号：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.schoolNumber}
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.subjectTypeName}
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.subjectFirstName}
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectNumber}
            </td>
            <td class="right left">项目来源：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectSourceName}
            </td>
        </tr>
        <tr>
            <td class="right">项目类型：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectType1Name}&nbsp;&nbsp;${identifyResultInfo.projectType2Name}
            </td>
        </tr>
        <tr>
            <td class="right">研究起始时间：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${ds.format(identifyResultInfo.startDate)}
            </td>
            <td class="right left">研究终止时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(identifyResultInfo.expectEndDate)}
            </td>
        </tr>
        <tr>
            <td class="right">鉴定单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.identifyUnit}
            </td>
        </tr>
        <tr>
            <td class="right">鉴定形式：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.formName}
            </td>
            <td class="right left">鉴定时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(identifyResultInfo.identifyDate)}
            </td>
        </tr>
        <tr>
            <td class="right">鉴定水平：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.idenLevelName}
            </td>
            <td class="right left">鉴定证书编号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.idenCertificateNum}
            </td>
        </tr>
        <tr>
            <td class="right">完成单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.finishUnit}
            </td>
        </tr>
        <tr>
            <td class="right">奖励金额：</td>
            <td colspan="8" class="ibg">
                ${identifyResultInfo.bonus}
                <label class="required">（元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">成果简介：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.remark}
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">${identifyResultInfo.leader}</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">${identifyResultInfo.registrant}</td>
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
                &nbsp;&nbsp;${identifyResultInfo.score}
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">
                <c:if test="${(activeUser.workNameAndNum eq identifyResultInfo.registrant)&&(identifyResultInfo.isEdit eq 1)}">
                    <c:if test="${empty identifyResultInfo.attachment}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${identifyResultInfo.identifyId}')">上传</a>
                    </c:if>
                </c:if>
                <c:if test="${!empty identifyResultInfo.attachment}">
                    <c:if test="${(activeUser.workNameAndNum eq identifyResultInfo.registrant)&&(identifyResultInfo.isEdit eq 1)}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${identifyResultInfo.identifyId}')">重传</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    </c:if>
                    <a href="javascript:void(0)"
                       onclick="fileDownload('${identifyResultInfo.attachment}')">下载</a>
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
                            <th colspan="4" class="left">所属单位</th>
                            <th colspan="2" class="left">人员类别</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${personList}" var="person">
                            <tr>
                                <td colspan="2" class="align-center">
                                        <%--${person.workNum}--%>
                                    <c:if test="${person.personType eq 1}">${person.workName}(${person.workNum})</c:if>
                                    <c:if test="${person.personType != 1}">${person.workName}</c:if>
                                </td>
                                <td colspan="4" class="left align-center">${person.collegeName}</td>
                                <td colspan="2" class="left align-center">
                                    <c:if test="${person.personType eq 1}">本校职工</c:if>
                                    <c:if test="${person.personType eq 2}">本校学生</c:if>
                                    <c:if test="${person.personType eq 3}">校外人员</c:if>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
        <!--end :人员选择--->
    </table>
</form>
</body>
</html>
