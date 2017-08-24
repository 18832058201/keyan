package com.hebeu.keyan.po;

public class ProProjectSource {
    private Integer projectSourceId;

    private String projectSourceName;

    private Integer subjectTypeId;

    private Integer isEffective;

    public Integer getProjectSourceId() {
        return projectSourceId;
    }

    public void setProjectSourceId(Integer projectSourceId) {
        this.projectSourceId = projectSourceId;
    }

    public String getProjectSourceName() {
        return projectSourceName;
    }

    public void setProjectSourceName(String projectSourceName) {
        this.projectSourceName = projectSourceName == null ? null : projectSourceName.trim();
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