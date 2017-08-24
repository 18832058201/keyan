package com.hebeu.keyan.service;

import com.hebeu.keyan.po.PerPostLevel;
import com.hebeu.keyan.po.PerPostType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/7/31  11:58
 * 描述：绩效 业务接口
 */
@Service
public interface PerPostService {
    /**
     * 查询所有的 绩效等级
     *
     * @return 返回所有的 绩效等级 集合
     */
    public List<PerPostLevel> findPerPostLevelList();

    /**
     * 查询 绩效 记录总数
     *
     * @return 返回记录总数
     */
    public Integer findPerPostLevelCount();

    /**
     * 查询所有的 绩效类型
     *
     * @return 返回 绩效类型 集合
     */
    public List<PerPostType> findPerPostTypeList();

    /**
     * 编辑 绩效的倍率
     *
     * @param perPostLevel 绩效 对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePerPostLevel(PerPostLevel perPostLevel);
}
