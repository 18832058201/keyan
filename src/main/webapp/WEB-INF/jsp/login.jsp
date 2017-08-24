<%--
Created by IntelliJ IDEA.
User: Administrator
Date: 2017/6/10
Time: 8:51
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <title>科研信息管理系统-登录</title><meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/matrix-login.css" />
    <link href="<%=request.getContextPath()%>/font-awesome/css/font-awesome.css" rel="stylesheet" />
	<%--<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,800' rel='stylesheet' type='text/css'>--%>
    <style type="text/css">
        input{
            /*font-family: "Microsoft Yahei", serif;*/
            text-align: center;
        }
        .control-label{
            color: #B2DFEE;
            padding-left: 4px;
        }

    </style>
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/verificationNumbers.js" tppabs="js/verificationNumbers.js"></script>
    <script>
        $(document).ready(function() {
            //验证码
            createCode();
            //测试提交，对接程序删除即可
            $(".submit_btn").click(function(){
                location.href="javascrpt:;"/*tpa=http://***index.html*/;
            });
        });
    </script>
</head>
<body onkeydown="keydown()">
    <div id="loginbox">
        <div class="control-group normal_text" style="border-bottom: 1px solid #616161">
            <h2 style="color:#B2DFEE;font-size:25px;">科研信息管理系统</h2>
        </div>
        <form id="loginform" class="form-vertical" action="<%=request.getContextPath()%>/login.action" method="post" onsubmit="return validate()" >
            <div align="center"><span style="color: red">${loginResult}</span></div>
            <div class="control-group">
                <label class="control-label">登陆账号</label>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_lg"><i class="icon-user" style="font-size:16px;"></i></span><input type="text" name="username"  style="width: 200px" />
                    </div>
                </div>
            </div>
            <div class="control-group2">
                <label class="control-label">登陆密码</label>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly"><i class="icon-lock" style="font-size:16px;"></i></span><input type="password" name="password"  style="width: 200px"/>
                    </div>
                </div>
            </div>
            <div class="control-group2">
                <label class="control-label">验证码</label>
                <div class="controls">
                    <div class="main_input_box">
                        <span class="add-on bg_ly" id="myCanvas" onclick="createCode()" style="padding:5px 9px 12px 9px;font-size: 22px;width: 100px;"></span><input type="text" id="codeText"  style="width: 150px"/>
                    </div>
                </div>
            </div>
            <div class="form-actions" style="text-align: center">
                <%--<span class="pull-left"><label style="color: white"><input type="checkbox" name="rememberMe" style="vertical-align:baseline;"/>下次自动登录</label></span>--%>
                <span ><input type="submit" id="checkBtn" class="btn btn-success" style="width:270px;height: 35px" value=" 登&nbsp;&nbsp;&nbsp;&nbsp;录"/></span>
            </div>
        </form>
    </div>
<div style="text-align: center;margin-top: 20px">
    <div class="control-group normal_text">
        <div style="font-size:14px;color:gray;">推荐使用<a href="javascript:void(0)">chrome浏览器</a>、<a href="javascript:void(0)">火狐浏览器</a>，点击链接即可下载</div>
        <span style="font-size:14px;color:gray;">版权所有 &copy; 河北工程大学 2017</span>
    </div>
</div>
</body>

</html>
