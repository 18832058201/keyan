package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.customMapper.CommonMapper;
import com.hebeu.keyan.po.customPO.AllProjectCustom;
import com.hebeu.keyan.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/9  8:09
 * 描述：公共业务实现类
 */
@Service
public class CommonServiceImpl implements CommonService{
    private final CommonMapper commonMapper;
    @Autowired
    public CommonServiceImpl(CommonMapper commonMapper){
        this.commonMapper = commonMapper;
    }
    /**
     * 查询指定workNum参与的所有项目（科研处审核通过的）
     * @param workNum
     * @return allProjectCustom集合
     */
    public List<AllProjectCustom> findAllProjectByWorkNum(String workNum){
        return commonMapper.findAllProjectByWorkNum(workNum);
    }
}
