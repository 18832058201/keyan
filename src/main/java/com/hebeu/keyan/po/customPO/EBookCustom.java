package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EBook;

import java.util.Date;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/5  9:34
 * 描述：著作 实体拓展类,用于接收数据库返回的数据
 */
public class EBookCustom extends EBook {
    //著作成果  拓展属性
    private String subjectTypeName;
    private String subjectFirstName;
    private String pressTypeName;
    private String bookTypeName;
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

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
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

    public String getPressTypeName() {
        return pressTypeName;
    }

    public void setPressTypeName(String pressTypeName) {
        this.pressTypeName = pressTypeName;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
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

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    @Override
    public String toString() {
        return super.toString() + "EBookCustom{" +
                "subjectTypeName='" + subjectTypeName + '\'' +
                "subjectFirstName='" + subjectFirstName + '\'' +
                "pressTypeName='" + pressTypeName + '\'' +
                "bookTypeName='" + bookTypeName + '\'' +
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
