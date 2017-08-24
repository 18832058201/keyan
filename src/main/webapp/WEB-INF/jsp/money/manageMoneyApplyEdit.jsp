<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <title>编辑科研管理费申请</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style2.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/tableStyle.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
</head>
<body>
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="javascript:void(0)" onclick="submitApply()"
   class="button button-primary button-rounded button-small">提交</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">编辑科研管理费申请</h1>
<%--表单start--%>
<form action="" method="POST" id="applyForm" enctype="multipart/form-data">
    <%--设置隐藏提交按钮--%>
    <input type="submit" style="display: none" id="subForm">
    <table style="table-layout:fixed;">
        <tr>
            <td class="right" style="padding-top: 5px;">姓名（工号）：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;${activeUser.workNameAndNum}
            </td>
            <td class="right left">申请时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;${ds.format(manageMoneyApply.applyTime)}
            </td>
            <input type="hidden" name="collegeId" id="collegeId" value="${activeUser.userInfo.collegeId2}">
            <input type="hidden" name="workNum" value="${activeUser.userId}">
            <input type="hidden" name="workName" value="${activeUser.username}">
            <input type="hidden" name="applyId" id="applyId" value="${manageMoneyApply.applyId}">
            <input type="hidden" name="submitType" id="submitType" value="edit">
        </tr>
        <tr>
            <td class="right">申请类型：</td>
            <td colspan="3" class="ibg">
                <select name="applyTypeId" id="applyTypeId" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${applyTypeList}" var="applyType">
                        <option value="${applyType.applyTypeId}" ${applyType.applyTypeId eq manageMoneyApply.applyTypeId?"selected='selected'":""}>${applyType.applyTypeName}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
            <td class="right left">申请年份：</td>
            <td colspan="4" class="ibg">
                <select name="applyYear" id="applyYear" class="select-min" required>
                    <option value="">--请选择--</option>
                    <c:forEach items="${allYearList}" var="allYear">
                        <option value="${allYear.year}" ${allYear.year eq manageMoneyApply.applyYear?"selected='selected'":""}>${allYear.year}</option>
                    </c:forEach>
                </select>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right">申请金额：</td>
            <td colspan="8" class="ibg">
                <input name="applyMoney" type="number" required value="${manageMoneyApply.applyMoney}"
                       onblur="applyMoneyIsOut(this.value,'<%=request.getContextPath()%>/manageMoney/applyMoneyIsOut.action?applyId=${manageMoneyApply.applyId}')">
                <label class="required">*（单位：元）${exceptionMessage}</label>
            </td>
        </tr>
        <tr>
            <td class="right" style="text-align: center;">指定审核人<br>注意事项：</td>
            <td colspan="8" class="ibg">
                <label class="required">
                    1. 审核人可进行模糊查询，例如输入“张”，会显示所有名字带有“张”字的人员，然后点击进行选择即可；
                    <br>2. 若下拉框中不存在需要选择的人员，请联系他本人进入该网站维护个人信息；
                    <br>3. 最少指定一级审核人，最多指定三级审核人，根据实际情况选择；
                    <br>4. 三个级别的审核人不可选同一个人；
                </label>
            </td>
        </tr>
        <tr>
            <td class="right">一级审核人：</td>
            <td colspan="8" class="ibg">
                <input list="auditPersonId1" name="auditPersonId1" value="${manageMoneyApply.auditPersonId1}" style="width: 200px;" required/>
                <datalist id="auditPersonId1">
                    <c:forEach items="${allPersonList}" var="allPerson">
                        <option value="${allPerson.workName}(${allPerson.workNum})">${allPerson.workName}(${allPerson.workNum})</option>
                    </c:forEach>
                </datalist>
                <label class="required">*</label>
            </td>
        </tr>
        <tr>
            <td class="right left">二级审核人：</td>
            <td colspan="4" class="ibg">
                <input list="auditPersonId2" name="auditPersonId2" value="${manageMoneyApply.auditPersonId2}" style="width: 200px;"/>
                <datalist id="auditPersonId2">
                    <c:forEach items="${allPersonList}" var="allPerson">
                        <option value="${allPerson.workName}(${allPerson.workNum})"/>
                    </c:forEach>
                </datalist>
            </td>
        </tr>
        <tr>
            <td class="right left">三级审核人：</td>
            <td colspan="4" class="ibg">
                <input list="auditPersonId3" name="auditPersonId3" value="${manageMoneyApply.auditPersonId3}" style="width: 200px;"/>
                <datalist id="auditPersonId3">
                    <c:forEach items="${allPersonList}" var="allPerson">
                        <option value="${allPerson.workName}(${allPerson.workNum})"/>
                    </c:forEach>
                </datalist>
            </td>
        </tr>
        <tr>
            <td class="right">申请事由：</td>
            <td colspan="8" class="ibg">
                <textarea  style="width:80%;height: 100px;resize: none;" name="applyReason" required>${manageMoneyApply.applyReason}</textarea>
                <label class="required">*（200字以内）</label>
            </td>
        </tr>
        <tr>
            <td class="right">备注：</td>
            <td colspan="8" class="ibg">
                <textarea style="width:80%;height: 100px;resize: none;" name="remark" required>${manageMoneyApply.remark}</textarea>
                <label class="required">*（200字以内）</label>
            </td>
        </tr>
    </table>
    <br><br>
</form>
<script>
    /**
     * 通过ajax验证填写的申请金额是否大于可申请最大金额
     * @param applyMoney  申请金额
     * @param url  ajax请求的地址
     */
    function applyMoneyIsOut(applyMoney,url) {
        var applyTypeId = document.getElementById("applyTypeId").value;
        var applyYear = document.getElementById("applyYear").value;
        var submitType = document.getElementById("submitType").value;
        $.ajax({
            type: "POST",                   //请求的方式
            url: url,  //ajax请求的地址
            dataType: "json",                  //数据类型为json
            data: {applyMoney: applyMoney,applyTypeId: applyTypeId,applyYear: applyYear,submitType: submitType}, //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的name
            success: function (data) {         //服务器执行成功调用此方法，data为服务器返回的数据
                if (data) {
                    alert("提示：输入的申请金额超出最大可申请金额，请确认后重新输入！");
                }
            },
            error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
                alert("服务器异常");
            }
        });
    }
    //提交form表单
    function submitApply() {
        if (confirm("确定提交该申请信息吗？")) {
            //修改提交地址为 submit
            $("#applyForm").attr("action", "<%=request.getContextPath()%>/manageMoney/updateApply.action");
            $("#subForm").click(); //触发按钮提交事件
        }
    }
</script>
<%--按钮end--%>
</body>
</html>
