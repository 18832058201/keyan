package com.hebeu.keyan.service;

import com.hebeu.keyan.po.PaperPublishLevel;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/1 20:35
 * 描述：刊物等级业务接口
 */
public interface PaperPublishLevelService {

    /**
     * 查询所有的刊物等级
     * @return 返回所有的刊物等级的集合
     */
    public List<PaperPublishLevel> findPaperPublishLevelList();

    /**
     * 更新刊物等级
     * @param paperPublishLevel 刊物等级对象
     */
    public void updataPaperPublishLevel(PaperPublishLevel paperPublishLevel);

    /**
     * 插入刊物等级
     * @param paperPublishLevel 刊物等级对象
     */
    public void insertPaperPublishLevel(PaperPublishLevel paperPublishLevel);

    /**
     * 更新：查询数据库是否存在同名的paperPublishLevel
     * @param paperPublishLevel 刊物等级对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findPublishLevelNameIsExistedUpdate(PaperPublishLevel paperPublishLevel);

    /**
     * 插入：查询数据库是否存在同名的paperPublishLevel
     * @param validateName 输入的刊物等级名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findPublishLevelNameIsExistedInsert(String validateName);
}

