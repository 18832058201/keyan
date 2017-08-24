package com.hebeu.keyan.po;

public class ProProjectDomain {
    private Integer projectDomainId;

    private String projectDomainName;

    private Integer isEffective;

    private Double rate;

    public Integer getProjectDomainId() {
        return projectDomainId;
    }

    public void setProjectDomainId(Integer projectDomainId) {
        this.projectDomainId = projectDomainId;
    }

    public String getProjectDomainName() {
        return projectDomainName;
    }

    public void setProjectDomainName(String projectDomainName) {
        this.projectDomainName = projectDomainName == null ? null : projectDomainName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}