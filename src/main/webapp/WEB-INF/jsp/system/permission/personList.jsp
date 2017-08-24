<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
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
    <title>权限管理-人员列表</title>
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
    <link rel="stylesheet" href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" />

    <script src="<%=request.getContextPath()%>/js/jquery_dialog.js"></script>
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
    <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/jquery.uniform.js"></script>
    <script src="<%=request.getContextPath()%>/js/select2.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js"></script>
    <%--实现表格数据的排序等功能--%>
    <script src="<%=request.getContextPath()%>/js/matrix.js"></script>
    <script src="<%=request.getContextPath()%>/js/matrix.tables.js"></script>
    <%--实现表格的分页等功能--%>
    <script src="<%=request.getContextPath()%>/js/common.js"></script>

    <script>
        /**
         * 重置所有人员权限
         */
        function resetPermission() {
            if(confirm("提示：此操作将重置所有人员权限，操作后所有人员将只具有科研人员角色，是否继续？")){
                location.href = "<%=request.getContextPath()%>/system/permission/resetRole.action";
            }
        }
    </script>
</head>
<body >
<div id="content">
    <form action="<%=request.getContextPath()%>/insertRewClass.action" class="form-horizontal" method="post"
          id="insertForm">
        <div id="content-header">
            <%--按钮start--%>
            <br>
                <shiro:hasRole name="superAdmin">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="javascript:void(0)" onclick="resetPermission()" class="button button-primary button-rounded button-small">重置所有人员权限</a>
                </shiro:hasRole>
          <%--  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">导出到Excel</a>--%>
            <%--按钮end--%>
        </div>

        <br>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title" style="line-height: 36px;"><span class="icon"><i class="icon-th"></i></span>
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">人员列表，共有&nbsp;&nbsp;${personList.size()}&nbsp;&nbsp;条数据</label>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 10%;">序号</th>
                                    <th style="text-align: center;width: 20%;">人员姓名</th>
                                    <th style="text-align: center;width: 50%;">所属单位</th>
                                    <th style="text-align: center;width: 20%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <%--数据库中查询的数据--%>
                                <c:forEach items="${personList}" var="person" varStatus="i">
                                    <tr class="gradeX">
                                        <td>${i.count}</td>
                                        <td><a href="<%=request.getContextPath()%>/system/permission/toSetPersonRole.action?workNum=${person.workNum}">${person.workName}(${person.workNum})</a></td>
                                        <td>${person.college2Name}</td>
                                        <td>
                                            <a href="<%=request.getContextPath()%>/system/permission/toSetPersonRole.action?workNum=${person.workNum}">分配权限</a>
                                            <a href="<%=request.getContextPath()%>/system/permission/resetPassword.action?workNum=${person.workNum}">/重置密码</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                              <%--  <tfoot>
                                &lt;%&ndash;新增行数据&ndash;%&gt;
                                <tr class="gradeX">
                                    <td></td>
                                    <td><input type="text" name="rewClassName" style="width: 80%;height:30px"/></td>
                                    <td>
                                        <select style="width: 80%;height:30px" name="subjectTypeId">
                                            <c:forEach items="${subjectTypeList}" var="subjectType">
                                                <option value="${subjectType.subjectTypeId}">${subjectType.subjectTypeName}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                    <td><input type="text" value="0" name="score" style="width: 80%;height:30px"></td>
                                    <td>
                                        <select name="isEffective" style="width: 80%;height:30px">
                                            <option value="1">有效</option>
                                            <option value="0">无效</option>
                                        </select></td>
                                    <td><a href="javascript:void(0)" onclick="insertRewClass()">新增</a></td>
                                </tr>
                                </tfoot>--%>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>

<%--返回异常信息--%>
<c:if test="${!empty exceptionMessage}">
    <script>
        alert('${exceptionMessage}');
    </script>
</c:if>
</body>
</html>
