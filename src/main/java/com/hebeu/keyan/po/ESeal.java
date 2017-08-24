package com.hebeu.keyan.po;

import java.util.Date;

public class ESeal {
    private String sealId;

    private Integer sealTypeId;

    private Integer collegeId;

    private String sealReason;

    private Integer sealNum;

    private String applyPersonId;

    private String remark;

    private Integer auditStatusId;

    private String auditPersonId1;

    private String auditPoinion1;

    private String auditPersonId2;

    private String auditPoinion2;

    private Date insertTime;

    private Date lastTime;

    public String getSealId() {
        return sealId;
    }

    public void setSealId(String sealId) {
        this.sealId = sealId == null ? null : sealId.trim();
    }

    public Integer getSealTypeId() {
        return sealTypeId;
    }

    public void setSealTypeId(Integer sealTypeId) {
        this.sealTypeId = sealTypeId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getSealReason() {
        return sealReason;
    }

    public void setSealReason(String sealReason) {
        this.sealReason = sealReason == null ? null : sealReason.trim();
    }

    public Integer getSealNum() {
        return sealNum;
    }

    public void setSealNum(Integer sealNum) {
        this.sealNum = sealNum;
    }

    public String getApplyPersonId() {
        return applyPersonId;
    }

    public void setApplyPersonId(String applyPersonId) {
        this.applyPersonId = applyPersonId == null ? null : applyPersonId.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
}