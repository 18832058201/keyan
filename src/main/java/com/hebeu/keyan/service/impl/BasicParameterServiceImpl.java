package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.*;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.service.BasicParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/7/31 18:09
 * 描述：基础表查询（仅查询有效值）业务实现类
 */
@Service
public class BasicParameterServiceImpl implements BasicParameterService {
    private final BookPressTypeMapper bookPressTypeMapper;
    private final BookTypeMapper bookTypeMapper;
    private final IdenFormMapper idenFormMapper;
    private final IdenLevelMapper idenLevelMapper;
    private final IdenResultLevelMapper idenResultLevelMapper;
    private final IncludeToolMapper includeToolMapper;
    private final PaperPublishLevelMapper paperPublishLevelMapper;
    private final PaperPublishRangeMapper paperPublishRangeMapper;
    private final PaperPublishTypeMapper paperPublishTypeMapper;
    private final PatTypeMapper patTypeMapper;
    private final PerCountryMapper perCountryMapper;
    private final PerDegreeMapper perDegreeMapper;
    private final PerDutyMapper perDutyMapper;
    private final PerEducationMapper perEducationMapper;
    private final PerForeignLanguageMapper perForeignLanguageMapper;
    private final PerJobStatusMapper perJobStatusMapper;
    private final PerLanguageLevelMapper perLanguageLevelMapper;
    private final PerNationMapper perNationMapper;
    private final PerPostLevelMapper perPostLevelMapper;
    private final PerPostTypeMapper perPostTypeMapper;
    private final PerSubjectFirstMapper perSubjectFirstMapper;
    private final PerSubjectSecondMapper perSubjectSecondMapper;
    private final PerSubjectThirdMapper perSubjectThirdMapper;
    private final PerTitleLevelMapper perTitleLevelMapper;
    private final PerTitleTypeMapper perTitleTypeMapper;
    private final PerTutorTypeMapper perTutorTypeMapper;
    private final PlantGenusMapper plantGenusMapper;
    private final PlantGradeMapper plantGradeMapper;
    private final PlantTypeMapper plantTypeMapper;
    private final ProCooperationTypeMapper proCooperationTypeMapper;
    private final ProEconomicsIndustry1Mapper proEconomicsIndustry1Mapper;
    private final ProEconomicsIndustry2Mapper proEconomicsIndustry2Mapper;
    private final ProEconomicsIndustry3Mapper proEconomicsIndustry3Mapper;
    private final ProEconomicsTargetMapper proEconomicsTargetMapper;
    private final ProOrganizationFormMapper proOrganizationFormMapper;
    private final ProProjectDomainMapper proProjectDomainMapper;
    private final ProProjectGradeMapper proProjectGradeMapper;
    private final ProProjectSourceMapper proProjectSourceMapper;
    private final ProProjectType1Mapper proProjectType1Mapper;
    private final ProProjectType2Mapper proProjectType2Mapper;
    private final ProResultFormMapper proResultFormMapper;
    private final PubResearchTypeMapper pubResearchTypeMapper;
    private final PubSignMapper pubSignMapper;
    private final SubjectTypeMapper subjectTypeMapper;
    private final RewClassMapper rewClassMapper;
    private final RewGradeMapper rewGradeMapper;
    private final RewLevelMapper rewLevelMapper;
    private final RewFinishWayMapper rewFinishWayMapper;
    private final RewResultTypeMapper rewResultTypeMapper;
    private final RewTypeMapper rewTypeMapper;
    private final SealTypeMapper sealTypeMapper;
    private final StandBusinessMapper standBusinessMapper;
    private final StandObjectMapper standObjectMapper;
    private final StandStateMapper standStateMapper;
    private final StandTypeMapper standTypeMapper;
    private final ManageApplyTypeMapper manageApplyTypeMapper;

