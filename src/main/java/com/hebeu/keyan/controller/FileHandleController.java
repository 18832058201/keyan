package com.hebeu.keyan.controller;

import com.hebeu.keyan.service.FileHandleService;
import com.hebeu.keyan.utils.FileHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：陈德华
 * 时间：2017/8/5 13:53
 * 描述：文件上传下载处理控制器
 */
@Controller
@RequestMapping("/file/")
public class FileHandleController {
    private final FileHandleService fileHandleService;

    @Autowired
    public FileHandleController(FileHandleService fileHandleService) {
        this.fileHandleService = fileHandleService;
    }


    /**
     * 文件下载
     * @param request 请求
     * @param response 响应
     * @param fileName 保存的文件名臣
     */
    @RequestMapping("fileDownload.action")
    public void fileDownload(HttpServletRequest request, HttpServletResponse response, String fileName) {

        System.out.println("下载的文件名为："+fileName);
        String id = FileHandle.getRidSuffixName(fileName);  //通过文件名得到项目id，因为文件名和项目名相同
        Integer type = fileHandleService.getTypeById(id);   //得到项目或成果的对应的类型标识
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String realName = sdf.format(new Date());       //将格式化后的系统时间作为下载的文件名称
            //根据类型判断文件所在文件夹
            String dir = FileHandle.getDir(type);
            FileHandle.fileDownload(request, response, fileName, realName, dir);       //调用文件下载工具下载文件
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 文件上传
     * @param id 项目或成果主键id
     * @param file 上传的文件
     */
    @RequestMapping("fileUpload.action")
    public void fileUpload(HttpServletResponse response,String id, MultipartFile file) throws IOException {
        try {
            //调用文件更新方法更新文件
            System.out.println("项目id"+id);
            fileHandleService.updateFileName(id,file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        PrintWriter out =  response.getWriter();
        out.print("<script>history.back(-1);</script>");  //返回上一历史
    }


}
