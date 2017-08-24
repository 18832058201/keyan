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
    <title>鉴定成果详情</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <style type="text/css">
        .table-container {
            overflow: auto;
            display: block;
        }

        /*hr标签样式*/
        .hrLine {
            vertical-align: middle;
            display: inline-block;
        }
    </style>
</head>
<body>
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
<h1 class="title-h1">鉴定成果信息详情</h1>
<br>
<div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
<hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
&nbsp;&nbsp;&nbsp;&nbsp;鉴定成果基本信息&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${auditType eq 1}">
    <a href="<%=request.getContextPath()%>/result/identifyResult/toEditIdentifyResult.action?editType=audit&identifyId=${identifyResultInfo.identifyId}"><label class="required">编辑此部分</label></a>
</c:if>
<hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
</div>
<%--表单start--%>
<form action="" method="post" id="subForm">
    <input type="hidden" id="auditOpinion" name="auditOpinion">  <%--设置审核意见隐藏域--%>
    <input type="hidden" name="auditObjectId" value="${identifyResultInfo.identifyId}"> <%--设置鉴定成果id--%>
</form>
<%--表单end--%>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectName}
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.subjectTypeName}
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.subjectFirstName}
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectNumber}
            </td>
            <td class="right left">项目来源：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectSourceName}
            </td>
        </tr>
        <tr>
            <td class="right">项目类型：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.projectType1Name}&nbsp;&nbsp;${identifyResultInfo.projectType2Name}
            </td>
        </tr>
        <tr>
            <td class="right">研究起始时间：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${ds.format(identifyResultInfo.startDate)}
            </td>
            <td class="right left">预期终止时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(identifyResultInfo.expectEndDate)}
            </td>
        </tr>
        <tr>
            <td class="right">成果形式：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.resultForm}
            </td>
        </tr>
        <td class="right">成果级别：</td>
        <td colspan="8" class="ibg">
            &nbsp;&nbsp;${identifyResultInfo.resultLevelName}
        </td>
        <tr>
            <td class="right">鉴定单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.identifyUnit}
            </td>
        </tr>
        <tr>
            <td class="right">鉴定形式：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.formName}
            </td>
            <td class="right left">鉴定时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(identifyResultInfo.identifyDate)}
            </td>
        </tr>
        <tr>
            <td class="right">鉴定水平：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.idenLevelName}
            </td>
            <td class="right left">鉴定证书编号：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.idenCertificateNum}
            </td>
        </tr>
        <tr>
            <td class="right">完成单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.finishUnit}
            </td>
        </tr>
        <tr>
            <td class="right">成果简介：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.remark}
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">${identifyResultInfo.leader}</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">${identifyResultInfo.registrant}</td>
        </tr>
        <tr>
            <td class="right">所属二级单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personList.get(0).collegeName}
            </td>
        </tr>
        <tr>
            <td class="right">奖励金额：</td>
            <td colspan="8" class="ibg">
                200
                <label class="required">（元）</label>
            </td>
        </tr>
        <tr>
            <td class="right">年度考核得分：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${identifyResultInfo.score}
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">&nbsp;&nbsp;
                <c:choose>
                    <c:when test="${!empty identifyResultInfo.attachment}">
                        <a href="<%=request.getContextPath()%>/file/fileDownload.action?fileName=${identifyResultInfo.attachment}">下载</a>
                    </c:when>
                    <c:otherwise>
                        无
                    </c:otherwise>
                </c:choose>
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
                            <th colspan="4" class="left">所属单位</th>
                            <th colspan="2" class="left">人员类别</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${personList}" var="person">
                            <tr>
                                <td colspan="2" class="align-center">
                                        <%--${person.workNum}--%>
                                    <c:if test="${person.personType eq 1}">${person.workName}(${person.workNum})</c:if>
                                    <c:if test="${person.personType != 1}">${person.workName}</c:if>
                                </td>
                                <td colspan="4" class="left align-center">${person.collegeName}</td>
                                <td colspan="2" class="left align-center">
                                    <c:if test="${person.personType eq 1}">本校职工</c:if>
                                    <c:if test="${person.personType eq 2}">本校学生</c:if>
                                    <c:if test="${person.personType eq 3}">校外人员</c:if>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
        <!--功能相关js-->
        <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/addPerson.js"></script>
        <!--end :人员选择--->
    </table>
<script>
    /**
     *审核通过
     */
    function agree() {
        var auditOpinion = prompt("审核意见", '通过审核');    //设置审核意见
        if(auditOpinion){  //确定审核操作
            $("#auditOpinion").val(auditOpinion);                                  //设置审核意见隐藏域的值
            $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitIdentifyResultAudit.action?operation=agree");   //修改提交路径
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
            $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitIdentifyResultAudit.action?operation=refuse");   //修改提交路径
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
            $("#subForm").attr("action","<%=request.getContextPath()%>/audit/submitIdentifyResultAudit.action?operation=revoke");   //修改提交路径
            $("#subForm").submit();
        }
        else {
            alert("提示：您已取消审核操作");
        }

    }

</script>
<br><br>
</body>
</html>