    @Autowired
    public BasicParameterServiceImpl(BookPressTypeMapper bookPressTypeMapper, BookTypeMapper bookTypeMapper, IdenFormMapper idenFormMapper, IdenLevelMapper idenLevelMapper, IdenResultLevelMapper idenResultLevelMapper, IncludeToolMapper includeToolMapper, PaperPublishLevelMapper paperPublishLevelMapper, PaperPublishRangeMapper paperPublishRangeMapper, PaperPublishTypeMapper paperPublishTypeMapper, PatTypeMapper patTypeMapper, PerCountryMapper perCountryMapper, PerDegreeMapper perDegreeMapper, PerDutyMapper perDutyMapper, PerEducationMapper perEducationMapper, PerForeignLanguageMapper perForeignLanguageMapper, PerJobStatusMapper perJobStatusMapper, PerLanguageLevelMapper perLanguageLevelMapper, PerNationMapper perNationMapper, PerPostLevelMapper perPostLevelMapper, PerPostTypeMapper perPostTypeMapper, PerSubjectFirstMapper perSubjectFirstMapper, PerSubjectSecondMapper perSubjectSecondMapper, PerSubjectThirdMapper perSubjectThirdMapper, PerTitleLevelMapper perTitleLevelMapper, PerTitleTypeMapper perTitleTypeMapper, PerTutorTypeMapper perTutorTypeMapper, PlantGenusMapper plantGenusMapper, PlantGradeMapper plantGradeMapper, PlantTypeMapper plantTypeMapper, ProCooperationTypeMapper proCooperationTypeMapper, ProEconomicsIndustry1Mapper proEconomicsIndustry1Mapper, ProEconomicsIndustry2Mapper proEconomicsIndustry2Mapper, ProEconomicsIndustry3Mapper proEconomicsIndustry3Mapper, ProEconomicsTargetMapper proEconomicsTargetMapper, ProOrganizationFormMapper proOrganizationFormMapper, ProProjectDomainMapper proProjectDomainMapper, ProProjectGradeMapper proProjectGradeMapper, ProProjectSourceMapper proProjectSourceMapper, ProProjectType1Mapper proProjectType1Mapper, ProProjectType2Mapper proProjectType2Mapper, ProResultFormMapper proResultFormMapper, PubResearchTypeMapper pubResearchTypeMapper, PubSignMapper pubSignMapper, SubjectTypeMapper subjectTypeMapper, RewClassMapper rewClassMapper, RewGradeMapper rewGradeMapper, RewLevelMapper rewLevelMapper, RewFinishWayMapper rewFinishWayMapper,RewResultTypeMapper rewResultTypeMapper, RewTypeMapper rewTypeMapper, SealTypeMapper sealTypeMapper, StandBusinessMapper standBusinessMapper, StandObjectMapper standObjectMapper, StandStateMapper standStateMapper, StandTypeMapper standTypeMapper,ManageApplyTypeMapper manageApplyTypeMapper) {
        this.bookPressTypeMapper = bookPressTypeMapper;
        this.bookTypeMapper = bookTypeMapper;
        this.idenFormMapper = idenFormMapper;
        this.idenLevelMapper = idenLevelMapper;
        this.idenResultLevelMapper = idenResultLevelMapper;
        this.includeToolMapper = includeToolMapper;
        this.paperPublishLevelMapper = paperPublishLevelMapper;
        this.paperPublishRangeMapper = paperPublishRangeMapper;
        this.paperPublishTypeMapper = paperPublishTypeMapper;
        this.patTypeMapper = patTypeMapper;
        this.perCountryMapper = perCountryMapper;
        this.perDegreeMapper = perDegreeMapper;
        this.perDutyMapper = perDutyMapper;
        this.perEducationMapper = perEducationMapper;
        this.perForeignLanguageMapper = perForeignLanguageMapper;
        this.perJobStatusMapper = perJobStatusMapper;
        this.perLanguageLevelMapper = perLanguageLevelMapper;
        this.perNationMapper = perNationMapper;
        this.perPostLevelMapper = perPostLevelMapper;
        this.perPostTypeMapper = perPostTypeMapper;
        this.perSubjectFirstMapper = perSubjectFirstMapper;
        this.perSubjectSecondMapper = perSubjectSecondMapper;
        this.perSubjectThirdMapper = perSubjectThirdMapper;
        this.perTitleLevelMapper = perTitleLevelMapper;
        this.perTitleTypeMapper = perTitleTypeMapper;
        this.perTutorTypeMapper = perTutorTypeMapper;
        this.plantGenusMapper = plantGenusMapper;
        this.plantGradeMapper = plantGradeMapper;
        this.plantTypeMapper = plantTypeMapper;
        this.proCooperationTypeMapper = proCooperationTypeMapper;
        this.proEconomicsIndustry1Mapper = proEconomicsIndustry1Mapper;
        this.proEconomicsIndustry2Mapper = proEconomicsIndustry2Mapper;
        this.proEconomicsIndustry3Mapper = proEconomicsIndustry3Mapper;
        this.proEconomicsTargetMapper = proEconomicsTargetMapper;
        this.proOrganizationFormMapper = proOrganizationFormMapper;
        this.proProjectDomainMapper = proProjectDomainMapper;
        this.proProjectGradeMapper = proProjectGradeMapper;
        this.proProjectSourceMapper = proProjectSourceMapper;
        this.proProjectType1Mapper = proProjectType1Mapper;
        this.proProjectType2Mapper = proProjectType2Mapper;
        this.proResultFormMapper = proResultFormMapper;
        this.pubResearchTypeMapper = pubResearchTypeMapper;
        this.pubSignMapper = pubSignMapper;
        this.subjectTypeMapper = subjectTypeMapper;
        this.rewClassMapper = rewClassMapper;
        this.rewGradeMapper = rewGradeMapper;
        this.rewLevelMapper = rewLevelMapper;
        this.rewFinishWayMapper = rewFinishWayMapper;
        this.rewResultTypeMapper = rewResultTypeMapper;
        this.rewTypeMapper = rewTypeMapper;
        this.sealTypeMapper = sealTypeMapper;
        this.standBusinessMapper = standBusinessMapper;
        this.standObjectMapper = standObjectMapper;
        this.standStateMapper = standStateMapper;
        this.standTypeMapper = standTypeMapper;
        this.manageApplyTypeMapper = manageApplyTypeMapper;
    }


