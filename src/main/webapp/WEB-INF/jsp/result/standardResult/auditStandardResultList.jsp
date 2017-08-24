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
    <title>标准成果列表</title>
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
    <div id="content-header">
        <%--按钮start--%>
        <br>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <c:if test="${auditType eq 1}">
            <a href="javascript:agree()" class="button button-primary button-rounded button-small">审核通过</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a href="javascript:refuse()" class="button button-primary button-rounded button-small">审核不通过</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
        </c:if>
        <c:if test="${auditType eq 2}">
            <a href="javascript:revoke()" class="button button-primary button-rounded button-small">撤销审核</a>
            &nbsp;&nbsp;&nbsp;&nbsp;
        </c:if>
        <a href="" class="button button-primary button-rounded button-small">导出到Excel</a>
        <%--按钮end--%>
    </div>
    <br>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title" style="line-height: 36px;"><span class="icon"><i class="icon-th"></i></span>
                        <label style="float:left;padding-top: 7px;padding-left: 20px;">标准成果列表，共有&nbsp;&nbsp;${standardResultList.size()}&nbsp;&nbsp;条数据</label>
                        <label style="float:right;padding-top: 7px;padding-right: 30px;"><a href="<%=request.getContextPath()%>/audit/toStandardResultListAudit.action?auditType=2"><input type="radio" name="radio" ${auditType eq 2?'checked="checked"':""}>已审核</a></label>
                        <label style="float:right;padding-top: 7px;"><a href="<%=request.getContextPath()%>/audit/toStandardResultListAudit.action?auditType=1"><input type="radio" name="radio" ${auditType eq 1?'checked="checked"':""}>待审核</a>&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <label style="float:right;padding-top: 7px;"><a href="<%=request.getContextPath()%>/audit/toStandardResultListAudit.action?auditType=3"><input type="radio" name="radio" ${auditType eq 3?'checked="checked"':""}>全部</a>&nbsp;&nbsp;&nbsp;&nbsp;</label>
                        <label style="float: right;padding-top: 7px;"> 请选择状态：&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    </div>
                    <div class="widget-content nopadding">
                        <form action="" method="post" class="form-horizontal" id="subForm">
                            <input type="hidden" id="auditOpinion" name="auditOpinion">  <%--设置审核意见隐藏域--%>
                        <table class="table table-bordered data-table" style="table-layout:fixed;">
                            <thead class="table">
                            <tr>
                                <th style="text-align: center;width: 5%;"><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox"/></th>
                                <th style="text-align: center;width: 20%;">标准号</th>
                                <th style="text-align: center;width: 10%;">学科门类</th>
                                <th style="text-align: center;width: 10%;">作者</th>
                                <th style="text-align: center;width: 10%;">标准状态</th>
                                <th style="text-align: center;width: 10%;">行业分类</th>
                                <th style="text-align: center;width: 10%;">实施日期</th>
                                <th style="text-align: center;width: 10%;">审核状态</th>
                                <th style="text-align: center;width: 5%;">附件</th>
                                <c:if test="${auditType eq 1}">
                                    <th style="text-align: center;width: 5%;">操作</th>
                                </c:if>
                            </tr>
                            </thead>
                            <tbody class="table">
                            <c:forEach items="${standardResultList}" var="standard">
                            <tr class="gradeX">
                                <td><input type="checkbox" name="auditObjectId" value="${standard.standardId}"></td>
                                <td><a href="<%=request.getContextPath()%>/audit/viewStandardResultInfo.action?id=${standard.standardId}&auditType=${auditType}">${standard.standNumber}</a></td>
                                <td>${standard.subjectTypeName}</td>
                                <td>${standard.personList}</td>
                                <td>${standard.standStateName}</td>
                                <td>${standard.standBusinessName}</td>
                                <td>${ds.format(standard.implementDate)}</td>
                                <td>${standard.auditStatusName}</td>
                                <td>
                                    <c:choose>
                                        <c:when test="${!empty standard.attachment}">
                                            <a href="<%=request.getContextPath()%>/file/fileDownload.action?fileName=${standard.attachment}">下载</a>
                                        </c:when>
                                        <c:otherwise>
                                            无
                                        </c:otherwise>
                                    </c:choose>
                                </td>
                                <c:if test="${auditType eq 1}">
                                    <td>
                                        <a href="<%=request.getContextPath()%>/result/standardResult/toEditStandardResult.action?editType=audit&standardId=${standard.standardId}">编辑</a>
                                    </td>
                                </c:if>
                            </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
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
    /**
     *审核通过
     */
    function agree() {
        //至少勾选了一项才能提交审核
        if(isChecked()){
            var auditOpinion = prompt("审核意见", '通过审核');    //设置审核意见
            if(auditOpinion){  //确定审核操作
                $("#auditOpinion").val(auditOpinion);                                  //设置审核意见隐藏域的值
                $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitStandardResultAudit.action?operation=agree");   //修改提交路径
                $("#subForm").submit();                                                //提交表单
            }else {
                alert("提示：您已取消审核操作");
            }
        }
    }

    /**
     *审核不通过
     */
    function refuse() {
        //至少勾选了一项才能提交审核
        if(isChecked()){
            var auditOpinion = prompt("审核意见", '审核不通过');    //设置审核意见
            if(auditOpinion){  //确定审核操作
                $("#auditOpinion").val(auditOpinion);
                $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitStandardResultAudit.action?operation=refuse");   //修改提交路径
                $("#subForm").submit();                                                //提交表单
            }else {
                alert("提示：您已取消审核操作");
            }
        }
    }
    /**
     *撤销审核
     */
    function revoke() {
        //至少勾选了一项才能提交审核
        if(isChecked()){
            if(confirm("提示：撤销审核后将重新进入待审核状态，继续撤销吗？")){
                $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitStandardResultAudit.action?operation=revoke");   //修改提交路径
                $("#subForm").submit();
            }
            else {
                alert("提示：您已取消审核操作");
            }
            //提交表单
        }
    }

    /**
     * 验证是否勾选
     * 返回false表示未勾选，返回true表示至少勾选了一项
     */
    function isChecked() {
        var flag = false;
        $("input[name='auditObjectId']").each(function () {
            if($(this).is(':checked')){
                flag = true;
                return;  //如果有选中的结束遍历
            }
        });
        if(!flag){
            alert("提示：请至少勾选一项");
        }
        return flag;
    }

</script>
</body>
</html>

