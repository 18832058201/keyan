package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.PaperPublishLevelMapper;
import com.hebeu.keyan.po.PaperPublishLevel;
import com.hebeu.keyan.po.PaperPublishLevelExample;
import com.hebeu.keyan.service.PaperPublishLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/1 20:40
 * 描述：刊物等级的业务处理
 */
@Service
public class PaperPublishLevelServiceImpl implements PaperPublishLevelService{

    @Autowired
    private PaperPublishLevelMapper paperPublishLevelMapper;

    /**
     * 查询所有的刊物等级
     * @return 返回所有的刊物等级的集合
     */
    @Override
    public List<PaperPublishLevel> findPaperPublishLevelList() {
        //通过Criteria查询对象查询的四个步骤：

        //1.创建一个PaperPublishLevelExample对象
        PaperPublishLevelExample paperPublishLevelExample = new PaperPublishLevelExample();
        //2.通过example类中的createCriteria()创建一个criteria对象
        PaperPublishLevelExample.Criteria criteria = paperPublishLevelExample.createCriteria();
        //3.给criteria对象增加查询条件
        criteria.andPublishLevelIdIsNotNull(); //创建id列不为空的条件，即可表示查询所有的值
        //4.调selectByExample方法查询满足条件的结果集存放到集合中
        List<PaperPublishLevel> paperPublishLevelList = paperPublishLevelMapper.selectByExample(paperPublishLevelExample);

        return paperPublishLevelList;
    }

    /**
     * 更新刊物等级
     * @param paperPublishLevel 刊物等级对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public void updataPaperPublishLevel(PaperPublishLevel paperPublishLevel) {
        //如果名称已存在直接抛出名称异常信息
        //此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if (paperPublishLevel.getIsEffective() == null) {
            if (this.findPublishLevelNameIsExistedUpdate(paperPublishLevel)) {
                throw new RuntimeException("该刊物等级已存在");
            }
        }
        try {
            paperPublishLevelMapper.updateByPrimaryKeySelective(paperPublishLevel); //updateByPrimaryKeySelective方法表示通过主键更新属性值不为null的列
        } catch (Exception e) {
            //e.printStackTrace();  不打印报错信息
            throw new RuntimeException("更新数据异常");
        }
    }

    /**
     * 插入刊物等级
     * @param paperPublishLevel 刊物等级对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public void insertPaperPublishLevel(PaperPublishLevel paperPublishLevel) {
        //如果名称已存在直接抛出名称异常信息
        //此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if (this.findPublishLevelNameIsExistedInsert(paperPublishLevel.getPublishLevelName())) {
            throw new RuntimeException("该刊物等级已存在");
        }
        try {
            paperPublishLevelMapper.insertSelective(paperPublishLevel);
        } catch (Exception e) {
            //e.printStackTrace();  不打印报错信息
            throw new RuntimeException("插入数据异常");
        }
    }

    /**
     * 更新：查询数据库是否存在同名的paperPublishLevel
     * @param paperPublishLevel 刊物等级对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    @Override
    public boolean findPublishLevelNameIsExistedUpdate(PaperPublishLevel paperPublishLevel) {
        PaperPublishLevelExample paperPublishLevelExample = new PaperPublishLevelExample();
        PaperPublishLevelExample.Criteria criteria = paperPublishLevelExample.createCriteria();
        if (paperPublishLevel.getPublishLevelName() != null){
            criteria.andPublishLevelNameEqualTo(paperPublishLevel.getPublishLevelName());
        }
        //排除自身
        if (paperPublishLevel.getPublishLevelId() != null){
            criteria.andPublishLevelIdNotEqualTo(paperPublishLevel.getPublishLevelId());
        }
        List<PaperPublishLevel> paperPublishLevelList = paperPublishLevelMapper.selectByExample(paperPublishLevelExample);
        //大于0表示查询到记录，即数据库已存在
        if (paperPublishLevelList.size() > 0){
            return true;
        }
        return false;
    }

    /**
     * 插入：查询数据库是否存在同名的paperPublishLevel
     * @param validateName 输入的成果级别名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    @Override
    public boolean findPublishLevelNameIsExistedInsert(String validateName) {
        PaperPublishLevelExample paperPublishLevelExample = new PaperPublishLevelExample();
        PaperPublishLevelExample.Criteria criteria = paperPublishLevelExample.createCriteria();
        if (validateName != null) {
            criteria.andPublishLevelNameEqualTo(validateName);
        }
        List<PaperPublishLevel> paperPublishLevelList = paperPublishLevelMapper.selectByExample(paperPublishLevelExample);
        //大于0表示查询到记录，即数据库已存在
        if (paperPublishLevelList.size() > 0){
            return true;
        }
        return false;
    }
}
