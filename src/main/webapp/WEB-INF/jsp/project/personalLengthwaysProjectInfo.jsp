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
    <title>纵向项目信息详情</title>
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

<%--引入文件上传相关内容--%>
<jsp:include page="../fileUpload.jsp"/>

<%--按钮start--%>
<br>
<c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="<%=request.getContextPath()%>/project/toEditLengthWaysProject.action?projectId=${projectInfo.projectId}" class="button button-primary button-rounded button-small">编辑项目信息</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="personalLengthwaysProjectBudget.jsp" class="button button-primary button-rounded button-small">预算调整</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="personalLengthwaysProjectEnd.jsp" class="button button-primary button-rounded button-small">项目结题</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="personalLengthwaysProjectEndEdit.jsp" class="button button-primary button-rounded button-small">编辑结题信息</a>
</c:if>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">纵向项目信息详情</h1>
<br>
<div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    &nbsp;&nbsp;&nbsp;&nbsp;第一部分：项目基本信息&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
    <a href="<%=request.getContextPath()%>/project/toEditLengthWaysProject.action?projectId=${projectInfo.projectId}"><label class="required">编辑此部分</label></a>
</c:if>
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
</div>
<br>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${projectInfo.subjectTypeName}
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${projectInfo.subjectFirstName}
            </td>
        </tr>
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${projectInfo.projectName}
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${projectInfo.projectNumber}
            </td>
            <td class="right left">项目性质：</td>
            <td colspan="4" class="ibg">&nbsp;&nbsp;纵向项目</td>
        </tr>
        <tr>
            <td class="right">项目来源：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${projectInfo.projectSourceName}
            </td>
            <td class="right left">批准时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(projectInfo.approveDate)}
            </td>
        </tr>
        <tr>
            <td class="right">项目类型：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${projectInfo.projectType1Name}
                &nbsp;&nbsp;${projectInfo.projectType2Name}
            </td>
        </tr>
        <tr>
            <td class="right">研究类别：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${projectInfo.researchTypeName}
            </td>
            <td class="right left">组织形式：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${projectInfo.organizationFormName}
            </td>
        </tr>
        <c:if test="${projectInfo.subjectTypeId eq 1}">
            <tr>
                <td class="right">独立/合作研究：</td>
                <td colspan="8" class="ibg">
                    &nbsp;&nbsp;${projectInfo.cooperationTypeName}
                </td>
            </tr>
        </c:if>
        <c:if test="${projectInfo.subjectTypeId eq 2}">
            <tr>
                <td class="right">社会经济目标：</td>
                <td colspan="8" class="ibg">
                    &nbsp;&nbsp;${projectInfo.economicsTargetName}
                </td>
            </tr>
        </c:if>
        <tr>
            <td class="right">协作单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${projectInfo.cooperationUnit}
            </td>
        </tr>
        <tr>
            <td class="right">服务的国民经济行业：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${projectInfo.economicsIndustry1Name}
                &nbsp;&nbsp;${projectInfo.economicsIndustry2Name}
                &nbsp;&nbsp;${projectInfo.economicsIndustry3Name}
            </td>
        </tr>
        <tr>
            <td class="right">预期成果形式：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${projectInfo.resultForm}
            </td>
        </tr>
        <tr>
            <td class="right">研究起始时间：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${ds.format(projectInfo.startDate)}
            </td>
            <td class="right left">预期终止时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(projectInfo.expectEndDate)}
            </td>
        </tr>
        <tr>
            <td class="right">批准经费：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${projectInfo.approveMoney}
            </td>
        </tr>
        <tr>
            <td class="right">是否已中期检查：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${projectInfo.inspect eq 1 ? "是" : "否"}
            </td>
            <td class="right left">是否重点项目：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${projectInfo.important eq 1? "是": "否"}
            </td>
        </tr>
        <tr>
            <td class="right">项目所属类型：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${projectInfo.projectDomainName}
            </td>
            <td class="right left">项目等级：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${projectInfo.projectGradeName}
            </td>
        </tr>
        <%--<tr>--%>
            <%--<td class="right">是否重点项目：</td>--%>
            <%--<td colspan="8" class="ibg">--%>
                <%--&nbsp;&nbsp;${projectInfo.important eq 1? "是": "否"}--%>
            <%--</td>--%>
        <%--</tr>--%>
        <tr>
            <td class="right">研究要点及目标：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${projectInfo.remark}
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">&nbsp;&nbsp;${projectInfo.leader}</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">&nbsp;&nbsp;${projectInfo.registrant}</td>
        </tr>
        <tr>
            <td class="right">所属二级单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;${personList.get(0).collegeName}   <%--取人员列表中第一个人的学院--%>
            </td>
        </tr>
        <tr>
            <td class="right">年度考核得分：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${projectInfo.score}
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">&nbsp;&nbsp;
                <c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
                    <c:if test="${empty projectInfo.attachment}">
                        <a href="javascript:void(0)" data-reveal-id="myModal"data-animation="fade" onclick="fileUpload('${projectInfo.projectId}')">上传</a>
                    </c:if>
                </c:if>
                <c:if test="${!empty projectInfo.attachment}">
                    <c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
                    <a href="javascript:void(0)" data-reveal-id="myModal"data-animation="fade" onclick="fileUpload('${projectInfo.projectId}')">重新上传</a>
                    </c:if>
                    <a href="javascript:void(0)" onclick="fileDownload('${projectInfo.attachment}')">下载</a>
                </c:if>
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
        <!--end :人员选择--->
        <!--strat:相关成果-->
        <tr>
            <td class="right">相关成果列表：</td>
            <td colspan="8" class="ibg">
                <div class="table-container">
                    <table style="border: 1px solid black;width: 100%;table-layout:fixed;" id="">
                        <thead>
                        <tr>
                            <th colspan="4">成果名称</th>
                            <th colspan="2" class="left">所属单位</th>
                            <th class="left">负责人</th>
                            <th class="left">删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td colspan="4" class="align-center">测试成果</td>
                            <td colspan="2" class="left align-center">信息与电气工程学院</td>
                            <td class="left align-center">测试人员</td>
                            <td class="left align-center"></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
        <!--end:相关成果-->
    </table>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第二部分：经费到款信息&nbsp;&nbsp;&nbsp;&nbsp;
    <c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
        <a href="personalLengthwaysProjectBudget.jsp"><label class="required">编辑此部分</label></a>
    </c:if>
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <thead>
        <tr>
            <th colspan="3" class="right">到款日期</th>
            <th colspan="2" class="right">到款金额<label class="required">（元）</label></th>
            <th colspan="2" class="right">直接经费<label class="required">（元）</label></th>
            <th colspan="2" class="right">科研管理费<label class="required">（元）<br>（横向3%，纵向5%）</label></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">2017-06-16</td>
            <td colspan="2" class="right" style="text-align: center;">1000</td>
            <td colspan="2" class="right" style="text-align: center;">950</td>
            <td colspan="2" class="right" style="text-align: center;">50</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">2017-06-16</td>
            <td colspan="2" class="right" style="text-align: center;">2000</td>
            <td colspan="2" class="right" style="text-align: center;">1900</td>
            <td colspan="2" class="right" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">2017-06-16</td>
            <td colspan="2" class="right" style="text-align: center;">3000</td>
            <td colspan="2" class="right" style="text-align: center;">2850</td>
            <td colspan="2" class="right" style="text-align: center;">150</td>
        </tr>
        </tbody>
        <tfoot>
        <tr>
            <td colspan="3" class="right" style="text-align: center;border: 1px solid black;">总计</td>
            <td colspan="2" class="right" style="text-align: center;border: 1px solid black;">3000</td>
            <td colspan="2" class="right" style="text-align: center;border: 1px solid black;">2850</td>
            <td colspan="2" class="right" style="text-align: center;border: 1px solid black;">150</td>
        </tr>
        </tfoot>
    </table>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第三部分：经费预算信息&nbsp;&nbsp;&nbsp;&nbsp;
        <c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
            <a href="personalLengthwaysProjectBudget.jsp"><label class="required">预算调整</label></a>
        </c:if>
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <thead>
        <tr>
            <th colspan="3" class="right">科目</th>
            <th colspan="1.5" class="right">预算金额<label class="required">（元）</label></th>
            <th colspan="1.5" class="right">可用金额<label class="required">（元）</label></th>
            <th colspan="1.5" class="right">已报销金额<label class="required">（元）</label></th>
            <th colspan="1.5">可用余额<label class="required">（元）</label></th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">出版/文献/信息传播/知识产权事务费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.publishTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">材料费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.materialsTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">测试化验加工费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.testTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">燃料动力费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.fuelTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">差旅费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.travelTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">会议费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.meetTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr><tr>
            <td colspan="3" class="right" style="text-align: center;">国际合作与交流费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.internationalTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">设备费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.facilityTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">劳务费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.labourTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">专家咨询费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.expertTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">资料费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.datumTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">数据采集费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.dataTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">印刷费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.printTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <%--<tr>--%>
            <%--<td colspan="3" class="right" style="text-align: center;">管理费：</td>--%>
            <%--<td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.manageTotal}</td>--%>
            <%--<td colspan="1.5" class="right" style="text-align: center;">500</td>--%>
            <%--<td colspan="1.5" class="right" style="text-align: center;">400</td>--%>
            <%--<td colspan="1.5" class="ibg" style="text-align: center;">100</td>--%>
        <%--</tr>--%>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">其他经费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.otherTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">科研管理费：</td>
            <td colspan="4" style="text-align: center;">&nbsp;&nbsp;${budgetMoney.manageTotal}
                <label class="required">（注：科研管理费为间接经费，直接扣除，可在科研管理费条目下进行申请）</label>
            </td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">绩效支出：</td>
            <td colspan="1.5" class="right" style="text-align: center;">${budgetMoney.postTotal}</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        </tbody>
        <tfoot>
        <tr>
            <td colspan="3" class="right" style="text-align: center;border: 1px solid black;">总计：</td>
            <td colspan="1.5" class="right" style="text-align: center;border: 1px solid black;">8000</td>
            <td colspan="1.5" class="right" style="text-align: center;border: 1px solid black;">5000</td>
            <td colspan="1.5" class="right" style="text-align: center;border:1px solid black;">4000</td>
            <td colspan="1.5" class="ibg" style="text-align: center;border: 1px solid black;">1000</td>
        </tr>
        </tfoot>
    </table>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第四部分：经费报销信息&nbsp;&nbsp;&nbsp;&nbsp;
