package com.hebeu.keyan.po;

public class RewClass {
    private Integer rewClassId;

    private String rewClassName;

    private Integer subjectTypeId;

    private Double score;

    private Integer isEffective;

    public Integer getRewClassId() {
        return rewClassId;
    }

    public void setRewClassId(Integer rewClassId) {
        this.rewClassId = rewClassId;
    }

    public String getRewClassName() {
        return rewClassName;
    }

    public void setRewClassName(String rewClassName) {
        this.rewClassName = rewClassName == null ? null : rewClassName.trim();
    }

    public Integer getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Integer subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}