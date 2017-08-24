package com.hebeu.keyan.po;

public class ProEconomicsIndustry1Key {
    private Integer id;

    private String economicsIndustry1Id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEconomicsIndustry1Id() {
        return economicsIndustry1Id;
    }

    public void setEconomicsIndustry1Id(String economicsIndustry1Id) {
        this.economicsIndustry1Id = economicsIndustry1Id == null ? null : economicsIndustry1Id.trim();
    }
}