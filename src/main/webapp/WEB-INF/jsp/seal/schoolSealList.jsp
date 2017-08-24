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
    <title>学校公章列表</title>
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

<div id="content">
    <form action="#" method="get" class="form-horizontal">
        <div id="content-header">
            <%--按钮start--%>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">审核通过</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">审核不通过</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">撤销审核</a>
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
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">学校公章申请列表，共有&nbsp;&nbsp;XXXX&nbsp;&nbsp;条数据</label>
                            <label style="float:right;padding-top: 7px;padding-right: 30px;"><input type="radio"
                                                                                                    name="radio"
                                                                                                    value="yes">已审核</label>
                            <label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="no">待审核
                                &nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <label style="float:right;padding-top: 7px;"><input type="radio" name="radio" value="all"
                                                                                checked="checked">全部
                                &nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <label style="float: right;padding-top: 7px;"> 请选择状态：&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 5%;">
                                        <input type="checkbox" id="title-table-checkbox" name="title-table-checkbox"/>
                                    </th>
                                    <th style="text-align: center;width: 15%;">用印说明</th>
                                    <th style="text-align: center;width: 15%;">申请用印单位</th>
                                    <th style="text-align: center;width: 10%;">用印人</th>
                                    <th style="text-align: center;width: 10%;">用印类型</th>
                                    <th style="text-align: center;width: 10%;">用印数量</th>
                                    <th style="text-align: center;width: 10%;">审核状态</th>
                                    <th style="text-align: center;width: 10%;">有效时间</th>
                                    <th style="text-align: center;width: 10%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <tr class="gradeX">
                                    <td><input type="checkbox"/></td>
                                    <td><a href="sealInfo.jsp">测试</a></td>
                                    <td>学校</td>
                                    <td>测试人员</td>
                                    <td>学校公章</td>
                                    <td>5</td>
                                    <td>待科研院审核</td>
                                    <td>2017-06-09</td>
                                    <td><a href="sealEdit.jsp">编辑</a></td>
                                </tr>
                                <tr class="gradeX">
                                    <td><input type="checkbox"/></td>
                                    <td><a href="sealInfo.jsp">测试</a></td>
                                    <td>学校</td>
                                    <td>测试人员</td>
                                    <td>学校公章</td>
                                    <td>5</td>
                                    <td>待科研院审核</td>
                                    <td>2017-06-09</td>
                                    <td><a href="sealEdit.jsp">编辑</a></td>
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
<script src="<%=request.getContextPath()%>/js/jquery_dialog.js"></script>
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

