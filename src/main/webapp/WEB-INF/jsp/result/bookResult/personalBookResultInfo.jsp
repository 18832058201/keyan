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
    <title>著作成果详情</title>
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

<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${(activeUser.workNameAndNum eq bookResultInfo.registrant)&&(bookResultInfo.isEdit eq 1)}">
    <a href="<%=request.getContextPath()%>/result/bookResult/toEditBookResult.action?bookId=${bookResultInfo.bookId}"
       class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
</c:if>
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">著作成果详情</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">著作名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.bookName}
            </td>
        </tr>
        <tr>
            <td class="right">校内编号：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.schoolNumber}
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.subjectTypeName}
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.subjectFirstName}
            </td>
        </tr>
        <tr>
            <td class="right">著作类型：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.bookTypeName}
            </td>
            <td class="right left">ISBN：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.isbn}
            </td>
        </tr>
        <tr>
            <td class="right">著作总字数：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.totalNum}
            </td>
            <td class="right left">撰写总字数：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.writeNum}
            </td>
        </tr>
        <tr>
            <td class="right">出版单位：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.publishUnit}
            </td>
            <td class="right left">出版地：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.publishPlace}
            </td>
        </tr>
        <tr>
            <td class="right">出版日期：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${ds.format(bookResultInfo.publishDate)}
            </td>
            <td class="right left">出版社类型：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.pressTypeName}
            </td>
        </tr>
        <tr>
            <td class="right">备注：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.remark}
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">&nbsp;&nbsp;${bookResultInfo.leader}</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">&nbsp;&nbsp;${bookResultInfo.registrant}</td>
        </tr>
        <tr>
            <td class="right">所属二级单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personList[0].collegeName}
            </td>
        </tr>
        <tr>
            <td class="right">奖励金额：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.bonus}
                <label class="required">（元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">年度考核得分：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${bookResultInfo.score}
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">
                <%--先判断有无上传权限--%>
                <c:if test="${(activeUser.workNameAndNum eq bookResultInfo.registrant)&&(bookResultInfo.isEdit eq 1)}">
                    <c:if test="${empty bookResultInfo.attachment}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${bookResultInfo.bookId}')">上传</a>
                    </c:if>
                </c:if>
                <c:if test="${!empty bookResultInfo.attachment}">
                    <c:if test="${(activeUser.workNameAndNum eq bookResultInfo.registrant)&&(bookResultInfo.isEdit eq 1)}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"
                           data-animation="fade"
                           onclick="fileUpload('${bookResultInfo.bookId}')">重传</a>&nbsp;&nbsp;&nbsp;&nbsp;
                    </c:if>
                    <a href="javascript:void(0)"
                       onclick="fileDownload('${bookResultInfo.attachment}')">下载</a>
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
<%--按钮end--%>
</body>
</html>
