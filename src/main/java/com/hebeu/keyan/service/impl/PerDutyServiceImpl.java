package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.PerDutyMapper;
import com.hebeu.keyan.po.PerDuty;
import com.hebeu.keyan.po.PerDutyExample;
import com.hebeu.keyan.service.PerDutyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/30  17:09
 * 描述：个人信息--职务  处理业务
 */
@Service
public class PerDutyServiceImpl implements PerDutyService {

    private final PerDutyMapper perDutyMapper;

    @Autowired
    public PerDutyServiceImpl(PerDutyMapper PerDutyMapper) {
        this.perDutyMapper = PerDutyMapper;
    }

    /**
     * 查询所有的职务
     *
     * @return 查询到的职务列表
     */
    public List<PerDuty> findPerDutyList() {
        //通过Criteria查询对象查询的四个步骤：
        //1.创建一个RewClass实体类的一个Example类
        PerDutyExample perDutyExample = new PerDutyExample();
        //2.通过example类中的createCriteria()创建一个criteria对象
        PerDutyExample.Criteria criteria = perDutyExample.createCriteria();
        //3.给criteria对象增加查询条件
        criteria.andDutyIdIsNotNull();//查询所有id不为null的职务（即查询所有）
        //4.调selectByExample方法查询满足条件的结果集存放到集合中
        List<PerDuty> perDutyList = perDutyMapper.selectByExample(perDutyExample);
        return perDutyList;
    }

    /**
     * 查询获奖类别记录总数
     *
     * @return 返回记录总数
     */
    public Integer findPerDutyCount() {
        PerDutyExample perDutyExample = new PerDutyExample();
        PerDutyExample.Criteria criteria = perDutyExample.createCriteria();
        criteria.andDutyIdIsNotNull();
        return perDutyMapper.countByExample(perDutyExample);
    }

    /**
     * 插入 职务 数据
     *
     * @param perDuty 对象
     */
    //此事物注解作用是当插入出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertPerDuty(PerDuty perDuty) {
        //如果名称已存在直接抛出名称异常信息
        // 此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if (this.findPerDutyIsExisted(perDuty.getDutyName())) {
            throw new RuntimeException("该职务已存在");
        }
        try {
            perDutyMapper.insertSelective(perDuty);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据异常");
        }
    }

    /**
     * 更新 职务（将数据置为无效）
     *
     * @param perDuty 职务 对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePerDuty(PerDuty perDuty) {
        //如果名称已存在直接抛出名称异常信息
        // 此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if(perDuty.getIsEffective() == null){
            if (this.findPerDutyIsExisted(perDuty.getDutyName())) {
                throw new RuntimeException("该职务已存在");
            }
        }
        try {
            perDutyMapper.updateByPrimaryKeySelective(perDuty);//updateByPrimaryKeySelective方法表示通过主键更新属性值不为null的列
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }

    /**
     * 新增：查询数据库是否已存在同名 职务
     *
     * @param validateName 职务 名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findPerDutyIsExisted(String validateName) {
        PerDutyExample perDutyExample = new PerDutyExample();
        PerDutyExample.Criteria criteria = perDutyExample.createCriteria();
        //判断名字即可
        if(validateName != null){
            criteria.andDutyNameEqualTo(validateName);
        }
        List<PerDuty> perDutyList = perDutyMapper.selectByExample(perDutyExample);
        //集合长度>0则存在，否则不存在
        if (perDutyList.size() > 0) {
            return true;
        }
        return false;
    }
}
