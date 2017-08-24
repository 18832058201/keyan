package com.hebeu.keyan.service;

import com.hebeu.keyan.po.ProProjectSource;
import com.hebeu.keyan.po.SubjectType;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
@Service
public interface ProProjectSourceService {

    public List<ProProjectSource> fidProProjectSourceList();
    public Integer findProProjectSourceCount();
    //@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateProProjectSource(ProProjectSource proProjectSource);
    //@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertProProjectSource(ProProjectSource proProjectSource);
    public boolean findProProjectSourceIsExisted(ProProjectSource proProjectSource);
    public boolean findProProjectSourceIsExistedEdit(ProProjectSource proProjectSource);
}
