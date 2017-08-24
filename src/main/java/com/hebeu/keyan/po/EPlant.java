package com.hebeu.keyan.po;

import java.util.Date;

public class EPlant {
    private String plantId;

    private String plantName;

    private String schoolNumber;

    private Integer subjectTypeId;

    private Integer plantGradeId;

    private Integer plantTypeId;

    private Integer plantGenusId;

    private String breedOwner;

    private String breedNumber;

    private String foster;

    private String certificateNumber;

    private Date applyDate;

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

    public String getPlantId() {
        return plantId;
    }

    public void setPlantId(String plantId) {
        this.plantId = plantId == null ? null : plantId.trim();
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName == null ? null : plantName.trim();
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

    public Integer getPlantGradeId() {
        return plantGradeId;
    }

    public void setPlantGradeId(Integer plantGradeId) {
        this.plantGradeId = plantGradeId;
    }

    public Integer getPlantTypeId() {
        return plantTypeId;
    }

    public void setPlantTypeId(Integer plantTypeId) {
        this.plantTypeId = plantTypeId;
    }

    public Integer getPlantGenusId() {
        return plantGenusId;
    }

    public void setPlantGenusId(Integer plantGenusId) {
        this.plantGenusId = plantGenusId;
    }

    public String getBreedOwner() {
        return breedOwner;
    }

    public void setBreedOwner(String breedOwner) {
        this.breedOwner = breedOwner == null ? null : breedOwner.trim();
    }

    public String getBreedNumber() {
        return breedNumber;
    }

    public void setBreedNumber(String breedNumber) {
        this.breedNumber = breedNumber == null ? null : breedNumber.trim();
    }

    public String getFoster() {
        return foster;
    }

    public void setFoster(String foster) {
        this.foster = foster == null ? null : foster.trim();
    }

    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber == null ? null : certificateNumber.trim();
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
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