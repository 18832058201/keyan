package com.hebeu.keyan.po;

public class PerLanguageLevel {
    private Integer languageLevelId;

    private String languageLevelName;

    private Integer isEffective;

    public Integer getLanguageLevelId() {
        return languageLevelId;
    }

    public void setLanguageLevelId(Integer languageLevelId) {
        this.languageLevelId = languageLevelId;
    }

    public String getLanguageLevelName() {
        return languageLevelName;
    }

    public void setLanguageLevelName(String languageLevelName) {
        this.languageLevelName = languageLevelName == null ? null : languageLevelName.trim();
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}