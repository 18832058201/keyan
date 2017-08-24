package com.hebeu.keyan.po;

public class PatType {
    private Integer patTypeId;

    private String patTypeName;

    private Double score;

    private Integer isEffective;

    public Integer getPatTypeId() {
        return patTypeId;
    }

    public void setPatTypeId(Integer patTypeId) {
        this.patTypeId = patTypeId;
    }

    public String getPatTypeName() {
        return patTypeName;
    }

    public void setPatTypeName(String patTypeName) {
        this.patTypeName = patTypeName == null ? null : patTypeName.trim();
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