package com.hebeu.keyan.po;

public class RewGrade {
    private Integer rewGradeId;

    private String rewGradeName;

    private Double score;

    private Integer isEffective;

    public Integer getRewGradeId() {
        return rewGradeId;
    }

    public void setRewGradeId(Integer rewGradeId) {
        this.rewGradeId = rewGradeId;
    }

    public String getRewGradeName() {
        return rewGradeName;
    }

    public void setRewGradeName(String rewGradeName) {
        this.rewGradeName = rewGradeName == null ? null : rewGradeName.trim();
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}