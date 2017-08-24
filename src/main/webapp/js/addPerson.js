/*改变人员类别*/
function changePersonType(type) {
    if (parseInt(type) === 1) {
        $("#teacher").show(); //显示校内职工
        $("#student").hide();
        $("#outsidePerson").hide();
    } else if (parseInt(type) === 2) {
        $("#student").show(); //显示校内学生
        $("#teacher").hide();
        $("#outsidePerson").hide();
    } else if (parseInt(type) === 3) {
        $("#outsidePerson").show();  //显示校外人员
        $("#teacher").hide();
        $("#student").hide();
    }
}

/*新增教师*/
function addTeacher() {
    var personTable = $("#personTable");  //得到personTable表格对象
    var teacherCollege = $("#teacherCollege"); //获取教师部门选择框对象
    var teacherName = $("#teacherName");  //获取教师名选择框对象
    var flag = true;
    personTable.find("tr").each(function () {
        //判断是否已添加此人员
        if ($(this).find("td").eq(0).html() === teacherName.find("option:selected").text()) {
            alert("不能重复添加同一人员");
            flag = false;
        }
    });
    if (flag && !(teacherName.find("option:selected").val() === "-1")) {
        if (teacherCollege.find("option:selected").val() === "-1") {
            alert("请选择院部！");
        } else {
            var workName = teacherName.find("option:selected").text().split("(")[0];  //取到选中的人员姓名
            var workNum = teacherName.find("option:selected").val();                  //取到选中的人员工号
            var collegeId = teacherCollege.find("option:selected").val();             //取到选中的学院id
            var collegeName = teacherCollege.find("option:selected").text();          //取到选中的学院名称
            //设置隐藏域内容
            var hiddenHtml = '<input type="hidden" name="personType" value="1"><input type="hidden" name="workNum" value="'+workNum+'"><input type="hidden" name="workName" value="'+workName+'"><input type="hidden" name="collegeId" value="'+collegeId+'"><input type="hidden" name="collegeName" value="'+collegeName+'">';
            // alert(hiddenHtml);
            //将隐藏域内容拼接到tr中
            personTable.html(personTable.html() + '<tr>'+hiddenHtml+'<td colspan="2" class="align-center">' + teacherName.find("option:selected").text() + '</td><td colspan="3" class="left align-center" >' + teacherCollege.find("option:selected").text() + '</td> <td colspan="2" class="left align-center" ><a href="javascript:void (0)" onclick="moveUp(this)">上调</a>&nbsp;<a href="javascript:void(0)" onclick="moveDown(this)">下调</a></td> <td class="left align-center" ><a href="javascript:void(0)" onclick="del(this)">删除</a></td></tr>');
        }
    }
}
/*新增学生*/
function addStudent() {
    var personTable = $("#personTable");  //得到personTable表格对象
    var studentCollege = $("#studentCollege"); //获取学生学院选择框对象
    var studentName = $("#studentName");  //获取学生名输入框对象
    var flag = true;
    personTable.find("tr").each(function () {
        //判断是否已添加此人员
        if ($(this).find("td").eq(0).html() === studentName.val()) {
            alert("不能重复添加同一人员");
            flag = false;
        }
    });
    if (flag && !(studentName.val() === "")) {
        if (studentCollege.find("option:selected").val() === "-1") {
            alert("请选择院部！");
        } else {
            var workName = studentName.val();                                         //取到输入人员姓名
            var workNum = -2;                                                         //设置为 -2表示为校内学生
            var collegeId = studentCollege.find("option:selected").val();             //取到选中的学院id
            var collegeName = studentCollege.find("option:selected").text();          //取到选中的学院名称
            var hiddenHtml = '<input type="hidden" name="personType" value="2"><input type="hidden" name="workNum" value="'+workNum+'"><input type="hidden" name="workName" value="'+workName+'"><input type="hidden" name="collegeId" value="'+collegeId+'"><input type="hidden" name="collegeName" value="'+collegeName+'">';
            // console.log(hiddenHtml);
            personTable.html(personTable.html() + '<tr>'+hiddenHtml+'<td colspan="2" class="align-center">' + studentName.val() + '</td><td colspan="3" class="left align-center" >' + studentCollege.find("option:selected").text() + '</td> <td colspan="2" class="left align-center" ><a href="javascript:void (0)" onclick="moveUp(this)">上调</a>&nbsp;<a href="javascript:void(0)" onclick="moveDown(this)">下调</a></td> <td class="left align-center" ><a href="javascript:void(0)" onclick="del(this)">删除</a></td> </tr>');
        }
    }
}
/*新增校外人员*/
function addOutsidePeople() {
    var personTable = $("#personTable");  //得到personTable表格对象
    var outsideDepartment = $("#outsideDepartment"); //获取校外人员部门输入框对象
    var outsideName = $("#outsideName");  //获取校外人员名称输入框对象
    var flag = true;
    personTable.find("tr").each(function () {
        //判断是否已添加此人员
        if ($(this).find("td").eq(0).html() === outsideName.val()) {
            alert("不能重复添加同一人员");
            flag = false;
        }
    });
    if (flag && !(outsideName.val() === "")) {
        if (outsideDepartment.val() === "") {
            alert("所在单位不能为空！");
        } else {
            var workName = outsideName.val();                                           //取到输入的人员姓名
            var workNum = -3;                                                           //设置为 -3表示为校外人员
            var collegeId = "";                                                         //校外人员没有学院id
            var collegeName = outsideDepartment.val();         //取到输入的单位名称
            var hiddenHtml = '<input type="hidden" name="personType" value="3"><input type="hidden" name="workNum" value="'+workNum+'"><input type="hidden" name="workName" value="'+workName+'"><input type="hidden" name="collegeId" value="'+collegeId+'"><input type="hidden" name="collegeName" value="'+collegeName+'">';
            // console.log(hiddenHtml);
            personTable.html(personTable.html() + '<tr>'+hiddenHtml+'<td colspan="2" class="align-center">' + outsideName.val() + '</td><td colspan="3" class="left align-center" >' + outsideDepartment.val() + '</td> <td colspan="2" class="left align-center" ><a href="javascript:void (0)" onclick="moveUp(this)">上调</a>&nbsp;<a href="javascript:void(0)" onclick="moveDown(this)">下调</a></td> <td class="left align-center" ><a href="javascript:void(0)" onclick="del(this)">删除</a></td> </tr>');
        }
    }
}

