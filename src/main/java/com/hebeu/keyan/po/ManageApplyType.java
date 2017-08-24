package com.hebeu.keyan.po;

public class ManageApplyType {
    private Integer applyTypeId;

    private String applyTypeName;

    public Integer getApplyTypeId() {
        return applyTypeId;
    }

    public void setApplyTypeId(Integer applyTypeId) {
        this.applyTypeId = applyTypeId;
    }

    public String getApplyTypeName() {
        return applyTypeName;
    }

    public void setApplyTypeName(String applyTypeName) {
        this.applyTypeName = applyTypeName == null ? null : applyTypeName.trim();
    }
}