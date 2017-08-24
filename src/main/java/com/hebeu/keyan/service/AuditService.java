package com.hebeu.keyan.service;

import com.hebeu.keyan.po.customPO.*;
import com.hebeu.keyan.vo.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/11 13:45
 * 描述：项目和成果审核业务接口
 */
@Service
public interface AuditService {

    /**
     * 按指定条件查询纵向项目
     * @return 返回指定查询的项目集合
     */
    public List<EProjectCustom> findLengthWaysProjectList(AuditObjectVo auditObjectVo);


    /**
     * 更新项目审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateProjectAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 编辑项目 并同时审核项目
     * @param projectVO 项目值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateProject(ProjectVO projectVO,AuditObjectVo auditObjectVo);


    /**
     * 按条件查询鉴定成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回鉴定成果集合
     */
    public List<EIdentifyCustom> findIdentifyResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新鉴定成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateIdentifyAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑鉴定成果
     * @param identifyResultVO 鉴定成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateIdentify(IdentifyResultVO identifyResultVO,AuditObjectVo auditObjectVo);

    /**
     * 按条件查询获奖成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回获奖成果集合
     */
    public List<ERewardCustom> findRewardResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新获奖成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateRewardAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑获奖成果
     * @param rewardResultVO 获奖成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateReward(RewardResultVO rewardResultVO, AuditObjectVo auditObjectVo);



    /**
     * 按条件查询专利成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回专利成果集合
     */
    public List<EPatentCustom> findPatentResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新专利成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePatentAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑专利成果
     * @param patentResultVO 专利成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePatent(PatentResultVO patentResultVO, AuditObjectVo auditObjectVo);



    /**
     * 按条件查询论文成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回论文成果集合
     */
    public List<EPaperCustom> findPaperResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新论文成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePaperAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑论文成果
     * @param paperResultVO 论文成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePaper(PaperResultVO paperResultVO, AuditObjectVo auditObjectVo);



    /**
     * 按条件查询软件成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回软件成果集合
     */
    public List<ESoftwareCustom> findSoftwareResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新软件成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateSoftwareAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑软件成果
     * @param softwareResultVO 软件成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateSoftware(SoftwareResultVO softwareResultVO, AuditObjectVo auditObjectVo);


    /**
     * 按条件查询植物新品种成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回著作成果集合
     */
    public List<EPlantCustom> findPlantResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新植物新品种成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePlantAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑植物新品种成果
     * @param plantResultVO 植物新品种成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updatePlant(PlantResultVO plantResultVO, AuditObjectVo auditObjectVo);


    /**
     * 按条件查询标准成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回标准成果集合
     */
    public List<EStandardCustom> findStandardResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新标准成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateStandardAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑著作成果
     * @param standardResultVO 标准成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateStandard(StandardResultVO standardResultVO, AuditObjectVo auditObjectVo);


    /**
     * 按条件查询著作成果列表
     * @param auditObjectVo 审核查询条件
     * @return 返回著作成果集合
     */
    public List<EBookCustom> findBookResultList(AuditObjectVo auditObjectVo);


    /**
     * 更新著作成果审核状态
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateBookAuditStatus(AuditObjectVo auditObjectVo);

    /**
     * 审核时编辑著作成果
     * @param bookResultVO 著作成果值对象
     * @param auditObjectVo 审核对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateBook(BookResultVO bookResultVO, AuditObjectVo auditObjectVo);

}
