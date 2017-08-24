/**
 * 通过ajax验证同名情况
 * @param validateName  需要验证的名字
 * @param url  ajax请求的地址
 */
function nameIsExisted(validateName, url) {
    $.ajax({
        type: "POST",                   //请求的方式
        url: url,  //ajax请求的地址
        dataType: "json",                  //数据类型为json
        data: {validateName: validateName}, //第一个参数为后台接受的参数名，必须与这个一致，第二个表示input的name
        success: function (data) {         //服务器执行成功调用此方法，data为服务器返回的数据
            if (data) {
                alert("提示：该名称已存在，请重新输入！");
            }
        },
        error: function (msg) {    //服务器执行异常调用此方法，msg为异常是服务器返回的数据
            alert("服务器异常");
        }
    });
}

/**
 * 返回true表示有时间为空，返回false说明没有空值
 * @returns {boolean}
 */
function checkDate() {
    //对时间框进行必填验证
    var flag = true;
    $("input[class='Wdate']").each(function () {
        if ($(this).val() === "") {
            alert("提示：您还有必填时间没有选择，请检查后再提交！");
            flag = false;  //改变flag的值
            return false;  //each循环返回false，相当于break结束循环
        }
    });
    //对flag取反后返回，如果flag为false说明必填时间框有空值，就需要组织表单提交
    return !flag;

}