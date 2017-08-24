<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/10
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>顶部导航</title>
    <style>
        a:hover {
            cursor: pointer;
        }
    </style>
</head>
<body>
<!--Header-part-->
<div id="header">
    <h1><a href="javascript:void(0)">科研信息管理系统</a></h1>
</div>
<!--close-Header-part-->


<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse" ${roles.size() <= 1?'style="right: 20px"':''} >
    <ul class="nav">
        <li class="dropdown" id="profile-messages">
            <a title="" href="#" data-toggle="dropdown" data-target="#profile-messages" class="dropdown-toggle">
                <i class="icon icon-user"></i>&nbsp;
                <span class="text">欢迎你，${activeUser.username}</span>&nbsp;
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
                <%--<li><a class="menu_a" href="<%=request.getContextPath()%>/personal/toPersonInfo.action" ><i class="icon-user"></i> 个人资料</a></li>--%>
                <%--<li class="divider"></li>--%>
                <%--<li><a href="personal/personalInfoEdit.jsp" target="content"><i class="icon-check"></i> 我的任务</a></li>
                <li class="divider"></li>--%>
                <li><a href="<%=request.getContextPath()%>/logout.action"><i class="icon-key"></i> 退出系统</a></li>
            </ul>
        </li>
        <li class="dropdown" id="menu-messages">
            <a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle">
                <i class="icon icon-envelope"></i>&nbsp;
                <span class="text">我的消息</span>&nbsp;
                <%--<span class="label label-important"></span>&nbsp;--%>
                <b class="caret"></b>
            </a>
            <ul class="dropdown-menu">
                <li><a class="sAdd" title="" href="#"><i class="icon-plus"></i> 新消息</a></li>
                <li class="divider"></li>
                <li><a class="sInbox" title="" href="#"><i class="icon-envelope"></i> 收件箱</a></li>
                <li class="divider"></li>
                <li><a class="sOutbox" title="" href="#"><i class="icon-arrow-up"></i> 发件箱</a></li>
                <li class="divider"></li>
                <li><a class="sTrash" title="" href="#"><i class="icon-trash"></i> 回收站</a></li>
            </ul>
        </li>
        <%--<li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">&nbsp;设置</span></a></li>--%>
        <li class=""><a title="" href="<%=request.getContextPath()%>/logout.action"><i class="icon icon-share-alt"></i>
            <span
                    class="text">&nbsp;退出系统</span></a></li>
    </ul>
</div>
<!--close-top-Header-menu-->
<!--start-top-serch-->
<shiro:hasAnyRoles name="collegeLeader,collegeAdmin,projectSection1,projectSection2,projectSection3,projectSection4,resultSection,schoolLeader,platformAdmin,systemAdmin">
<div id="search">
    <label>
        <span style="color: #999999;font-size: 14px;display: inline-block;">当前角色：</span>
        <select onchange="changeRole(this.value)" style="width: 180px;background-color:#EEEEEE ">
            <shiro:hasAnyRoles name="researcher">
                <option value="personal" ${role eq "personal" ? "selected = 'selected'":""}>个人管理</option>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="collegeLeader,collegeAdmin">
                <option value="college" ${role eq "college" ? "selected = 'selected'":""}>学院管理</option>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="projectSection1,projectSection2,projectSection3,projectSection4,resultSection,schoolLeader">
                <option value="scientific" ${role eq "scientific" ? "selected = 'selected'":""}>科研院管理</option>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="platformAdmin">
                <option value="platform" ${role eq "platform" ? "selected = 'selected'":""}>平台管理</option>
            </shiro:hasAnyRoles>
            <shiro:hasAnyRoles name="systemAdmin">
            <option value="system" ${role eq "system" ? "selected = 'selected'":""}>系统管理</option>
            </shiro:hasAnyRoles>
        </select>
    </label>
</div>
</shiro:hasAnyRoles>
<!--close-top-serch-->
<script>
    function changeRole(value) {
        if (value === "personal") {
            location.href = "/personal.action";
        } else if (value === "college") {
            location.href = "/college.action";
        } else if (value === "scientific") {
            location.href = "/scientific.action";
        } else if (value === "platform") {
            location.href = "/platform.action";
        } else if (value === "system") {
            location.href = "/system.action"
        }
    }
</script>
</body>
</html>
