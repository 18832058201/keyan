package com.hebeu.keyan.po;

public class PerTitleType {
    private Integer titleTypeId;

    private String titleTypeName;

    private Integer isEffective;

    public Integer getTitleTypeId() {
        return titleTypeId;
    }

    public void setTitleTypeId(Integer titleTypeId) {
        this.titleTypeId = titleTypeId;
    }

    public String getTitleTypeName() {
        return titleTypeName;
    }

    public void setTitleTypeName(String titleTypeName) {
        this.titleTypeName = titleTypeName == null ? null : titleTypeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}