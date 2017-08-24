<%--
  Created by IntelliJ IDEA.
  User: FengJialong
  Date: 2017-06-22
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
</head>
<body>
<input type="text" id="txtSearch" maxlength="50" />
<input type="button" id="btnSearch" value="Search" /><br />
<select id="selType">
    <option value="1">上海</option>
    <option value="2">北京</option>
    <option value="3">北京2</option>
    <option value="4">上海2</option>
    <option value="5">深圳</option>
</select>
<script type="text/javascript">
    window.onload = function() {
        var txtSearch = document.getElementById("txtSearch");
        var btnSearch = document.getElementById("btnSearch");
        var selType = document.getElementById("selType").options;
        var List = [];
        for (var i = 0; i < selType.length; i++) {
            List[i] = selType[i].value + "|" + selType[i].text;
        }
        btnSearch.onclick = function() {
            var Html = "";
            if (!(txtSearch.value.length < 1)) {
                selType.length = 0;
                for (var i = 0; i < List.length; i++) {
                    if (List[i].indexOf(txtSearch.value) > -1) {
                        selType.add(new Option(List[i].split("|")[1], List[i].split("|")[0]));
                    }
                }
            }
        };
    }
</script>
</body>
</html>
