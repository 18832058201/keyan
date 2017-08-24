package com.hebeu.keyan.po;

import java.util.Date;

public class EInclude {
    private String includeId;

    private Date includeDate;

    private Integer includeToolId;

    private String includeNumber;

    private String paperId;

    private String registrant;

    private Integer auditStatusId;

    private String auditPersonId1;

    private String auditPoinion1;

    private String auditPersonId2;

    private String auditPoinion2;

    private Date insertTime;

    private Date lastTime;

    public String getIncludeId() {
        return includeId;
    }

    public void setIncludeId(String includeId) {
        this.includeId = includeId == null ? null : includeId.trim();
    }

    public Date getIncludeDate() {
        return includeDate;
    }

    public void setIncludeDate(Date includeDate) {
        this.includeDate = includeDate;
    }

    public Integer getIncludeToolId() {
        return includeToolId;
    }

    public void setIncludeToolId(Integer includeToolId) {
        this.includeToolId = includeToolId;
    }

    public String getIncludeNumber() {
        return includeNumber;
    }

    public void setIncludeNumber(String includeNumber) {
        this.includeNumber = includeNumber == null ? null : includeNumber.trim();
    }

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }

    public String getRegistrant() {
        return registrant;
    }

    public void setRegistrant(String registrant) {
        this.registrant = registrant == null ? null : registrant.trim();
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