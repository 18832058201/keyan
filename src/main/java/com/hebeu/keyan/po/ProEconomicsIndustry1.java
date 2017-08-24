package com.hebeu.keyan.po;

public class ProEconomicsIndustry1 extends ProEconomicsIndustry1Key {
    private String economicsIndustry1Name;

    private Integer isEffective;

    public String getEconomicsIndustry1Name() {
        return economicsIndustry1Name;
    }

    public void setEconomicsIndustry1Name(String economicsIndustry1Name) {
        this.economicsIndustry1Name = economicsIndustry1Name == null ? null : economicsIndustry1Name.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}