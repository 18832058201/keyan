package com.hebeu.keyan.po;

public class PaperPublishLevel {
    private Integer publishLevelId;

    private String publishLevelName;

    private Double bonus;

    private Double score;

    private Integer isEffective;

    public Integer getPublishLevelId() {
        return publishLevelId;
    }

    public void setPublishLevelId(Integer publishLevelId) {
        this.publishLevelId = publishLevelId;
    }

    public String getPublishLevelName() {
        return publishLevelName;
    }

    public void setPublishLevelName(String publishLevelName) {
        this.publishLevelName = publishLevelName == null ? null : publishLevelName.trim();
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
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