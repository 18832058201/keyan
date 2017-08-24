package com.hebeu.keyan.po;

public class IdenLevel {
    private Integer idenLevelId;

    private String idenLevelName;

    private Integer subjectTypeId;

    private Integer isEffective;

    public Integer getIdenLevelId() {
        return idenLevelId;
    }

    public void setIdenLevelId(Integer idenLevelId) {
        this.idenLevelId = idenLevelId;
    }

    public String getIdenLevelName() {
        return idenLevelName;
    }

    public void setIdenLevelName(String idenLevelName) {
        this.idenLevelName = idenLevelName == null ? null : idenLevelName.trim();
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