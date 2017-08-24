<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/9
  Time: 19:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>系统维护</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-media.css"/>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" />
    <script type="text/javascript"  src="<%=request.getContextPath()%>/js/common.js"></script>
    <!--实现三级菜单-->
    <script type="text/javascript">
        function open(hehe){
            var id = $(hehe).attr("id");
            alert(id);
            var ui = document.getElementById("onem");
            var state = document.getElementById("onem").style.display;
            if(state == "none"){
                ui.style.display="";
            }else{
                ui.style.display="none";
            }
        }
    </script>
</head>
<body>
<!--导入头部-->
<jsp:include page="header.jsp"/>
<!--左侧-menu-->
<div id="sidebar" style="OVERFLOW-Y: auto; OVERFLOW-X:hidden;">
    <ul>
        <li class="submenu active">
            <a class="menu_a" href="javascript:void(0)"><i class="icon icon-home"></i> <span>系统维护主页</span></a>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-stop"></i>
                <span>参数设置</span>
            </a>
            <ul>
                <li><a class="mmm" listId="one" link="gallery.html"><i class="icon icon-caret-right"></i>个人信息参数设置</a>
                    <!-- 注意：二级菜单的class都是mmm，listId可以任意设置，但是要保证三级菜单的ul的id为listId+m的格式 -->
                    <ul class="submenu" id="onem" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toPerDutyList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>职务</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toPerPostList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>绩效</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toPerTitleList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>职称</a></li>
                    </ul>
                </li>
                <li><a class="mmm" listId="two" link="gallery.html"><i class="icon icon-caret-right"></i>项目参数设置</a>
                    <!-- 注意：二级菜单的class都是mmm，listId可以任意设置，但是要保证三级菜单的ul的id为listId+m的格式 -->
                    <ul class="submenu" id="twom" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toProEconomicsTargetList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>社会经济目标</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toProProjectDomain.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>项目所属领域</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toProProjectGrade.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>项目等级</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toProProjectSource.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>项目来源</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toProProjectType.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>项目类型</a></li>
                    </ul>
                </li>
                <li><a class="mmm" listId="three" link="gallery.html"><i class="icon icon-caret-right"></i>成果参数设置</a>
                    <!-- 注意：二级菜单的class都是mmm，listId可以任意设置，但是要保证三级菜单的ul的id为listId+m的格式 -->
                    <ul class="submenu" id="threem" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toRewardList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>奖励类别</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toIdenResultLevelList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>成果级别</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toIncludeToolList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>收录工具</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toPaperPublishLevelList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>刊物等级</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/toPatTypeList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>专利类型</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <!--权限管理-->
        <li class="submenu">
            <a href="#">
                <i class="icon icon-stop"></i>
                <span>权限管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/system/permission/toPersonList.action"><i class="icon icon-caret-right"></i>人员列表</a></li>
            </ul>
        </li>
    </ul>
</div>
<!--左侧-menu-->


<!--start：主要内容部分-->
<div id="content">
    <!--breadcrumbs-->
    <div id="content-header">
        <div id="breadcrumb"><a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i>
            Home</a></div>
    </div>
    <!--End-breadcrumbs-->
    <iframe src="<%=request.getContextPath()%>/systemIndex.action" id="iframe-main" frameborder='0' style="width:100%;"></iframe>
</div>
<!--end：主要内容部分-->

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

