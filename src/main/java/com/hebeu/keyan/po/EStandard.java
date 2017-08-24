package com.hebeu.keyan.po;

import java.util.Date;

public class EStandard {
    private String standardId;

    private String schoolNumber;

    private String standNumber;

    private Integer standStateId;

    private Integer subjectTypeId;

    private Integer subjectFirstId;

    private Integer standObjectId;

    private Integer standBusinessId;

    private String putUnderUnit;

    private String proposeUnit;

    private String draftUnit;

    private Date implementDate;

    private String replaceStatus;

    private Integer standTypeId;

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

    public String getStandardId() {
        return standardId;
    }

    public void setStandardId(String standardId) {
        this.standardId = standardId == null ? null : standardId.trim();
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(String schoolNumber) {
        this.schoolNumber = schoolNumber == null ? null : schoolNumber.trim();
    }

    public String getStandNumber() {
        return standNumber;
    }

    public void setStandNumber(String standNumber) {
        this.standNumber = standNumber == null ? null : standNumber.trim();
    }

    public Integer getStandStateId() {
        return standStateId;
    }

    public void setStandStateId(Integer standStateId) {
        this.standStateId = standStateId;
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

    public Integer getStandObjectId() {
        return standObjectId;
    }

    public void setStandObjectId(Integer standObjectId) {
        this.standObjectId = standObjectId;
    }

    public Integer getStandBusinessId() {
        return standBusinessId;
    }

    public void setStandBusinessId(Integer standBusinessId) {
        this.standBusinessId = standBusinessId;
    }

    public String getPutUnderUnit() {
        return putUnderUnit;
    }

    public void setPutUnderUnit(String putUnderUnit) {
        this.putUnderUnit = putUnderUnit == null ? null : putUnderUnit.trim();
    }

    public String getProposeUnit() {
        return proposeUnit;
    }

    public void setProposeUnit(String proposeUnit) {
        this.proposeUnit = proposeUnit == null ? null : proposeUnit.trim();
    }

    public String getDraftUnit() {
        return draftUnit;
    }

    public void setDraftUnit(String draftUnit) {
        this.draftUnit = draftUnit == null ? null : draftUnit.trim();
    }

    public Date getImplementDate() {
        return implementDate;
    }

    public void setImplementDate(Date implementDate) {
        this.implementDate = implementDate;
    }

    public String getReplaceStatus() {
        return replaceStatus;
    }

    public void setReplaceStatus(String replaceStatus) {
        this.replaceStatus = replaceStatus == null ? null : replaceStatus.trim();
    }

    public Integer getStandTypeId() {
        return standTypeId;
    }

    public void setStandTypeId(Integer standTypeId) {
        this.standTypeId = standTypeId;
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