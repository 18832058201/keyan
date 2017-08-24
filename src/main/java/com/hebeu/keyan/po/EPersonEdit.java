package com.hebeu.keyan.po;

import java.util.Date;

public class EPersonEdit {
    private String personEditId;

    private String workNum;

    private String workName;

    private Integer collegeId2;

    private Integer postTypeId;

    private Integer postLevelId;

    private Integer titleTypeId;

    private Integer titleLevelId;

    private String editContent;

    private Integer auditStatusId;

    private String auditPersonId;

    private String auditPoinion;

    private Date lastTime;

    public String getPersonEditId() {
        return personEditId;
    }

    public void setPersonEditId(String personEditId) {
        this.personEditId = personEditId == null ? null : personEditId.trim();
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum == null ? null : workNum.trim();
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public Integer getCollegeId2() {
        return collegeId2;
    }

    public void setCollegeId2(Integer collegeId2) {
        this.collegeId2 = collegeId2;
    }

    public Integer getPostTypeId() {
        return postTypeId;
    }

    public void setPostTypeId(Integer postTypeId) {
        this.postTypeId = postTypeId;
    }

    public Integer getPostLevelId() {
        return postLevelId;
    }

    public void setPostLevelId(Integer postLevelId) {
        this.postLevelId = postLevelId;
    }

    public Integer getTitleTypeId() {
        return titleTypeId;
    }

    public void setTitleTypeId(Integer titleTypeId) {
        this.titleTypeId = titleTypeId;
    }

    public Integer getTitleLevelId() {
        return titleLevelId;
    }

    public void setTitleLevelId(Integer titleLevelId) {
        this.titleLevelId = titleLevelId;
    }

    public String getEditContent() {
        return editContent;
    }

    public void setEditContent(String editContent) {
        this.editContent = editContent == null ? null : editContent.trim();
    }

    public Integer getAuditStatusId() {
        return auditStatusId;
    }

    public void setAuditStatusId(Integer auditStatusId) {
        this.auditStatusId = auditStatusId;
    }

    public String getAuditPersonId() {
        return auditPersonId;
    }

    public void setAuditPersonId(String auditPersonId) {
        this.auditPersonId = auditPersonId == null ? null : auditPersonId.trim();
    }

    public String getAuditPoinion() {
        return auditPoinion;
    }

    public void setAuditPoinion(String auditPoinion) {
        this.auditPoinion = auditPoinion == null ? null : auditPoinion.trim();
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }
}