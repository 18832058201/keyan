package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.PerPostLevelMapper;
import com.hebeu.keyan.dao.PerPostTypeMapper;
import com.hebeu.keyan.dao.PerTitleLevelMapper;
import com.hebeu.keyan.dao.PerTitleTypeMapper;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.service.PerPostService;
import com.hebeu.keyan.service.PerTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/31  12:25
 * 描述：个人信息--职称 处理业务
 */
@Service
public class PerTitleServiceImpl implements PerTitleService{
    private final PerTitleLevelMapper perTitleLevelMapper;
    private final PerTitleTypeMapper perTitleTypeMapper;
    @Autowired
    public PerTitleServiceImpl(PerTitleLevelMapper perTitleLevelMapper, PerTitleTypeMapper perTitleTypeMapper){
        this.perTitleLevelMapper = perTitleLevelMapper;
        this.perTitleTypeMapper = perTitleTypeMapper;
    }

    /**
     * 查询所有的 职称类型
     *
     * @return 返回所有的 职称类型集合
     */
    public List<PerTitleType> findPerTitleTypeList() {
        //通过Criteria查询对象查询的四个步骤：
        //1.创建一个RewClass实体类的一个Example类
        PerTitleTypeExample perTitleTypeExample = new PerTitleTypeExample();
        //2.通过example类中的createCriteria()创建一个criteria对象
        PerTitleTypeExample.Criteria criteria = perTitleTypeExample.createCriteria();
        //3.给criteria对象增加查询条件
        criteria.andTitleTypeIdIsNotNull();  //创建id列不为空的条件，即可表示查询所有的值
        //4.调selectByExample方法查询满足条件的结果集存放到集合中
        List<PerTitleType> perTitleTypeList = perTitleTypeMapper.selectByExample(perTitleTypeExample);
        return perTitleTypeList;
    }

    /**
     * 查询 职称等级 记录总数
     *
     * @return 返回记录总数
     */
    public Integer findPerTitleLevelCount() {
        PerTitleLevelExample perTitleLevelExample = new PerTitleLevelExample();
        PerTitleLevelExample.Criteria criteria = perTitleLevelExample.createCriteria();
        criteria.andTitleLevelIdIsNotNull();
        return perTitleLevelMapper.countByExample(perTitleLevelExample);
    }

    /**
     * 查询所有的 职称等级
     *
     * @return 返回 职称等级集合
     */
    public List<PerTitleLevel> findPerTitleLevelList() {
        PerTitleLevelExample perTitleLevelExample = new PerTitleLevelExample();
        PerTitleLevelExample.Criteria criteria = perTitleLevelExample.createCriteria();
        criteria.andTitleLevelIdIsNotNull();
        List<PerTitleLevel> perTitleLevelList = perTitleLevelMapper.selectByExample(perTitleLevelExample);
        return perTitleLevelList;
    }

    /**
     * 更新 职称倍率 数据
     * @param perTitleLevel 职称 对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePerTitleLevel(PerTitleLevel perTitleLevel) {
        try {
            perTitleLevelMapper.updateByPrimaryKeySelective(perTitleLevel); //updateByPrimaryKeySelective方法表示通过主键更新属性值不为null的列
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }
}
