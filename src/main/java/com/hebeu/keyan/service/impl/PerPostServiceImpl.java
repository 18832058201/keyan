package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.PerPostLevelMapper;
import com.hebeu.keyan.dao.PerPostTypeMapper;
import com.hebeu.keyan.po.PerPostLevel;
import com.hebeu.keyan.po.PerPostLevelExample;
import com.hebeu.keyan.po.PerPostType;
import com.hebeu.keyan.po.PerPostTypeExample;
import com.hebeu.keyan.service.PerPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributesModelMap;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/31  12:25
 * 描述：个人信息--绩效 处理业务
 */
@Service
public class PerPostServiceImpl implements PerPostService{
    private final PerPostLevelMapper perPostLevelMapper;
    private final PerPostTypeMapper perPostTypeMapper;
    @Autowired
    public PerPostServiceImpl(PerPostLevelMapper perPostLevelMapper,PerPostTypeMapper perPostTypeMapper){
        this.perPostLevelMapper = perPostLevelMapper;
        this.perPostTypeMapper = perPostTypeMapper;
    }

    /**
     * 查询所有的绩效类型
     *
     * @return 返回所有的绩效类型集合
     */
    public List<PerPostType> findPerPostTypeList() {
        //通过Criteria查询对象查询的四个步骤：
        //1.创建一个RewClass实体类的一个Example类
        PerPostTypeExample perPostTypeExample = new PerPostTypeExample();
        //2.通过example类中的createCriteria()创建一个criteria对象
        PerPostTypeExample.Criteria criteria = perPostTypeExample.createCriteria();
        //3.给criteria对象增加查询条件
        criteria.andPostTypeIdIsNotNull();  //创建id列不为空的条件，即可表示查询所有的值
        //4.调selectByExample方法查询满足条件的结果集存放到集合中
        List<PerPostType> perPostTypeList = perPostTypeMapper.selectByExample(perPostTypeExample);
        return perPostTypeList;
    }

    /**
     * 查询 绩效 记录总数
     *
     * @return 返回记录总数
     */
    public Integer findPerPostLevelCount() {
        PerPostLevelExample perPostLevelExample = new PerPostLevelExample();
        PerPostLevelExample.Criteria criteria = perPostLevelExample.createCriteria();
        criteria.andPostLevelIdIsNotNull();
        return perPostLevelMapper.countByExample(perPostLevelExample);
    }

    /**
     * 查询所有的绩效等级
     *
     * @return 返回绩效等级集合
     */
    public List<PerPostLevel> findPerPostLevelList() {
        PerPostLevelExample perPostLevelExample = new PerPostLevelExample();
        PerPostLevelExample.Criteria criteria = perPostLevelExample.createCriteria();
        criteria.andPostLevelIdIsNotNull();
        List<PerPostLevel> perPostLevelList = perPostLevelMapper.selectByExample(perPostLevelExample);
        return perPostLevelList;
    }

    /**
     * 更新 绩效倍率 数据
     * @param perPostLevel 绩效 对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePerPostLevel(PerPostLevel perPostLevel) {
        try {
            perPostLevelMapper.updateByPrimaryKeySelective(perPostLevel); //updateByPrimaryKeySelective方法表示通过主键更新属性值不为null的列
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }
}
