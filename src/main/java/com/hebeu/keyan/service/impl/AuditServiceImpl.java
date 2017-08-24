package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.*;
import com.hebeu.keyan.dao.customMapper.AuditMapper;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.*;
import com.hebeu.keyan.service.*;
import com.hebeu.keyan.vo.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/11 15:44
 * 描述：项目和成果审核业务接口类实现类
 */
@Service
public class AuditServiceImpl implements AuditService {
    private final AuditMapper auditMapper;
    private final EProjectMapper eProjectMapper;
    private final LengthWaysProjectService lengthWaysProjectService;
    private final EIdentifyMapper eIdentifyMapper;
    private final IdentifyResultService identifyResultService;
    private final ERewardMapper eRewardMapper;
    private final RewardResultService rewardResultService;
    private final EPatentMapper ePatentMapper;
    private final PatentResultService patentResultService;
    private final EPaperMapper ePaperMapper;
    private final PaperResultService paperResultService;
    private final ESoftwareMapper eSoftwareMapper;
    private final SoftwareResultService softwareResultService;
    private final EPlantMapper ePlantMapper;
    private final PlantResultService plantResultService;
    private final EStandardMapper eStandardMapper;
    private final StandardResultService standardResultService;
    private final EBookMapper eBookMapper;
    private final BookResultService bookResultService;

    @Autowired
    public AuditServiceImpl(AuditMapper auditMapper, EProjectMapper eProjectMapper,
                            LengthWaysProjectService lengthWaysProjectService, EIdentifyMapper eIdentifyMapper,
                            IdentifyResultService identifyResultService, ERewardMapper eRewardMapper,
                            RewardResultService rewardResultService, EPatentMapper ePatentMapper,
                            PatentResultService patentResultService, EPaperMapper ePaperMapper,
                            PaperResultService paperResultService, ESoftwareMapper eSoftwareMapper,
                            SoftwareResultService softwareResultService, EPlantMapper ePlantMapper,
                            PlantResultService plantResultService, EStandardMapper eStandardMapper,
                            StandardResultService standardResultService, EBookMapper eBookMapper,
                            BookResultService bookResultService) {
        this.auditMapper = auditMapper;
        this.eProjectMapper = eProjectMapper;
        this.lengthWaysProjectService = lengthWaysProjectService;
        this.eIdentifyMapper = eIdentifyMapper;
        this.identifyResultService = identifyResultService;
        this.eRewardMapper = eRewardMapper;
        this.rewardResultService = rewardResultService;
        this.ePatentMapper = ePatentMapper;
        this.patentResultService = patentResultService;
        this.ePaperMapper = ePaperMapper;
        this.paperResultService = paperResultService;
        this.eSoftwareMapper = eSoftwareMapper;
        this.softwareResultService = softwareResultService;
        this.ePlantMapper = ePlantMapper;
        this.plantResultService = plantResultService;
        this.eStandardMapper = eStandardMapper;
        this.standardResultService = standardResultService;
        this.eBookMapper = eBookMapper;
        this.bookResultService = bookResultService;
    }


    /**
     * 按指定条件查询纵向项目
     *
     * @param auditObjectVo 查询条件对象
     * @return 返回指定查询的项目集合
     */
    @Override
    public List<EProjectCustom> findLengthWaysProjectList(AuditObjectVo auditObjectVo) {
        //当学院id为空时就表示查询的是所有的项目
        if (null == auditObjectVo.getCollegeId()){
            return auditMapper.selectAllLengthWaysProjectList(auditObjectVo);
        }else { //不为空时表示查询对应学院的项目
            return auditMapper.selectCollegeLengthWaysProjectList(auditObjectVo);
        }
    }

