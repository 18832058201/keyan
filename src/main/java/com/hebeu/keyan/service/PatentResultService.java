package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.EPatentCustom;
import com.hebeu.keyan.vo.PatentResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/10.
 */
@Service
public interface PatentResultService {
    List<EPatentCustom> findPatentResultListByWorkNum(String workNum);
    void insertPatentResult(PatentResultVO patentResultVO);
    EPatentCustom findPatentResultById(String patentId);
    List<PersonListVO> findPersonalListById(String patentId);
    public void updatePatentResult(PatentResultVO patentResultVO);
    public void deletePatentResult(String patentId);
    public boolean patentNameIsExisted(PatentResultVO patentResultVO);
}
