package com.hebeu.keyan.po;

public class RewResultType {
    private Integer resultTypeId;

    private String resultTypeName;

    private Integer subjectTypeId;

    private Integer isEffective;

    public Integer getResultTypeId() {
        return resultTypeId;
    }

    public void setResultTypeId(Integer resultTypeId) {
        this.resultTypeId = resultTypeId;
    }

    public String getResultTypeName() {
        return resultTypeName;
    }

    public void setResultTypeName(String resultTypeName) {
        this.resultTypeName = resultTypeName == null ? null : resultTypeName.trim();
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