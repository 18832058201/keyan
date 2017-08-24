package com.hebeu.keyan.po;

public class PerTitleLevel {
    private Integer titleLevelId;

    private String titleLevelName;

    private Integer titleTypeId;

    private Double rate;

    private Integer isEffective;

    public Integer getTitleLevelId() {
        return titleLevelId;
    }

    public void setTitleLevelId(Integer titleLevelId) {
        this.titleLevelId = titleLevelId;
    }

    public String getTitleLevelName() {
        return titleLevelName;
    }

    public void setTitleLevelName(String titleLevelName) {
        this.titleLevelName = titleLevelName == null ? null : titleLevelName.trim();
    }

    public Integer getTitleTypeId() {
        return titleTypeId;
    }

    public void setTitleTypeId(Integer titleTypeId) {
        this.titleTypeId = titleTypeId;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}