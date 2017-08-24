package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.EPersonEdit;
import com.hebeu.keyan.po.customPO.EPersonCustom;
import com.hebeu.keyan.po.customPO.EPersonEditCustom;
import com.hebeu.keyan.vo.PersonInfoSearchVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-18  14:53
 * 描述：人员信息 Mapper拓展接口，主要是实现自定义查询
 */
@Repository
public interface EPersonMapperCustom {
    /**
     * 根据登录人的工号，查询个人信息
     * @param workNum 工号
     * @return 个人信息对象 EPersonCustom
     */
    public EPersonCustom selectPersonInfoByWorkNum(String workNum);

    /**
     * 根据登录人的工号，查询个人编辑暂存信息
     * @param workNum 工号
     * @return 个人信息对象 EPersonEditCustom
     */
    public EPersonEditCustom selectEPersonEditByWorkNum(String workNum);

    /**
     * 根据编辑编号，查询个人编辑暂存信息
     * @param personEditId 编辑编号
     * @return 个人信息对象 EPersonEditCustom
     */
    public EPersonEditCustom selectEPersonEditByPersonEditId(String personEditId);

    /**
     * 根据审核状态、学院id查询个人信息详情审核列表
     * @param personInfoSearchVO
     */
    public List<EPersonEditCustom> selectEPersonEditCustom(@Param("personInfoSearchVO") PersonInfoSearchVO personInfoSearchVO);
}