    /**
     * 查询出版社类型
     *
     * @return 返回出版社类型集合
     */
    @Override
    public List<BookPressType> findBookPressType() {
        BookPressTypeExample bookPressTypeExample = new BookPressTypeExample();
        BookPressTypeExample.Criteria criteria = bookPressTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return bookPressTypeMapper.selectByExample(bookPressTypeExample);
    }

    /**
     * 按照 学科门类 查询 著作类型
     * @param subjectTypeId 学科门类id
     * @return 返回 著作类型 集合
     */
    @Override
    public List<BookType> findBookType(Integer subjectTypeId) {
        if (subjectTypeId == null) {  //如果学科门类编号为空就直接就返回空
            return null;
        }
        BookTypeExample bookTypeExample = new BookTypeExample();
        BookTypeExample.Criteria criteria = bookTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return bookTypeMapper.selectByExample(bookTypeExample);
    }

    /**
     * 查询鉴定形式
     *
     * @return 返回鉴定形式集合
     */
    @Override
    public List<IdenForm> findIdenForm() {
        IdenFormExample idenFormExample = new IdenFormExample();
        IdenFormExample.Criteria criteria = idenFormExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return idenFormMapper.selectByExample(idenFormExample);
    }

    /**
     * 查询鉴定水平
     *
     * @return 返回鉴定水平集合
     */
    @Override
    public List<IdenLevel> findIdenLevel() {
        IdenLevelExample idenLevelExample = new IdenLevelExample();
        IdenLevelExample.Criteria criteria = idenLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return idenLevelMapper.selectByExample(idenLevelExample);
    }

    /**
     * 查询鉴定水平
     * @param subjectTypeId
     * @return 返回鉴定水平集合
     */
    @Override
    public List<IdenLevel> findIdenLevel(Integer subjectTypeId) {
        if (subjectTypeId == null) {  //如果学科门类编号为空就直接就返回空
            return null;
        }
        IdenLevelExample idenLevelExample = new IdenLevelExample();
        IdenLevelExample.Criteria criteria = idenLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return idenLevelMapper.selectByExample(idenLevelExample);
    }

    /**
     * 查询鉴定结果水平
     *
     * @return 返回鉴定结果水平集合
     */
    @Override
    public List<IdenResultLevel> findIdenResultLevel() {
        IdenResultLevelExample idenResultLevelExample = new IdenResultLevelExample();
        IdenResultLevelExample.Criteria criteria = idenResultLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return idenResultLevelMapper.selectByExample(idenResultLevelExample);
    }

    /**
     * 查询收录工具
     *
     * @return 返回收录工具集合
     */
    @Override
    public List<IncludeTool> findIncludeTool() {
        IncludeToolExample includeToolExample = new IncludeToolExample();
        IncludeToolExample.Criteria criteria = includeToolExample.createCriteria();
        criteria.andIncludeToolIdEqualTo(1);
        return includeToolMapper.selectByExample(includeToolExample);
    }

    /**
     * 查询论文出版级别
     *
     * @return 返回论文出版级别集合
     */
    @Override
    public List<PaperPublishLevel> findPaperPublishLevel() {
        PaperPublishLevelExample paperPublishLevelExample = new PaperPublishLevelExample();
        PaperPublishLevelExample.Criteria criteria = paperPublishLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return paperPublishLevelMapper.selectByExample(paperPublishLevelExample);
    }

    /**
     * 查询论文出版范围
     *
     * @return 返回论文出版范围集合
     */
    @Override
    public List<PaperPublishRange> findPaperPublishRange() {
        PaperPublishRangeExample paperPublishRangeExample = new PaperPublishRangeExample();
        PaperPublishRangeExample.Criteria criteria = paperPublishRangeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return paperPublishRangeMapper.selectByExample(paperPublishRangeExample);
    }

    /**
     * 查询论文出版类型
     *
     * @return 返回论文出版类型集合
     */
    @Override
    public List<PaperPublishType> findPaperPublishType() {
        PaperPublishTypeExample paperPublishTypeExample = new PaperPublishTypeExample();
        PaperPublishTypeExample.Criteria criteria = paperPublishTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return paperPublishTypeMapper.selectByExample(paperPublishTypeExample);
    }

    /**
     * 查询专利类型
     *
     * @return 返回专利类型集合
     */
    @Override
    public List<PatType> findPatType() {
        PatTypeExample patTypeExample = new PatTypeExample();
        PatTypeExample.Criteria criteria = patTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return patTypeMapper.selectByExample(patTypeExample);
    }

    /**
     * 查询人员国家
     *
     * @return 返回人员国家集合
     */
    @Override
    public List<PerCountry> findPerCountry() {
        PerCountryExample perCountryExample = new PerCountryExample();
        PerCountryExample.Criteria criteria = perCountryExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perCountryMapper.selectByExample(perCountryExample);
    }

    /**
     * 查询人员学位
     *
     * @return 返回人员学位集合
     */
    @Override
    public List<PerDegree> findPerDegree() {
        PerDegreeExample perDegreeExample = new PerDegreeExample();
        PerDegreeExample.Criteria criteria = perDegreeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perDegreeMapper.selectByExample(perDegreeExample);
    }

