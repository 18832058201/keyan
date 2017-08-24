package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EPerson;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-18  13:50
 * 描述：人员信息 实体拓展类,用于接收数据库返回的数据
 */
public class EPersonCustom extends EPerson{
    //拓展信息
    private String subjectTypeName;
    private String titleTypeName;
    private String titleLevelName;
    private String educationName;
    private String degreeName;
    private String subjectFirstName;
    private String subjectSecondName;
    private String subjectThirdName;
    private String college1Name;
    private String department1Name;
    private String college2Name;
    private String department2Name;
    private String college3Name;
    private String jobStatusName;
    private String dutyName;
    private String postTypeName;
    private String postLevelName;
    private String countryName;
    private String nationName;
    private String tutorTypeName;
    private String foreignLanguage1Name;
    private String languageLevel1Name;
    private String foreignLanguage2Name;
    private String languageLevel2Name;
//    private String platformName;

    public String getSubjectTypeName() {
        return subjectTypeName;
    }

    public void setSubjectTypeName(String subjectTypeName) {
        this.subjectTypeName = subjectTypeName;
    }

    public String getTitleTypeName() {
        return titleTypeName;
    }

    public void setTitleTypeName(String titleTypeName) {
        this.titleTypeName = titleTypeName;
    }

    public String getTitleLevelName() {
        return titleLevelName;
    }

    public void setTitleLevelName(String titleLevelName) {
        this.titleLevelName = titleLevelName;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }

    public String getCollege1Name() {
        return college1Name;
    }

    public void setCollege1Name(String college1Name) {
        this.college1Name = college1Name;
    }

    public String getDepartment1Name() {
        return department1Name;
    }

    public void setDepartment1Name(String department1Name) {
        this.department1Name = department1Name;
    }

    public String getCollege2Name() {
        return college2Name;
    }

    public void setCollege2Name(String college2Name) {
        this.college2Name = college2Name;
    }

    public String getDepartment2Name() {
        return department2Name;
    }

    public void setDepartment2Name(String department2Name) {
        this.department2Name = department2Name;
    }

    public String getCollege3Name() {
        return college3Name;
    }

    public void setCollege3Name(String college3Name) {
        this.college3Name = college3Name;
    }

    public String getForeignLanguage1Name() {
        return foreignLanguage1Name;
    }

    public void setForeignLanguage1Name(String foreignLanguage1Name) {
        this.foreignLanguage1Name = foreignLanguage1Name;
    }

    public String getLanguageLevel1Name() {
        return languageLevel1Name;
    }

    public void setLanguageLevel1Name(String languageLevel1Name) {
        this.languageLevel1Name = languageLevel1Name;
    }

    public String getForeignLanguage2Name() {
        return foreignLanguage2Name;
    }

    public void setForeignLanguage2Name(String foreignLanguage2Name) {
        this.foreignLanguage2Name = foreignLanguage2Name;
    }

    public String getLanguageLevel2Name() {
        return languageLevel2Name;
    }

    public void setLanguageLevel2Name(String languageLevel2Name) {
        this.languageLevel2Name = languageLevel2Name;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getSubjectFirstName() {
        return subjectFirstName;
    }

    public void setSubjectFirstName(String subjectFirstName) {
        this.subjectFirstName = subjectFirstName;
    }

    public String getSubjectSecondName() {
        return subjectSecondName;
    }

    public void setSubjectSecondName(String subjectSecondName) {
        this.subjectSecondName = subjectSecondName;
    }

    public String getSubjectThirdName() {
        return subjectThirdName;
    }

    public void setSubjectThirdName(String subjectThirdName) {
        this.subjectThirdName = subjectThirdName;
    }


    public String getJobStatusName() {
        return jobStatusName;
    }

    public void setJobStatusName(String jobStatusName) {
        this.jobStatusName = jobStatusName;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public String getPostTypeName() {
        return postTypeName;
    }

    public void setPostTypeName(String postTypeName) {
        this.postTypeName = postTypeName;
    }

    public String getPostLevelName() {
        return postLevelName;
    }

    public void setPostLevelName(String postLevelName) {
        this.postLevelName = postLevelName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getNationName() {
        return nationName;
    }

    public void setNationName(String nationName) {
        this.nationName = nationName;
    }

    public String getTutorTypeName() {
        return tutorTypeName;
    }

    public void setTutorTypeName(String tutorTypeName) {
        this.tutorTypeName = tutorTypeName;
    }



//    public String getPlatformName() {
//        return platformName;
//    }
//
//    public void setPlatformName(String platformName) {
//        this.platformName = platformName;
//    }
    @Override
    public String toString() {
        return super.toString() + "EPersonCustom{" +
                "subjectTypeName='" + subjectTypeName + '\'' +
                "titleTypeName='" + titleTypeName + '\'' +
                "titleLevelName='" + titleLevelName + '\'' +
                "educationName='" + educationName + '\'' +
                "degreeName='" + degreeName + '\'' +
                "subjectFirstName='" + subjectFirstName + '\'' +
                "subjectSecondName='" + subjectSecondName + '\'' +
                "subjectThirdName='" + subjectThirdName + '\'' +
                "college1Name='" + college1Name + '\'' +
                "department1Name='" + department1Name + '\'' +
                "college2Name='" + college2Name + '\'' +
                "department2Name='" + department2Name + '\'' +
                "college3Name='" + college3Name + '\'' +
                "jobStatusName='" + jobStatusName + '\'' +
                "dutyName='" + dutyName + '\'' +
                "postTypeName='" + postTypeName + '\'' +
                "postLevelName='" + postLevelName + '\'' +
                "countryName='" + countryName + '\'' +
                "nationName='" + nationName + '\'' +
                "tutorTypeName='" + tutorTypeName + '\'' +
                "foreignLanguage1Name='" + foreignLanguage1Name + '\'' +
                "languageLevel1Name='" + languageLevel1Name + '\'' +
                "foreignLanguage1Name='" + foreignLanguage1Name + '\'' +
                "languageLevel1Name='" + languageLevel1Name + '\'' +
//                "platformName='" + platformName + '\'' +
                '}';
    }
}
