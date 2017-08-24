package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ProProjectSourceMapper;
import com.hebeu.keyan.po.ProProjectSource;
import com.hebeu.keyan.po.ProProjectSourceExample;
import com.hebeu.keyan.service.ProProjectSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
@Service
public class ProProjectSourceServiceImpl implements ProProjectSourceService {
    private ProProjectSourceMapper proProjectSourceMapper;

    @Autowired
    public ProProjectSourceServiceImpl(ProProjectSourceMapper proProjectSourceMapper){
        this.proProjectSourceMapper = proProjectSourceMapper;
    }
    @Override
    public List<ProProjectSource> fidProProjectSourceList() {
        ProProjectSourceExample proProjectSourceExample = new ProProjectSourceExample();
        ProProjectSourceExample.Criteria criteria = proProjectSourceExample.createCriteria();
        criteria.andIsEffectiveIsNotNull();

        return proProjectSourceMapper.selectByExample(proProjectSourceExample);
    }

    @Override
    public Integer findProProjectSourceCount() {
        ProProjectSourceExample proProjectSourceExample = new ProProjectSourceExample();
        ProProjectSourceExample.Criteria criteria = proProjectSourceExample.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectSourceMapper.countByExample(proProjectSourceExample);
    }

    @Override
    public void updateProProjectSource(ProProjectSource proProjectSource) {
        if(findProProjectSourceIsExistedEdit(proProjectSource)){
            throw new RuntimeException("该项目来源已存在");
        }
        try {
            proProjectSourceMapper.updateByPrimaryKeySelective(proProjectSource);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("更新出现异常");
        }
    }

    @Override
    public void insertProProjectSource(ProProjectSource proProjectSource) {
        if(findProProjectSourceIsExisted(proProjectSource)){
            throw new RuntimeException("该项目来源已经存在");
        }
        try {
            proProjectSourceMapper.insertSelective(proProjectSource);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("新增出现问题");
        }
    }

    @Override
    public boolean findProProjectSourceIsExisted(ProProjectSource proProjectSource) {
        ProProjectSourceExample proProjectSourceExample = new ProProjectSourceExample();
        ProProjectSourceExample.Criteria criteria = proProjectSourceExample.createCriteria();
        criteria.andProjectSourceNameEqualTo(proProjectSource.getProjectSourceName());
        List<ProProjectSource> proProjectSourceList =
                proProjectSourceMapper.selectByExample(proProjectSourceExample);
        if(proProjectSourceList.size()>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean findProProjectSourceIsExistedEdit(ProProjectSource proProjectSource) {
        ProProjectSourceExample proProjectSourceExample = new ProProjectSourceExample();
        ProProjectSourceExample.Criteria criteria = proProjectSourceExample.createCriteria();
        if(proProjectSource.getProjectSourceName()==null){
            ProProjectSource proProjectSourceForTable = proProjectSourceMapper.selectByPrimaryKey(proProjectSource.getProjectSourceId());
            proProjectSource.setProjectSourceName(proProjectSourceForTable.getProjectSourceName());
        }
        if(proProjectSource.getProjectSourceName()!=null){
            criteria.andProjectSourceNameEqualTo(proProjectSource.getProjectSourceName());
        }
        if(proProjectSource.getProjectSourceId()!=null){
            criteria.andProjectSourceIdNotEqualTo(proProjectSource.getProjectSourceId());
        }
        if(proProjectSource.getSubjectTypeId()!=null){
            criteria.andSubjectTypeIdEqualTo(proProjectSource.getSubjectTypeId());
        }
        List<ProProjectSource> proProjectSourceList =
                proProjectSourceMapper.selectByExample(proProjectSourceExample);
        if(proProjectSourceList.size()>0){
            return true;
        }else {
            return false;
        }
    }
}
