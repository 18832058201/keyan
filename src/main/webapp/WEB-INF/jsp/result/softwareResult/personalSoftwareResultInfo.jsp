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
    <title>软件著作成果详情</title>
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
<%--按钮start--%>
<jsp:include page="../../fileUpload.jsp"/>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${(activeUser.workNameAndNum eq softwareResultInfo.registrant)&&(softwareResultInfo.isEdit eq 1)}">
    <a href="<%=request.getContextPath()%>/result/softwareResult/toEditSoftwareResult.action?softwareId=${softwareResultInfo.softwareId}"
       class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">软件著作成果详情</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">软件全称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.softwareName}
            </td>
        </tr>
        <tr>
            <td class="right">软件版本：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.softwareVersion}
            </td>
            <td class="right left">软件简称：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.softwareShortName}
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.subjectTypeName}
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.subjectFirstName}
            </td>
        </tr>
        <tr>
            <td class="right">著作权人：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.owner}
            </td>
            <td class="right left">证书号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.certificateNumber}
            </td>
        </tr>
        <tr>
            <td class="right">登记号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.registerNumber}
            </td>
            <td class="right left">分类号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.classifyNumber}
            </td>
        </tr>
        <tr>
            <td class="right">首次发表时间：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${ds.format(softwareResultInfo.publishDate)}
            </td>
            <td class="right left">登记批准时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(softwareResultInfo.approveDate)}
            </td>
        </tr>
        <tr>
            <td class="right">证书日期：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${ds.format(softwareResultInfo.certificateDate)}
            </td>
        </tr>
        <tr>
            <td class="right">编程语言：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.programmingLanguage}
            </td>
            <td class="right left">代码行数：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.codeLine}
            </td>
        </tr>
        <tr>
            <td class="right">奖励金额：</td>
            <td colspan="8" class="ibg">
                ${softwareResultInfo.bonus}
                <label class="required">（元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">简介：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${softwareResultInfo.remark}
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">${softwareResultInfo.leader}</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">${softwareResultInfo.registrant}</td>
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
                &nbsp;&nbsp;${softwareResultInfo.score}
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">
                <%--先判断有无上传权限--%>
                <c:if test="${(activeUser.workNameAndNum eq softwareResultInfo.registrant)&&(softwareResultInfo.isEdit eq 1)}">
                    <c:if test="${empty softwareResultInfo.attachment}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${softwareResultInfo.softwareId}')">上传</a>
                    </c:if>
                </c:if>
                <c:if test="${!empty softwareResultInfo.attachment}">
                    <c:if test="${(activeUser.workNameAndNum eq softwareResultInfo.registrant)&&(softwareResultInfo.isEdit eq 1)}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${softwareResultInfo.softwareId}')">重传</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    </c:if>
                    <a href="javascript:void(0)"
                       onclick="fileDownload('${softwareResultInfo.attachment}')">下载</a>
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
        <!--功能相关js-->
        <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/addPerson.js"></script>
        <!--end :人员选择--->
    </table>
</form>
<%--按钮end--%>
</body>
</html>
