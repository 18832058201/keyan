package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.ESoftwareCustom;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.SoftwareResultVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/17.
 */
@Repository
public interface ESoftwareMapperCustom {
    List<ESoftwareCustom> selectSoftwareByWorkNum(String workNum);
    List<PersonListVO> selectPersonListBySoftwareId(String softwareId);
    ESoftwareCustom selectSoftwareResultInfoById(String softwareId);
}
