package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.IdenResultLevelMapper;
import com.hebeu.keyan.po.IdenResultLevel;
import com.hebeu.keyan.po.IdenResultLevelExample;
import com.hebeu.keyan.service.IdenResultLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/1 10:22
 * 描述：成果级别业务处理
 */
@Service("idenResultLevelService")
public class IdenResultLevelServiceImpl implements IdenResultLevelService{

    @Autowired
    private IdenResultLevelMapper idenResultLevelMapper;

    /**
     * 查询所有的成果级别
     * @return 返回所有的成果级别集合
     */
    @Override
    public List<IdenResultLevel> findIdenResultLevelList() {
        //通过Criteria查询对象查询的四个步骤：

        //1.创建一个IdenResultLevelExample对象
        IdenResultLevelExample idenResultLevelExample = new IdenResultLevelExample();
        //2.通过example类中的createCriteria()创建一个criteria对象
        IdenResultLevelExample.Criteria criteria = idenResultLevelExample.createCriteria();
        //3.给criteria对象增加查询条件
        criteria.andResultLevelIdIsNotNull(); //创建id列不为空的条件，即可表示查询所有的值
        //4.调selectByExample方法查询满足条件的结果集存放到集合中
        List<IdenResultLevel> idenResultLevelList = idenResultLevelMapper.selectByExample(idenResultLevelExample);

        return idenResultLevelList;
    }

    /**
     * 更新成果级别
     * @param idenResultLevel 成果级别对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public void updataIdenResultLevel(IdenResultLevel idenResultLevel) {
        //如果名称已存在直接抛出名称异常信息
        //此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if (idenResultLevel.getIsEffective() == null){
            if (this.findResultLevelNameIsExistedUpdate(idenResultLevel)){
                throw new RuntimeException("该成果级别已存在");
            }
        }
        try {
            idenResultLevelMapper.updateByPrimaryKeySelective(idenResultLevel); //updateByPrimaryKeySelective方法表示通过主键更新属性值不为null的列
        } catch (Exception e) {
            //e.printStackTrace();  不打印报错信息
            throw new RuntimeException("更新数据异常");
        }
    }

    /**
     * 插入成果级别
     * @param idenResultLevel 成果级别对象
     */
    //此事物注解作用是当更新出现异常时就进行回滚
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public void insertIdenResultLevel(IdenResultLevel idenResultLevel) {
        //如果名称已存在直接抛出名称异常信息
        //此语句不能放到下边的try语句里，会被catch捕捉到异常信息，运行时异常的异常信息就会被覆盖掉
        if (this.findResultLevelNameIsExistedInsert(idenResultLevel.getResultLevelName())) {
            throw new RuntimeException("该成果级别已存在");
        }
        try {
            idenResultLevelMapper.insertSelective(idenResultLevel);
        } catch (Exception e) {
            //e.printStackTrace();  不打印报错信息
            throw new RuntimeException("插入数据异常");
        }
    }

    /**
     * 更新：查询数据库是否存在同名的idenResultLevel
     * @param idenResultLevel 成果级别对象
     * @return 返回true表示已存在，返回false表示不存在
     */
    @Override
    public boolean findResultLevelNameIsExistedUpdate(IdenResultLevel idenResultLevel) {
        IdenResultLevelExample idenResultLevelExample = new IdenResultLevelExample();
        IdenResultLevelExample.Criteria criteria = idenResultLevelExample.createCriteria();
        if (idenResultLevel.getResultLevelName() != null){
            criteria.andResultLevelNameEqualTo(idenResultLevel.getResultLevelName());
        }
        //排除自身
        if (idenResultLevel.getResultLevelId() != null){
            criteria.andResultLevelIdNotEqualTo(idenResultLevel.getResultLevelId());
        }
        List<IdenResultLevel> idenResultLevelList = idenResultLevelMapper.selectByExample(idenResultLevelExample);
        //大于0表示查询到记录，即数据库已存在
        if (idenResultLevelList.size() > 0){
            return true;
        }
        return false;
    }

    /**
     * 插入：查询数据库是否存在同名的idenResultLevel
     * @param validateName 输入的成果级别名称
     * @return 返回true表示已存在，返回false表示不存在
     */
    @Override
    public boolean findResultLevelNameIsExistedInsert(String validateName) {
        IdenResultLevelExample idenResultLevelExample = new IdenResultLevelExample();
        IdenResultLevelExample.Criteria criteria = idenResultLevelExample.createCriteria();
        if (validateName != null){
            criteria.andResultLevelNameEqualTo(validateName);
        }
        List<IdenResultLevel> idenResultLevelList = idenResultLevelMapper.selectByExample(idenResultLevelExample);
        //大于0表示查询到记录，即数据库已存在
        if (idenResultLevelList.size() > 0){
            return true;
        }
        return false;
    }
}
