<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-08
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>平台管理</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-style.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-media.css" />
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" rel="stylesheet" />
</head>
<body>

<!--导入头部-->
<jsp:include page="header.jsp"/>
<!--sidebar-menu-->
<div id="sidebar" style="OVERFLOW-Y: auto; OVERFLOW-X:hidden;">
    <ul>
        <li class="submenu active">
            <a class="menu_a" link="index2.html"><i class="icon icon-home"></i> <span>平台管理首页</span></a>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-table"></i>
                <span>平台管理</span>
            </a>
            <ul>
                <li><a class="menu_a" link="form-common.html"><i class="icon icon-caret-right"></i>基本资料</a></li>
                <li><a class="menu_a" link="form-validation.html"><i class="icon icon-caret-right"></i>人员管理</a></li>
                <li><a class="menu_a" link="form-validation.html"><i class="icon icon-caret-right"></i>开放交流</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-th"></i>
                <span>仪器设备</span>
                <span class="label label-important">6</span>
            </a>
            <ul>
                <li><a class="menu_a" link="form-common.html"><i class="icon icon-caret-right"></i>仪器设备</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-th"></i>
                <span>开放交流</span>
            </a>
            <ul>
                <li><a class="menu_a" link="form-common.html"><i class="icon icon-caret-right"></i>开放交流</a></li>
            </ul>
        </li>
        <li class="submenu">
            <a href="#">
                <i class="icon icon-th"></i>
                <span>平台年报</span>
            </a>
            <ul>
                <li><a class="menu_a" link="form-common.html"><i class="icon icon-caret-right"></i>平台年报</a></li>
            </ul>
        </li>
    </ul>
</div>
<!--sidebar-menu-->

<!--main-container-part-->
<div id="content">
    <!--breadcrumbs-->
    <div id="content-header">
        <div id="breadcrumb"> <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a></div>
    </div>
    <!--End-breadcrumbs-->
    <iframe src="<%=request.getContextPath()%>/platformIndex.action" id="iframe-main" frameborder='0' style="width:100%;"></iframe>
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
    function init(){
        $("body").height($(window).height()-80);
        $("#iframe-main").height($(window).height()-90);
        $("#sidebar").height($(window).height()-50);
    }

    $(function(){
        init();
        $(window).resize(function(){
            init();
        });
    });

    // This function is called from the pop-up menus to transfer to
    // a different page. Ignore if the value returned is a null string:
    function goPage (newURL) {
        // if url is empty, skip the menu dividers and reset the menu selection to default
        if (newURL != "") {
            // if url is "-", it is this page -- reset the menu:
            if (newURL == "-" ) {
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
