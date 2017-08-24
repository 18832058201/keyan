package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.RewClassMapper;
import com.hebeu.keyan.dao.SubjectTypeMapper;
import com.hebeu.keyan.po.RewClass;
import com.hebeu.keyan.po.RewClassExample;
import com.hebeu.keyan.po.SubjectType;
import com.hebeu.keyan.po.SubjectTypeExample;
import com.hebeu.keyan.service.RewClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/7/27 12:07
 * 描述：获奖类别处理业务
 */
@Service
public class RewClassServiceImpl implements RewClassService {

    private final SubjectTypeMapper subjectTypeMapper;

    private final RewClassMapper rewClassMapper;

    @Autowired
    public RewClassServiceImpl(SubjectTypeMapper subjectTypeMapper, RewClassMapper rewClassMapper) {
        this.subjectTypeMapper = subjectTypeMapper;
        this.rewClassMapper = rewClassMapper;
    }


    /**
     * 查询所有的获奖成果
     *
     * @return 返回所有的获奖成果集合
     */
    public List<RewClass> fidRewClassList() {
        //通过Criteria查询对象查询的四个步骤：

        //1.创建一个RewClass实体类的一个Example类
        RewClassExample rewClassExample = new RewClassExample();
        //2.通过example类中的createCriteria()创建一个criteria对象
        RewClassExample.Criteria criteria = rewClassExample.createCriteria();
        //3.给criteria对象增加查询条件
        criteria.andRewClassIdIsNotNull();  //创建id列不为空的条件，即可表示查询所有的值
        //4.调selectByExample方法查询满足条件的结果集存放到集合中
        List<RewClass> rewClassList = rewClassMapper.selectByExample(rewClassExample);

        return rewClassList;
    }

    /**
     * 查询获奖类别记录总数
     *
     * @return 返回记录总数
     */
    public Integer findRewClassCount() {
        RewClassExample rewClassExample = new RewClassExample();
        RewClassExample.Criteria criteria = rewClassExample.createCriteria();
        criteria.andRewClassIdIsNotNull();
        return rewClassMapper.countByExample(rewClassExample);
    }

    /**
     * 查询所有的学科门类
     *
     * @return 返回学科门类集合
     */
    public List<SubjectType> findSubjectTypeList() {
        SubjectTypeExample subjectTypeExample = new SubjectTypeExample();
        SubjectTypeExample.Criteria criteria = subjectTypeExample.createCriteria();
        criteria.andSubjectTypeIdIsNotNull();
        List<SubjectType> subjectTypeList = subjectTypeMapper.selectByExample(subjectTypeExample);
        return subjectTypeList;
    }

    /**
     * 更新获奖类别（将数据置为无效）
     *
     * @param rewClass 获奖类别对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateRewClass(RewClass rewClass) {
        //如果名称已存在直接抛出名称异常信息
        // 此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if (rewClass.getIsEffective() == null) {
            if (this.findRewClassIsExistedEdit(rewClass)) {
                throw new RuntimeException("该获奖类别已存在");
            }
        }
        try {
            rewClassMapper.updateByPrimaryKeySelective(rewClass); //updateByPrimaryKeySelective方法表示通过主键更新属性值不为null的列
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }

    /**
     * 插入获奖类别
     *
     * @param rewClass 获奖类别对象
     */
    //此事物注解作用是当插入出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertRewClass(RewClass rewClass) {
        //如果名称已存在直接抛出名称异常信息
        // 此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if (this.findRewClassIsExisted(rewClass)) {
            throw new RuntimeException("该获奖类别已存在");
        }
        try {
            rewClassMapper.insertSelective(rewClass);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("插入数据异常");
        }
    }

    /**
     * 新增：查询数据库是否已存在同名rewClassName
     *
     * @param rewClass 获奖类别对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findRewClassIsExisted(RewClass rewClass) {
        RewClassExample rewClassExample = new RewClassExample();
        RewClassExample.Criteria criteria = rewClassExample.createCriteria();
        //此处判断同名需要两个条件，获奖类别和自社科都相同才表示重复
        if (rewClass.getRewClassName() != null) {
            criteria.andRewClassNameEqualTo(rewClass.getRewClassName());
        }
        if (rewClass.getSubjectTypeId() != null) {
            criteria.andSubjectTypeIdEqualTo(rewClass.getSubjectTypeId());
        }
        List<RewClass> rewClassList = rewClassMapper.selectByExample(rewClassExample);
        //集合大于0表示查询到该记录，即数据库已存在
        if (rewClassList.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * 编辑：查询数据库是否已存在同名rewClassName
     *
     * @param rewClass 获奖类别对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    public boolean findRewClassIsExistedEdit(RewClass rewClass) {
        RewClassExample rewClassExample = new RewClassExample();
        RewClassExample.Criteria criteria = rewClassExample.createCriteria();
        //此处判断同名需要三个条件，获奖类别和自社科都相同以及排除他自身才表示重复
        if (rewClass.getRewClassName() != null) {
            criteria.andRewClassNameEqualTo(rewClass.getRewClassName());
        }
        if (rewClass.getSubjectTypeId() != null) {
            criteria.andSubjectTypeIdEqualTo(rewClass.getSubjectTypeId());
        }
        if(rewClass.getRewClassId() != null){
            criteria.andRewClassIdNotEqualTo(rewClass.getRewClassId());
        }
        List<RewClass> rewClassList = rewClassMapper.selectByExample(rewClassExample);
        //集合大于0表示查询到该记录，即数据库已存在
        if (rewClassList.size() > 0) {
            return true;
        }
        return false;
    }

}
