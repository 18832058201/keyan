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
    <title>横向项目信息详情</title>
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
<%--按钮start--%>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="personalLengthwaysProjectEdit.jsp" class="button button-primary button-rounded button-small">编辑项目信息</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="personalLengthwaysProjectBudget.jsp" class="button button-primary button-rounded button-small">预算调整</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="personalLengthwaysProjectEnd.jsp" class="button button-primary button-rounded button-small">项目结题</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="personalLengthwaysProjectEndEdit.jsp" class="button button-primary button-rounded button-small">编辑结题信息</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<a href="" class="button button-primary button-rounded button-small">导出到Word</a>
<br>
<br>
<%--按钮end--%>
<h1 class="title-h1">横向项目信息详情</h1>
<br>
<div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    &nbsp;&nbsp;&nbsp;&nbsp;第一部分：项目基本信息&nbsp;&nbsp;&nbsp;&nbsp;
    <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
</div>
<br>
<%--表单start--%>
<form>
    <table style="table-layout:fixed;">
        <tr>
            <td class="right">学科门类：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;自科
            </td>
            <td class="right left">所属学科：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;所属学科
            </td>
        </tr>
        <tr>
            <td class="right">项目名称：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;测试
            </td>
        </tr>
        <tr>
            <td class="right">项目编号：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;ABCDEF1234
            </td>
            <td class="right left">合同类型：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;技术成果转让
            </td>
        </tr>
        <tr>
            <td class="right">研究类别：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;基础研究
            </td>
            <td class="right left">合同签订时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;2017-06-16
            </td>
        </tr>
        <tr>
            <td class="right">委托单位：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;河北工程大学....
            </td>
        </tr>
        <tr>
            <td class="right">服务的国民经济行业：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;农、林、牧、渔业&nbsp;&nbsp;&nbsp;&nbsp;农业
                &nbsp;&nbsp;&nbsp;&nbsp;谷物及其他作物的种植
            </td>
        </tr>
        <tr>
            <td class="right">预期成果形式：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;论文
            </td>
        </tr>
        <tr>
            <td class="right">研究起始时间：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;2017-06-16
            </td>
            <td class="right left">预期终止时间：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;2017-06-16
            </td>
        </tr>
        <tr>
            <td class="right">是否已中期检查：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;是
            </td>
        </tr>
        <tr>
            <td class="right">登记时间：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;2017-06-16
            </td>
        </tr>
        <tr>
            <td class="right">项目所属类型：</td>
            <td colspan="3" class="ibg">
                &nbsp;&nbsp;软科学
            </td>
            <td class="right">项目等级：</td>
            <td colspan="4" class="ibg">
                &nbsp;&nbsp;国家级项目
            </td>
        </tr>
        <tr>
            <td class="right">是否重点项目：</td>
            <td colspan="8" class="ibg">
                &nbsp;&nbsp;是
            </td>
        </tr>
        <tr>
            <td class="right">研究要点及目标：</td>
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
                            <td colspan="3" class="left align-center">信息与电气工程学院</td>
                            <td colspan="2" class="left align-center"></td>
                            <td class="left align-center"></td>
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
    </table>
    <br>
    <div style=" width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第二部分：经费到款信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
    <table style="table-layout:fixed;">
        <thead>
        <tr>
            <th colspan="3" class="right">到款日期</th>
            <th colspan="2" class="right">到款金额<label class="required">（元）</label></th>
            <th colspan="2" class="right">直接经费<label class="required">（元）</label></th>
            <th colspan="2" class="right">科研管理费<label class="required">（元）<br>（横向3%，横向5%）</label></th>
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
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">材料费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">测试化验加工费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">燃料动力费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">差旅费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">会议费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr><tr>
            <td colspan="3" class="right" style="text-align: center;">国际合作与交流费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">设备费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">劳务费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">专家咨询费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">资料费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">资料费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">印刷费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">管理费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">其他经费：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
            <td colspan="1.5" class="right" style="text-align: center;">500</td>
            <td colspan="1.5" class="right" style="text-align: center;">400</td>
            <td colspan="1.5" class="ibg" style="text-align: center;">100</td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">科研管理费：</td>
            <td colspan="4" style="text-align: center;">&nbsp;&nbsp;800
                <label class="required">（注：科研管理费为间接经费，直接扣除，可在科研管理费条目下进行申请）</label>
            </td>
        </tr>
        <tr>
            <td colspan="3" class="right" style="text-align: center;">绩效支出：</td>
            <td colspan="1.5" class="right" style="text-align: center;">800</td>
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
    <div style="width:100%; text-align:center; margin-left:15px; margin-right:15px;">
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
        &nbsp;&nbsp;&nbsp;&nbsp;第六部分：相关成果信息&nbsp;&nbsp;&nbsp;&nbsp;
        <hr size="3" class="hrLine" style="width:300px;" color="#EE7600" noshade/>
    </div>
    <br>
</form>
<%--按钮end--%>
</body>
</html>
