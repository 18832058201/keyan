package com.hebeu.keyan.po;

public class ProCooperationType {
    private Integer cooperationTypeId;

    private String cooperationTypeName;

    private Integer isEffective;

    public Integer getCooperationTypeId() {
        return cooperationTypeId;
    }

    public void setCooperationTypeId(Integer cooperationTypeId) {
        this.cooperationTypeId = cooperationTypeId;
    }

    public String getCooperationTypeName() {
        return cooperationTypeName;
    }

    public void setCooperationTypeName(String cooperationTypeName) {
        this.cooperationTypeName = cooperationTypeName == null ? null : cooperationTypeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}