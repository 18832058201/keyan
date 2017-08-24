package com.hebeu.keyan.po;

public class PerSubjectFirst {
    private Integer subjectFirstId;

    private String subjectFirstName;

    private Integer subjectTypeId;

    private Integer isEffective;

    public Integer getSubjectFirstId() {
        return subjectFirstId;
    }

    public void setSubjectFirstId(Integer subjectFirstId) {
        this.subjectFirstId = subjectFirstId;
    }

    public String getSubjectFirstName() {
        return subjectFirstName;
    }

    public void setSubjectFirstName(String subjectFirstName) {
        this.subjectFirstName = subjectFirstName == null ? null : subjectFirstName.trim();
    }

    public Integer getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Integer subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}