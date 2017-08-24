package com.hebeu.keyan.service;

import com.hebeu.keyan.po.BudgetMoney;
import com.hebeu.keyan.po.EProject;
import com.hebeu.keyan.po.customPO.EProjectCustom;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.ProjectVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/3 18:40
 * 描述：纵向项目处理业务接口
 */
@Service
public interface LengthWaysProjectService {

    /**
     * 插入项目
     * @param projectVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertProject(ProjectVO projectVO);

    /**
     * 更新项目
     * @param projectVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateProject(ProjectVO projectVO);

    /**
     * 通过项目主键查询项目详细信息
     * @param projectId 项目id
     * @return 返回项目对象
     */
    public EProjectCustom findProjectById(String projectId);

    /**
     * 通过工号查询项目集合
     * @param workNum 指定查询的工号
     * @return 返回指定工号的项目集合
     */
    public List<EProjectCustom> findProjectListByWorkNum(String workNum);

    /**
     * 通过指定项目编号查询对应的人员列表
     * @param projectId 项目id
     * @return 返回人员列表集合
     */
    public List<PersonListVO> findPersonListByProjectId(String projectId);

    /**
     * 赋值公共属性
     * @param projectVO 项目对象
     * @param personListVO 人员对象
     */
    public void assignedCommonData(ProjectVO projectVO,PersonListVO personListVO);

    /**
     * 检查是否存在同名项目
     * @param projectVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    public boolean isExistedProject(ProjectVO projectVO);

    /**
     * 删除指定id的项目
     * @param projectId 项目id
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void deleteProject(String projectId);

    /**
     * 通过项目id查询经费预算信息
     * @param projectId 项目id
     * @return 返回经费预算信息
     */
    public BudgetMoney findBudgetMoneyByProjectId(String projectId);

    /**
     * 比较项目信息中的批准经费和预算经费总额
     * @param budgetMoney  预算经费
     * @param projectVO  项目信息
     * @return 预算经费超过批准经费返回true ，否则返回false
     */
    public boolean isExcess (BudgetMoney budgetMoney,ProjectVO projectVO);

}
