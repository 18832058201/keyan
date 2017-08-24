package com.hebeu.keyan.po;

public class PaperPublishRange {
    private Integer publishRangeId;

    private String publishRangeName;

    private Integer isEffective;

    public Integer getPublishRangeId() {
        return publishRangeId;
    }

    public void setPublishRangeId(Integer publishRangeId) {
        this.publishRangeId = publishRangeId;
    }

    public String getPublishRangeName() {
        return publishRangeName;
    }

    public void setPublishRangeName(String publishRangeName) {
        this.publishRangeName = publishRangeName == null ? null : publishRangeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}