package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ProProjectType1Mapper;
import com.hebeu.keyan.dao.ProProjectType2Mapper;
import com.hebeu.keyan.po.ProProjectType1;
import com.hebeu.keyan.po.ProProjectType1Example;
import com.hebeu.keyan.po.ProProjectType2;
import com.hebeu.keyan.po.ProProjectType2Example;
import com.hebeu.keyan.service.ProProjectTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
@Service
public class ProProjectTypeServiceImpl implements ProProjectTypeService{

    private ProProjectType1Mapper proProjectType1Mapper;
    private ProProjectType2Mapper proProjectType2Mapper;
    @Autowired
    public ProProjectTypeServiceImpl(ProProjectType1Mapper proProjectType1Mapper,ProProjectType2Mapper proProjectType2Mapper){
        this.proProjectType1Mapper = proProjectType1Mapper;
        this.proProjectType2Mapper = proProjectType2Mapper;
    }
    @Override
    public List<ProProjectType1> findProProjectType1List() {
        ProProjectType1Example proProjectType1Example = new ProProjectType1Example();
        ProProjectType1Example.Criteria criteria = proProjectType1Example.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectType1Mapper.selectByExample(proProjectType1Example);
    }

    @Override
    public List<ProProjectType2> findProProjectType2List() {
        ProProjectType2Example proProjectType2Example = new ProProjectType2Example();
        ProProjectType2Example.Criteria criteria = proProjectType2Example.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectType2Mapper.selectByExample(proProjectType2Example);
    }

    @Override
    public Integer findProProjectType2Count() {
        ProProjectType2Example proProjectType2Example = new ProProjectType2Example();
        ProProjectType2Example.Criteria criteria = proProjectType2Example.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectType2Mapper.countByExample(proProjectType2Example);
    }

    @Override
    public void insertProProjectType1(ProProjectType1 proProjectType1) {
        ProProjectType1Example proProjectType1Example = new ProProjectType1Example();
        ProProjectType1Example.Criteria criteria = proProjectType1Example.createCriteria();
        criteria.andProjectType1NameEqualTo(proProjectType1.getProjectType1Name());
        criteria.andSubjectTypeIdEqualTo(proProjectType1.getSubjectTypeId());
        List<ProProjectType1> list1 = proProjectType1Mapper.selectByExample(proProjectType1Example);
        if(list1.size()>0){
            throw new RuntimeException("表1插入重复");
        }
        try{
            proProjectType1Mapper.insertSelective(proProjectType1);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("表1插入异常");
        }
    }

    @Override
    public void insertProProjectType2(ProProjectType2 proProjectType2) {
        ProProjectType2Example proProjectType2Example = new ProProjectType2Example();
        ProProjectType2Example.Criteria criteria = proProjectType2Example.createCriteria();
        criteria.andProjectType2NameEqualTo(proProjectType2.getProjectType2Name());
        List<ProProjectType2> list2 = proProjectType2Mapper.selectByExample(proProjectType2Example);
        if(list2.size()>0){
            throw new RuntimeException("表2插入重复");
        }
        try{
            proProjectType2Mapper.insertSelective(proProjectType2);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("表2插入异常");
        }
    }

    @Override
    public void updateProProjectType1(ProProjectType1 proProjectType1) {
        ProProjectType1Example proProjectType1Example = new ProProjectType1Example();
        ProProjectType1Example.Criteria criteria = proProjectType1Example.createCriteria();
        criteria.andProjectType1NameEqualTo(proProjectType1.getProjectType1Name());
        criteria.andSubjectTypeIdEqualTo(proProjectType1.getSubjectTypeId());
        List<ProProjectType1> list1 = proProjectType1Mapper.selectByExample(proProjectType1Example);
        if(list1.size()>0){
            throw new RuntimeException("已存在该项目1类型");
        }
        try{
            proProjectType1Mapper.updateByPrimaryKeySelective(proProjectType1);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("更新异常");
        }
    }

    @Override
    public void updateProProjectType2(ProProjectType2 proProjectType2) {
        ProProjectType2Example proProjectType2Example = new ProProjectType2Example();
        ProProjectType2Example.Criteria criteria = proProjectType2Example.createCriteria();
        if(proProjectType2.getProjectType2Name()!=null){
            criteria.andProjectType2NameEqualTo(proProjectType2.getProjectType2Name());
        }
        List<ProProjectType2> list2 = proProjectType2Mapper.selectByExample(proProjectType2Example);
        if(proProjectType2.getProjectType2Name()!=null){
            if(list2.size()>0){
                throw new RuntimeException("已存在该项目2类型");
            }
        }
        try{
            proProjectType2Mapper.updateByPrimaryKeySelective(proProjectType2);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("更新异常");
        }
    }
}
