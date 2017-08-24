package com.hebeu.keyan.service;

import com.hebeu.keyan.po.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/7/31 16:06
 * 描述：基础参数查询（仅查询有效值）业务接口
 */
public interface BasicParameterService {
    /**
     * 查询出版社类型
     * @return 返回出版社类型集合
     */
    public List<BookPressType> findBookPressType();

    /**
     *查询书籍类型
     * @param subjectTypeId
     * @return 返回书籍类型集合
     */
    public List<BookType> findBookType(Integer subjectTypeId);

    /**
     * 查询鉴定形式
     * @return 返回鉴定形式集合
     */
    public List<IdenForm> findIdenForm();

    /**
     * 查询鉴定水平
     * @return 返回鉴定水平集合
     */
    public List<IdenLevel> findIdenLevel();

    /**
     * 查询鉴定水平
     * @param subjectTypeId
     * @return 返回鉴定水平集合
     */
    public List<IdenLevel> findIdenLevel(Integer subjectTypeId);

    /**
     * 查询鉴定结果水平
     * @return 返回鉴定结果水平集合
     */
    public List<IdenResultLevel> findIdenResultLevel();

    /**
     * 查询收录工具
     * @return 返回收录工具集合
     */
    public List<IncludeTool> findIncludeTool();

    /**
     * 查询论文出版级别
     * @return 返回论文出版级别集合
     */
    public List<PaperPublishLevel> findPaperPublishLevel();

    /**
     * 查询论文出版范围
     * @return 返回论文出版范围集合
     */
    public List<PaperPublishRange> findPaperPublishRange();

    /**
     * 查询论文出版类型
     * @return 返回论文出版类型集合
     */
    public List<PaperPublishType> findPaperPublishType();

    /**
     * 查询专利类型
     * @return 返回专利类型集合
     */
    public List<PatType> findPatType();

    /**
     * 查询人员国家
     * @return 返回人员国家集合
     */
    public List<PerCountry> findPerCountry();

    /**
     * 查询人员学位
     * @return  返回人员学位集合
     */
    public List<PerDegree> findPerDegree();

    /**
     * 查询人员职务
     * @return 返回人员职务集合
     */
    public  List<PerDuty> findPerDuty();

    /**
     * 查询人员学历
     * @return 返回学历集合
     */
    public List<PerEducation> findPerEducation();

    /**
     * 查询人员外语
     * @return 返回人员外语集合
     */
    public List<PerForeignLanguage> findPerForeignLanguage();

    /**
     * 查询人员工作状态
     * @return 返回人员工作状态集合
     */
    public List<PerJobStatus> findPerJobStatus();

    /**
     * 查询外语水平
     * @return 返回外语水平集合
     */
    public List<PerLanguageLevel> findPerLanguageLevel();

    /**
     * 查询人员民族
     * @return 返回人员民族集合
     */
    public List<PerNation> findPerNation();

    /**
     * 查询人员绩效等级
     * @return 返回人员绩效等级
     */
    public List<PerPostLevel> findPerPostLevel();

    /**
     * 查询人员绩效等级
     * @param postTypeId
     * @return 返回人员绩效等级
     */
    public List<PerPostLevel> findPerPostLevel(Integer postTypeId);

    /**
     * 查询人员岗位类别
     * @return 返回人员岗位类别集合
     */
    public List<PerPostType> findPerPostType();

    /**
     * 按查询人员第一学科
     * @return 返回人员第一学科集合
     */
    public List<PerSubjectFirst> findPerSubjectFirst();

    /**
     * 按学科门类查询人员第一学科
     * @param subjectTypeId   学科门类编号
     * @return 返回人员第一学科集合
     */
    public List<PerSubjectFirst> findPerSubjectFirst(Integer subjectTypeId);

    /**
     * 查询人员第二学科
     * @return 返回人员第二学科
     */
    public List<PerSubjectSecond> findPerSubjectSecond();
    /**
     * 查询人员第二学科
     * @param subjectFirstId
     * @return 返回人员第二学科
     */
    public List<PerSubjectSecond> findPerSubjectSecond(Integer subjectFirstId);

    /**
     * 查询人员第三学科
     * @return 返回人员第三学科集合
     */
    public List<PerSubjectThird> findPerSubjectThird();
    /**
     * 查询人员第三学科
     * @param subjectSecondId
     * @return 返回人员第三学科集合
     */
    public List<PerSubjectThird> findPerSubjectThird(Integer subjectSecondId);

    /**
     * 查询人员职称级别
     * @return 返回人员职称级别集合
     */
    public List<PerTitleLevel> findPerTitleLevel();
    /**
     * 查询人员职称级别
     * @param titleTypeId
     * @return 返回人员职称级别集合
     */
    public List<PerTitleLevel> findPerTitleLevel(Integer titleTypeId);

    /**
     * 查询职称类别
     * @return  返回职称类别集合
     */
    public List<PerTitleType> findPerTitleType();

    /**
     * 查询人员导师类别
     * @return 返回人员导师类别集合
     */
    public List<PerTutorType> findPerTutorType();

    /**
     * 查询新品种属或种
     * @return 返回新品种属或种集合
     */
    public List<PlantGenus> findPlantGenus();

    /**
     * 查询新品种等级
     * @return 返回新品种等级集合
     */
    public List<PlantGrade> findPlantGrade();

    /**
     * 查询新品种类型
     * @return 返回新品种类型集合
     */
    public List<PlantType> findPlantType();

    /**
     * 查询项目来源
     * @return 返回项目来源集合
     */
    public List<ProProjectSource> findProProjectSource();

