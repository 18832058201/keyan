package com.hebeu.keyan.po;

public class StandType {
    private Integer standTypeId;

    private String standTypeName;

    private Integer isEffective;

    public Integer getStandTypeId() {
        return standTypeId;
    }

    public void setStandTypeId(Integer standTypeId) {
        this.standTypeId = standTypeId;
    }

    public String getStandTypeName() {
        return standTypeName;
    }

    public void setStandTypeName(String standTypeName) {
        this.standTypeName = standTypeName == null ? null : standTypeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}