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
    <title>植物新品种详情</title>
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
<c:if test="${(activeUser.workNameAndNum eq plantResult.registrant)&&(plantResult.isEdit eq 1)}">
    <a href="<%=request.getContextPath()%>/result/plantResult/toEditPlantResult.action?plantId=${plantResult.plantId}"
       class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">植物新品种详情</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">品种名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${plantResult.plantName}
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${plantResult.subjectTypeName}
            </td>
            <td class="right left">品种级别：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${plantResult.plantGradeName}
            </td>
        </tr>
        <tr>
            <td class="right">生物种类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${plantResult.plantTypeName}
            </td>
            <td class="right left">属或种：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${plantResult.plantGenusName}
            </td>
        </tr>
        <tr>
            <td class="right">品种权人：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${plantResult.breedOwner}
            </td>
            <td class="right left">品种权号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${plantResult.breedNumber}
            </td>
        </tr>
        <tr>
            <td class="right">培育人：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${plantResult.foster}
            </td>
            <td class="right left">证书号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${plantResult.certificateNumber}
            </td>
        </tr>
        <tr>
            <td class="right">申请日期：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${ds.format(plantResult.applyDate)}
            </td>
            <td class="right left">授权日期：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(plantResult.empowerDate)}
            </td>
        </tr>
        <tr>
            <td class="right">奖励金额：</td>
            <td colspan="8" class="ibg">
                ${plantResult.bonus}
                <label class="required">（元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">简介：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${plantResult.remark}
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">${plantResult.leader}</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">${plantResult.registrant}</td>
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
                &nbsp;&nbsp;${plantResult.score}
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">
                <%--先判断有无上传权限--%>
                <c:if test="${(activeUser.workNameAndNum eq plantResult.registrant)&&(plantResult.isEdit eq 1)}">
                    <c:if test="${empty plantResult.attachment}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${plantResult.plantId}')">上传</a>
                    </c:if>
                </c:if>
                <c:if test="${!empty plantResult.attachment}">
                    <c:if test="${(activeUser.workNameAndNum eq plantResult.registrant)&&(plantResult.isEdit eq 1)}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${plantResult.plantId}')">重传</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    </c:if>
                    <a href="javascript:void(0)"
                       onclick="fileDownload('${plantResult.attachment}')">下载</a>
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
