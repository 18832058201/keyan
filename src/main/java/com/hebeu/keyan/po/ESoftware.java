package com.hebeu.keyan.po;

import java.util.Date;

public class ESoftware {
    private String softwareId;

    private String schoolNumber;

    private String softwareName;

    private String softwareVersion;

    private String softwareShortName;

    private Integer subjectTypeId;

    private Integer subjectFirstId;

    private String owner;

    private String certificateNumber;

    private String registerNumber;

    private String classifyNumber;

    private Date publishDate;

    private Date approveDate;

    private Date certificateDate;

    private String programmingLanguage;

    private Integer codeLine;

    private Double bonus;

    private String remark;

    private String leader;

    private String registrant;

    private String personList;

    private String attachment;

    private Integer auditStatusId;

    private String auditPersonId1;

    private String auditPoinion1;

    private String auditPersonId2;

    private String auditPoinion2;

    private Date insertTime;

    private Date lastTime;

    private Double score;

    public String getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId == null ? null : softwareId.trim();
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber == null ? null : schoolNumber.trim();
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName == null ? null : softwareName.trim();
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion == null ? null : softwareVersion.trim();
    }

    public String getSoftwareShortName() {
        return softwareShortName;
    }

    public void setSoftwareShortName(String softwareShortName) {
        this.softwareShortName = softwareShortName == null ? null : softwareShortName.trim();
    }

    public Integer getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Integer subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public Integer getSubjectFirstId() {
        return subjectFirstId;
    }

    public void setSubjectFirstId(Integer subjectFirstId) {
        this.subjectFirstId = subjectFirstId;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber == null ? null : registerNumber.trim();
    }

    public String getClassifyNumber() {
        return classifyNumber;
    }

    public void setClassifyNumber(String classifyNumber) {
        this.classifyNumber = classifyNumber == null ? null : classifyNumber.trim();
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Date getApproveDate() {
        return approveDate;
    }

    public void setApproveDate(Date approveDate) {
        this.approveDate = approveDate;
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage == null ? null : programmingLanguage.trim();
    }

    public Integer getCodeLine() {
        return codeLine;
    }

    public void setCodeLine(Integer codeLine) {
        this.codeLine = codeLine;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant == null ? null : registrant.trim();
    }

    public String getPersonList() {
        return personList;
    }

    public void setPersonList(String personList) {
        this.personList = personList == null ? null : personList.trim();
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment == null ? null : attachment.trim();
    }

    public Integer getAuditStatusId() {
        return auditStatusId;
    }

    public void setAuditStatusId(Integer auditStatusId) {
        this.auditStatusId = auditStatusId;
    }

    public String getAuditPersonId1() {
        return auditPersonId1;
    }

    public void setAuditPersonId1(String auditPersonId1) {
        this.auditPersonId1 = auditPersonId1 == null ? null : auditPersonId1.trim();
    }

    public String getAuditPoinion1() {
        return auditPoinion1;
    }

    public void setAuditPoinion1(String auditPoinion1) {
        this.auditPoinion1 = auditPoinion1 == null ? null : auditPoinion1.trim();
    }

    public String getAuditPersonId2() {
        return auditPersonId2;
    }

    public void setAuditPersonId2(String auditPersonId2) {
        this.auditPersonId2 = auditPersonId2 == null ? null : auditPersonId2.trim();
    }

    public String getAuditPoinion2() {
        return auditPoinion2;
    }

    public void setAuditPoinion2(String auditPoinion2) {
        this.auditPoinion2 = auditPoinion2 == null ? null : auditPoinion2.trim();
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}