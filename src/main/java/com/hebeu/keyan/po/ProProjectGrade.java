package com.hebeu.keyan.po;

public class ProProjectGrade {
    private Integer projectGradeId;

    private String projectGradeName;

    private Integer isEffective;

    public Integer getProjectGradeId() {
        return projectGradeId;
    }

    public void setProjectGradeId(Integer projectGradeId) {
        this.projectGradeId = projectGradeId;
    }

    public String getProjectGradeName() {
        return projectGradeName;
    }

    public void setProjectGradeName(String projectGradeName) {
        this.projectGradeName = projectGradeName == null ? null : projectGradeName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}