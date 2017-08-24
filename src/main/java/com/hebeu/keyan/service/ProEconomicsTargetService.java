package com.hebeu.keyan.service;

import com.hebeu.keyan.po.ProEconomicsTarget;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@Service
public interface ProEconomicsTargetService {
    /**
     * 查询所有社会经济目标
     * @return 返回社会经济目标列表
     */
    public List<ProEconomicsTarget> findProEconomicsTargetList();

    /**
     * 查询社会经济目标记录数量
     * @return 返回社会经济目标记录数量
     */
    public Integer findProEconomicsTargetCount();

    /**
     * 插入一条社会经济目标
     * @param proEconomicsTarget
     */
    public void insertProEconomicsTarget(ProEconomicsTarget proEconomicsTarget);

    /**
     * 查询重复的记录
     * @param proEconomicsTarget
     * @return true存在重复，false表示不存在
     */
    public boolean findProEconomicsTargetIsExisted(ProEconomicsTarget proEconomicsTarget);

    /**
     * 更新ProEconomicsTarget
     * @param proEconomicsTarget
     */
    public void updateProEconomicsTarget(ProEconomicsTarget proEconomicsTarget);
}
