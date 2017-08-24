package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.AllProjectCustom;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/8  23:02
 * 描述：公共业务处理接口
 */
public interface CommonService {
    /**
     * 查询指定workNum参与的所有项目（科研处审核通过的）
     * @param workNum
     * @return allProjectCustom集合
     */
    public List<AllProjectCustom> findAllProjectByWorkNum(String workNum);
}
