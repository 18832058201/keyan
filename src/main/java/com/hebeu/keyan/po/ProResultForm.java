package com.hebeu.keyan.po;

public class ProResultForm {
    private Integer resultFormId;

    private String resultFormName;

    private Integer isEffective;

    public Integer getResultFormId() {
        return resultFormId;
    }

    public void setResultFormId(Integer resultFormId) {
        this.resultFormId = resultFormId;
    }

    public String getResultFormName() {
        return resultFormName;
    }

    public void setResultFormName(String resultFormName) {
        this.resultFormName = resultFormName == null ? null : resultFormName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}