package com.hebeu.keyan.po;

public class RewType {
    private Integer rewTypeId;

    private String rewTypeName;

    private Integer subjectTypeId;

    private Integer isEffective;

    public Integer getRewTypeId() {
        return rewTypeId;
    }

    public void setRewTypeId(Integer rewTypeId) {
        this.rewTypeId = rewTypeId;
    }

    public String getRewTypeName() {
        return rewTypeName;
    }

    public void setRewTypeName(String rewTypeName) {
        this.rewTypeName = rewTypeName == null ? null : rewTypeName.trim();
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