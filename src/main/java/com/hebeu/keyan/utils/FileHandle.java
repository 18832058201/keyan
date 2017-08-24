package com.hebeu.keyan.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Properties;

/**
 * 文件处理类，包括文件上传，文件下载，文件自动备份等操作
 * Created by Administrator on 2017/6/23.
 */
public class FileHandle {
    //定义文件存储的绝对路径地址
    public static String ABSOLUTEPATH ;       //根路径
    public static String LENGTHWAYSPROJECT;   //纵向项目
    public static String CROSSWISEPROJECT;    //横向项目
    public static String RESULTTRANSFORM;     //成果转化
    public static String IDENTIFYRESULT;      //鉴定成果
    public static String REWARDRESULT;        //获奖成果
    public static String PATENTREULT;         //专利成果
    public static String PAPERRESULT;         //论文成果
    public static String BOOKRESULT;          //著作成果
    public static String SOFTWARERESULT;      //软著成果
    public static String PLANTRESULT;         //新品种
    public static String STANDARDRESULT;      //标准成果

    /*
     * 从配置文件读取文件存储路径并设置
     */
    static {
        Properties prop = new Properties();
        try {
            prop.load(FileHandle.class.getClassLoader().getResourceAsStream(
                    "fileSavePath.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ABSOLUTEPATH = prop.getProperty("rootPath");
        LENGTHWAYSPROJECT = prop.getProperty("lengthWaysProject");
        CROSSWISEPROJECT = prop.getProperty("crosswiseProject");
        RESULTTRANSFORM = prop.getProperty("resultTransform");
        IDENTIFYRESULT = prop.getProperty("identify");
        REWARDRESULT = prop.getProperty("reward");
        PATENTREULT = prop.getProperty("patent");
        PAPERRESULT = prop.getProperty("paper");
        SOFTWARERESULT = prop.getProperty("software");
        PLANTRESULT = prop.getProperty("plant");
        BOOKRESULT = prop.getProperty("book");
        STANDARDRESULT = prop.getProperty("standard");
    }


    /**
     * 文件上传
     *
     * @param dir     指定上传的文件夹
     * @param file    上传的文件
     * @param uuid    通过项目名的UUID作为文件的UUID名
     * @return 返回保存的文件名
     */
    public static String fileUpload(String dir, MultipartFile file ,String uuid) throws IOException, FileNotFoundException {
        if ("".equals(file.getOriginalFilename())) {
            return null;   //如果没有上传文件返回null
        }
        //通过UUID生成保存的文件名
        String saveFileName = uuid + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        //得到文件路径
//        String filePath = request.getServletContext().getRealPath("/" + dir + "/");
        String filePath = ABSOLUTEPATH + "/" + dir + "/";
        /*start ：判断文件路径是否存在，若不存在则创建该文件路径*/
        System.out.println("开始创建文件夹");
        File tempFilePath = new File(filePath);   //创建临时文件夹
        if (!tempFilePath.exists()) {
            tempFilePath.mkdirs();  //不存在文件夹就创建该文件夹
        }
        System.out.println("创建文件夹成功");
        /*end ：判断文件路径是否存在，若不存在则创建该文件路径*/
        filePath += saveFileName;  //得到文件全路径
        write(file.getInputStream(), new FileOutputStream(filePath));  //将文件写入到磁盘中
        return saveFileName;  //返回文件名
    }

    /**
     * 向磁盘中入数据
     *
     * @param in  输入流
     * @param out 输出流
     * @throws IOException 抛出IOException异常
     */
    private static void write(InputStream in, OutputStream out) throws IOException {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead = -1;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            out.flush();   //刷新此输出流并强制写出所有缓冲的输出字节。
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException ignored) {
            }
        }
    }


    /**
     * 文件下载
     * @param request request请求
     * @param response  response响应
     * @param storeName 保存的文件名
     * @param realName  下载的文件名
     * @param dir 文件路径，传文件夹名就可以
     * @throws Exception  抛出异常
     */
    public static void fileDownload(HttpServletRequest request,
                                    HttpServletResponse response, String storeName,
                                    String realName, String dir) throws Exception {
//        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("application/octet-stream"); //设置响应类型为下载文件类型
        request.setCharacterEncoding("UTF-8");  //设置编码
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        //得到下载文件的路径
        String filePath = ABSOLUTEPATH + "/" + dir + "/";
//        String filePath = request.getServletContext().getRealPath("/" + dir + "/");
        String downLoadPath = filePath + storeName;
        long fileLength = new File(downLoadPath).length();

        //通过存储文件得到文件后缀生成新的文件名
        realName += FileHandle.getSuffix(storeName);

        //设置响应头
        response.setHeader("Content-disposition", "attachment; filename="
                + new String(realName.getBytes("UTF-8"), "ISO-8859-1"));
        response.setHeader("Content-Length", String.valueOf(fileLength));

        bis = new BufferedInputStream(new FileInputStream(downLoadPath));
        bos = new BufferedOutputStream(response.getOutputStream());
        byte[] buff = new byte[2048];
        int bytesRead;
        while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
            bos.write(buff, 0, bytesRead);
        }
//        bos.flush();
        bis.close();
        bos.close();
    }


    /**
     * 删除指定文件
     *
     * @param dir      文件夹名称
     * @param fileName 文件名
     */
    public static void deleteFile(String dir, String fileName) {
        String absolutePath = ABSOLUTEPATH + "/" + dir + "/" + fileName;
        //取出文件的绝对路径，然后用File方法删除相应文件。
        File file = new File(absolutePath);
        if (file.exists()) {
            file.delete();
        }
    }

    /**
     * 通过文件名得到文件后缀名，即文件类型
     * @param fileName 文件名
     * @return 返回文件后缀
     */
    public static String getSuffix(String fileName){
        //文件为空返回null
        if(fileName == null){
            return null;
        }
        return fileName.substring(fileName.lastIndexOf("."),fileName.length());
    }

    /**
     * 得到去掉后缀的文件名称
     * @param fileName 文件名
     * @return 返回去掉后缀的文件名
     */
    public static String getRidSuffixName(String fileName){
        if (fileName ==null){
            return null;
        }
        return fileName.substring(0,fileName.lastIndexOf("."));
    }

    /**
     * 根据项目或成果类型得到文件夹名称
     * @param type 项目或成果类型
     * @return 返回文件夹
     */
    public static String getDir(Integer type){
        String dir = null;
        if (type == 1) {
            dir = FileHandle.LENGTHWAYSPROJECT;
        } else if (type == 2) {
            dir = FileHandle.CROSSWISEPROJECT;
        } else if (type == 3) {
            dir = FileHandle.RESULTTRANSFORM;
        } else if (type == 11) {
            dir = FileHandle.IDENTIFYRESULT;
        } else if (type == 12) {
            dir = FileHandle.REWARDRESULT;
        } else if (type == 13) {
            dir = FileHandle.PATENTREULT;
        } else if (type == 14) {
            dir = FileHandle.PAPERRESULT;
        } else if (type == 15) {
            dir = FileHandle.SOFTWARERESULT;
        } else if (type == 16) {
            dir = FileHandle.PLANTRESULT;
        } else if (type == 17) {
            dir = FileHandle.STANDARDRESULT;
        } else if (type == 18) {
            dir = FileHandle.BOOKRESULT;
        }
        return dir;
    }


}
