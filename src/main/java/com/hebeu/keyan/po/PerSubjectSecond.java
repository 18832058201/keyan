package com.hebeu.keyan.po;

public class PerSubjectSecond {
    private Integer subjectSecondId;

    private String subjectSecondName;

    private Integer subjectFirstId;

    private Integer isEffective;

    public Integer getSubjectSecondId() {
        return subjectSecondId;
    }

    public void setSubjectSecondId(Integer subjectSecondId) {
        this.subjectSecondId = subjectSecondId;
    }

    public String getSubjectSecondName() {
        return subjectSecondName;
    }

    public void setSubjectSecondName(String subjectSecondName) {
        this.subjectSecondName = subjectSecondName == null ? null : subjectSecondName.trim();
    }

    public Integer getSubjectFirstId() {
        return subjectFirstId;
    }

    public void setSubjectFirstId(Integer subjectFirstId) {
        this.subjectFirstId = subjectFirstId;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}