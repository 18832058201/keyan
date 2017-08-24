package com.hebeu.keyan.po;

public class PerForeignLanguage {
    private Integer foreignLanguageId;

    private String foreignLanguageName;

    private Integer isEffective;

    public Integer getForeignLanguageId() {
        return foreignLanguageId;
    }

    public void setForeignLanguageId(Integer foreignLanguageId) {
        this.foreignLanguageId = foreignLanguageId;
    }

    public String getForeignLanguageName() {
        return foreignLanguageName;
    }

    public void setForeignLanguageName(String foreignLanguageName) {
        this.foreignLanguageName = foreignLanguageName == null ? null : foreignLanguageName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}