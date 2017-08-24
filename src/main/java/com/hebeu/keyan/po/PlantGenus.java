package com.hebeu.keyan.po;

public class PlantGenus {
    private Integer plantGenusId;

    private String plantGenusName;

    private Integer isEffective;

    public Integer getPlantGenusId() {
        return plantGenusId;
    }

    public void setPlantGenusId(Integer plantGenusId) {
        this.plantGenusId = plantGenusId;
    }

    public String getPlantGenusName() {
        return plantGenusName;
    }

    public void setPlantGenusName(String plantGenusName) {
        this.plantGenusName = plantGenusName == null ? null : plantGenusName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}