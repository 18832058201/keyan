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
    <title>项目所属领域-系统维护</title>
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
</head>
<body>
<div id="content">
    <form action="<%=request.getContextPath()%>/insertProProjectDomain.action" class="form-horizontal" method="post"
          id="insertForm">
        <div id="content-header">
            <%--按钮start--%>
            <br>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="" class="button button-primary button-rounded button-small">导出到Excel</a>
            <%--按钮end--%>
        </div>
        <br>
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="span12">
                    <div class="widget-box">
                        <div class="widget-title" style="line-height: 36px;"><span class="icon"><i class="icon-th"></i></span>
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">项目所属领域列表，共有&nbsp;&nbsp;${ProProjectDomainCount}&nbsp;&nbsp;条数据</label>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 10%;">编号</th>
                                    <th style="text-align: center;width: 30%;">项目所属领域</th>
                                    <th style="text-align: center;width: 10%;">倍率</th>
                                    <th style="text-align: center;width: 15%;">当前状态</th>
                                    <th style="text-align: center;width: 15%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <%--数据库中查询的数据--%>
                                <c:forEach items="${ProProjectDomainList}" var="ProProjectDomain">
                                    <tr class="gradeX">
                                        <td>${ProProjectDomain.projectDomainId}</td>
                                        <td>${ProProjectDomain.projectDomainName}</td>
                                        <td>${ProProjectDomain.rate}</td>
                                        <td>${ProProjectDomain.isEffective eq 1 ? "有效":"无效"}</td>
                                        <td>
                                            <%--<a href="javascript:void(0)" onclick="window.showModalDialog('personalTransformationProjectEnd.jsp','mewwindow','dialogWidth=1000px;dialogHeight=600px,center=yes')">编辑</a>--%>
                                            <a href="javascript:void(0)" onclick="toEdit(this)">编辑</a>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <a href="javascript:void(0)" onclick="updateIsEffective(${ProProjectDomain.projectDomainId},0)" ${ProProjectDomain.isEffective eq 1 ? 'style=""':'style="display:none"'}>置为无效</a>
                                            <a href="javascript:void(0)" onclick="updateIsEffective(${ProProjectDomain.projectDomainId},1)" ${ProProjectDomain.isEffective eq 0 ? 'style=""':'style="display:none"'}>设为有效</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                <tfoot>
                                <%--新增行数据--%>
                                <tr class="gradeX">
                                    <td></td>
                                    <td><input type="text" name="projectDomainName" style="width: 80%;height:30px"/></td>
                                    <td><input type="text" value="0" name="rate" style="width: 80%;height:30px"></td>
                                    <td>
                                        <select name="isEffective" style="width: 80%;height:30px">
                                            <option value="1">有效</option>
                                            <option value="0">无效</option>
                                        </select></td>
                                    <td><a href="javascript:void(0)" onclick="insertProProjectDomain()">新增</a></td>
                                </tr>
                                </tfoot>
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
<%--实现表格数据的排序等功能--%>
<script src="<%=request.getContextPath()%>/js/matrix.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.tables.js"></script>
<%--实现表格的分页等功能--%>
<script src="<%=request.getContextPath()%>/js/common.js"></script>

<script>
    //插入数据
    function insertProProjectDomain() {
        if (confirm("确认新增吗？")) {
            $("#insertForm").submit();
        }
    }
    //更新是否有效状态
    function updateIsEffective(projectDomainId,isEffective) {
        if (confirm("确认更新吗？")) {
            location.href = "updateProProjectDomain.action?projectDomainId=" + projectDomainId + "&isEffective="+isEffective+"";
        }
    }

    //编辑
    function toEdit(obj){
        //获取到编辑按钮当前的行元素
        var tr = $(obj).parent().parent();  //$(obj)为a标签对象，父元素是td，再父元素就是tr对象
        if($(obj).html()==="编辑"){
            $(obj).html("保存");  //点击编辑后将按钮设置为保存
            //获取到第二列元素
            var td2 = tr.find("td").eq(1);
            td2.html('<input type="text" name="projectDomainName" style="width: 80%;height:30px" value="'+td2.html()+'">');
            //获取到第四列元素
            var td4 = tr.find("td").eq(2);
            td4.html('<input type="text" name="rate" style="width: 80%;height:30px" value="'+td4.html()+'">');
        }else{
            var projectDomainId = tr.find("td").eq(0).html();
            var projectDomainName = tr.find("td").eq(1).find("input").val();
            var rate = tr.find("td").eq(2).find("input").eq(0).val();
            location.href ="/updateProProjectDomain.action?projectDomainName="+projectDomainName+"&rate="+rate+"&projectDomainId="+projectDomainId+"";
        }
    }
</script>

<%--返回异常信息--%>
<c:if test="${!empty exceptionMessage}">
    <script>
        alert('${exceptionMessage}');
    </script>
</c:if>


<%--通过ajax检测是否存在重名情况--%>
<%--这里由于有自社科区分，可以存在同名情况，所以此处不需要验证同名情况--%>
<%--<script>
    function rewClassIsExisted(rewClassName) {
        $.ajax({
            type: "POST",                      //请求的方式
            url: "/rewClassIsExisted.action",  //ajax请求的地址
            dataType: "json",                  //数据类型为json
            data: {rewClassName: rewClassName}, //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
            success: function (data) {         //服务器执行成功调用此方法，data为服务器返回的数据
                if (data) {
                    alert("该获奖类别名称已存在，请重新输入！");
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }
</script>--%>

<%--通过ajax检测是否存在重名情况--%>
<%--由于表格js原因，以下方法在此不适用，在其他地方可用以下方法--%>
<%--<script>
    $(function () {
        $("input[name='rewClassName']").blur(function () {  //给input标签注册失焦事件
            var rewClassName = $(this).val();       //获取输入的获奖名称
            alert(rewClassName);
            $.ajax({
                type: "POST",                      //请求的方式
                url: "/rewClassIsExisted.action",  //ajax请求的地址
                dataType: "json",                  //数据类型为json
                data: {rewClassName: rewClassName}, //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的rewClassName
                success: function (data) {         //服务器执行成功调用此方法，data为服务器返回的数据
                    if(data){
                        alert("该获奖名称已存在，请重新输入！");
                    }
                },
                error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                    alert("服务器异常");
                }
            });
        });
    });
</script>--%>


</body>
</html>