<c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
        <a href=""><label class="required">编辑此部分</label></a>
</c:if>
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <thead>
        <tr>
            <th colspan="1" class="right">报销申请编号<label class="required"><br>（编号唯一，系统自动生成）</label></th>
            <th colspan="1" class="right">报销申请日期</th>
            <th colspan="2" class="right">报销申请总金额<label class="required">（元）</label></th>
            <th colspan="2" class="right">报销申请人</th>
            <th colspan="2" class="right">审核状态</th>
            <th colspan="1" class="right">有效时间</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="1" class="right" style="text-align: center;"><a herf="">ABCDEF1234</a></td>
            <td colspan="1" class="right" style="text-align: center;">2017-06-16</td>
            <td colspan="2" class="right" style="text-align: center;">500</td>
            <td colspan="2" class="right" style="text-align: center;">测试人员</td>
            <td colspan="2" class="right" style="text-align: center;">项目组负责人不通过</td>
            <td colspan="1" class="right" style="text-align: center;">2017-06-16</td>
        </tr>
        </tbody>
    </table>
    <br>
    <div style="width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第五部分：项目结题信息&nbsp;&nbsp;&nbsp;&nbsp;
            <c:if test="${(activeUser.workNameAndNum eq projectInfo.registrant)&&(projectInfo.isEdit eq 1)}">
        <a href="personalLengthwaysProjectEndEdit.jsp"><label class="required">编辑此部分</label></a>
            </c:if>
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">验收单位：</td>
            <td colspan="8" class="ibg">&nbsp;&nbsp;河北工程大学
            </td>
        </tr>
        <tr>
            <td class="right">验收形式：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;书面审核验收
            </td>
            <td class="right left">验收时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;2017-06-16
            </td>
        </tr>
        <tr>
            <td class="right">完成人员：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;测试人员1,测试人员2,测试人员3
            </td>
        </tr>
        <tr>
            <td class="right">最终成果形式：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;论文*3 著作*5
            </td>
        </tr>
        <tr>
            <td class="right">验收结果：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;验收通过
            </td>
        </tr>
        <tr>
            <td class="right">完成单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;信息与电气工程学院,机械装备制造学院....
            </td>
        </tr>
    </table>
    <br>
</form>
<%--按钮end--%>



</body>
</html>
