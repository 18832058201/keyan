package com.hebeu.keyan.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * 作者：陈德华
 * 时间：2017/8/5 15:55
 * 描述：文件上传处理接口
 */
@Service
public interface FileHandleService {

    /**
     * 保存文件名
     * @param id 项目或成果的id
     * @param file 要上传的附件
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateFileName(String id, MultipartFile file);

    /**
     * 通过项目或成果id得到类型标识
     * @param id 项目或成果id
     * @return 返回对应标识
     */
    public Integer getTypeById(String id);
}
