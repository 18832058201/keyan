package com.hebeu.keyan.po;

public class BookPressType {
    private Integer pressTypeId;

    private String pressTypeName;

    private Integer isEffective;

    public Integer getPressTypeId() {
        return pressTypeId;
    }

    public void setPressTypeId(Integer pressTypeId) {
        this.pressTypeId = pressTypeId;
    }

    public String getPressTypeName() {
        return pressTypeName;
    }

    public void setPressTypeName(String pressTypeName) {
        this.pressTypeName = pressTypeName == null ? null : pressTypeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}