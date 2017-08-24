package com.hebeu.keyan.po;

public class ProProjectType2 {
    private Integer projectType2Id;

    private String projectType2Name;

    private Integer projectType1Id;

    private Integer isEffective;

    public Integer getProjectType2Id() {
        return projectType2Id;
    }

    public void setProjectType2Id(Integer projectType2Id) {
        this.projectType2Id = projectType2Id;
    }

    public String getProjectType2Name() {
        return projectType2Name;
    }

    public void setProjectType2Name(String projectType2Name) {
        this.projectType2Name = projectType2Name == null ? null : projectType2Name.trim();
    }

    public Integer getProjectType1Id() {
        return projectType1Id;
    }

    public void setProjectType1Id(Integer projectType1Id) {
        this.projectType1Id = projectType1Id;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}