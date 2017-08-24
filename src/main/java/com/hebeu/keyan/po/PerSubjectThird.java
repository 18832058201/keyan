package com.hebeu.keyan.po;

public class PerSubjectThird {
    private Integer subjectThirdId;

    private String subjectThirdName;

    private Integer subjectSecondId;

    private Integer isEffective;

    public Integer getSubjectThirdId() {
        return subjectThirdId;
    }

    public void setSubjectThirdId(Integer subjectThirdId) {
        this.subjectThirdId = subjectThirdId;
    }

    public String getSubjectThirdName() {
        return subjectThirdName;
    }

    public void setSubjectThirdName(String subjectThirdName) {
        this.subjectThirdName = subjectThirdName == null ? null : subjectThirdName.trim();
    }

    public Integer getSubjectSecondId() {
        return subjectSecondId;
    }

    public void setSubjectSecondId(Integer subjectSecondId) {
        this.subjectSecondId = subjectSecondId;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}