package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EProject;

import java.util.Date;

/**
 * 作者：陈德华
 * 时间：2017/8/4 21:30
 * 描述：项目实体拓展类,用于接收数据库返回的数据
 */
public class EProjectCustom extends EProject{
    //项目拓展属性
    private String subjectTypeName;
    private String subjectFirstName;
    private String projectSourceName;
    private String projectType1Name;
    private String projectType2Name;
    private String researchTypeName;
    private String cooperationTypeName;
    private String economicsTargetName;
    private String organizationFormName;
    private String economicsIndustry1Name;
    private String economicsIndustry2Name;
    private String economicsIndustry3Name;
    private String projectDomainName;
    private String projectGradeName;
    private String auditStatusName;
    private String endStatusName;

    private Integer isEdit;  //是否可编辑

    //用于存储人员项目关系表中数据的属性
    private String id;
    private String workNum;
    private Integer collegeId;
    private String collegeName;
    private Integer personType;
    private Integer type;
    private String name;
    private Date keyDate;
//    private Double score; 父类中已有


    public String getSubjectTypeName() {
        return subjectTypeName;
    }

    public void setSubjectTypeName(String subjectTypeName) {
        this.subjectTypeName = subjectTypeName;
    }

    public String getSubjectFirstName() {
        return subjectFirstName;
    }

    public void setSubjectFirstName(String subjectFirstName) {
        this.subjectFirstName = subjectFirstName;
    }

    public String getProjectSourceName() {
        return projectSourceName;
    }

    public void setProjectSourceName(String projectSourceName) {
        this.projectSourceName = projectSourceName;
    }

    public String getProjectType1Name() {
        return projectType1Name;
    }

    public void setProjectType1Name(String projectType1Name) {
        this.projectType1Name = projectType1Name;
    }

    public String getProjectType2Name() {
        return projectType2Name;
    }

    public void setProjectType2Name(String projectType2Name) {
        this.projectType2Name = projectType2Name;
    }

    public String getResearchTypeName() {
        return researchTypeName;
    }

    public void setResearchTypeName(String researchTypeName) {
        this.researchTypeName = researchTypeName;
    }

    public String getCooperationTypeName() {
        return cooperationTypeName;
    }

    public void setCooperationTypeName(String cooperationTypeName) {
        this.cooperationTypeName = cooperationTypeName;
    }

    public String getEconomicsTargetName() {
        return economicsTargetName;
    }

    public void setEconomicsTargetName(String economicsTargetName) {
        this.economicsTargetName = economicsTargetName;
    }

    public String getOrganizationFormName() {
        return organizationFormName;
    }

    public void setOrganizationFormName(String organizationFormName) {
        this.organizationFormName = organizationFormName;
    }

    public String getEconomicsIndustry1Name() {
        return economicsIndustry1Name;
    }

    public void setEconomicsIndustry1Name(String economicsIndustry1Name) {
        this.economicsIndustry1Name = economicsIndustry1Name;
    }

    public String getEconomicsIndustry2Name() {
        return economicsIndustry2Name;
    }

    public void setEconomicsIndustry2Name(String economicsIndustry2Name) {
        this.economicsIndustry2Name = economicsIndustry2Name;
    }

    public String getEconomicsIndustry3Name() {
        return economicsIndustry3Name;
    }

    public void setEconomicsIndustry3Name(String economicsIndustry3Name) {
        this.economicsIndustry3Name = economicsIndustry3Name;
    }

    public String getProjectDomainName() {
        return projectDomainName;
    }

    public void setProjectDomainName(String projectDomainName) {
        this.projectDomainName = projectDomainName;
    }

    public String getProjectGradeName() {
        return projectGradeName;
    }

    public void setProjectGradeName(String projectGradeName) {
        this.projectGradeName = projectGradeName;
    }

    public String getAuditStatusName() {
        return auditStatusName;
    }

    public void setAuditStatusName(String auditStatusName) {
        this.auditStatusName = auditStatusName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Integer getPersonType() {
        return personType;
    }

    public void setPersonType(Integer personType) {
        this.personType = personType;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getKeyDate() {
        return keyDate;
    }

    public void setKeyDate(Date keyDate) {
        this.keyDate = keyDate;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }

    public String getEndStatusName() {
        return endStatusName;
    }

    public void setEndStatusName(String endStatusName) {
        this.endStatusName = endStatusName;
    }

    @Override
    public String toString() {
        return super.toString() + "EProjectCustom{" +
                "subjectTypeName='" + subjectTypeName + '\'' +
                ", subjectFirstName='" + subjectFirstName + '\'' +
                ", projectSourceName='" + projectSourceName + '\'' +
                ", projectType1Name='" + projectType1Name + '\'' +
                ", projectType2Name='" + projectType2Name + '\'' +
                ", researchTypeName='" + researchTypeName + '\'' +
                ", cooperationTypeName='" + cooperationTypeName + '\'' +
                ", economicsTargetName='" + economicsTargetName + '\'' +
                ", organizationFormName='" + organizationFormName + '\'' +
                ", economicsIndustry1Name='" + economicsIndustry1Name + '\'' +
                ", economicsIndustry2Name='" + economicsIndustry2Name + '\'' +
                ", economicsIndustry3Name='" + economicsIndustry3Name + '\'' +
                ", projectDomainName='" + projectDomainName + '\'' +
                ", projectGradeName='" + projectGradeName + '\'' +
                ", auditStatusName='" + auditStatusName + '\'' +
                ", endStatusName='" + endStatusName + '\'' +
                ", isEdit=" + isEdit +
                ", id='" + id + '\'' +
                ", workNum='" + workNum + '\'' +
                ", collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", personType=" + personType +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", keyDate=" + keyDate +
                '}';
    }
}
