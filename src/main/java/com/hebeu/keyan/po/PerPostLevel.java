package com.hebeu.keyan.po;

public class PerPostLevel {
    private Integer postLevelId;

    private String postLevelName;

    private Integer postTypeId;

    private Double rate;

    private Integer isEffective;

    public Integer getPostLevelId() {
        return postLevelId;
    }

    public void setPostLevelId(Integer postLevelId) {
        this.postLevelId = postLevelId;
    }

    public String getPostLevelName() {
        return postLevelName;
    }

    public void setPostLevelName(String postLevelName) {
        this.postLevelName = postLevelName == null ? null : postLevelName.trim();
    }

    public Integer getPostTypeId() {
        return postTypeId;
    }

    public void setPostTypeId(Integer postTypeId) {
        this.postTypeId = postTypeId;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}