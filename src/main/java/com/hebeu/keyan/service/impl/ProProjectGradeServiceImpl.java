package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ProProjectGradeMapper;
import com.hebeu.keyan.po.ProProjectGrade;
import com.hebeu.keyan.po.ProProjectGrade;
import com.hebeu.keyan.po.ProProjectGradeExample;
import com.hebeu.keyan.service.ProProjectGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：张程
 * 时间：2017/8/2 17:45
 * 描述：项目等级业务
 */
@Service
public class ProProjectGradeServiceImpl implements ProProjectGradeService{
    private ProProjectGradeMapper proProjectGradeMapper;
    @Autowired
    public ProProjectGradeServiceImpl(ProProjectGradeMapper proProjectGradeMapper){
        this.proProjectGradeMapper = proProjectGradeMapper;
    }
    @Override
    public List<ProProjectGrade> findProProjectGradeList() {
        ProProjectGradeExample proProjectGradeExample = new ProProjectGradeExample();
        ProProjectGradeExample.Criteria criteria = proProjectGradeExample.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectGradeMapper.selectByExample(proProjectGradeExample);
    }

    @Override
    public Integer findProProjectGradeCount() {
        ProProjectGradeExample proProjectGradeExample = new ProProjectGradeExample();
        ProProjectGradeExample.Criteria criteria = proProjectGradeExample.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectGradeMapper.countByExample(proProjectGradeExample);
    }

    @Override
    public void insertProProjectGrade(ProProjectGrade proProjectGrade) {
        if (this.findProProjectGradeIsExisted(proProjectGrade)){
            throw new RuntimeException("ProProjectGrade重复插入");
        }
        try {
            proProjectGradeMapper.insertSelective(proProjectGrade);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("ProProjectGrade插入异常");
        }
    }

    @Override
    public boolean findProProjectGradeIsExisted(ProProjectGrade proProjectGrade) {
        ProProjectGradeExample ProProjectGradeExample = new ProProjectGradeExample();
        ProProjectGradeExample.Criteria criteria = ProProjectGradeExample.createCriteria();
        criteria.andProjectGradeNameEqualTo(proProjectGrade.getProjectGradeName());
        List<ProProjectGrade> ProProjectGradeList =
                proProjectGradeMapper.selectByExample(ProProjectGradeExample);
        if (ProProjectGradeList.size()>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void updateProProjectGrade(ProProjectGrade proProjectGrade) {
        try {
            proProjectGradeMapper.updateByPrimaryKeySelective(proProjectGrade);
        }catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }
}
