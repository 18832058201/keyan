package com.hebeu.keyan.po;

public class RewFinishWay {
    private Integer finishWayId;

    private String finishWayName;

    private Integer rewLevelId;

    private Integer isEffective;

    public Integer getFinishWayId() {
        return finishWayId;
    }

    public void setFinishWayId(Integer finishWayId) {
        this.finishWayId = finishWayId;
    }

    public String getFinishWayName() {
        return finishWayName;
    }

    public void setFinishWayName(String finishWayName) {
        this.finishWayName = finishWayName == null ? null : finishWayName.trim();
    }

    public Integer getRewLevelId() {
        return rewLevelId;
    }

    public void setRewLevelId(Integer rewLevelId) {
        this.rewLevelId = rewLevelId;
    }

    public Integer getIsEffective() {
        return isEffective;
    }

    public void setIsEffective(Integer isEffective) {
        this.isEffective = isEffective;
    }
}