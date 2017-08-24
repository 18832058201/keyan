<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  作者：张彤
  时间：2017/7/31 20:59
  描述：成果级别列表
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>成果级别-系统维护</title>
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
    <form action="<%=request.getContextPath()%>/insertIdenResultLevel.action" class="form-horizontal" method="post"
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
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">成果级别列表，共有&nbsp;&nbsp;${idenResultLevelList.size()}&nbsp;&nbsp;条数据</label>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 10%;">编号</th>
                                    <th style="text-align: center;width: 30%;">成果级别名称</th>
                                    <th style="text-align: center;width: 20%;">考核得分</th>
                                    <th style="text-align: center;width: 20%;">当前状态</th>
                                    <th style="text-align: center;width: 20%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <%--数据库中查询的数据--%>
                                <c:forEach items="${idenResultLevelList}" var="idenResultLevel">
                                    <tr class="gradeX">
                                        <td>${idenResultLevel.resultLevelId}</td>
                                        <td>${idenResultLevel.resultLevelName}</td>
                                        <td>${idenResultLevel.score}</td>
                                        <td>${idenResultLevel.isEffective eq 1 ? "有效":"无效"}</td>
                                        <td>
                                            <a href="javascript:void(0)" onclick="toEdit(this)">编辑</a>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <a href="javascript:void(0)" onclick="updateIsEffective(${idenResultLevel.resultLevelId},0)" ${idenResultLevel.isEffective eq 1 ? 'style=""':'style="display:none"'}>置为无效</a>
                                            <a href="javascript:void(0)" onclick="updateIsEffective(${idenResultLevel.resultLevelId},1)" ${idenResultLevel.isEffective eq 0 ? 'style=""':'style="display:none"'}>设为有效</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                <tfoot>
                                <%--新增行数据--%>
                                <tr class="gradeX">
                                    <td></td>
                                    <td><input type="text" name="resultLevelName" onblur="nameIsExisted(this.value,'/resultLevelNameIsExisted.action')" style="width: 80%;height:30px"/></td>
                                    <td><input type="text" value="0" name="score" style="width: 80%;height:30px"></td>
                                    <td>
                                        <select name="isEffective" style="width: 80%;height:30px">
                                            <option value="1">有效</option>
                                            <option value="0">无效</option>
                                        </select></td>
                                    <td><a href="javascript:void(0)" onclick="insertIdenResultLevel()">新增</a></td>
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
    //编辑
    function toEdit(obj){
        //获取到编辑按钮当前的行元素
        var tr = $(obj).parent().parent();  //$(obj)为a标签对象，父元素是td，再父元素就是tr对象
        if($(obj).html()==="编辑"){
            $(obj).html("保存");  //点击编辑后将按钮设置为保存
            //获取到第二列元素
            var td2 = tr.find("td").eq(1);
            td2.html('<input type="text" name="resultLevelName" style="width: 80%;height:30px" value="'+ td2.html() +'">');
            //获取到第三列元素
            var td3 = tr.find("td").eq(2);
            td3.html('<input type="text" name="score" style="width: 80%;height:30px" value="'+ td3.html() +'">');
        }else{
            var resultLevelId = tr.find("td").eq(0).html(); //获取成果级别id
            var resultLevelName = tr.find("td").eq(1).find("input").val();  //获取成果级别名称
            var score = tr.find("td").eq(2).find("input").eq(0).val();   //获取考核得分
            location.href ="updateIdenResultLevel.action?resultLevelName="+ resultLevelName +"&score="+ score +"&resultLevelId="+ resultLevelId +"";
        }
    }

    //更新是否有效状态
    function updateIsEffective(resultLevelId,isEffective) {
        if (confirm("确认更新吗？")) {
            location.href = "updateIdenResultLevel.action?resultLevelId=" + resultLevelId + "&isEffective="+ isEffective +"";
        }
    }

    //插入数据
    function insertIdenResultLevel() {
        if (confirm("确认新增吗？")) {
            $("#insertForm").submit();
        }
    }
</script>

<%--返回异常信息--%>
<c:if test="${!empty exceptionMessage}">
    <script>
        alert('${exceptionMessage}');
    </script>
</c:if>

</body>
</html>
