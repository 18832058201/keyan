package com.hebeu.keyan.po;

public class ProEconomicsIndustry3 extends ProEconomicsIndustry3Key {
    private String economicsIndustry3Name;

    private String economicsIndustry2Id;

    private Integer isEffective;

    public String getEconomicsIndustry3Name() {
        return economicsIndustry3Name;
    }

    public void setEconomicsIndustry3Name(String economicsIndustry3Name) {
        this.economicsIndustry3Name = economicsIndustry3Name == null ? null : economicsIndustry3Name.trim();
    }

    public String getEconomicsIndustry2Id() {
        return economicsIndustry2Id;
    }

    public void setEconomicsIndustry2Id(String economicsIndustry2Id) {
        this.economicsIndustry2Id = economicsIndustry2Id == null ? null : economicsIndustry2Id.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}