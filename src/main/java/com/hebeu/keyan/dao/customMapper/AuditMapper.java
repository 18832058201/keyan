package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.*;
import com.hebeu.keyan.vo.AuditObjectVo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/11 13:59
 * 描述：查询指定审核条件的项目或成果集合
 */
@Repository
public interface AuditMapper {

    /**
     * 查询指定学院满足审核条件的项目
     * @param auditObjectVo 查询条件查询条件对象
     * @return 返回满足条件的项目集合
     */
    public List<EProjectCustom> selectCollegeLengthWaysProjectList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有的满足审核条件的项目
     * @param auditObjectVo  查询条件对象
     * @return 返回指定查询的项目集合
     */
    public List<EProjectCustom> selectAllLengthWaysProjectList(AuditObjectVo auditObjectVo);

    /**
     * 查询指定学院满足审核条件的鉴定成果
     * @param auditObjectVo 查询条件
     * @return 返回鉴定成果集合
     */
    public List<EIdentifyCustom> selectCollegeIdentifyResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有满足审核条件的鉴定成果
     * @param auditObjectVo 查询条件
     * @return 返回鉴定成果集合
     */
    public List<EIdentifyCustom> selectAllIdentifyResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询指定学院满足审核条件的获奖成果
     * @param auditObjectVo 查询条件
     * @return 返回获奖成果合
     */
    public List<ERewardCustom> selectCollegeRewardResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有满足审核条件的获奖成果
     * @param auditObjectVo 查询条件
     * @return 返回获奖成果集合
     */
    public List<ERewardCustom> selectAllRewardResultList(AuditObjectVo auditObjectVo);


    /**
     * 查询指定学院满足审核条件的专利成果
     * @param auditObjectVo 查询条件
     * @return 返回专利成果集合
     */
    public List<EPatentCustom> selectCollegePatentResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有满足审核条件的专利成果
     * @param auditObjectVo 查询条件
     * @return 返回专利成果集合
     */
    public List<EPatentCustom> selectAllPatentResultList(AuditObjectVo auditObjectVo);


    /**
     * 查询指定学院满足审核条件的论文成果
     * @param auditObjectVo 查询条件
     * @return 返回论文成果集合
     */
    public List<EPaperCustom> selectCollegePaperResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有满足审核条件的专论文成果
     * @param auditObjectVo 查询条件
     * @return 返回论文成果集合
     */
    public List<EPaperCustom> selectAllPaperResultList(AuditObjectVo auditObjectVo);


    /**
     * 查询指定学院满足审核条件的软件成果
     * @param auditObjectVo 查询条件
     * @return 返回软件成果集合
     */
    public List<ESoftwareCustom> selectCollegeSoftwareResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有满足审核条件的软件成果
     * @param auditObjectVo 查询条件
     * @return 返回软件成果集合
     */
    public List<ESoftwareCustom> selectAllSoftwareResultList(AuditObjectVo auditObjectVo);


    /**
     * 查询指定学院满足审核条件的植物新品种成果
     * @param auditObjectVo 查询条件
     * @return 返回植物新品种成果集合
     */
    public List<EPlantCustom> selectCollegePlantResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有满足审核条件的软件成果
     * @param auditObjectVo 查询条件
     * @return 返回植物新品种成果集合
     */
    public List<EPlantCustom> selectAllPlantResultList(AuditObjectVo auditObjectVo);


    /**
     * 查询指定学院满足审核条件的标准管理成果
     * @param auditObjectVo 查询条件
     * @return 返回标准管理成果集合
     */
    public List<EStandardCustom> selectCollegeStandardResultList(AuditObjectVo auditObjectVo);

    /**
     * 查询所有满足审核条件的标准管理成果
     * @param auditObjectVo 查询条件
     * @return 返回标准管理成果集合
     */
    public List<EStandardCustom> selectAllStandardResultList(AuditObjectVo auditObjectVo);


    /**
     * 查询指定学院满足审核条件的著作成果
     * @param auditObjectVo 查询条件
     * @return 返回著作成果合
     */
    public List<EBookCustom> selectCollegeBookResultList(AuditObjectVo auditObjectVo);
    /**
     * 查询所有满足审核条件的著作成果
     * @param auditObjectVo 查询条件
     * @return 返回著作成果集合
     */
    public List<EBookCustom> selectAllBookResultList(AuditObjectVo auditObjectVo);


}
