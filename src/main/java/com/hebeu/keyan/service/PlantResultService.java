package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.EPlantCustom;
import com.hebeu.keyan.vo.PersonListVO;
import com.hebeu.keyan.vo.PlantResultVO;

import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
public interface PlantResultService {
    public List<EPlantCustom> findPlantResultListByWorkNum(String workNum);
    public void insertPlantResult(PlantResultVO plantResultVO);
    public EPlantCustom findPlantResultById(String plantId);
    public List<PersonListVO> findPersonListByPlantId(String plantId);
    public void updatePlantResult(PlantResultVO plantResultVO);
    public boolean plantNameIsExisted(PlantResultVO plantResultVO);
    public void deleteBookResultByPlantId(String plantId);
}
