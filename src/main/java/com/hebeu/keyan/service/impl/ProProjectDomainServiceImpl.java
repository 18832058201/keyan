package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.ProProjectDomainMapper;
import com.hebeu.keyan.po.ProProjectDomain;
import com.hebeu.keyan.po.ProProjectDomainExample;
import com.hebeu.keyan.service.ProProjectDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：张程
 * 时间：2017/8/1 16:23
 * 描述：项目所属领域业务
 */
@Service
public class ProProjectDomainServiceImpl implements ProProjectDomainService{
    private ProProjectDomainMapper proProjectDomainMapper;

    @Autowired
    public ProProjectDomainServiceImpl(ProProjectDomainMapper proProjectDomainMapper){
        this.proProjectDomainMapper = proProjectDomainMapper;
    }

    @Override
    public List<ProProjectDomain> findProProjectDomainList() {
        ProProjectDomainExample proProjectDomainExample = new ProProjectDomainExample();
        ProProjectDomainExample.Criteria criteria = proProjectDomainExample.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectDomainMapper.selectByExample(proProjectDomainExample);
    }

    @Override
    public Integer findProProjectDomainCount() {
        ProProjectDomainExample proProjectDomainExample = new ProProjectDomainExample();
        ProProjectDomainExample.Criteria criteria = proProjectDomainExample.createCriteria();
        criteria.andIsEffectiveIsNotNull();
        return proProjectDomainMapper.countByExample(proProjectDomainExample);
    }

    @Override
    public void insertProProjectDomain(ProProjectDomain proProjectDomain) {
        if (this.findProProjectDomainIsExisted(proProjectDomain)){
            throw new RuntimeException("proProjectDomain重复插入");
        }
        try {
            proProjectDomainMapper.insertSelective(proProjectDomain);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("proProjectDomain插入异常");
        }
    }

    @Override
    public boolean findProProjectDomainIsExisted(ProProjectDomain proProjectDomain) {
        ProProjectDomainExample proProjectDomainExample = new ProProjectDomainExample();
        ProProjectDomainExample.Criteria criteria = proProjectDomainExample.createCriteria();
        criteria.andProjectDomainNameEqualTo(proProjectDomain.getProjectDomainName());
        List<ProProjectDomain> proProjectDomainList
                = proProjectDomainMapper.selectByExample(proProjectDomainExample);
        if(proProjectDomainList.size()>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void updateProProjectDomain(ProProjectDomain proProjectDomain) {
        try{
            proProjectDomainMapper.updateByPrimaryKeySelective(proProjectDomain);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("更新数据异常");
        }
    }
}
