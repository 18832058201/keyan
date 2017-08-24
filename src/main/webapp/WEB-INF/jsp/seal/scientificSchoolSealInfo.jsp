<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-08
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>学校公章详情-科研处</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/colorpicker.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/datepicker.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/uniform.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/select2.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-media.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-wysihtml5.css" />
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>

    <style>
        .control-group .controls label{
            display:inline-block;
        }
        /*列表宽度*/
        .table{width:100%;*width:100%;}
        /*测试span11*/
        .row-fluid .abc{width:50%;*width:50%}
        /*表格右侧样式*/
        .td1{width: 20%; text-align: right;}
        .td2{width: 30%; text-align: left;}
        .td3 {
            border-right: 1px solid #d3d3d3;
        }
        /*input文本框格式*/
        .textBox{text-align:left;padding: 15px 0;font-size: 14px;}
        .input-wbk{border: none;background-color: #F9F9F9;  }
    </style>
</head>
<body>

<div id="content">
    <div id="content-header">
        <h1>普通表单</h1>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="table">
                <div class="widget-box">
                    <div class="widget-title"> <span class="icon"> <i class="icon-align-justify"></i> </span>
                        <h5>学校公章申请详情</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <form action="#" method="get" class="form-horizontal">
                            <table width="100%">
                                <tr>
                                    <td class="td1 td3">申请用印单位：&nbsp;&nbsp;</td>
                                    <td class="td2 td3">&nbsp;&nbsp;信息与电气工程学院</td>
                                    <td class="td1 td3">申请人：&nbsp;&nbsp;</td>
                                    <td class="td2">&nbsp;&nbsp;测试人员</td>
                                </tr>
                                <tr>
                                    <td class="td1 td3">申请用印单位：&nbsp;&nbsp;</td>
                                    <td class="td2 td3">&nbsp;&nbsp;信息与电气工程学院</td>
                                    <td class="td1 td3">申请人：&nbsp;&nbsp;</td>
                                    <td class="td2">&nbsp;&nbsp;测试人员</td>
                                </tr>
                                <tr>
                                    <td class="td1 td3">申请用印单位：&nbsp;&nbsp;</td>
                                    <td class="td2 td3">&nbsp;&nbsp;信息与电气工程学院</td>
                                    <td class="td1 td3">申请人：&nbsp;&nbsp;</td>
                                    <td class="td2">&nbsp;&nbsp;测试人员</td>
                                </tr>
                            </table>
                            <div class="form-actions">
                                <button type="submit" class="btn btn-success">Save</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap-colorpicker.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap-datepicker.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.toggle.buttons.html"></script>
<script src="<%=request.getContextPath()%>/js/masked.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.uniform.js"></script>
<script src="<%=request.getContextPath()%>/js/select2.min.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.form_common.js"></script>
<script src="<%=request.getContextPath()%>/js/wysihtml5-0.3.0.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.peity.min.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap-wysihtml5.js"></script>
<script>
    $('.textarea_editor').wysihtml5();
</script>
</body>
</html>