    /**
     * 更新审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateProjectAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            EProject eProject = new EProject();

            setAuditStatusId(eProject,auditObjectVo);  //设置审核状态和审核意见等信息

            EProjectExample eProjectExample = new EProjectExample();
            EProjectExample.Criteria  criteria = eProjectExample.createCriteria();
            criteria.andProjectIdIn(auditObjectVo.getAuditObjectId());
            eProjectMapper.updateByExampleSelective(eProject,eProjectExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }

    }

    /**
     * 编辑项目 并同时审核项目
     *
     * @param projectVO     项目值对象
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateProject(ProjectVO projectVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(projectVO.getSubmitType())){
                setAuditStatusId(projectVO,auditObjectVo);
            }
            lengthWaysProjectService.updateProject(projectVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询鉴定成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回鉴定成果集合
     */
    @Override
    public List<EIdentifyCustom> findIdentifyResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的鉴定成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllIdentifyResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的鉴定成果
            return auditMapper.selectCollegeIdentifyResultList(auditObjectVo);
        }
    }

    /**
     * 更新鉴定成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateIdentifyAuditStatus(AuditObjectVo auditObjectVo) {
        try {

            EIdentify eIdentify = new EIdentify();

            setAuditStatusId(eIdentify,auditObjectVo);   //设置审核状态和审核人等信息

            EIdentifyExample eIdentifyExample = new EIdentifyExample();
            EIdentifyExample.Criteria criteria = eIdentifyExample.createCriteria();
            criteria.andIdentifyIdIn(auditObjectVo.getAuditObjectId());
            eIdentifyMapper.updateByExampleSelective(eIdentify,eIdentifyExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑鉴定成果
     *
     * @param identifyResultVO 鉴定成果值对象
     * @param auditObjectVo    审核对象
     */
    @Override
    public void updateIdentify(IdentifyResultVO identifyResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(identifyResultVO.getSubmitType())){
                setAuditStatusId(identifyResultVO,auditObjectVo);
            }
            identifyResultService.updateIdentifyResult(identifyResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询获奖成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回获奖成果集合
     */
    @Override
    public List<ERewardCustom> findRewardResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的获奖成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllRewardResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的获奖成果
            return auditMapper.selectCollegeRewardResultList(auditObjectVo);
        }
    }

    /**
     * 更新获奖成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateRewardAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            EReward eReward = new EReward();
            setAuditStatusId(eReward,auditObjectVo);   //设置审核状态和审核人等信息
            ERewardExample eRewardExample = new ERewardExample();
            ERewardExample.Criteria criteria = eRewardExample.createCriteria();
            criteria.andRewardIdIn(auditObjectVo.getAuditObjectId());
            eRewardMapper.updateByExampleSelective(eReward,eRewardExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑获奖成果
     *
     * @param rewardResultVO 获奖成果值对象
     * @param auditObjectVo  审核对象
     */
    @Override
    public void updateReward(RewardResultVO rewardResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(rewardResultVO.getSubmitType())){
                setAuditStatusId(rewardResultVO,auditObjectVo);
            }
            rewardResultService.updateRewardResult(rewardResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询专利成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回专利成果集合
     */
    @Override
    public List<EPatentCustom> findPatentResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的专利成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllPatentResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的专利成果
            return auditMapper.selectCollegePatentResultList(auditObjectVo);
        }
    }

    /**
     * 更新专利成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updatePatentAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            EPatent ePatent = new EPatent();
            setAuditStatusId(ePatent,auditObjectVo);   //设置审核状态和审核人等信息
            EPatentExample ePatentExample = new EPatentExample();
            EPatentExample.Criteria criteria = ePatentExample.createCriteria();
            criteria.andPatentIdIn(auditObjectVo.getAuditObjectId());
            ePatentMapper.updateByExampleSelective(ePatent,ePatentExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑专利成果
     *
     * @param patentResultVO 专利成果值对象
     * @param auditObjectVo  审核对象
     */
    @Override
    public void updatePatent(PatentResultVO patentResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(patentResultVO.getSubmitType())){
                setAuditStatusId(patentResultVO,auditObjectVo);
            }
            patentResultService.updatePatentResult(patentResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询论文成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回论文成果集合
     */
    @Override
    public List<EPaperCustom> findPaperResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的论文成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllPaperResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的论文成果
            return auditMapper.selectCollegePaperResultList(auditObjectVo);
        }
    }

    /**
     * 更新论文成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updatePaperAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            EPaper ePaper = new EPaper();
            setAuditStatusId(ePaper,auditObjectVo);   //设置审核状态和审核人等信息
            EPaperExample ePaperExample = new EPaperExample();
            EPaperExample.Criteria criteria = ePaperExample.createCriteria();
            criteria.andPaperIdIn(auditObjectVo.getAuditObjectId());
            ePaperMapper.updateByExampleSelective(ePaper,ePaperExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑论文成果
     *
     * @param paperResultVO 论文成果值对象
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updatePaper(PaperResultVO paperResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(paperResultVO.getSubmitType())){
                setAuditStatusId(paperResultVO,auditObjectVo);
            }
            paperResultService.updatePaperResult(paperResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询软件成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回软件成果集合
     */
    @Override
    public List<ESoftwareCustom> findSoftwareResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的软件成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllSoftwareResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的软件成果
            return auditMapper.selectCollegeSoftwareResultList(auditObjectVo);
        }
    }

    /**
     * 更新软件成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateSoftwareAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            ESoftware eSoftware = new ESoftware();
            setAuditStatusId(eSoftware,auditObjectVo);   //设置审核状态和审核人等信息
            ESoftwareExample eSoftwareExample = new ESoftwareExample();
            ESoftwareExample.Criteria criteria = eSoftwareExample.createCriteria();
            criteria.andSoftwareIdIn(auditObjectVo.getAuditObjectId());
            eSoftwareMapper.updateByExampleSelective(eSoftware,eSoftwareExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑软件成果
     *
     * @param softwareResultVO 软件成果值对象
     * @param auditObjectVo    审核对象
     */
    @Override
    public void updateSoftware(SoftwareResultVO softwareResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(softwareResultVO.getSubmitType())){
                setAuditStatusId(softwareResultVO,auditObjectVo);
            }
            softwareResultService.updateSoftwareResult(softwareResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询植物新品种成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回著作成果集合
     */
    @Override
    public List<EPlantCustom> findPlantResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的植物新品种成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllPlantResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的植物新品种成果
            return auditMapper.selectCollegePlantResultList(auditObjectVo);
        }
    }

    /**
     * 更新植物新品种成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updatePlantAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            EPlant ePlant = new EPlant();
            setAuditStatusId(ePlant,auditObjectVo);   //设置审核状态和审核人等信息
            EPlantExample ePlantExample = new EPlantExample();
            EPlantExample.Criteria criteria = ePlantExample.createCriteria();
            criteria.andPlantIdIn(auditObjectVo.getAuditObjectId());
            ePlantMapper.updateByExampleSelective(ePlant,ePlantExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑植物新品种成果
     *
     * @param plantResultVO 植物新品种成果值对象
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updatePlant(PlantResultVO plantResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(plantResultVO.getSubmitType())){
                setAuditStatusId(plantResultVO,auditObjectVo);
            }
            plantResultService.updatePlantResult(plantResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询标准成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回标准成果集合
     */
    @Override
    public List<EStandardCustom> findStandardResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的标准成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllStandardResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的标准成果
            return auditMapper.selectCollegeStandardResultList(auditObjectVo);
        }
    }

    /**
     * 更新标准成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateStandardAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            EStandard eStandard = new EStandard();
            setAuditStatusId(eStandard,auditObjectVo);   //设置审核状态和审核人等信息
            EStandardExample eStandardExample = new EStandardExample();
            EStandardExample.Criteria criteria = eStandardExample.createCriteria();
            criteria.andStandardIdIn(auditObjectVo.getAuditObjectId());
            eStandardMapper.updateByExampleSelective(eStandard,eStandardExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑著作成果
     *
     * @param standardResultVO 标准成果值对象
     * @param auditObjectVo    审核对象
     */
    @Override
    public void updateStandard(StandardResultVO standardResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(standardResultVO.getSubmitType())){
                setAuditStatusId(standardResultVO,auditObjectVo);
            }
            standardResultService.updateStandardResult(standardResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 按条件查询著作成果列表
     *
     * @param auditObjectVo 审核查询条件
     * @return 返回著作成果集合
     */
    @Override
    public List<EBookCustom> findBookResultList(AuditObjectVo auditObjectVo) {
        //学院id为空时就表示查询所有的著作成果
        if (auditObjectVo.getCollegeId() == null){
            return auditMapper.selectAllBookResultList(auditObjectVo);
        }else{ //不为空就表示查询对应学院的著作成果
            return auditMapper.selectCollegeBookResultList(auditObjectVo);
        }
    }

    /**
     * 更新著作成果审核状态
     *
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateBookAuditStatus(AuditObjectVo auditObjectVo) {
        try {
            EBook eBook = new EBook();
            setAuditStatusId(eBook,auditObjectVo);   //设置审核状态和审核人等信息
            EBookExample eBookExample = new EBookExample();
            EBookExample.Criteria criteria = eBookExample.createCriteria();
            criteria.andBookIdIn(auditObjectVo.getAuditObjectId());
            eBookMapper.updateByExampleSelective(eBook,eBookExample);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 审核时编辑著作成果
     *
     * @param bookResultVO  著作成果值对象
     * @param auditObjectVo 审核对象
     */
    @Override
    public void updateBook(BookResultVO bookResultVO, AuditObjectVo auditObjectVo) {
        try {
            //保存并审核
            if ("saveAndAudit".equals(bookResultVO.getSubmitType())){
                setAuditStatusId(bookResultVO,auditObjectVo);
            }
            bookResultService.updateBookResult(bookResultVO);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("审核失败");
        }
    }

    /**
     * 通过反射设置审核状态、审核意见和审核人
     * @param o  项目或成果对象
     * @param auditObjectVo 审核意见等值
     * @throws Exception 抛出异常
     */
    public void setAuditStatusId(Object o,AuditObjectVo auditObjectVo) throws Exception {
        Class aClass = o.getClass();
        //通过反射得到对象中的设置审核状态和审核人等信息
        Method setAuditStatusId = aClass.getMethod("setAuditStatusId",Integer.class);
        Method setAuditPoinion1 = aClass.getMethod("setAuditPoinion1",String.class);
        Method setAuditPersonId1 = aClass.getMethod("setAuditPersonId1",String.class);
        Method setAuditPoinion2 = aClass.getMethod("setAuditPoinion2",String.class);
        Method setAuditPersonId2 = aClass.getMethod("setAuditPersonId2",String.class);
        //主体
        Subject subject = SecurityUtils.getSubject();
        //得到登录人身份信息
        ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
        //学院审核
        if(subject.hasRole("collegeAdmin")){
            //根据操作来设置审核状态值
            if("agree".equals(auditObjectVo.getOperation())){
                setAuditStatusId.invoke(o,3); //同意审核
            }else if("refuse".equals(auditObjectVo.getOperation())){
                setAuditStatusId.invoke(o,4); //拒绝审核
            }else if("revoke".equals(auditObjectVo.getOperation())){
                setAuditStatusId.invoke(o,2);    //撤销审核
            }
            setAuditPoinion1.invoke(o,auditObjectVo.getAuditOpinion()==null?"":auditObjectVo.getAuditOpinion());//设置审核意见
            setAuditPersonId1.invoke(o,activeUser.getWorkNameAndNum());    //设置审核人姓名+工号
        }
        //科研处审核
        else if(subject.hasRole("projectSection1")||subject.hasRole("projectSection2")||subject.hasRole("projectSection3")
                ||subject.hasRole("projectSection4")||subject.hasRole("resultSection")){
            if("agree".equals(auditObjectVo.getOperation())){
                setAuditStatusId.invoke(o,5);//同意审核
            } else if("refuse".equals(auditObjectVo.getOperation())){
                setAuditStatusId.invoke(o,6);   //拒绝审核
            } else if("revoke".equals(auditObjectVo.getOperation())){
                setAuditStatusId.invoke(o,3);   //撤销审核
            }
            setAuditPoinion2.invoke(o,auditObjectVo.getAuditOpinion()==null?"":auditObjectVo.getAuditOpinion());            //设置审核状态
            setAuditPersonId2.invoke(o,activeUser.getWorkNameAndNum()); //设置审核人工号
        }
    }

}
