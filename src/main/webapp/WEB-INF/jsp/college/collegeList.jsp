<%--
  Created by IntelliJ IDEA.
  User: ZHT
  Date: 2017/7/24
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>学院列表-科研院</title>
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
            <button class="btn btn-success">新增学院</button>&nbsp;&nbsp;
        </div>
        <br>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title"> <span class="icon"><i class="icon-th"></i></span>
                            <h5>学院列表</h5>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table">
                                <thead class="table">
                                <tr>
                                    <th>学院名称</th>
                                    <th>学院人数（已入库）</th>
                                    <th>人员资源拥有量</th>
                                    <th>学院院长</th>
                                    <th>分管科研工作院长</th>
                                    <th>科研秘书</th>
                                    <th>联系电话</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <tr class="gradeX">
                                    <td><a href="../college/collegeInfo.jsp">信息与电气工程学院</a></td>
                                    <td><a href="">20</a></td>
                                    <td><a href="">22.2</a></td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>0311-123456789</td>
                                    <td><a href="">编辑</a>&nbsp;&nbsp; <a href="">删除</a></td>
                                </tr>
                                <tr class="gradeX">
                                    <td><a href="../Seal/scientificSealSchoolInfo.jsp">信息与电气工程学院</a></td>
                                    <td><a href="">20</a></td>
                                    <td><a href="">22.2</a></td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>0311-123456789</td>
                                    <td><a href="">编辑</a>&nbsp;&nbsp; <a href="">删除</a></td>
                                </tr>
                                <tr class="gradeX">
                                    <td><a href="../Seal/scientificSealSchoolInfo.jsp">信息与电气工程学院</a></td>
                                    <td><a href="">20</a></td>
                                    <td><a href="">22.2</a></td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>0311-123456789</td>
                                    <td><a href="">编辑</a>&nbsp;&nbsp; <a href="">删除</a></td>
                                </tr>
                                <tr class="gradeX">
                                    <td><a href="../Seal/scientificSealSchoolInfo.jsp">信息与电气工程学院</a></td>
                                    <td><a href="">20</a></td>
                                    <td><a href="">22.2</a></td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>测试人员</td>
                                    <td>0311-123456789</td>
                                    <td><a href="">编辑</a>&nbsp;&nbsp; <a href="">删除</a></td>
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

