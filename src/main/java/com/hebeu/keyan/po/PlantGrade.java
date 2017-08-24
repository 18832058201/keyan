package com.hebeu.keyan.po;

public class PlantGrade {
    private Integer plantGradeId;

    private String plantGradeName;

    private Integer isEffective;

    public Integer getPlantGradeId() {
        return plantGradeId;
    }

    public void setPlantGradeId(Integer plantGradeId) {
        this.plantGradeId = plantGradeId;
    }

    public String getPlantGradeName() {
        return plantGradeName;
    }

    public void setPlantGradeName(String plantGradeName) {
        this.plantGradeName = plantGradeName == null ? null : plantGradeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}