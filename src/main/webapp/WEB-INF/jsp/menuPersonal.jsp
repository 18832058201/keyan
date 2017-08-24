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
    <title>个人管理</title>
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
            <a class="menu_a" href="javascript:void(0)"><i class="icon icon-home"></i> <span>控制面板</span></a>
        </li>
        <!--个人信息-->
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>个人信息</span>
            </a>
            <ul>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/personal/toPersonInfo.action"><i class="icon icon-caret-right"></i>个人信息</a>
                </li>
                <li><a class="menu_a" link="no.html"><i class="icon icon-caret-right"></i>修改密码</a>
                </li>
            </ul>
        </li>
        <!--科研办公-->
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>科研办公</span>
            </a>
            <ul>
                <li><a class="menu_a" link="seal/personalSealList.jsp"><i class="icon icon-caret-right"></i>公章列表</a>
                </li>
                <li><a class="menu_a" link="no.html"><i class="icon icon-caret-right"></i>办公短信</a>
                </li>
            </ul>
        </li>
        <!--科研项目-->
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>科研项目</span>
            </a>
            <ul>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/project/lengthwaysProjectList.action"><i class="icon icon-caret-right"></i>纵向项目</a></li>
                <li><a class="menu_a" link="project/personalCrosswiseProjectList.jsp"><i class="icon icon-caret-right"></i>横向项目</a></li>
                <li><a class="menu_a" link="project/personalTransformationProjectList.jsp"><i class="icon icon-caret-right"></i>成果转化项目</a></li>
            </ul>
        </li>
        <!--科研成果-->
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>科研成果</span>
            </a>
            <ul>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/identifyResult/toIdentifyResultList.action"><i class="icon icon-caret-right"></i>鉴定成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/rewardResult/toRewardResultList.action"><i class="icon icon-caret-right"></i>获奖成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/patentResult/PatentResultList.action"><i class="icon icon-caret-right"></i>专利成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/paperResult/toPaperResultList.action"><i class="icon icon-caret-right"></i>论文成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/softwareResult/softwareResultList.action"><i class="icon icon-caret-right"></i>软件成果</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/plantResult/plantResultList.action"><i class="icon icon-caret-right"></i>植物新品种</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/standardResult/standardResultList.action"><i class="icon icon-caret-right"></i>标准管理</a></li>
                <li><a class="menu_a" link="<%=request.getContextPath()%>/result/bookResult/bookResultList.action"><i class="icon icon-caret-right"></i>著作成果</a></li>
    </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-stop"></i>
                <span>经费报销</span>
            </a>
            <ul>
                <li><a class="mmm" listId="one" link="gallery.html"><i class="icon icon-caret-right"></i>科研管理费</a>
                    <!-- 注意：二级菜单的class都是mmm，listId可以任意设置，但是要保证三级菜单的ul的id为listId+m的格式 -->
                    <ul class="submenu" id="onem" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/manageMoney/toApplyList.action">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>报销申请</a></li>
                        <li><a class="menu_a" link="<%=request.getContextPath()%>/manageMoney/toAuditApplyList.action?auditType=1">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>申请审核</a></li>
                    </ul>
                </li>
                <li><a class="mmm" listId="two" link="gallery.html"><i class="icon icon-caret-right"></i>项目经费</a>
                    <!-- 注意：二级菜单的class都是mmm，listId可以任意设置，但是要保证三级菜单的ul的id为listId+m的格式 -->
                    <ul class="submenu" id="twom" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="project/scientificLengthwaysProjectList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>报销申请</a></li>
                        <li><a class="menu_a" link="project/scientificLengthwaysProjectEndList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>申请审核</a></li>
                    </ul>
                </li>
                <li><a class="mmm" listId="three" link="gallery.html"><i class="icon icon-caret-right"></i>项目绩效</a>
                    <!-- 注意：二级菜单的class都是mmm，listId可以任意设置，但是要保证三级菜单的ul的id为listId+m的格式 -->
                    <ul class="submenu" id="threem" style="display: none"><!-- 请看此处的id. -->
                        <li><a class="menu_a" link="project/scientificLengthwaysProjectList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>报销申请</a></li>
                        <li><a class="menu_a" link="project/scientificLengthwaysProjectEndList.jsp">&nbsp;&nbsp;&nbsp;&nbsp;<i class="icon icon-caret-right"></i>申请审核</a></li>
                    </ul>
                </li>
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
    <iframe src="<%=request.getContextPath()%>/personalIndex.action" id="iframe-main" frameborder='0' style="width:100%;"></iframe>
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

