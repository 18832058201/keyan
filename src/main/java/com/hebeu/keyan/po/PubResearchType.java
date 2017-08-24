package com.hebeu.keyan.po;

public class PubResearchType {
    private Integer researchTypeId;

    private String researchTypeName;

    private Integer subjectTypeId;

    private Integer isEffective;

    public Integer getResearchTypeId() {
        return researchTypeId;
    }

    public void setResearchTypeId(Integer researchTypeId) {
        this.researchTypeId = researchTypeId;
    }

    public String getResearchTypeName() {
        return researchTypeName;
    }

    public void setResearchTypeName(String researchTypeName) {
        this.researchTypeName = researchTypeName == null ? null : researchTypeName.trim();
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