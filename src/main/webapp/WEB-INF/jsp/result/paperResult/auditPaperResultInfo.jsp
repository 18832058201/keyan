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
    <title>论文成果详情</title>
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
<a href="personalPaperResultEdit.jsp" class="button button-primary button-rounded button-small">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">论文成果详情</h1>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">论文题目：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;测试
            </td>
        </tr>
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;自科
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;与学科门类相关
            </td>
        </tr>
        <tr>
            <td class="right">研究类型：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;与学科门类相关
            </td>
            <td class="right left">署名情况：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;署名我校为第一单位
            </td>
        </tr>
        <tr>
            <td class="right">刊物名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;测试
            </td>
        </tr>
        <tr>
            <td class="right">刊物类型：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;期刊论文
            </td>
            <td class="right left">署名情况：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;I类A
            </td>
        </tr>
        <tr>
            <td class="right">卷号：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;26
            </td>
        </tr>
        <tr>
            <td class="right">期号：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;5
            </td>
        </tr>
        <tr>
            <td class="right">页码范围：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;110-119
            </td>
        </tr>
        <tr>
            <td class="right">出版时间：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;2017-06-16
            </td>
            <td class="right left">通讯作者：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;测试人员（00001）
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
            <td class="right">简介：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;测试
            </td>
        </tr>
        <tr>
            <td class="right">负责人：</td>
            <td colspan="3" class="ibg">测试人员1</td>
            <td class="right left">登记人：</td>
            <td colspan="4" class="ibg">测试人员2</td>
        </tr>
        <tr>
            <td class="right">所属二级单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;信息与电气工程学院,机械装备制造学院....
            </td>
        </tr>
        <tr>
            <td class="right">年度考核得分：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;30.0
            </td>
            <td class="right left">相关附件：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;上传/下载
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
                            <th colspan="2" class="left">排名调整</th>
                            <th class="left">删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td colspan="2" class="align-center">测试人员（00002）</td>
                            <td colspan="3" class="left align-center" >信息与电气工程学院</td>
                            <td colspan="2" class="left align-center"></td>
                            <td class="left align-center" ></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
        <!--功能相关js-->
        <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/addPerson.js"></script>
        <!--end :人员选择--->
        <%--start：论文收录--%>
        <tr>
            <td class="right">收录情况列表：</td>
            <td colspan="8" class="ibg">
                <div class="table-container">
                    <table style="border: 1px solid black;width: 100%;table-layout:fixed;" id="includeTable">
                        <thead>
                        <tr>
                            <th colspan="2">收录时间</th>
                            <th colspan="2" class="left">收录工具</th>
                            <th colspan="2" class="left">收录号</th>
                            <th colspan="2" class="left">审核状态</th>
                            <th class="left">删除</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td colspan="2" class="align-center">测试人员（00002）</td>
                            <td colspan="2" class="left align-center" >信息与电气工程学院</td>
                            <td colspan="2" class="left align-center" >ABCDEF1234</td>
                            <td colspan="2" class="left align-center" >待审核</td>
                            <td class="left align-center" ></td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </td>
        </tr>
        <script src="<%=request.getContextPath()%>/js/addPaperInclude.js"></script>
        <%--end：论文收录--%>
    </table>
</form>
<%--按钮end--%>
</body>
</html>
