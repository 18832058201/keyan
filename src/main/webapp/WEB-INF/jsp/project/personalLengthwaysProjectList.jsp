<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-08
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>纵向项目列表-个人</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/uniform.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/select2.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-media.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableListStyle.css">
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" rel="stylesheet"/>
</head>
<body>
<%--引入文件上传相关内容--%>
<jsp:include page="../fileUpload.jsp"/>

<div id="content">
    <form action="#" method="get" class="form-horizontal">
        <div id="content-header">
            <%--按钮start--%>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="<%=request.getContextPath()%>/project/toAddLengthwaysProject.action" class="button button-primary button-rounded button-small">新增</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">导出到Excel</a>
            <%--按钮end--%>
        </div>
        <br>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title" style="line-height: 36px;"><span class="icon"><i class="icon-th"></i></span>
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">纵向项目列表，共有&nbsp;&nbsp;${projectList.size()}&nbsp;&nbsp;条数据</label>
                            <%--<label style="float:right;padding-top: 7px;padding-right: 30px;"><input type="radio" name="radio" value="yes">已审核</label>--%>
                            <%--<label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="no">待审核&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                            <%--<label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="all" checked="checked">全部&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                            <%--<label style="float: right;padding-top: 7px;"> 请选择状态：&nbsp;&nbsp;&nbsp;&nbsp;</label>--%>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 25%;">项目名称</th>
                                    <%--<th style="text-align: center;width: 6%;">项目性质</th>--%>
                                    <th style="text-align: center;width: 6%;">学科门类</th>
                                    <th style="text-align: center;width: 5%;">负责人</th>
                                    <th style="text-align: center;width: 8%;">所属单位</th>
                                    <th style="text-align: center;width: 6%;">项目状态</th>
                                    <th style="text-align: center;width: 6%;">审核状态</th>
                                    <th style="text-align: center;width: 7%;">批准时间</th>
                                    <th style="text-align: center;width: 4%;">附件</th>
                                    <th style="text-align: center;width: 6%;">结题操作</th>
                                    <th style="text-align: center;width: 8%;">其他操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <c:forEach items="${projectList}" var="project">
                                <tr class="gradeX">
                                    <td>
                                        <a href="<%=request.getContextPath()%>/project/viewLengthWaysProjectInfo.action?projectId=${project.projectId}">${project.projectName}</a>
                                    </td>
                                    <%--<td>纵向项目</td>--%>
                                    <td>${project.subjectTypeName}</td>
                                    <td>${project.leader}</td>
                                    <td>${project.collegeName}</td>
                                    <td>${project.endStatusName}</td>
                                    <td>${project.auditStatusName}</td>
                                    <td>${ds.format(project.keyDate)}</td>
                                    <td >
                                    <%--先判断有无上传权限--%>
                                    <c:if test="${(activeUser.workNameAndNum eq project.registrant)&&(project.isEdit eq 1)}">
                                        <c:if test="${empty project.attachment}">
                                            <a href="javascript:void(0)" data-reveal-id="myModal"data-animation="fade" onclick="fileUpload('${project.projectId}')">上传</a>
                                        </c:if>
                                    </c:if>
                                    <c:if test="${!empty project.attachment}">
                                        <c:if test="${(activeUser.workNameAndNum eq project.registrant)&&(project.isEdit eq 1)}">
                                        <a href="javascript:void(0)" data-reveal-id="myModal"data-animation="fade" onclick="fileUpload('${project.projectId}')">重传</a><br>
                                        </c:if>
                                        <a href="javascript:void(0)" onclick="fileDownload('${project.attachment}')">下载</a>
                                    </c:if>
                                    </td>
                                    <td>
                                    <c:choose>
                                        <c:when test="${(activeUser.workNameAndNum eq project.registrant)&&(project.isEdit eq 1)}">
                                            <a href="javascript:void(0)">结题</a><br>
                                            <a href="javascript:void(0)">结题编辑</a>
                                        </c:when>
                                        <c:otherwise>
                                            无权操作
                                        </c:otherwise>
                                    </c:choose>

                                    </td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${(activeUser.workNameAndNum eq project.registrant)&&(project.isEdit eq 1)}">
                                            <a href="javascript:void(0)">预算调整</a><br>
                                            <a href="<%=request.getContextPath()%>/project/toEditLengthWaysProject.action?projectId=${project.projectId}">编辑</a>&nbsp;&nbsp;
                                            <a href="javascript:void(0)" onclick="deleteProject('${project.projectId}')">删除</a></td>
                                            </c:when>
                                            <c:otherwise>
                                                无权操作
                                            </c:otherwise>
                                        </c:choose>
                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
<script src="<%=request.getContextPath()%>/js/jquery_dialog.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.uniform.js"></script>
<script src="<%=request.getContextPath()%>/js/select2.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.tables.js"></script>

<script>
    function deleteProject(projectId) {
        if(confirm("确定删除该项目吗？")){
            location.href = "<%=request.getContextPath()%>/project/deleteLengthWaysProject.action?projectId="+projectId+"";
        }
    }
</script>
</body>
</html>