    /**
     * 查询人员职务
     *
     * @return 返回人员职务集合
     */
    @Override
    public List<PerDuty> findPerDuty() {
        PerDutyExample perDutyExample = new PerDutyExample();
        PerDutyExample.Criteria criteria = perDutyExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perDutyMapper.selectByExample(perDutyExample);
    }

    /**
     * 查询人员学历
     *
     * @return 返回学历集合
     */
    @Override
    public List<PerEducation> findPerEducation() {
        PerEducationExample perEducationExample = new PerEducationExample();
        PerEducationExample.Criteria criteria = perEducationExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perEducationMapper.selectByExample(perEducationExample);
    }

    /**
     * 查询人员外语
     *
     * @return 返回人员外语集合
     */
    @Override
    public List<PerForeignLanguage> findPerForeignLanguage() {
        PerForeignLanguageExample perForeignLanguageExample = new PerForeignLanguageExample();
        PerForeignLanguageExample.Criteria criteria = perForeignLanguageExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perForeignLanguageMapper.selectByExample(perForeignLanguageExample);
    }

    /**
     * 查询人员工作状态
     *
     * @return 返回人员工作状态集合
     */
    @Override
    public List<PerJobStatus> findPerJobStatus() {
        PerJobStatusExample perJobStatusExample = new PerJobStatusExample();
        PerJobStatusExample.Criteria criteria = perJobStatusExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perJobStatusMapper.selectByExample(perJobStatusExample);
    }

    /**
     * 查询外语水平
     *
     * @return 返回外语水平集合
     */
    @Override
    public List<PerLanguageLevel> findPerLanguageLevel() {
        PerLanguageLevelExample perLanguageLevelExample = new PerLanguageLevelExample();
        PerLanguageLevelExample.Criteria criteria = perLanguageLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perLanguageLevelMapper.selectByExample(perLanguageLevelExample);
    }

    /**
     * 查询人员民族
     *
     * @return 返回人员民族集合
     */
    @Override
    public List<PerNation> findPerNation() {
        PerNationExample perNationExample = new PerNationExample();
        PerNationExample.Criteria criteria = perNationExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perNationMapper.selectByExample(perNationExample);
    }

    /**
     * 查询人员绩效等级
     *
     * @return 返回人员绩效等级
     */
    @Override
    public List<PerPostLevel> findPerPostLevel() {
        PerPostLevelExample perPostLevelExample = new PerPostLevelExample();
        PerPostLevelExample.Criteria criteria = perPostLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perPostLevelMapper.selectByExample(perPostLevelExample);
    }

    /**
     * 查询人员绩效等级
     * @param postTypeId
     * @return 返回人员绩效等级
     */
    public List<PerPostLevel> findPerPostLevel(Integer postTypeId){
        if(postTypeId == null){
            return null;
        }
        PerPostLevelExample perPostLevelExample = new PerPostLevelExample();
        PerPostLevelExample.Criteria criteria = perPostLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andPostTypeIdEqualTo(postTypeId);
        return perPostLevelMapper.selectByExample(perPostLevelExample);
    }

    /**
     * 查询人员岗位类别
     *
     * @return 返回人员岗位类别集合
     */
    @Override
    public List<PerPostType> findPerPostType() {
        PerPostTypeExample perPostTypeExample = new PerPostTypeExample();
        PerPostTypeExample.Criteria criteria = perPostTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perPostTypeMapper.selectByExample(perPostTypeExample);
    }

    /**
     * 查询人员第一学科
     *
     * @return 返回人员第一学科集合
     */
    @Override
    public List<PerSubjectFirst> findPerSubjectFirst() {
        PerSubjectFirstExample perSubjectFirstExample = new PerSubjectFirstExample();
        PerSubjectFirstExample.Criteria criteria = perSubjectFirstExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perSubjectFirstMapper.selectByExample(perSubjectFirstExample);
    }

    /**
     * 按学科门类查询人员第一学科
     *
     * @param subjectTypeId 学科门类编号
     * @return 返回人员第一学科集合
     */
    @Override
    public List<PerSubjectFirst> findPerSubjectFirst(Integer subjectTypeId) {
        if (subjectTypeId == null) {  //如果学科门类编号为空就直接就返回空
            return null;
        }
        PerSubjectFirstExample perSubjectFirstExample = new PerSubjectFirstExample();
        PerSubjectFirstExample.Criteria criteria = perSubjectFirstExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return perSubjectFirstMapper.selectByExample(perSubjectFirstExample);
    }

    /**
     * 查询人员第二学科
     *
     * @return 返回人员第二学科
     */
    @Override
    public List<PerSubjectSecond> findPerSubjectSecond() {
        PerSubjectSecondExample perSubjectSecondExample = new PerSubjectSecondExample();
        PerSubjectSecondExample.Criteria criteria = perSubjectSecondExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perSubjectSecondMapper.selectByExample(perSubjectSecondExample);
    }

