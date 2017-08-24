package com.hebeu.keyan.service;

import com.hebeu.keyan.po.IdenResultLevel;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/1 10:11
 * 描述：成果级别业务接口
 */
public interface IdenResultLevelService {

    /**
     * 查询所有的成果级别
     * @return 返回所有的成果级别的集合
     */
    public List<IdenResultLevel> findIdenResultLevelList();

    /**
     * 更新成果级别
     * @param idenResultLevel 成果级别对象
     */
    public void updataIdenResultLevel(IdenResultLevel idenResultLevel);

    /**
     * 插入成果级别
     * @param idenResultLevel 成果级别对象
     */
    public void insertIdenResultLevel(IdenResultLevel idenResultLevel);

    /**
     * 更新：查询数据库是否存在同名的idenResultLevel
     * @param idenResultLevel 成果级别对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findResultLevelNameIsExistedUpdate(IdenResultLevel idenResultLevel);

    /**
     * 插入：查询数据库是否存在同名的idenResultLevel
     * @param validateName 输入的成果级别名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findResultLevelNameIsExistedInsert(String validateName);

}
