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
    <title>植物新品种列表-个人</title>
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
<jsp:include page="../../fileUpload.jsp"/>
<div id="content">
    <form action="#" method="get" class="form-horizontal">
        <div id="content-header">
            <%--按钮start--%>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="<%=request.getContextPath()%>/result/plantResult/toAddPlantResult.action" class="button button-primary button-rounded button-small">新增</a>
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
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">植物新品种列表，共有&nbsp;&nbsp;${plantResultList.size()}&nbsp;&nbsp;条数据</label>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 15%;">品种权名</th>
                                    <th style="text-align: center;width: 8%;">学科门类</th>
                                    <th style="text-align: center;width: 10%;">证书号</th>
                                    <th style="text-align: center;width: 10%;">种类</th>
                                    <th style="text-align: center;width: 8%;">品种权人</th>
                                    <th style="text-align: center;width: 10%;">作者</th>
                                    <th style="text-align: center;width: 10%;">有效时间</th>
                                    <th style="text-align: center;width: 10%;">审核状态</th>
                                    <th style="text-align: center;width: 5%;">附件</th>
                                    <th style="text-align: center;width: 5%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <c:forEach items="${plantResultList}" var="plant">
                                <tr class="gradeX">
                                    <td>
                                        <a href="<%=request.getContextPath()%>/result/plantResult/PlantResultInfo.action?plantId=${plant.plantId}">${plant.plantName}</a>
                                    </td>
                                    <td>${plant.subjectTypeName}</td>
                                    <td>${plant.certificateNumber}</td>
                                    <td>${plant.plantTypeName}</td>
                                    <td>${plant.breedOwner}</td>
                                    <td>${plant.foster}</td>
                                    <td>${ds.format(plant.empowerDate)}</td>
                                    <td>${plant.auditStatusName}</td>
                                    <td>
                                            <%--先判断有无上传权限--%>
                                        <c:if test="${(activeUser.workNameAndNum eq plant.registrant)&&(plant.isEdit eq 1)}">
                                            <c:if test="${empty plant.attachment}">
                                                <a href="javascript:void(0)" data-reveal-id="myModal"
                                                   data-animation="fade"
                                                   onclick="fileUpload('${plant.plantId}')">上传</a>
                                            </c:if>
                                        </c:if>
                                        <c:if test="${!empty plant.attachment}">
                                            <c:if test="${(activeUser.workNameAndNum eq plant.registrant)&&(plant.isEdit eq 1)}">
                                                <a href="javascript:void(0)" data-reveal-id="myModal"
                                                   data-animation="fade"
                                                   onclick="fileUpload('${plant.plantId}')">重传</a><br>
                                            </c:if>
                                            <a href="javascript:void(0)"
                                               onclick="fileDownload('${plant.attachment}')">下载</a>
                                        </c:if>
                                    </td>
                                    <td>
                                        <c:choose>
                                            <c:when test="${(activeUser.workNameAndNum eq plant.registrant)&&(plant.isEdit eq 1)}">
                                                <a href="<%=request.getContextPath()%>/result/plantResult/toEditPlantResult.action?plantId=${plant.plantId}">编辑</a>
                                                <br>
                                                <a href="javascript:void(0)"
                                                   onclick="deleteResult('${plant.plantId}')">删除</a>
                                            </c:when>
                                            <c:otherwise>
                                                无权操作
                                            </c:otherwise>
                                        </c:choose>
                                    </td>
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
    function deleteResult(plantId) {
        if (confirm("确定删除该动植物品种吗？")) {
            location.href = "<%=request.getContextPath()%>/result/plantResult/deletePlantResult.action?plantId=" + plantId + "";
        }
    }
</script>
</body>
</html>