    /**
     * 查询人员第二学科
     * @param subjectFirstId
     * @return 返回人员第二学科
     */
    public List<PerSubjectSecond> findPerSubjectSecond(Integer subjectFirstId){
        if(subjectFirstId == null){
            return null;
        }
        PerSubjectSecondExample perSubjectSecondExample = new PerSubjectSecondExample();
        PerSubjectSecondExample.Criteria criteria = perSubjectSecondExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectFirstIdEqualTo(subjectFirstId);
        return perSubjectSecondMapper.selectByExample(perSubjectSecondExample);
    }

    /**
     * 查询人员第三学科
     *
     * @return 返回人员第三学科集合
     */
    @Override
    public List<PerSubjectThird> findPerSubjectThird() {
        PerSubjectThirdExample perSubjectThirdExample = new PerSubjectThirdExample();
        PerSubjectThirdExample.Criteria criteria = perSubjectThirdExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perSubjectThirdMapper.selectByExample(perSubjectThirdExample);
    }

    /**
     * 查询人员第三学科
     * @param subjectSecondId
     * @return 返回人员第三学科集合
     */
    @Override
    public List<PerSubjectThird> findPerSubjectThird(Integer subjectSecondId) {
        if(subjectSecondId == null){
            return null;
        }
        PerSubjectThirdExample perSubjectThirdExample = new PerSubjectThirdExample();
        PerSubjectThirdExample.Criteria criteria = perSubjectThirdExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectSecondIdEqualTo(subjectSecondId);
        return perSubjectThirdMapper.selectByExample(perSubjectThirdExample);
    }

    /**
     * 查询人员职称级别
     *
     * @return 返回人员职称级别集合
     */
    @Override
    public List<PerTitleLevel> findPerTitleLevel() {
        PerTitleLevelExample perTitleLevelExample = new PerTitleLevelExample();
        PerTitleLevelExample.Criteria criteria = perTitleLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perTitleLevelMapper.selectByExample(perTitleLevelExample);
    }
    /**
     * 查询人员职称级别
     * @param titleTypeId
     * @return 返回人员职称级别集合
     */
    public List<PerTitleLevel> findPerTitleLevel(Integer titleTypeId){
        if(titleTypeId == null){
            return null;
        }
        PerTitleLevelExample perTitleLevelExample = new PerTitleLevelExample();
        PerTitleLevelExample.Criteria criteria = perTitleLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andTitleTypeIdEqualTo(titleTypeId);
        return perTitleLevelMapper.selectByExample(perTitleLevelExample);
    }

    /**
     * 查询职称类别
     *
     * @return 返回职称类别集合
     */
    @Override
    public List<PerTitleType> findPerTitleType() {
        PerTitleTypeExample perTitleTypeExample = new PerTitleTypeExample();
        PerTitleTypeExample.Criteria criteria = perTitleTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perTitleTypeMapper.selectByExample(perTitleTypeExample);
    }

    /**
     * 查询人员导师类别
     *
     * @return 返回人员导师类别集合
     */
    @Override
    public List<PerTutorType> findPerTutorType() {
        PerTutorTypeExample perTutorTypeExample = new PerTutorTypeExample();
        PerTutorTypeExample.Criteria criteria = perTutorTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return perTutorTypeMapper.selectByExample(perTutorTypeExample);
    }

    /**
     * 查询新品种属或种
     *
     * @return 返回新品种属或种集合
     */
    @Override
    public List<PlantGenus> findPlantGenus() {
        PlantGenusExample plantGenusExample = new PlantGenusExample();
        PlantGenusExample.Criteria criteria = plantGenusExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return plantGenusMapper.selectByExample(plantGenusExample);
    }

    /**
     * 查询新品种等级
     *
     * @return 返回新品种等级集合
     */
    @Override
    public List<PlantGrade> findPlantGrade() {
        PlantGradeExample plantGradeExample = new PlantGradeExample();
        PlantGradeExample.Criteria criteria = plantGradeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return plantGradeMapper.selectByExample(plantGradeExample);
    }

    /**
     * 查询新品种类型
     *
     * @return 返回新品种类型集合
     */
    @Override
    public List<PlantType> findPlantType() {
        PlantTypeExample plantTypeExample = new PlantTypeExample();
        PlantTypeExample.Criteria criteria = plantTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return plantTypeMapper.selectByExample(plantTypeExample);
    }

    /**
     * 查询项目来源
     *
     * @return 返回项目来源集合
     */
    @Override
    public List<ProProjectSource> findProProjectSource() {
        ProProjectSourceExample proProjectSourceExample = new ProProjectSourceExample();
        ProProjectSourceExample.Criteria criteria = proProjectSourceExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proProjectSourceMapper.selectByExample(proProjectSourceExample);
    }

    /**
     * 查询项目来源
     *
     * @param subjectTypeId 学科门类编号
     * @return 返回项目来源集合
     */
    @Override
    public List<ProProjectSource> findProProjectSource(Integer subjectTypeId) {
        if (null == subjectTypeId) {
            return null;
        }
        ProProjectSourceExample proProjectSourceExample = new ProProjectSourceExample();
        ProProjectSourceExample.Criteria criteria = proProjectSourceExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return proProjectSourceMapper.selectByExample(proProjectSourceExample);
    }

