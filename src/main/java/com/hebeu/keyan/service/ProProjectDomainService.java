package com.hebeu.keyan.service;

import com.hebeu.keyan.po.ProProjectDomain;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：张程
 * 时间：2017/8/1 16:23
 * 描述：项目所属领域业务接口
 */
@Service
public interface ProProjectDomainService {
    /**
     * 查询所有的ProProjectDomain
     * @return 返回ProProjectDomain集合
     */
    public List<ProProjectDomain> findProProjectDomainList();

    /**
     * 查询记录数量
     * @return 返回记录数Integer
     */
    public Integer findProProjectDomainCount();
    public void insertProProjectDomain(ProProjectDomain proProjectDomain);
    public boolean findProProjectDomainIsExisted(ProProjectDomain proProjectDomain);
    public void updateProProjectDomain(ProProjectDomain proProjectDomain);
}
