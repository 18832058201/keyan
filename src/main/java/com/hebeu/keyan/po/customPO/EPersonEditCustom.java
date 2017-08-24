package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EPersonEdit;

import javax.lang.model.element.NestingKind;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-20  17:42
 * 描述：
 */
public class EPersonEditCustom extends EPersonEdit {
    private String collegeName2;
    private String postTypeName;
    private String postLevelName;
    private String titleTypeName;
    private String titleLevelName;
    private String auditStatusName;
    private Integer isEdit;

    public String getCollegeName2() {
        return collegeName2;
    }

    public void setCollegeName2(String collegeName2) {
        this.collegeName2 = collegeName2;
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

    public String getAuditStatusName() {
        return auditStatusName;
    }

    public void setAuditStatusName(String auditStatusName) {
        this.auditStatusName = auditStatusName;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }
    @Override
    public String toString() {
        return super.toString() + "EPersonEditCustom{" +
                "collegeName2='" + collegeName2 + '\'' +
                "titleTypeName='" + titleTypeName + '\'' +
                "titleLevelName='" + titleLevelName + '\'' +
                "postTypeName='" + postTypeName + '\'' +
                "postLevelName='" + postLevelName + '\'' +
                "auditStatusName='" + auditStatusName + '\'' +
                "isEdit='" + isEdit + '\'' +
                '}';
    }
}
