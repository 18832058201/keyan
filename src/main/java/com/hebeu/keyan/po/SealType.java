package com.hebeu.keyan.po;

public class SealType {
    private Integer sealTypeId;

    private String sealTypeName;

    private Integer isEffective;

    public Integer getSealTypeId() {
        return sealTypeId;
    }

    public void setSealTypeId(Integer sealTypeId) {
        this.sealTypeId = sealTypeId;
    }

    public String getSealTypeName() {
        return sealTypeName;
    }

    public void setSealTypeName(String sealTypeName) {
        this.sealTypeName = sealTypeName == null ? null : sealTypeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}