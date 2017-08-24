package com.hebeu.keyan.po;

public class ProEconomicsIndustry3Key {
    private Integer id;

    private String economicsIndustry3Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEconomicsIndustry3Id() {
        return economicsIndustry3Id;
    }

    public void setEconomicsIndustry3Id(String economicsIndustry3Id) {
        this.economicsIndustry3Id = economicsIndustry3Id == null ? null : economicsIndustry3Id.trim();
    }
}