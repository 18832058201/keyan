package com.hebeu.keyan.po;

public class ProProjectType1 {
    private Integer projectType1Id;

    private String projectType1Name;

    private Integer subjectTypeId;

    private Integer isEffective;

    public Integer getProjectType1Id() {
        return projectType1Id;
    }

    public void setProjectType1Id(Integer projectType1Id) {
        this.projectType1Id = projectType1Id;
    }

    public String getProjectType1Name() {
        return projectType1Name;
    }

    public void setProjectType1Name(String projectType1Name) {
        this.projectType1Name = projectType1Name == null ? null : projectType1Name.trim();
    }

    public Integer getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Integer subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}