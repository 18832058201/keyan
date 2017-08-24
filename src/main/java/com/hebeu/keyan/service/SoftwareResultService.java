package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.ESoftwareCustom;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.SoftwareResultVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */
@Service
public interface SoftwareResultService {
    List<ESoftwareCustom> findSoftwareResultListByWorkNum(String workNum);
    void insertSoftwareResult(SoftwareResultVO softwareResultVO);
    boolean softwareNameIsExisted(SoftwareResultVO softwareResultVO);
    void deleteSoftwareResult(String softwareId);
    List<PersonListVO> findPersonListBySoftwareId(String softwareId);
    ESoftwareCustom findSoftwareResult(String softwareId);
    void updateSoftwareResult(SoftwareResultVO softwareResultVO);
}
