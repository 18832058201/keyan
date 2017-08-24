package com.hebeu.keyan.po;

public class ProEconomicsIndustry2 extends ProEconomicsIndustry2Key {
    private String economicsIndustry2Name;

    private String economicsIndustry1Id;

    private Integer isEffective;

    public String getEconomicsIndustry2Name() {
        return economicsIndustry2Name;
    }

    public void setEconomicsIndustry2Name(String economicsIndustry2Name) {
        this.economicsIndustry2Name = economicsIndustry2Name == null ? null : economicsIndustry2Name.trim();
    }

    public String getEconomicsIndustry1Id() {
        return economicsIndustry1Id;
    }

    public void setEconomicsIndustry1Id(String economicsIndustry1Id) {
        this.economicsIndustry1Id = economicsIndustry1Id == null ? null : economicsIndustry1Id.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}