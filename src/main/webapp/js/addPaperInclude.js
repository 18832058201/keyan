/*新增论文收录*/
function addInclude() {
    var includeTable = $("#includeTable");  //得到includeTable表格对象
    var includeTime = $("#includeTime"); //获取收录时间对象
    var includeTool = $("#includeTool"); //获取收录工具选择框对象
    var includeNum = $("#includeNum");  //获取收录号对象
    var flag = true;
    includeTable.find("tr").each(function () {
        //判断是否已添加此收录号
        if ($(this).find("td").eq(2).html() === includeNum.val()) {
            alert("收录号不可重复，请确认后重新输入！");
            flag = false;
        }
    });
    if (flag) {
        if (includeNum.val() === "") {
            alert("收录号不能为空！");
        } else {
            if (includeTool.find("option:selected").val() === "") {
                alert("收录工具不能为空！");
            } else {
                if (includeTime.val() === "") {
                    alert("收录时间不能为空！");
                } else {
                    var includeDate = includeTime.val();//取到收录时间
                    var includeToolId = includeTool.find("option:selected").val();//选中的收录工具编号
                    var includeToolName = includeTool.find("option:selected").text();//选中的收录工具姓名
                    var includeNumber = includeNum.val();//收录号
                    var hiddenHtml = '<input type="hidden" name="includeDate" value="'+ includeDate +'">' +
                        '<input type="hidden" name="includeToolId" value="'+includeToolId+'">' +
                        '<input type="hidden" name="includeToolName" value="'+includeToolName+'">' +
                        '<input type="hidden" name="includeNumber" value="'+includeNumber+'">' +
                        '<input type="hidden" name="statusId" value="1">';
                    includeTable.html(includeTable.html() + '<tr>'+hiddenHtml+'<td colspan="2" class="align-center">' + includeTime.val() + '</td>' +
                        '<td colspan="2" class="left align-center">' + $("#includeTool").find("option:selected").text() + '</td>' +
                        '<td colspan="2" class="left align-center">' + includeNum.val() + '</td>' +
                        '<td colspan="2" class="left align-center">' + "未提交" + '</td>' +
                        '<td class="left align-center"><a href="javascript:void(0)" onclick="delInclude(this)">删除</a></td></tr>');
                }
            }
        }
    }
}
//删除
function delInclude(obj) {
    var length = $("tr").length - 1;
    if (confirm("您确定要删除吗？")) {
        $(obj).parent().parent().remove();
    }
}