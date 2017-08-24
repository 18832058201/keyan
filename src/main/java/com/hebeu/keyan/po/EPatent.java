package com.hebeu.keyan.po;

import java.util.Date;

public class EPatent {
    private String patentId;

    private String patentName;

    private String schoolNumber;

    private Integer subjectTypeId;

    private Integer subjectFirstId;

    private Integer patTypeId;

    private String patentee;

    private String applyNumber;

    private String patentNumber;

    private String patCertificateNum;

    private Date certificateDate;

    private Date patApplyDate;

    private Date empowerDate;

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

    public String getPatentId() {
        return patentId;
    }

    public void setPatentId(String patentId) {
        this.patentId = patentId == null ? null : patentId.trim();
    }

    public String getPatentName() {
        return patentName;
    }

    public void setPatentName(String patentName) {
        this.patentName = patentName == null ? null : patentName.trim();
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber == null ? null : schoolNumber.trim();
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

    public Integer getPatTypeId() {
        return patTypeId;
    }

    public void setPatTypeId(Integer patTypeId) {
        this.patTypeId = patTypeId;
    }

    public String getPatentee() {
        return patentee;
    }

    public void setPatentee(String patentee) {
        this.patentee = patentee == null ? null : patentee.trim();
    }

    public String getApplyNumber() {
        return applyNumber;
    }

    public void setApplyNumber(String applyNumber) {
        this.applyNumber = applyNumber == null ? null : applyNumber.trim();
    }

    public String getPatentNumber() {
        return patentNumber;
    }

    public void setPatentNumber(String patentNumber) {
        this.patentNumber = patentNumber == null ? null : patentNumber.trim();
    }

    public String getPatCertificateNum() {
        return patCertificateNum;
    }

    public void setPatCertificateNum(String patCertificateNum) {
        this.patCertificateNum = patCertificateNum == null ? null : patCertificateNum.trim();
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }

    public Date getPatApplyDate() {
        return patApplyDate;
    }

    public void setPatApplyDate(Date patApplyDate) {
        this.patApplyDate = patApplyDate;
    }

    public Date getEmpowerDate() {
        return empowerDate;
    }

    public void setEmpowerDate(Date empowerDate) {
        this.empowerDate = empowerDate;
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