    /**
     * 查询项目类型1
     *
     * @return 返回项目类型1集合
     */
    @Override
    public List<ProProjectType1> findProProjectType1() {
        ProProjectType1Example proProjectType1Example = new ProProjectType1Example();
        ProProjectType1Example.Criteria criteria = proProjectType1Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proProjectType1Mapper.selectByExample(proProjectType1Example);
    }

    /**
     * 查询项目类型1
     *
     * @param subjectTypeId 学科门类编号
     * @return 返回项目类型1集合
     */
    @Override
    public List<ProProjectType1> findProProjectType1(Integer subjectTypeId) {
        if (null == subjectTypeId) {
            return null;
        }
        ProProjectType1Example proProjectType1Example = new ProProjectType1Example();
        ProProjectType1Example.Criteria criteria = proProjectType1Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return proProjectType1Mapper.selectByExample(proProjectType1Example);
    }

    /**
     * 查询项目类型2
     *
     * @return 返回项目类型2集合
     */
    @Override
    public List<ProProjectType2> findProProjectType2() {
        ProProjectType2Example proProjectType2Example = new ProProjectType2Example();
        ProProjectType2Example.Criteria criteria = proProjectType2Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proProjectType2Mapper.selectByExample(proProjectType2Example);
    }

    /**
     * 查询通过对应项目类型1编号的项目类型2
     *
     * @param proProjectType1Id 项目类型1编号
     * @return 返回项目类型2集合
     */
    @Override
    public List<ProProjectType2> findProProjectType2(Integer proProjectType1Id) {
        if (proProjectType1Id == null) {
            return null;
        }
        ProProjectType2Example proProjectType2Example = new ProProjectType2Example();
        ProProjectType2Example.Criteria criteria = proProjectType2Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andProjectType1IdEqualTo(proProjectType1Id);
        return proProjectType2Mapper.selectByExample(proProjectType2Example);
    }

    /**
     * 查询研究类别
     *
     * @return 返回研究类别集合
     */
    @Override
    public List<PubResearchType> findPublicResearchType() {
        PubResearchTypeExample pubResearchTypeExample = new PubResearchTypeExample();
        PubResearchTypeExample.Criteria criteria = pubResearchTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return pubResearchTypeMapper.selectByExample(pubResearchTypeExample);
    }

    /**
     * 查询组织形式
     *
     * @return 返回组织形式集合
     */
    @Override
    public List<ProOrganizationForm> findProOrganizationForm() {
        ProOrganizationFormExample proOrganizationFormExample = new ProOrganizationFormExample();
        ProOrganizationFormExample.Criteria criteria = proOrganizationFormExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proOrganizationFormMapper.selectByExample(proOrganizationFormExample);
    }

    /**
     * 查询合作类型
     *
     * @return 返回合作类型集合
     */
    @Override
    public List<ProCooperationType> findProCooperationType() {
        ProCooperationTypeExample proCooperationTypeExample = new ProCooperationTypeExample();
        ProCooperationTypeExample.Criteria criteria = proCooperationTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proCooperationTypeMapper.selectByExample(proCooperationTypeExample);
    }

    /**
     * 查询社会经济目标
     *
     * @return 返回社会经济目标集合
     */
    @Override
    public List<ProEconomicsTarget> findProEconomicsTarget() {
        ProEconomicsTargetExample proEconomicsTargetExample = new ProEconomicsTargetExample();
        ProEconomicsTargetExample.Criteria criteria = proEconomicsTargetExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proEconomicsTargetMapper.selectByExample(proEconomicsTargetExample);
    }

    /**
     * 查询经济行业一级
     *
     * @return 返回经济行业一级集合
     */
    @Override
    public List<ProEconomicsIndustry1> findProEconomicsIndustry1() {
        ProEconomicsIndustry1Example proEconomicsIndustry1Example = new ProEconomicsIndustry1Example();
        ProEconomicsIndustry1Example.Criteria criteria = proEconomicsIndustry1Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proEconomicsIndustry1Mapper.selectByExample(proEconomicsIndustry1Example);
    }

    /**
     * 查询经济行业二级
     *
     * @return 返回经济行业二级集合
     */
    @Override
    public List<ProEconomicsIndustry2> findProEconomicsIndustry2() {
        ProEconomicsIndustry2Example proEconomicsIndustry2Example = new ProEconomicsIndustry2Example();
        ProEconomicsIndustry2Example.Criteria criteria = proEconomicsIndustry2Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proEconomicsIndustry2Mapper.selectByExample(proEconomicsIndustry2Example);
    }

    /**
     * 根据经济行业一级id查询经济行业二级
     *
     * @param proEconomicsIndustry1Id 经济行业一级id
     * @return 返回经济行业二级集合
     */
    @Override
    public List<ProEconomicsIndustry2> findProEconomicsIndustry2(String proEconomicsIndustry1Id) {
        if (proEconomicsIndustry1Id == null) {
            return null;
        }
        ProEconomicsIndustry2Example proEconomicsIndustry2Example = new ProEconomicsIndustry2Example();
        ProEconomicsIndustry2Example.Criteria criteria = proEconomicsIndustry2Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andEconomicsIndustry1IdEqualTo(proEconomicsIndustry1Id);
        return proEconomicsIndustry2Mapper.selectByExample(proEconomicsIndustry2Example);
    }

