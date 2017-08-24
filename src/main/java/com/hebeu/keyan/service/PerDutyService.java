package com.hebeu.keyan.service;

import com.hebeu.keyan.po.PerDuty;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/30  17:05
 * 描述：个人信息--职务维护接口
 */
@Service
public interface PerDutyService {
    /**
     * 查询所有的职务
     *
     * @return 所有职务的集合
     */
    public List<PerDuty> findPerDutyList();

    /**
     * 查询 职务 记录总数
     *
     * @return 返回记录总数
     */
    public Integer findPerDutyCount();

    /**
     * 插入 职务 数据
     *
     * @param perDuty 职务对象
     */
    //此事物注解作用是当插入出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertPerDuty(PerDuty perDuty);

    /**
     * 新增：查询数据库是否已存在同名 职务
     *
     * @param validateName 职务名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findPerDutyIsExisted(String validateName);

    /**
     * 更新获奖类别（将数据置为无效）
     *
     * @param perDuty 获奖类别对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePerDuty(PerDuty perDuty);
}
