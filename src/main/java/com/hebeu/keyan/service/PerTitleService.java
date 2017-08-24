package com.hebeu.keyan.service;

import com.hebeu.keyan.po.PerTitleLevel;
import com.hebeu.keyan.po.PerTitleType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/31  11:58
 * 描述：职称 业务接口
 */
@Service
public interface PerTitleService {
    /**
     * 查询所有的 职称 等级
     *
     * @return 返回所有的 职称等级 集合
     */
    public List<PerTitleLevel> findPerTitleLevelList();

    /**
     * 查询 职称等级 记录总数
     *
     * @return 返回记录总数
     */
    public Integer findPerTitleLevelCount();

    /**
     * 查询所有的 职称类型
     *
     * @return 返回 职称类型 集合
     */
    public List<PerTitleType> findPerTitleTypeList();

    /**
     * 编辑 职称 的倍率
     *
     * @param perTitleLevel 职称 对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePerTitleLevel(PerTitleLevel perTitleLevel);
}
