package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EPatent;

/**
 * Created by Administrator on 2017/8/10.
 */
public class EPatentCustom extends EPatent{
    private String subjectFirstName;
    private String patTypeName;
    private String auditStatusName;
    private Integer isEdit;
    private String subjectTypeName;

    public String getSubjectFirstName() {
        return subjectFirstName;
    }

    public void setSubjectFirstName(String subjectFirstName) {
        this.subjectFirstName = subjectFirstName;
    }

    public String getPatTypeName() {
        return patTypeName;
    }

    public void setPatTypeName(String patTypeName) {
        this.patTypeName = patTypeName;
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

    public String getSubjectTypeName() {
        return subjectTypeName;
    }

    public void setSubjectTypeName(String subjectTypeName) {
        this.subjectTypeName = subjectTypeName;
    }
}
