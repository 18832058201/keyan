package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.PatTypeMapper;
import com.hebeu.keyan.po.PatType;
import com.hebeu.keyan.po.PatTypeExample;
import com.hebeu.keyan.service.PatTypeServeice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/1 21:17
 * 描述：专利类型的业务处理
 */
@Service
public class PatTypeServiceImpl implements PatTypeServeice{

    @Autowired
    private PatTypeMapper patTypeMapper;

    /**
     * 查询所有的专利类型
     * @return 返回所有的专利类型的集合
     */
    @Override
    public List<PatType> findPatTypeList() {
        //通过Criteria查询对象查询的四个步骤：

        //1.创建一个IncludeToolExample对象
        PatTypeExample patTypeExample = new PatTypeExample();
        //2.通过example类中的createCriteria()创建一个criteria对象
        PatTypeExample.Criteria criteria = patTypeExample.createCriteria();
        //3.给criteria对象增加查询条件
        criteria.andPatTypeIdIsNotNull();  //创建id列不为空的条件，即可表示查询所有的值
        //4.调selectByExample方法查询满足条件的结果集存放到集合中
        List<PatType> patTypeList =  patTypeMapper.selectByExample(patTypeExample);

        return patTypeList;
    }

    /**
     * 更新专利类型
     * @param patType 专利类型对象
     */
    @Override
    public void updatePatType(PatType patType) {
        try {
            patTypeMapper.updateByPrimaryKeySelective(patType); //updateByPrimaryKeySelective方法表示通过主键更新属性值不为null的列
        } catch (Exception e) {
            //e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }
}
