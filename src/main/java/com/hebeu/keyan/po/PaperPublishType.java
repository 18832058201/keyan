package com.hebeu.keyan.po;

public class PaperPublishType {
    private Integer publishTypeId;

    private String publishTypeName;

    private Integer isEffective;

    public Integer getPublishTypeId() {
        return publishTypeId;
    }

    public void setPublishTypeId(Integer publishTypeId) {
        this.publishTypeId = publishTypeId;
    }

    public String getPublishTypeName() {
        return publishTypeName;
    }

    public void setPublishTypeName(String publishTypeName) {
        this.publishTypeName = publishTypeName == null ? null : publishTypeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}