    /**
     * 查询经济行业三级
     *
     * @return 返回经济行业三级集合
     */
    @Override
    public List<ProEconomicsIndustry3> findProEconomicsIndustry3() {
        ProEconomicsIndustry3Example proEconomicsIndustry3Example = new ProEconomicsIndustry3Example();
        ProEconomicsIndustry3Example.Criteria criteria = proEconomicsIndustry3Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proEconomicsIndustry3Mapper.selectByExample(proEconomicsIndustry3Example);
    }

    /**
     * 根据经济行业二级查询经济行业三级
     *
     * @param proEconomicsIndustry2Id 经济行业二级id
     * @return 返回经济行业三级集合
     */
    @Override
    public List<ProEconomicsIndustry3> findProEconomicsIndustry3(String proEconomicsIndustry2Id) {
        if (proEconomicsIndustry2Id == null) {
            return null;
        }
        ProEconomicsIndustry3Example proEconomicsIndustry3Example = new ProEconomicsIndustry3Example();
        ProEconomicsIndustry3Example.Criteria criteria = proEconomicsIndustry3Example.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andEconomicsIndustry2IdEqualTo(proEconomicsIndustry2Id);
        return proEconomicsIndustry3Mapper.selectByExample(proEconomicsIndustry3Example);
    }

    /**
     * 查询项目预期成果形式
     *
     * @return 返回预期成果形式集合
     */
    @Override
    public List<ProResultForm> findProResultForm() {
        ProResultFormExample proResultFormExample = new ProResultFormExample();
        ProResultFormExample.Criteria criteria = proResultFormExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proResultFormMapper.selectByExample(proResultFormExample);
    }

    /**
     * 查询项目领域
     *
     * @return 返回项目领域集合
     */
    @Override
    public List<ProProjectDomain> findProProjectDomain() {
        ProProjectDomainExample proProjectDomainExample = new ProProjectDomainExample();
        ProProjectDomainExample.Criteria criteria = proProjectDomainExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proProjectDomainMapper.selectByExample(proProjectDomainExample);
    }

    /**
     * 查询项目等级
     *
     * @return 返回项目等级类型
     */
    @Override
    public List<ProProjectGrade> findProProjectGrade() {
        ProProjectGradeExample proProjectGradeExample = new ProProjectGradeExample();
        ProProjectGradeExample.Criteria criteria = proProjectGradeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return proProjectGradeMapper.selectByExample(proProjectGradeExample);
    }

    /**
     * 查询研究类别
     *
     * @return 返回研究类别集合
     */
    @Override
    public List<PubResearchType> findPubResearchType() {
        PubResearchTypeExample pubResearchTypeExample = new PubResearchTypeExample();
        PubResearchTypeExample.Criteria criteria = pubResearchTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return pubResearchTypeMapper.selectByExample(pubResearchTypeExample);
    }

    /**
     * 查询研究类别
     *
     * @param subjectTypeId 学科门类编号
     * @return 返回研究类别集合
     */
    @Override
    public List<PubResearchType> findPubResearchType(Integer subjectTypeId) {
        if (subjectTypeId == null) {
            return null;
        }
        PubResearchTypeExample pubResearchTypeExample = new PubResearchTypeExample();
        PubResearchTypeExample.Criteria criteria = pubResearchTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return pubResearchTypeMapper.selectByExample(pubResearchTypeExample);
    }

    /**
     * 查询署名情况
     *
     * @return 返回署名情况集合
     */
    @Override
    public List<PubSign> findPubSign() {
        PubSignExample pubSignExample = new PubSignExample();
        PubSignExample.Criteria criteria = pubSignExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return pubSignMapper.selectByExample(pubSignExample);
    }

    /**
     * 查询学科门类
     *
     * @return 返回学科门类集合
     */
    @Override
    public List<SubjectType> findSubjectType() {
        SubjectTypeExample subjectTypeExample = new SubjectTypeExample();
        SubjectTypeExample.Criteria criteria = subjectTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return subjectTypeMapper.selectByExample(subjectTypeExample);
    }

    /**
     * 查询获奖类别
     *
     * @return 返回获奖类别集合
     */
    @Override
    public List<RewClass> findRewClass() {
        RewClassExample rewClassExample = new RewClassExample();
        RewClassExample.Criteria criteria = rewClassExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return rewClassMapper.selectByExample(rewClassExample);
    }

    /**
     * 查询获奖类别
     * @param subjectTypeId
     * @return 返回获奖类别集合
     */
    @Override
    public List<RewClass> findRewClass(Integer subjectTypeId) {
        if (subjectTypeId == null) {  //如果学科门类编号为空就直接就返回空
            return null;
        }
        RewClassExample rewClassExample = new RewClassExample();
        RewClassExample.Criteria criteria = rewClassExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return rewClassMapper.selectByExample(rewClassExample);
    }

    /**
     * 查询获奖等级
     *
     * @return 返回获奖等级集合
     */
    @Override
    public List<RewGrade> findRewGrade() {
        RewGradeExample rewGradeExample = new RewGradeExample();
        RewGradeExample.Criteria criteria = rewGradeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return rewGradeMapper.selectByExample(rewGradeExample);
    }

