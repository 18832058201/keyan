package com.hebeu.keyan.po;

import java.util.Date;

public class BudgetPostApply {
    private String applyId;

    private String workNum;

    private String projectId;

    private Double applyMoney;

    private Integer auditStatusId;

    private String auditPersonId1;

    private String auditPoinion1;

    private String auditPersonId2;

    private String auditPoinion2;

    private String auditPersonId3;

    private String auditPoinion3;

    private Date lastTime;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId == null ? null : applyId.trim();
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum == null ? null : workNum.trim();
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Double getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(Double applyMoney) {
        this.applyMoney = applyMoney;
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

    public String getAuditPersonId3() {
        return auditPersonId3;
    }

    public void setAuditPersonId3(String auditPersonId3) {
        this.auditPersonId3 = auditPersonId3 == null ? null : auditPersonId3.trim();
    }

    public String getAuditPoinion3() {
        return auditPoinion3;
    }

    public void setAuditPoinion3(String auditPoinion3) {
        this.auditPoinion3 = auditPoinion3 == null ? null : auditPoinion3.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}