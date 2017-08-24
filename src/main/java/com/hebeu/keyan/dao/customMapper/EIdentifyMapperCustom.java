package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.EIdentifyCustom;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/8  12:46
 * 描述：鉴定成果 Mapper拓展接口，主要是实现自定义查询
 */
@Repository
public interface EIdentifyMapperCustom {
    /**
     * 根据 工号 查询 鉴定成果 列表
     *
     * @param workNum 工号
     * @return 返回指定 工号 的 鉴定成果 集合
     */
    public List<EIdentifyCustom> selectIdentifyResultByWorkNum(String workNum);

    /**
     * 根据 鉴定成果编号 查询 鉴定成果
     *
     * @param identifyId 鉴定成果编号
     * @return 返回指定 鉴定成果编号 的鉴定成果信息
     */
    public EIdentifyCustom selectIdentifyResultInfoByIdentifyId(String identifyId);

    /**
     * 查询指定 鉴定成果 的人员列表
     * @param identifyId 鉴定成果
     * @return 返回指定 鉴定成果 的 人员列表集合
     */
    public List<PersonListVO> selectPersonListByIdentifyId(String identifyId);
}