    /**
     * 查询项目来源
     * @param subjectTypeId 学科门类编号
     * @return 返回项目来源集合
     */
    public List<ProProjectSource> findProProjectSource(Integer subjectTypeId);

    /**
     * 查询项目类型1
     * @return 返回项目类型1集合
     */
    public List<ProProjectType1> findProProjectType1();

    /**
     * 查询项目类型1
     * @param subjectTypeId 学科门类编号
     * @return 返回项目类型1集合
     */
    public List<ProProjectType1> findProProjectType1(Integer subjectTypeId);

    /**
     * 查询项目类型2
     * @return 返回项目类型2集合
     */
    public List<ProProjectType2> findProProjectType2();

    /**
     * 查询通过对应项目类型1编号的项目类型2
     * @param proProjectType1Id 项目类型1编号
     * @return 返回项目类型2集合
     */
    public List<ProProjectType2> findProProjectType2(Integer proProjectType1Id);

    /**
     * 查询研究类别
     * @return 返回研究类别集合
     */
    public List<PubResearchType> findPublicResearchType();

    /**
     * 查询组织形式
     * @return 返回组织形式集合
     */
    public List<ProOrganizationForm> findProOrganizationForm();

    /**
     * 查询合作类型
     * @return 返回合作类型集合
     */
    public List<ProCooperationType> findProCooperationType();

    /**
     * 查询社会经济目标
     * @return 返回社会经济目标集合
     */
    public List<ProEconomicsTarget> findProEconomicsTarget();

    /**
     * 查询经济行业一级
     * @return 返回经济行业一级集合
     */
    public List<ProEconomicsIndustry1> findProEconomicsIndustry1();

    /**
     * 查询经济行业二级
     * @return 返回经济行业二级集合
     */
    public List<ProEconomicsIndustry2> findProEconomicsIndustry2();

    /**
     * 根据经济行业一级id查询经济行业二级
     * @param proEconomicsIndustry1Id 经济行业一级id
     * @return 返回经济行业二级集合
     */
    public List<ProEconomicsIndustry2> findProEconomicsIndustry2(String proEconomicsIndustry1Id);

    /**
     * 查询经济行业三级
     * @return 返回经济行业三级集合
     */
    public List<ProEconomicsIndustry3> findProEconomicsIndustry3();

    /**
     * 根据经济行业二级查询经济行业三级
     * @param proEconomicsIndustry2Id 经济行业二级id
     * @return 返回经济行业三级集合
     */
    public List<ProEconomicsIndustry3> findProEconomicsIndustry3(String proEconomicsIndustry2Id);

    /**
     * 查询项目预期成果形式
     * @return 返回预期成果形式集合
     */
    public List<ProResultForm> findProResultForm();


    /**
     * 查询项目领域
     * @return  返回项目领域集合
     */
    public List<ProProjectDomain> findProProjectDomain();

    /**
     * 查询项目等级
     * @return 返回项目等级类型
     */
    public List<ProProjectGrade> findProProjectGrade();


    /**
     * 查询研究类别
     * @return 返回研究类别集合
     */
    public List<PubResearchType> findPubResearchType();

    /**
     * 查询研究类别
     * @param subjectTypeId 学科门类编号
     * @return 返回研究类别集合
     */
    public List<PubResearchType> findPubResearchType(Integer subjectTypeId);

    /**
     * 查询署名情况
     * @return 返回署名情况集合
     */
    public List<PubSign> findPubSign();

    /**
     * 查询学科门类
     * @return  返回学科门类集合
     */
    public List<SubjectType> findSubjectType();

    /**
     * 查询获奖类别
     * @return 返回获奖类别集合
     */
    public List<RewClass> findRewClass();

    /**
     * 查询获奖类别
     * @param subjectTypeId
     * @return 返回获奖类别集合
     */
    public List<RewClass> findRewClass(Integer subjectTypeId);

    /**
     * 查询获奖等级
     * @return 返回获奖等级集合
     */
    public List<RewGrade> findRewGrade();

    /**
     * 查询获奖级别
     * @return 返回获奖级别集合
     */
    public List<RewLevel> findRewLevel();

    /**
     * 查询获奖完成方式
     * @param rewLevelId
     * @return 返回获奖完成方式集合
     */
    public List<RewFinishWay> findRewFinishWay(Integer rewLevelId);

    /**
     * 查询获奖的成果类别
     * @return 返回获奖成果类别集合
     */
    public List<RewResultType> findRewResultType();

    /**
     * 查询获奖的成果类别
     * @param subjectTypeId
     * @return 返回获奖成果类别集合
     */
    public List<RewResultType> findRewResultType(Integer subjectTypeId);

    /**
     * 查询获奖类别
     * @return 返回获奖类别
     */
    public List<RewType> findRewType();

    /**
     * 查询获奖类别
     * @param subjectTypeId
     * @return 返回获奖类别
     */
    public List<RewType> findRewType(Integer subjectTypeId);

    /**
     * 查询印章类型
     * @return 返回印章类型集合
     */
    public List<SealType> findSealType();

    /**
     * 查询标准行业分类
     * @return 返回标准行业分类集合
     */
    public List<StandBusiness> findStandBusiness();

    /**
     * 查询标准对象分类
     * @return 返回标准对象分类
     */
    public List<StandObject> findStandObject();

    /**
     * 查询标准状态
     * @return 返回标准状态集合
     */
    public List<StandState> findStandState();

    /**
     * 查询标准类型
     * @return 返回标准类型集合
     */
    public List<StandType> findStandType();

    /**
     * 查询申请类型
     * @return 返回标准类型集合
     */
    public List<ManageApplyType> findManageApplyType();


}