//上移行
function moveUp(obj) {
    var tr = $(obj).parent().parent();
    var tb = tr.parent().parent()[0];
    var trs = tb.rows;
    var trNum = trs.length;
    var index = obj.parentNode.parentNode.rowIndex;
    if (trNum <= 2) {
        return;
    }
    if (index == 1) {
        alert("已经到顶部");
    } else {
        index--;
        tr.clone(true).insertBefore(trs[index]);
        tr.remove();
    }
}
//下移行
function moveDown(obj) {
    var tr = $(obj).parent().parent();
    var tb = tr.parent().parent()[0];
    var trs = tb.rows;
    var trNum = trs.length;
    var index = obj.parentNode.parentNode.rowIndex;
    if (trNum <= 2) {
        return;
    }
    if (index === trNum - 1) {
        alert("已经到底部");
    } else {
        index++;
        tr.clone(true).insertAfter(trs[index]);
        tr.remove();
    }
}
//删除
function del(obj) {
    var length = $("tr").length - 1;
    //alert(length);
    if (length <= 1) {
        alert("至少保留一行");
    } else {
        if (confirm("您确定要删除吗？")) {
            $(obj).parent().parent().remove();
        }
    }
}

/**
 * 改变学院级联教研室和人员列表
 * @param collegeId 学院id
 * @returns {boolean}
 */
function collegeChange(collegeId) {
    //选择学院为空 即-1时，初始化教研室下拉框和人员下拉框
    if("-1" === collegeId){
        $("#teacherDepartment").html('<option value="-1" >--请选择--</option>');
        $("#teacherName").html('<option value="-1" >--请选择--</option>');
        return true;
    }

    $.ajax({
        type: "POST",
        url: "/personList/collegeChange.action",
        dataType: "json",
        data: {collegeId: collegeId},
        success: function (resultData) {
            for (var key in resultData) {
                if (key === "departmentList") {
                    var department = $("#teacherDepartment");
                    var departmentHtml = '<option value="-1" >--请选择--</option>';
                    var departmentList = resultData["departmentList"];
                    for (var i=0;i<departmentList.length;i++){
                        departmentHtml += '<option value="'+departmentList[i].departmentId+'" >'+departmentList[i].departmentName+'</option>';
                    }
                    department.html(departmentHtml);
                }
                if (key === "personList") {
                    var teacherName = $("#teacherName");
                    var teacherNameHtml = '<option value="-1" >--请选择--</option>';
                    var teacherNameList = resultData["personList"];
                    for (var i=0;i<teacherNameList.length;i++){
                        teacherNameHtml += '<option value="'+teacherNameList[i].workNum+'" >'+teacherNameList[i].workName+'('+teacherNameList[i].workNum+')</option>';
                    }
                    teacherName.html(teacherNameHtml);
                }
            }
        },
        error: function (msg) {
            alert("服务器异常");
        }
    });

}

/**
 * 改变教研室时级联改变人员类别
 * @param departmentId  教研室id
 */
function departmentChange(departmentId){
    var collegeId = $("#teacherCollege").find("option:selected").val();  //获取到学院id
    $.ajax({
        type : "POST",
        url : "/personList/departmentChange.action",
        dataType : "json",
        data : {departmentId : departmentId , collegeId : collegeId},
        success : function (resultData) {
            var teacherName = $("#teacherName");
            var teacherNameHtml = '<option value="-1" >--请选择--</option>';
            for (var i=0;i<resultData.length;i++){
                teacherNameHtml += '<option value="'+resultData[i].workNum+'" >'+resultData[i].workName+'('+resultData[i].workNum+')</option>';
            }
            teacherName.html(teacherNameHtml);
        },
        error : function (msg) {
            alert("服务器异常");
        }
    });
}