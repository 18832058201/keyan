package com.hebeu.keyan.service;

import com.hebeu.keyan.po.PatType;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/1 21:08
 * 描述：专利类型业务接口
 */
public interface PatTypeServeice {

    /**
     * 查询所有的专利类型
     * @return 返回所有的专利类型的集合
     */
    public List<PatType> findPatTypeList();

    /**
     * 更新专利类型
     * @param patType 专利类型对象
     */
    public void updatePatType(PatType patType);

}
