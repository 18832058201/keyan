package com.hebeu.keyan.po;

public class RewLevel {
    private Integer rewLevelId;

    private String rewLevelName;

    private Integer isEffective;

    public Integer getRewLevelId() {
        return rewLevelId;
    }

    public void setRewLevelId(Integer rewLevelId) {
        this.rewLevelId = rewLevelId;
    }

    public String getRewLevelName() {
        return rewLevelName;
    }

    public void setRewLevelName(String rewLevelName) {
        this.rewLevelName = rewLevelName == null ? null : rewLevelName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}