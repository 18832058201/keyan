package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EReward;

import java.util.Date;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/9  17:33
 * 描述：获奖成果 实体拓展类,用于接收数据库返回的数据
 */
public class ERewardCustom extends EReward{
    //鉴定成果  拓展属性
    private String subjectTypeName;
    private String subjectFirstName;
    private String resultTypeName;
    private String rewTypeName;
    private String rewGradeName;
    private String rewClassName;
    private String rewLevelName;
    private String signName;
    private String finishWayName;
    private String auditStatusName;
    private Integer isEdit;
    @Override
    public String toString() {
        return super.toString() + "ERewardCustom{" +
                "subjectTypeName='" + subjectTypeName + '\'' +
                "subjectFirstName='" + subjectFirstName + '\'' +
                "resultTypeName='" + resultTypeName + '\'' +
                "rewTypeName='" + rewTypeName + '\'' +
                "rewGradeName='" + rewGradeName + '\'' +
                "rewClassName='" + rewClassName + '\'' +
                "rewLevelName='" + rewLevelName + '\'' +
                "signName='" + signName + '\'' +
                "finishWayName='" + finishWayName + '\'' +
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

    public String getResultTypeName() {
        return resultTypeName;
    }

    public void setResultTypeName(String resultTypeName) {
        this.resultTypeName = resultTypeName;
    }

    public String getRewTypeName() {
        return rewTypeName;
    }

    public void setRewTypeName(String rewTypeName) {
        this.rewTypeName = rewTypeName;
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

    public String getRewGradeName() {
        return rewGradeName;
    }

    public void setRewGradeName(String rewGradeName) {
        this.rewGradeName = rewGradeName;
    }

    public String getRewClassName() {
        return rewClassName;
    }

    public void setRewClassName(String rewClassName) {
        this.rewClassName = rewClassName;
    }

    public String getRewLevelName() {
        return rewLevelName;
    }

    public void setRewLevelName(String rewLevelName) {
        this.rewLevelName = rewLevelName;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getFinishWayName() {
        return finishWayName;
    }

    public void setFinishWayName(String finishWayName) {
        this.finishWayName = finishWayName;
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


}
