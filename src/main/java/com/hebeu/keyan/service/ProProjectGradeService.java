package com.hebeu.keyan.service;

import com.hebeu.keyan.po.ProEconomicsTarget;
import com.hebeu.keyan.po.ProProjectGrade;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
@Service
public interface ProProjectGradeService {
    /**
     * 查询所有项目等级
     * @return 返回项目等级列表
     */
    public List<ProProjectGrade> findProProjectGradeList();

    /**
     * 查询项目等级记录数量
     * @return 返回项目等级记录数量
     */
    public Integer findProProjectGradeCount();

    /**
     * 插入一条项目等级
     * @param
     */
    public void insertProProjectGrade(ProProjectGrade proProjectGrade);

    /**
     * 查询重复的记录
     * @param
     * @return true存在重复，false表示不存在
     */
    public boolean findProProjectGradeIsExisted(ProProjectGrade proProjectGrade);

    /**
     * 更新ProProjectGrade
     * @param
     */
    public void updateProProjectGrade(ProProjectGrade proProjectGrade);
}
