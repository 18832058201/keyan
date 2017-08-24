package com.hebeu.keyan.service;

import com.hebeu.keyan.po.ProProjectType1;
import com.hebeu.keyan.po.ProProjectType2;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
@Service
public interface ProProjectTypeService {
    public List<ProProjectType1> findProProjectType1List();
    public List<ProProjectType2> findProProjectType2List();
    public Integer findProProjectType2Count();
    public void insertProProjectType1(ProProjectType1 proProjectType1);
    public void insertProProjectType2(ProProjectType2 proProjectType2);
    public void updateProProjectType1(ProProjectType1 proProjectType1);
    public void updateProProjectType2(ProProjectType2 proProjectType2);
}
