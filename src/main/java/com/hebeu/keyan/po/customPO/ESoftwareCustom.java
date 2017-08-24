package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.ESoftware;

/**
 * Created by Administrator on 2017/8/17.
 */
public class ESoftwareCustom extends ESoftware{
    private String subjectTypeName;
    private String subjectFirstName;
    private String auditStatusName;
    private Integer isEdit;
    public String getSubjectTypeName() {
        return subjectTypeName;
    }

    public void setSubjectTypeName(String subjectTypeName) {
        this.subjectTypeName = subjectTypeName;
    }

    public String getSubjectFirstName() {
        return subjectFirstName;
    }

    public void setSubjectFirstName(String subjectFirstName) {
        this.subjectFirstName = subjectFirstName;
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
}
