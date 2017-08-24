<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-15
  Time: 22:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery.min.js"></script>
    <script src="../../js/jquery_dialog.js"></script>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/buttonStyle.css">

    <script>
        function openF(){
            window.open("buttons.html","","top=100,left=100,width=100,height=100,menubar=no,scrollbars=no,toolbar=no,status=no");
        }
        function ceshi() {
            JqueryDialog.Open('论文收录编辑', 'buttons.html', 10, 600);
        }
    </script>
</head>
<body>
<a href="http://www.bootcss.com/" class="button button-action button-pill">保存</a>
<a href="http://www.bootcss.com/" class="button button-action button-pill">提交</a>
<a href="http://www.bootcss.com/" class="button button-action">Go</a>
<a href="http://www.bootcss.com/" class="button button-primary button-pill button-small">Go</a>
<a  class="button button-primary button-rounded button-small"  >测试Go</a>
<input type="button" value="登陆" onclick="window.open('buttons.html','newwindow','height=600,width=1000,top=50,left=200,toolbar=no,menubar=no,scrollbars=no, resizable=no,location=no, status=no,alwaysRaised =yes')"/>
<a href="javascript:void (0)" onclick="window.showModalDialog('personalLengthwaysProjectEnd.jsp','newwindow','dialogWidth=1000px;dialogHeight=600px,center=yes')" ></a>
</body>
</html>
