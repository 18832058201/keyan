package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EPaper;

import java.util.Date;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  8:44
 * 描述：论文实体拓展属性，用于接收数据库数据
 */
public class EPaperCustom extends EPaper {
    //论文相关拓展属性
    private String subjectTypeName;
    private String subjectFirstName;
    private String researchTypeName;
    private String signName;
    private String publishTypeName;
    private String publishRangeName;
    private String publishLevelName;
    private String auditStatusName;
    private Integer isEdit;

    //用于存储人员项目成果关系表（r_person_project_result）中数据的属性
    private String id;
    private String workNum;
    private String workName;
    private Integer collegeId;
    private String collegeName;
    private Integer personType;
    private Integer type;
    private String name;
    private Date keyDate;

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

    public String getResearchTypeName() {
        return researchTypeName;
    }

    public void setResearchTypeName(String researchTypeName) {
        this.researchTypeName = researchTypeName;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getPublishTypeName() {
        return publishTypeName;
    }

    public void setPublishTypeName(String publishTypeName) {
        this.publishTypeName = publishTypeName;
    }

    public String getPublishRangeName() {
        return publishRangeName;
    }

    public void setPublishRangeName(String publishRangeName) {
        this.publishRangeName = publishRangeName;
    }

    public String getPublishLevelName() {
        return publishLevelName;
    }

    public void setPublishLevelName(String publishLevelName) {
        this.publishLevelName = publishLevelName;
    }

    public String getAuditStatusName() {
        return auditStatusName;
    }

    public void setAuditStatusName(String auditStatusName) {
        this.auditStatusName = auditStatusName;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
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

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
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

    @Override
    public String toString() {
        return super.toString() + "EPaperCustom{" +
                "subjectTypeName='" + subjectTypeName + '\'' +
                "subjectFirstName='" + subjectFirstName + '\'' +
                "researchTypeName='" + researchTypeName + '\'' +
                "signName='" + signName + '\'' +
                "publishTypeName='" + publishTypeName + '\'' +
                "publishRangeName='" + publishRangeName + '\'' +
                "publishLevelName='" + publishLevelName + '\'' +
                "auditStatusName='" + auditStatusName + '\'' +
                "isEdit='" + isEdit + '\'' +
                ", id='" + id + '\'' +
                ", workNum='" + workNum + '\'' +
                ", workNum='" + workName + '\'' +
                ", collegeId='" + collegeId + '\'' +
                ", collegeName='" + collegeName + '\'' +
                ", personType=" + personType +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", keyDate=" + keyDate +
                '}';
    }

}
