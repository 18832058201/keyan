package com.hebeu.keyan.po;

public class ProOrganizationForm {
    private Integer organizationFormId;

    private String organizationFormName;

    private Integer isEffective;

    public Integer getOrganizationFormId() {
        return organizationFormId;
    }

    public void setOrganizationFormId(Integer organizationFormId) {
        this.organizationFormId = organizationFormId;
    }

    public String getOrganizationFormName() {
        return organizationFormName;
    }

    public void setOrganizationFormName(String organizationFormName) {
        this.organizationFormName = organizationFormName == null ? null : organizationFormName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}