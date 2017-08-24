package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.EPlantCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/20.
 */
@Repository
public interface EPlantMapperCustom {
    public List<EPlantCustom> selectPlantByWorkNum(String workNum);
    public EPlantCustom selectPlantResultInfoById(String plantId);
    public List<PersonListVO> selectPersonListByPlantId(String plantId);
}
