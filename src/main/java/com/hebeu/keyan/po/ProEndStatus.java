package com.hebeu.keyan.po;

public class ProEndStatus {
    private Integer endStatusId;

    private String endStatusName;

    private Integer isEffective;

    public Integer getEndStatusId() {
        return endStatusId;
    }

    public void setEndStatusId(Integer endStatusId) {
        this.endStatusId = endStatusId;
    }

    public String getEndStatusName() {
        return endStatusName;
    }

    public void setEndStatusName(String endStatusName) {
        this.endStatusName = endStatusName == null ? null : endStatusName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}