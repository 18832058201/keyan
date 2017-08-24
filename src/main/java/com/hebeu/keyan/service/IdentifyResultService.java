package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.EIdentifyCustom;
import com.hebeu.keyan.vo.IdentifyResultVO;
import com.hebeu.keyan.vo.PersonListVO;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/8  11:23
 * 描述：鉴定成果相关处理类接口
 */
public interface IdentifyResultService {
    /**
     * 通过 工号 查询 鉴定成果 集合
     *
     * @param workNum 指定查询的工号
     * @return 返回指定 工号 的 鉴定成果 集合
     */
    public List<EIdentifyCustom> findIdentifyResultListByWorkNum(String workNum);

    /**
     * 插入鉴定成果
     *
     * @param identifyResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void insertIdentifyResult(IdentifyResultVO identifyResultVO);

    /**
     * 通过鉴定成果id查询 鉴定成果 详细信息
     *
     * @param identifyId 鉴定成果id
     * @return 返回鉴定成果对象
     */
    public EIdentifyCustom findIdentifyResultByIdentifyId(String identifyId);

    /**
     * 通过鉴定成果id查询 鉴定成果 人员列表详细信息
     *
     * @param identifyId 鉴定成果id
     * @return 返回鉴定成果 人员列表对象
     */
    public List<PersonListVO> findPersonListByIdentifyId(String identifyId);

    /**
     * 编辑项目
     *
     * @param identifyResultVO 项目值对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateIdentifyResult(IdentifyResultVO identifyResultVO);

    /**
     * 检查是否存在同名鉴定成果
     * @param identifyResultVO 项目对象
     * @return 存在就返回true  ，不存在返回false
     */
    public boolean identifyNameIsExisted(IdentifyResultVO identifyResultVO);

    /**
     * 删除指定id的鉴定成果
     * @param identifyId
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void deleteIdentifyResultByIdentifyId(String identifyId);
}
