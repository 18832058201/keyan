<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-08
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>学院相关管理</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-media.css"/>
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" rel="stylesheet"/>
    <script type="text/javascript">
        function open(hehe) {
            var id = $(hehe).attr("id");
            alert(id);
            var ui = document.getElementById("onem");
            var state = document.getElementById("onem").style.display;
            if (state == "none") {
                ui.style.display = "";
            } else {
                ui.style.display = "none";
            }
        }
    </script>
</head>
<body>
<!--导入头部-->
<jsp:include page="header.jsp"/>
<!--sidebar-menu-->
<div id="sidebar" style="OVERFLOW-Y: auto; OVERFLOW-X:hidden;">
    <ul>
        <li class="submenu active">
            <a class="menu_a" link="project/addProject.jsp"><i class="icon icon-home"></i> <span>学院管理首页</span></a>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>公章管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="seal/collegeSealList.jsp"><i class="icon icon-caret-right"></i>学院公章</a>
                </li>
                <li><a class="menu_a" link="seal/schoolSealList.jsp"><i class="icon icon-caret-right"></i>学校公章</a>
                </li>
                <li><a class="menu_a" link="seal/scientificSealList.jsp"><i class="icon icon-caret-right"></i>科研院公章</a>
                </li>
                <li><a class="menu_a" link="seal/technologySealList.jsp"><i class="icon icon-caret-right"></i>技术转移中心公章</a>
                </li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-th"></i>
                <span>学院管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="college/collegeInfo.jsp"><i class="icon icon-caret-right"></i>学院信息</a>
                </li>
                <li><a class="menu_a" link="college/collegePeopleList.jsp"><i class="icon icon-caret-right"></i>人员管理</a>
                </li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/personal/toAuditPersonalInfoList.action?auditType=1"><i class="icon icon-caret-right"></i>人员信息审核</a>
                </li>
                <li><a class="menu_a" link="college/collegeDepartmentList.jsp"><i class="icon icon-caret-right"></i>教研室管理</a>
                </li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-stop"></i>
                <span>科研项目</span>
            </a>
            <ul>
                <li><a class="mmm" listId="one" link="gallery.html"><i class="icon icon-caret-right"></i>纵向项目</a>
                    <!-- 注意：二级菜单的class都是mmm，listId可以任意设置，但是要保证三级菜单的ul的id为listId+m的格式 -->
                    <ul class="submenu" id="onem" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toLengthWaysProjectListAudit.action?auditType=1">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>项目列表</a></li>
                        <li><a class="menu_a" link="project/lengthwaysProjectEndList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>项目结题</a></li>
                        <li><a class="menu_a" link="project/lengthwaysProjectBudgetList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>预算调整</a></li>
                    </ul>
                </li>
                <li><a class="mmm" listId="two" link="calendar.html"><i class="icon icon-caret-right"></i>横向项目</a>
                    <ul class="submenu" id="twom" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="project/collegeCrosswiseProjectList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>项目列表</a></li>
                        <li><a class="menu_a" link="project/collegeCrosswiseProjectEndList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>项目结题</a></li>
                        <li><a class="menu_a" link="project/collegeCrosswiseProjectBudgetList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>预算调整</a></li>
                    </ul>
                </li>
                <li><a class="mmm" listId="three" link="invoice.html"><i class="icon icon-caret-right"></i>成果转化项目</a>
                    <ul class="submenu" id="threem" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="project/collegeTransformationProjectList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>项目列表</a></li>
                        <li><a class="menu_a" link="project/collegeTransformationProjectEndList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>项目结题</a></li>
                        <li><a class="menu_a" link="project/collegeTransformationProjectBudgetList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i
                                class="icon icon-caret-right"></i>预算调整</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-info-sign"></i>
                <span>科研成果</span>
            </a>
            <ul>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toIdentifyResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>鉴定成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toRewardResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>获奖成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toPatentResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>专利成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toPaperResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>论文成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toSoftwareResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>软件成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toPlantResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>植物新品种</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toStandardResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>标准管理</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/audit/toBookResultListAudit.action?auditType=1"><i class="icon icon-caret-right"></i>著作成果</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-info-sign"></i>
                <span>科研管理费</span>
                <%--<span class="label label-important">4</span>--%>
            </a>
            <ul>
                <li><a class="menu_a" link="error403.html"><i class="icon icon-caret-right"></i>管理费列表</a></li>
                <li><a class="menu_a" link="error404.html"><i class="icon icon-caret-right"></i>申请列表</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#"><i class="icon icon-info-sign"></i><span>综合查询</span></a>
            <ul>
                <li><a class="menu_a" link="error403.html"><i class="icon icon-caret-right"></i>综合查询</a></li>
            </ul>
        </li>
    </ul>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">
    <!--breadcrumbs-->
    <div id="content-header">
        <div id="breadcrumb"><a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>
            Home</a></div>
    </div>
    <!--End-breadcrumbs-->
    <iframe src="<%=request.getContextPath()%>/collegeIndex.action" id="iframe-main" frameborder='0' style="width:100%;"></iframe>
</div>
<!--end-main-container-part-->

<script src="<%=request.getContextPath()%>/js/excanvas.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.ui.custom.js"></script>
<script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/js/nicescroll/jquery.nicescroll.min.js"></script>
<script src="<%=request.getContextPath()%>/js/matrix.js"></script>


<script type="text/javascript">

    //初始化相关元素高度
    function init() {
        $("body").height($(window).height() - 80);
        $("#iframe-main").height($(window).height() - 90);
        $("#sidebar").height($(window).height() - 50);
    }

    $(function () {
        init();
        $(window).resize(function () {
            init();
        });
        $(".mmm").click(function () {
            var value = $(this).attr("listId");
            var ui = document.getElementById(value + "m");
            var state = document.getElementById(value + "m").style.display;
            if (state == "none") {
                ui.style.display = "";
            } else {
                ui.style.display = "none";
            }
        })
    });

    // This function is called from the pop-up menus to transfer to
    // a different page. Ignore if the value returned is a null string:
    function goPage(newURL) {
        // if url is empty, skip the menu dividers and reset the menu selection to default
        if (newURL != "") {
            // if url is "-", it is this page -- reset the menu:
            if (newURL == "-") {
                resetMenu();
            }
            // else, send page to designated URL
            else {
                document.location.href = newURL;
            }
        }
    }

    // resets the menu selection upon entry to this page:
    function resetMenu() {
        document.gomenu.selector.selectedIndex = 2;
    }

    // uniform使用示例：
    // $.uniform.update($(this).attr("checked", true));
</script>
</body>
</html>

