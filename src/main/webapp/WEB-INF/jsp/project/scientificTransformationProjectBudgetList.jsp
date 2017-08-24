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
    <title>学校公章列表-科研处</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/uniform.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/select2.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-media.css" />
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>
    <style type="text/css">
        .table thead th {font-size: 14px;}
        .table tbody td {font-size: 14px;}
    </style>
</head>
<body>

<div id="content">
    <form action="#" method="get" class="form-horizontal">
    <div id="content-header">
        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button class="btn btn-success">审核通过</button>&nbsp;&nbsp;
        <button class="btn btn-success">审核不通过</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        请选择状态：&nbsp;&nbsp;&nbsp;&nbsp;
        全部<input type="radio" name="radio" value="all" checked="checked">
        待审核<input type="radio" name="radio" value="no">
        已审核<input type="radio" name="radio" value="yes">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <button class="btn btn-success">确定</button>&nbsp;&nbsp;
    </div>
        <br>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                        <h5>学校公章申请列表</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <table class="table table-bordered data-table">
                            <thead class="table" style="table-layout:fixed;">
                            <tr>
                                <th style="text-align: center;width: 5%;"><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
                                <th style="text-align: center;width: 20%;">项目名称</th>
                                <th style="text-align: center;width: 10%;">项目来源</th>
                                <th style="text-align: center;width: 5%;">项目性质</th>
                                <th style="text-align: center;width: 5%;">学科门类</th>
                                <th style="text-align: center;width: 5%;">批准经费</th>
                                <th style="text-align: center;width: 10%;">审核状态</th>
                                <th style="text-align: center;width: 8%;">有效时间</th>
                                <th style="text-align: center;width: 5%;">操作</th>
                            </tr>
                            </thead>
                            <tbody class="table">
                            <tr class="gradeX">
                                <td><input type="checkbox" /></td>
                                <td><a href="scientificSealSchoolInfo.jsp">测试</a></td>
                                <td>信息与电气工程学院</td>
                                <td>测试人员</td>
                                <td>学校公章</td>
                                <td>5</td>
                                <td>待科研院审核</td>
                                <td>2017-06-09</td>
                                <td><a href="">编辑</a></td>
                            </tr>
                            <tr class="gradeX">
                                <td><input type="checkbox" /></td>
                                <td>测试</td>
                                <td>信息与电气工程学院</td>
                                <td>测试人员</td>
                                <td>学校公章</td>
                                <td>5</td>
                                <td>待科研院审核</td>
                                <td>2017-06-09</td>
                                <td><a href="">编辑</a></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </form>
</div>

<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.uniform.js"></script>
<script src="<%=request.getContextPath()%>/js/select2.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.dataTables.min.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.tables.js"></script>
</body>
</html>