    /**
     * 查询获奖级别
     *
     * @return 返回获奖级别集合
     */
    @Override
    public List<RewLevel> findRewLevel() {
        RewLevelExample rewLevelExample = new RewLevelExample();
        RewLevelExample.Criteria criteria = rewLevelExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return rewLevelMapper.selectByExample(rewLevelExample);
    }

    /**
     * 查询获奖完成方式
     * @param rewLevelId
     * @return 返回获奖完成方式集合
     */
    public List<RewFinishWay> findRewFinishWay(Integer rewLevelId){
        if (rewLevelId == null) {  //如果学科门类编号为空就直接就返回空
            return null;
        }
        RewFinishWayExample rewFinishWayExample = new RewFinishWayExample();
        RewFinishWayExample.Criteria criteria = rewFinishWayExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andRewLevelIdEqualTo(rewLevelId);
        return rewFinishWayMapper.selectByExample(rewFinishWayExample);
    }

    /**
     * 查询获奖的成果类别
     *
     * @return 返回获奖成果类别集合
     */
    @Override
    public List<RewResultType> findRewResultType() {
        RewResultTypeExample rewResultTypeExample = new RewResultTypeExample();
        RewResultTypeExample.Criteria criteria = rewResultTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return rewResultTypeMapper.selectByExample(rewResultTypeExample);
    }

    /**
     * 查询获奖的成果类别
     * @param subjectTypeId
     * @return 返回获奖成果类别集合
     */
    @Override
    public List<RewResultType> findRewResultType(Integer subjectTypeId) {
        if (subjectTypeId == null) {  //如果学科门类编号为空就直接就返回空
            return null;
        }
        RewResultTypeExample rewResultTypeExample = new RewResultTypeExample();
        RewResultTypeExample.Criteria criteria = rewResultTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return rewResultTypeMapper.selectByExample(rewResultTypeExample);
    }

    /**
     * 查询获奖类别
     *
     * @return 返回获奖类别
     */
    @Override
    public List<RewType> findRewType() {
        RewTypeExample rewTypeExample = new RewTypeExample();
        RewTypeExample.Criteria criteria = rewTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return rewTypeMapper.selectByExample(rewTypeExample);
    }

    /**
     * 查询获奖类别
     * @param subjectTypeId
     * @return 返回获奖类别
     */
    @Override
    public List<RewType> findRewType(Integer subjectTypeId) {
        if (subjectTypeId == null) {  //如果学科门类编号为空就直接就返回空
            return null;
        }
        RewTypeExample rewTypeExample = new RewTypeExample();
        RewTypeExample.Criteria criteria = rewTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        criteria.andSubjectTypeIdEqualTo(subjectTypeId);
        return rewTypeMapper.selectByExample(rewTypeExample);
    }

    /**
     * 查询印章类型
     *
     * @return 返回印章类型集合
     */
    @Override
    public List<SealType> findSealType() {
        SealTypeExample sealTypeExample = new SealTypeExample();
        SealTypeExample.Criteria criteria = sealTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return sealTypeMapper.selectByExample(sealTypeExample);
    }

    /**
     * 查询标准行业分类
     *
     * @return 返回标准行业分类集合
     */
    @Override
    public List<StandBusiness> findStandBusiness() {
        StandBusinessExample standBusinessExample = new StandBusinessExample();
        StandBusinessExample.Criteria criteria = standBusinessExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return standBusinessMapper.selectByExample(standBusinessExample);
    }

    /**
     * 查询标准对象分类
     *
     * @return 返回标准对象分类
     */
    @Override
    public List<StandObject> findStandObject() {
        StandObjectExample standObjectExample = new StandObjectExample();
        StandObjectExample.Criteria criteria = standObjectExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return standObjectMapper.selectByExample(standObjectExample);
    }

    /**
     * 查询标准状态
     *
     * @return 返回标准状态集合
     */
    @Override
    public List<StandState> findStandState() {
        StandStateExample standStateExample = new StandStateExample();
        StandStateExample.Criteria criteria = standStateExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return standStateMapper.selectByExample(standStateExample);
    }

    /**
     * 查询标准类型
     *
     * @return 返回标准类型集合
     */
    @Override
    public List<StandType> findStandType() {
        StandTypeExample standTypeExample = new StandTypeExample();
        StandTypeExample.Criteria criteria = standTypeExample.createCriteria();
        criteria.andIsEffectiveEqualTo(1);
        return standTypeMapper.selectByExample(standTypeExample);
    }

    /**
     * 查询申请类型
     * @return 返回标准类型集合
     */
    public List<ManageApplyType> findManageApplyType(){
        ManageApplyTypeExample manageApplyTypeExample = new ManageApplyTypeExample();
        ManageApplyTypeExample.Criteria criteria = manageApplyTypeExample.createCriteria();
        criteria.andApplyTypeIdIsNotNull();//查询所有
        return manageApplyTypeMapper.selectByExample(manageApplyTypeExample);
    }
}
