package com.hebeu.keyan.po;

public class IdenResultLevel {
    private Integer resultLevelId;

    private String resultLevelName;

    private Double score;

    private Integer isEffective;

    public Integer getResultLevelId() {
        return resultLevelId;
    }

    public void setResultLevelId(Integer resultLevelId) {
        this.resultLevelId = resultLevelId;
    }

    public String getResultLevelName() {
        return resultLevelName;
    }

    public void setResultLevelName(String resultLevelName) {
        this.resultLevelName = resultLevelName == null ? null : resultLevelName.trim();
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