package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EStandard;

import java.util.Date;

/**
 * 作者：张彤
 * 时间：2017/8/12 20:41
 * 描述：标准管理 实体拓展类，用于接收数据库返回的数据
 */
public class EStandardCustom extends EStandard{

    //标准管理的拓展属性
    private String standStateName;
    private String subjectTypeName;
    private String subjectFirstName;
    private String standObjectName;
    private String standBusinessName;
    private String standTypeName;
    private String auditStatusName;
    private Integer isEdit;


    //用于存储人员成果关系表（r_person_project_result）中数据的属性
    private String id;
    private String workNum;
    private String workName;
    private Integer collegeId;
    private String collegeName;
    private Integer personType;
    private Integer type;
    private String name;
    private Date keyDate;

    public String getStandStateName() {
        return standStateName;
    }

    public void setStandStateName(String standStateName) {
        this.standStateName = standStateName;
    }

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

    public String getStandObjectName() {
        return standObjectName;
    }

    public void setStandObjectName(String standObjectName) {
        this.standObjectName = standObjectName;
    }

    public String getStandBusinessName() {
        return standBusinessName;
    }

    public void setStandBusinessName(String standBusinessName) {
        this.standBusinessName = standBusinessName;
    }

    public String getStandTypeName() {
        return standTypeName;
    }

    public void setStandTypeName(String standTypeName) {
        this.standTypeName = standTypeName;
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
        return super.toString() + "EIdentifyCustom{" +
                "subjectTypeName='" + subjectTypeName + '\'' +
                "subjectFirstName='" + subjectFirstName + '\'' +
                "standStateName='" + standStateName + '\'' +
                "standObjectName='" + standObjectName + '\'' +
                "standBusinessName='" + standBusinessName + '\'' +
                "standTypeName='" + standTypeName + '\'' +
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
