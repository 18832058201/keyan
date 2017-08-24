package com.hebeu.keyan.service;

import com.hebeu.keyan.po.RewClass;
import com.hebeu.keyan.po.SubjectType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/7/28 15:19
 * 描述：获奖类别业务接口
 */
@Service
public interface RewClassService {
    /**
     * 查询所有的获奖成果
     *
     * @return 返回所有的获奖成果集合
     */
    public List<RewClass> fidRewClassList();

    /**
     * 查询获奖类别记录总数
     *
     * @return 返回记录总数
     */
    public Integer findRewClassCount();

    /**
     * 查询所有的学科门类
     *
     * @return 返回学科门类集合
     */
    public List<SubjectType> findSubjectTypeList();


    /**
     * 更新获奖类别（将数据置为无效）
     *
     * @param rewClass 获奖类别对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateRewClass(RewClass rewClass);

    /**
     * 插入获奖类别
     *
     * @param rewClass 获奖类别对象
     */
    //此事物注解作用是当插入出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertRewClass(RewClass rewClass);

    /**
     * 新增：查询数据库是否已存在同名rewClassName
     *
     * @param rewClass 获奖类别对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findRewClassIsExisted(RewClass rewClass);

    /**
     * 编辑：查询数据库是否已存在同名rewClassName
     *
     * @param rewClass 获奖类别对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findRewClassIsExistedEdit(RewClass rewClass);

}
