package com.hebeu.keyan.po;

public class PerTutorType {
    private Integer tutorTypeId;

    private String tutorTypeName;

    private Integer isEffective;

    public Integer getTutorTypeId() {
        return tutorTypeId;
    }

    public void setTutorTypeId(Integer tutorTypeId) {
        this.tutorTypeId = tutorTypeId;
    }

    public String getTutorTypeName() {
        return tutorTypeName;
    }

    public void setTutorTypeName(String tutorTypeName) {
        this.tutorTypeName = tutorTypeName == null ? null : tutorTypeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}