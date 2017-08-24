<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--start :文件上传弹出框-->
<div id="myModal" class="reveal-modal" align="center">
    <form action="<%=request.getContextPath()%>/file/fileUpload.action" method="post" enctype="multipart/form-data" onsubmit="return validateNull()" id="fileForm">
        <label style="font-size: 15px">上传说明：如果是重新上传将会覆盖原来的附件；如有多个文件请打包成压缩包后再上传</label><p>
        <label><input type="file" name="file" style="border: 1px solid #1f262d;width: 350px"></label><p>
        <input type="hidden" name="id" id="id" value=""/><!--上传文件对应的项目或成果id-->
        <input type="submit" class="button button-primary button-rounded button-small" value="开始上传" />
        <a class="close-reveal-modal">&#215;</a>
    </form>
</div>

<!--文件上传功能需引入的css及js-->
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/reveal.css">
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/jquery.reveal.js"></script>
<script>
    //上传时需绑定项目或成果的id
    function fileUpload(id) {
        $("input[name='id']").val(id);
    }
    //验证文件是否为空
    function validateNull() {
        if ($("input[type='file']").val() === "") {
            alert("提示：您还未选择文件！请选择文件后再上传");
            return false;
        } else {
            return true;
        }
    }

    /**
     * 下载文件
     * @param fileName  文件名称
     * @param type 项目或成果标识
     */
    function fileDownload(fileName) {
        location.href = "/file/fileDownload.action?fileName="+fileName+"";
    }

</script>
<!--end :文件上传弹出框-->

