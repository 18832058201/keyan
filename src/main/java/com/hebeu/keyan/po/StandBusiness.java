package com.hebeu.keyan.po;

public class StandBusiness {
    private Integer standBusinessId;

    private String standBusinessName;

    private Integer isEffective;

    public Integer getStandBusinessId() {
        return standBusinessId;
    }

    public void setStandBusinessId(Integer standBusinessId) {
        this.standBusinessId = standBusinessId;
    }

    public String getStandBusinessName() {
        return standBusinessName;
    }

    public void setStandBusinessName(String standBusinessName) {
        this.standBusinessName = standBusinessName == null ? null : standBusinessName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}