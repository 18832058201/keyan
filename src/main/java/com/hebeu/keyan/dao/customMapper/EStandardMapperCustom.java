package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.EStandardCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：张彤
 * 时间：2017/8/12 16:16
 * 描述：标准管理的Mapper扩展接口，主要实现自定义查询
 */
@Repository
public interface EStandardMapperCustom {

    /**
     * 根据工号查询标准管理
     * @param workNum
     * @return
     */
    List<EStandardCustom> selectStandardByWorkNum(String workNum);

    /**
     * 根据标管理的编号查询标准管理
     * @param standardId
     * @return
     */
    EStandardCustom selectStandardResultInfoById(String standardId);

    /**
     * 查询指定标准管理编号的人员
     * @param standardId
     * @return
     */
    List<PersonListVO> selectPersonListByStandId(String standardId);
}
