package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.*;
import com.hebeu.keyan.dao.customMapper.CommonMapper;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.service.FileHandleService;
import com.hebeu.keyan.utils.FileHandle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 作者：陈德华
 * 时间：2017/8/5 16:04
 * 描述：文件处理业务实现类
 */
@Service
public class FileHandleServieImpl implements FileHandleService {
    private final EProjectMapper eProjectMapper;
    private final EIdentifyMapper eIdentifyMapper;
    private final ERewardMapper eRewardMapper;
    private final EPatentMapper ePatentMapper;
    private final EPaperMapper ePaperMapper;
    private final ESoftwareMapper eSoftwareMapper;
    private final EPlantMapper ePlantMapper;
    private final EStandardMapper eStandardMapper;
    private final EBookMapper eBookMapper;
    private final CommonMapper commonMapper;

    @Autowired
    public FileHandleServieImpl(EProjectMapper eProjectMapper, EIdentifyMapper eIdentifyMapper, ERewardMapper eRewardMapper, EPatentMapper ePatentMapper, EPaperMapper ePaperMapper, ESoftwareMapper eSoftwareMapper, EPlantMapper ePlantMapper, EStandardMapper eStandardMapper, EBookMapper eBookMapper, CommonMapper commonMapper) {
        this.eProjectMapper = eProjectMapper;
        this.eIdentifyMapper = eIdentifyMapper;
        this.eRewardMapper = eRewardMapper;
        this.ePatentMapper = ePatentMapper;
        this.ePaperMapper = ePaperMapper;
        this.eSoftwareMapper = eSoftwareMapper;
        this.ePlantMapper = ePlantMapper;
        this.eStandardMapper = eStandardMapper;
        this.eBookMapper = eBookMapper;
        this.commonMapper = commonMapper;
    }

    /**
     * 保存文件并更新数据库（若已存在文件直接覆盖）
     *
     * @param id   项目或成果的id
     * @param file 要上传的附件
     */
    @Override
    public void updateFileName(String id, MultipartFile file) {
        try {
            String oldFileName = null; //定义原来的附件名
            Integer type = this.getTypeById(id);  //根据项目或成果的主键得到对应的类型标识
            String dir = FileHandle.getDir(type); //根据类型标识得到文件夹
            String fileName = FileHandle.fileUpload(dir, file, id); //保存文件并得到文件名，如果已存在同名文件会覆盖文件
            if (type == 1) {
                EProject eProject = new EProject();
                eProject.setProjectId(id);
                eProject.setAttachment(fileName);
                oldFileName = eProjectMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                eProjectMapper.updateByPrimaryKeySelective(eProject);                //更新附件名称
            } else if (type == 2) {
                //横向项目暂时未做
            } else if (type == 3) {
                //成果转化暂时未做
            } else if (type == 11) {
                EIdentify eIdentify = new EIdentify();
                eIdentify.setIdentifyId(id);
                eIdentify.setAttachment(fileName);
                oldFileName = eIdentifyMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                eIdentifyMapper.updateByPrimaryKeySelective(eIdentify);
            } else if (type == 12) {
                EReward eReward = new EReward();
                eReward.setRewardId(id);
                eReward.setAttachment(fileName);
                oldFileName = eRewardMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                eRewardMapper.updateByPrimaryKeySelective(eReward);
            } else if (type == 13) {
                EPatent ePatent = new EPatent();
                ePatent.setPatentId(id);
                ePatent.setAttachment(fileName);
                oldFileName = ePatentMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                ePatentMapper.updateByPrimaryKeySelective(ePatent);
            } else if (type == 14) {
                EPaper ePaper = new EPaper();
                ePaper.setPaperId(id);
                ePaper.setAttachment(fileName);
                oldFileName = ePaperMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                ePaperMapper.updateByPrimaryKeySelective(ePaper);
            } else if (type == 15) {
                ESoftware eSoftware = new ESoftware();
                eSoftware.setSoftwareId(id);
                eSoftware.setAttachment(fileName);
                oldFileName = eSoftwareMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                eSoftwareMapper.updateByPrimaryKeySelective(eSoftware);
            } else if (type == 16) {
                EPlant plant = new EPlant();
                plant.setPlantId(id);
                plant.setAttachment(fileName);
                oldFileName = ePlantMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                ePlantMapper.updateByPrimaryKeySelective(plant);
            } else if (type == 17) {
                EStandard eStandard = new EStandard();
                eStandard.setStandardId(id);
                eStandard.setAttachment(fileName);
                oldFileName = eStandardMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                eStandardMapper.updateByPrimaryKeySelective(eStandard);
            } else if (type == 18) {
                EBook eBook = new EBook();
                eBook.setBookId(id);
                eBook.setAttachment(fileName);
                oldFileName = eBookMapper.selectByPrimaryKey(id).getAttachment(); //取到原来名称并赋值
                eBookMapper.updateByPrimaryKeySelective(eBook);
            }
            //如果重新上传的文件与原文件类型不一致就删除原来的文件
            if (!fileName.equals(oldFileName)) {
                FileHandle.deleteFile(dir, oldFileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("上传图片失败");
        }

    }

    /**
     * 通过项目或成果id得到类型标识
     *
     * @param id 项目或成果id
     * @return 返回对应标识
     */
    @Override
    public Integer getTypeById(String id) {
        return commonMapper.findTypeById(id);
    }
}
