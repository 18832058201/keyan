package com.hebeu.keyan.po;

public class ProEconomicsIndustry2Key {
    private Integer id;

    private String economicsIndustry2Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEconomicsIndustry2Id() {
        return economicsIndustry2Id;
    }

    public void setEconomicsIndustry2Id(String economicsIndustry2Id) {
        this.economicsIndustry2Id = economicsIndustry2Id == null ? null : economicsIndustry2Id.trim();
    }
}