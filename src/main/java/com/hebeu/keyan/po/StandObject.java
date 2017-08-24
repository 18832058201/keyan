package com.hebeu.keyan.po;

public class StandObject {
    private Integer standObjectId;

    private String standObjectName;

    private Integer isEffective;

    public Integer getStandObjectId() {
        return standObjectId;
    }

    public void setStandObjectId(Integer standObjectId) {
        this.standObjectId = standObjectId;
    }

    public String getStandObjectName() {
        return standObjectName;
    }

    public void setStandObjectName(String standObjectName) {
        this.standObjectName = standObjectName == null ? null : standObjectName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}