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
    <title>论文成果收录信息</title>
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
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="submitInclude()"
   class="button button-primary button-rounded button-small">提交</a>&nbsp;&nbsp;
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">论文成果收录信息</h1>
<%--表单start--%>
<form action="" method="POST" id="includeForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">论文题目：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${paperInfo.paperName}
                <input type="hidden" name="paperId" value="${paperInfo.paperId}"/>
                <input type="hidden" name="registrant" value="${activeUser.username}(${activeUser.userId})"/>
                <input type="hidden" name="auditStatusId" value="${paperInfo.auditStatusId}"/>
            </td>
        </tr>
        <tr>
        <tr>
            <td class="right">刊物名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${paperInfo.publishName}
            </td>
        </tr>
        <tr>
            <td class="right">出版时间：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${ds.format(paperInfo.publishDate)}
            </td>
        </tr>
        <tr>
            <td class="right">简介：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${paperInfo.remark}
            </td>
        </tr>
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
<script>
    //提交 著作成果
    function submitInclude() {
        if (confirm("确定提交收录信息吗？")) {
            //修改提交地址为 submit
            $("#includeForm").attr("action", "<%=request.getContextPath()%>/result/paperResult/updateInclude.action");
            $("#subForm").click(); //触发按钮提交事件
        }
    }
</script>
<%--按钮end--%>
</body>
</html>
