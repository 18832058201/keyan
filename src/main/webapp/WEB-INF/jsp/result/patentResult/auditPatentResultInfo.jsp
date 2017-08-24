<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/10
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>专利成果详情</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <style type="text/css">
        .table-container {
            overflow: auto;
            display: block;
        }
    </style>
</head>
<body>
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
<h1 class="title-h1">获奖成果详情</h1>
<%--表单start--%>
<form action="" method="post" id="subForm">
    <input type="hidden" id="auditOpinion" name="auditOpinion">  <%--设置审核意见隐藏域--%>
    <input type="hidden" name="auditObjectId" value="${patentResultInfo.patentId}"> <%--设置专利成果id--%>
</form>
<%--表单end--%>

<table style="table-layout:fixed;">
    <tr>
        <td class="right">专利名称：</td>
        <td colspan="8" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.patentName}
        </td>
    </tr>
    <tr>
        <td class="right">学科门类：</td>
        <td colspan="3" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.subjectTypeName}
        </td>
        <td class="right left">所属学科：</td>
        <td colspan="4" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.subjectFirstName}
        </td>
    </tr>
    <tr>
        <td class="right">专利类型：</td>
        <td colspan="8" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.patTypeName}
        </td>
    </tr>
    <tr>
        <td class="right">专利权人：</td>
        <td colspan="8" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.patentee}
        </td>
    </tr>
    <tr>
        <td class="right">申请号：</td>
        <td colspan="3" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.applyNumber}
        </td>
        <td class="right left">专利号：</td>
        <td colspan="4" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.patentNumber}
        </td>
    </tr>
    <tr>
        <td class="right">证书编号：</td>
        <td colspan="3" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.patCertificateNum}
        </td>
        <td class="right left">证书日期：</td>
        <td colspan="4" class="ibg">
            &nbsp;&nbsp;${ds.format(patentResultInfo.certificateDate)}
        </td>
    </tr>
    <tr>
        <td class="right">专利申请日期：</td>
        <td colspan="3" class="ibg">
            &nbsp;&nbsp;${ds.format(patentResultInfo.patApplyDate)}
        </td>
        <td class="right left">授权公告日：</td>
        <td colspan="4" class="ibg">
            &nbsp;&nbsp;${ds.format(patentResultInfo.empowerDate)}
        </td>
    </tr>
    <tr>
        <td class="right">奖励金额：</td>
        <td colspan="8" class="ibg">
            ${patentResultInfo.bonus}
            <label class="required">（元）</label>
        </td>
    </tr>
    <tr>
        <td class="right">专利简介：</td>
        <td colspan="8" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.remark}
        </td>
    </tr>
    <tr>
        <td class="right">负责人：</td>
        <td colspan="3" class="ibg">${patentResultInfo.leader}</td>
        <td class="right left">登记人：</td>
        <td colspan="4" class="ibg">${patentResultInfo.registrant}</td>
    </tr>
    <tr>
        <td class="right">所属二级单位：</td>
        <td colspan="8" class="ibg">
            &nbsp;&nbsp;${personList[0].collegeName}
        </td>
    </tr>
    <tr>
        <td class="right">年度考核得分：</td>
        <td colspan="3" class="ibg">
            &nbsp;&nbsp;${patentResultInfo.score}
        </td>
        <td class="right left">相关附件：</td>
        <td colspan="4" class="ibg">&nbsp;&nbsp;
            <c:choose>
                <c:when test="${!empty patentResultInfo.attachment}">
                    <a href="<%=request.getContextPath()%>/file/fileDownload.action?fileName=${patentResultInfo.attachment}">下载</a>
                </c:when>
                <c:otherwise>
                    无
                </c:otherwise>
            </c:choose>
        </td>
        </td>
    </tr>
    <!--start :人员选择--->
    <tr>
        <td class="right">人员列表：</td>
        <td colspan="8" class="ibg">
            <div class="table-container">
                <table style="border: 1px solid black;width: 100%;table-layout:fixed;" id="personTable">
                    <thead>
                    <tr>
                        <th colspan="2">姓名（工号）</th>
                        <th colspan="3" class="left">所属单位</th>
                        <th colspan="2" class="left">人员类别</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${personList}" var="personal">
                        <tr>
                            <td colspan="2" class="align-center">${personal.workName}</td>
                            <td colspan="3" class="left align-center">${personal.collegeName}</td>
                            <td colspan="2" class="left align-center">
                                <c:if test="${personal.personType eq 1}">本校职工</c:if>
                                <c:if test="${personal.personType eq 2}">本校学生</c:if>
                                <c:if test="${personal.personType eq 3}">校外人员</c:if>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </td>
    </tr>
</table>

<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script>
    /**
     *审核通过
     */
    function agree() {
        var auditOpinion = prompt("审核意见", '通过审核');    //设置审核意见
        if(auditOpinion){  //确定审核操作
            $("#auditOpinion").val(auditOpinion);                                  //设置审核意见隐藏域的值
            $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitPatentResultAudit.action?operation=agree");   //修改提交路径
            $("#subForm").submit();                                                //提交表单
        }else {
            alert("提示：您已取消审核操作");
        }
    }

    /**
     *审核不通过
     */
    function refuse() {
        var auditOpinion = prompt("审核意见", '审核不通过');    //设置审核意见
        if(auditOpinion){  //确定审核操作
            $("#auditOpinion").val(auditOpinion);
            $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitPatentResultAudit.action?operation=refuse");   //修改提交路径
            $("#subForm").submit();                                                //提交表单
        }else {
            alert("提示：您已取消审核操作");
        }

    }
    /**
     *撤销审核
     */
    function revoke() {
        if(confirm("提示：撤销审核后将重新进入待审核状态，继续撤销吗？")){
            $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitPatentResultAudit.action?operation=revoke");   //修改提交路径
            $("#subForm").submit();
        }
        else {
            alert("提示：您已取消审核操作");
        }

    }
</script>
</body>
</html>
