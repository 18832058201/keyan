package com.hebeu.keyan.po.customPO;

import java.util.Date;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/8  18:30
 * 描述：项目PO类，实现纵向、横向、成果转化项目的综合查询（查询所有项目的集合）
 */
public class AllProjectCustom {
    private String projectId;                   //项目编号
    private String projectName;                 //项目名称
    private String projectNumber;               //项目编号
    private String subjectTypeName;             //学科门类
    private String subjectFirstName;            //所属学科
    private String projectSourceName;           //项目来源
    private String projectType1Name;            //项目类型1
    private String projectType2Name;            //项目类型2
    private String resultForm;                  //预期成果形式
    private Date startDate;                     //开始时间
    private Date expectEndDate;                 //结束时间

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
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

    public String getResultForm() {
        return resultForm;
    }

    public void setResultForm(String resultForm) {
        this.resultForm = resultForm;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getExpectEndDate() {
        return expectEndDate;
    }

    public void setExpectEndDate(Date expectEndDate) {
        this.expectEndDate = expectEndDate;
    }

    @Override
    public String toString() {
        return super.toString() + "AllProjectCustom{" +
                "projectId='" + projectId + '\'' +
                "projectName='" + projectName + '\'' +
                "projectNumber='" + projectNumber + '\'' +
                "subjectTypeName='" + subjectTypeName + '\'' +
                ", subjectFirstName='" + subjectFirstName + '\'' +
                ", projectSourceName='" + projectSourceName + '\'' +
                ", projectType1Name='" + projectType1Name + '\'' +
                ", projectType2Name='" + projectType2Name + '\'' +
                ", resultForm='" + resultForm + '\'' +
                ", startDate='" + startDate + '\'' +
                ", expectEndDate='" + expectEndDate + '\'' +
                '}';
    }
}
