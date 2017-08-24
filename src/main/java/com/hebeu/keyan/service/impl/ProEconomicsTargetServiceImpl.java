package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ProEconomicsTargetMapper;
import com.hebeu.keyan.po.ProEconomicsTarget;
import com.hebeu.keyan.po.ProEconomicsTargetExample;
import com.hebeu.keyan.service.ProEconomicsTargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：张程
 * 时间：2017/7/31 21:24
 * 描述：社会经济目标表service
 */
@Service
public class ProEconomicsTargetServiceImpl implements ProEconomicsTargetService {
    private ProEconomicsTargetMapper proEconomicsTargetMapper;
    @Autowired
    public ProEconomicsTargetServiceImpl(ProEconomicsTargetMapper proEconomicsTargetMapper) {
        this.proEconomicsTargetMapper = proEconomicsTargetMapper;
    }

    /**
     * 查找社会经济目标表的所有信息
     * @return 返回社会经济目标List
     */
    @Override
    public List<ProEconomicsTarget> findProEconomicsTargetList() {
        List<ProEconomicsTarget> proEconomicsTargetList;
        ProEconomicsTargetExample proEconomicsTargetExample = new ProEconomicsTargetExample();
        ProEconomicsTargetExample.Criteria criteria = proEconomicsTargetExample.createCriteria();
        criteria.andEconomicsTargetIdIsNotNull();
        proEconomicsTargetList = proEconomicsTargetMapper.selectByExample(proEconomicsTargetExample);
        return proEconomicsTargetList;
    }

    /**
     * 查找社会经济目标表的记录数
     * @return 返回社会经济目标表的记录数
     */
    @Override
    public Integer findProEconomicsTargetCount() {
        Integer ProEconomicsTargetCount = null;
        ProEconomicsTargetExample proEconomicsTargetExample = new ProEconomicsTargetExample();
        ProEconomicsTargetExample.Criteria criteria = proEconomicsTargetExample.createCriteria();
        criteria.andEconomicsTargetIdIsNotNull();
        ProEconomicsTargetCount = proEconomicsTargetMapper.countByExample(proEconomicsTargetExample);
        return ProEconomicsTargetCount;
    }

    /**
     * 插入社会经济目标
     * @param proEconomicsTarget
     */
    @Override
    public void insertProEconomicsTarget(ProEconomicsTarget proEconomicsTarget) {
        if(this.findProEconomicsTargetIsExisted(proEconomicsTarget)){
            throw new RuntimeException("proEconomicsTarget插入重复");
        }
        try{
            proEconomicsTargetMapper.insertSelective(proEconomicsTarget);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("proEconomicsTarget插入异常");
        }
    }

    /**
     * 判断数据是否重复
     * @param proEconomicsTarget
     * @return
     */
    @Override
    public boolean findProEconomicsTargetIsExisted(ProEconomicsTarget proEconomicsTarget) {
        ProEconomicsTargetExample proEconomicsTargetExample = new ProEconomicsTargetExample();
        ProEconomicsTargetExample.Criteria criteria = proEconomicsTargetExample.createCriteria();
        criteria.andEconomicsTargetNameEqualTo(proEconomicsTarget.getEconomicsTargetName());
        List<ProEconomicsTarget> proEconomicsTargetList =
                proEconomicsTargetMapper.selectByExample(proEconomicsTargetExample);
        if (proEconomicsTargetList.size()>0){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 更新ProEconomicsTarget
     * @param proEconomicsTarget
     */
    @Override
    public void updateProEconomicsTarget(ProEconomicsTarget proEconomicsTarget) {
        try {
            proEconomicsTargetMapper.updateByPrimaryKeySelective(proEconomicsTarget);
        }catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }
}
