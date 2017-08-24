package com.hebeu.keyan.po;

import java.util.Date;

public class BudgetAdjust {
    private Integer budgetId;

    private String projectId;

    private Double publishTotal;

    private Double materialsTotal;

    private Double testTotal;

    private Double fuelTotal;

    private Double travelTotal;

    private Double meetTotal;

    private Double internationalTotal;

    private Double facilityTotal;

    private Double labourTotal;

    private Double expertTotal;

    private Double datumTotal;

    private Double printTotal;

    private Double otherTotal;

    private Double manageTotal;

    private Double postTotal;

    private Integer auditStatusId;

    private String auditPersonId1;

    private String auditPoinion1;

    private String auditPersonId2;

    private String auditPoinion2;

    private Date insertTime;

    private Date lastTime;

    public Integer getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(Integer budgetId) {
        this.budgetId = budgetId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public Double getPublishTotal() {
        return publishTotal;
    }

    public void setPublishTotal(Double publishTotal) {
        this.publishTotal = publishTotal;
    }

    public Double getMaterialsTotal() {
        return materialsTotal;
    }

    public void setMaterialsTotal(Double materialsTotal) {
        this.materialsTotal = materialsTotal;
    }

    public Double getTestTotal() {
        return testTotal;
    }

    public void setTestTotal(Double testTotal) {
        this.testTotal = testTotal;
    }

    public Double getFuelTotal() {
        return fuelTotal;
    }

    public void setFuelTotal(Double fuelTotal) {
        this.fuelTotal = fuelTotal;
    }

    public Double getTravelTotal() {
        return travelTotal;
    }

    public void setTravelTotal(Double travelTotal) {
        this.travelTotal = travelTotal;
    }

    public Double getMeetTotal() {
        return meetTotal;
    }

    public void setMeetTotal(Double meetTotal) {
        this.meetTotal = meetTotal;
    }

    public Double getInternationalTotal() {
        return internationalTotal;
    }

    public void setInternationalTotal(Double internationalTotal) {
        this.internationalTotal = internationalTotal;
    }

    public Double getFacilityTotal() {
        return facilityTotal;
    }

    public void setFacilityTotal(Double facilityTotal) {
        this.facilityTotal = facilityTotal;
    }

    public Double getLabourTotal() {
        return labourTotal;
    }

    public void setLabourTotal(Double labourTotal) {
        this.labourTotal = labourTotal;
    }

    public Double getExpertTotal() {
        return expertTotal;
    }

    public void setExpertTotal(Double expertTotal) {
        this.expertTotal = expertTotal;
    }

    public Double getDatumTotal() {
        return datumTotal;
    }

    public void setDatumTotal(Double datumTotal) {
        this.datumTotal = datumTotal;
    }

    public Double getPrintTotal() {
        return printTotal;
    }

    public void setPrintTotal(Double printTotal) {
        this.printTotal = printTotal;
    }

    public Double getOtherTotal() {
        return otherTotal;
    }

    public void setOtherTotal(Double otherTotal) {
        this.otherTotal = otherTotal;
    }

    public Double getManageTotal() {
        return manageTotal;
    }

    public void setManageTotal(Double manageTotal) {
        this.manageTotal = manageTotal;
    }

    public Double getPostTotal() {
        return postTotal;
    }

    public void setPostTotal(Double postTotal) {
        this.postTotal = postTotal;
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