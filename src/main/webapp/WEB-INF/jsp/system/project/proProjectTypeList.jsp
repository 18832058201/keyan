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
    <title>项目类型-系统维护</title>
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
    <form action="<%=request.getContextPath()%>/insertProProjectType.action" class="form-horizontal" method="post"
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
                            <label style="float:left;padding-top: 7px;padding-left: 20px;">项目类型列表，共有&nbsp;&nbsp;${count}&nbsp;&nbsp;条数据</label>
                        </div>
                        <div class="widget-content nopadding">
                            <table class="table table-bordered data-table" style="table-layout:fixed;">
                                <thead class="table">
                                <tr>
                                    <th style="text-align: center;width: 10%;">编号</th>
                                    <th style="text-align: center;width: 30%;">项目类型1</th>
                                    <th style="text-align: center;width: 20%;">项目类型2</th>
                                    <th style="text-align: center;width: 20%;">学科类别</th>
                                    <th style="text-align: center;width: 15%;">当前状态</th>
                                    <th style="text-align: center;width: 15%;">操作</th>
                                </tr>
                                </thead>
                                <tbody class="table">
                                <%--数据库中查询的数据--%>
                                <c:forEach items="${type2List}" var="proProjectType2">
                                    <tr class="gradeX">
                                        <td>${proProjectType2.projectType2Id}</td>
                                        <input type="hidden" value="${ proProjectType2.projectType1Id}"/>
                                        <c:forEach items="${type1List}" var="proProjectType1">
                                            <c:if test="${proProjectType1.projectType1Id eq proProjectType2.projectType1Id}">
                                                <td>
                                                    ${proProjectType1.projectType1Name}
                                                    <%--<input type="hidden" value="${ proProjectType2.projectType1Id}"/>--%>
                                                </td>
                                                <td>${proProjectType2.projectType2Name}</td>
                                                <td>
                                                    <c:forEach items="${SubjectTypeList}" var="subjectType">
                                                        <c:if test="${subjectType.subjectTypeId eq proProjectType1.subjectTypeId}">
                                                            ${subjectType.subjectTypeName}
                                                        </c:if>
                                                    </c:forEach>
                                                    <input type="hidden" value="${ proProjectType1.subjectTypeId}"/>
                                                </td>
                                            </c:if>
                                        </c:forEach>
                                        <td>${proProjectType2.isEffective eq 1 ? "有效":"无效"}</td>
                                        <td>
                                            <%--<a href="javascript:void(0)" onclick="window.showModalDialog('personalTransformationProjectEnd.jsp','mewwindow','dialogWidth=1000px;dialogHeight=600px,center=yes')">编辑</a>--%>
                                            <a href="javascript:void(0)" onclick="toEdit(this)">编辑</a>
                                            &nbsp;&nbsp;&nbsp;&nbsp;
                                            <a href="javascript:void(0)" onclick="updateIsEffective(${proProjectType2.projectType2Id},0)" ${proProjectType2.isEffective eq 1 ? 'style=""':'style="display:none"'}>置为无效</a>
                                            <a href="javascript:void(0)" onclick="updateIsEffective(${proProjectType2.projectType2Id},1)" ${proProjectType2.isEffective eq 0 ? 'style=""':'style="display:none"'}>设为有效</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                                <tfoot>
                                <%--新增行数据--%>
                                <tr class="gradeX">
                                    <td>项目类型1</td>
                                    <td><input type="text" name="projectType1Name" style="width: 80%;height:30px"/></td>
                                    <td></td>
                                    <td>
                                        <select style="width: 80%;height:30px" name="subjectTypeId">
                                            <c:forEach items="${SubjectTypeList}" var="subjectType">
                                                <option value="${subjectType.subjectTypeId}">${subjectType.subjectTypeName}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                    <td>
                                        <%--<select name="isEffective" style="width: 80%;height:30px">--%>
                                            <%--<option value="1">有效</option>--%>
                                            <%--<option value="0">无效</option>--%>
                                        <%--</select>--%>
                                    </td>
                                    <td><a href="javascript:void(0)" onclick="insert()">新增</a></td>
                                </tr>

                                <tr class="gradeX">
                                    <td>项目类型2</td>
                                    <td>
                                        <select style="width: 80%;height:30px" name="projectType1Id">
                                            <c:forEach items="${type1List}" var="proProjectType1">
                                                <option value="${proProjectType1.projectType1Id}">${proProjectType1.projectType1Name}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                    <td><input type="text" name="projectType2Name" style="width: 80%;height:30px"/></td>
                                    <td></td>
                                    <td>
                                        <select name="isEffective" style="width: 80%;height:30px">
                                            <option value="1">有效</option>
                                            <option value="0">无效</option>
                                        </select></td>
                                    <td><a href="javascript:void(0)" onclick="insert()">新增</a></td>
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
    function insert() {
        if (confirm("确认新增吗？")) {
            $("#insertForm").submit();
        }
    }
    //更新是否有效状态
    function updateIsEffective(projectType2Id,isEffective) {
        if (confirm("确认更新吗？")) {
            location.href = "updateIsEffective.action?projectType2Id=" + projectType2Id + "&isEffective="+isEffective+"";
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
            td2.html('<input type="text" name="projectType1Name" style="width: 80%;height:30px" value="'+td2.html()+'">');
            //获取到第四列元素
            var td3 = tr.find("td").eq(2);
            td3.html('<input type="text" name="projectType2Name" style="width: 80%;height:30px" value="'+td3.html()+'">');
        }else{
            var projectType2Id = tr.find("td").eq(0).html(); //获取获奖类别id
            var projectType1Name = tr.find("td").eq(1).find("input").val();  //获取获奖类别名称
            var projectType2Name = tr.find("td").eq(2).find("input").val();
            var subjectTypeId = tr.find("td").eq(3).find("input").val();
            var projectType1Id = tr.find("input").eq(0).val();
            location.href ="/updateProProjectType.action?projectType2Id="+projectType2Id+"&projectType2Name="+projectType2Name+"&projectType1Id="+projectType1Id+"&projectType1Name="+projectType1Name+"&subjectTypeId="+subjectTypeId+"";
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
