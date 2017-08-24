package com.hebeu.keyan.po;

public class StandState {
    private Integer standStateId;

    private String standStateName;

    private Integer isEffective;

    public Integer getStandStateId() {
        return standStateId;
    }

    public void setStandStateId(Integer standStateId) {
        this.standStateId = standStateId;
    }

    public String getStandStateName() {
        return standStateName;
    }

    public void setStandStateName(String standStateName) {
        this.standStateName = standStateName == null ? null : standStateName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}