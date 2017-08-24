package com.hebeu.keyan.po;

public class ProEconomicsTarget {
    private Integer economicsTargetId;

    private String economicsTargetName;

    private Integer isEffective;

    public Integer getEconomicsTargetId() {
        return economicsTargetId;
    }

    public void setEconomicsTargetId(Integer economicsTargetId) {
        this.economicsTargetId = economicsTargetId;
    }

    public String getEconomicsTargetName() {
        return economicsTargetName;
    }

    public void setEconomicsTargetName(String economicsTargetName) {
        this.economicsTargetName = economicsTargetName == null ? null : economicsTargetName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}