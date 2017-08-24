package com.hebeu.keyan.po;

import java.util.Date;

public class RPersonProjectResult {
    private String id;

    private String workNum;

    private String workName;

    private Integer collegeId;

    private String collegeName;

    private Integer personType;

    private Integer isLeader;

    private Integer type;

    private String name;

    private Date keyDate;

    private Double score;

    public String getId() {
        return id;
    }

    public RPersonProjectResult() {
    }

    public RPersonProjectResult(String id, Integer type, String name, Date keyDate) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.keyDate = keyDate;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum == null ? null : workNum.trim();
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName == null ? null : workName.trim();
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public Integer getPersonType() {
        return personType;
    }

    public void setPersonType(Integer personType) {
        this.personType = personType;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getKeyDate() {
        return keyDate;
    }

    public void setKeyDate(Date keyDate) {
        this.keyDate = keyDate;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "RPersonProjectResult{" +
                "id='" + id + '\'' +
                ", workNum='" + workNum + '\'' +
                ", workName='" + workName + '\'' +
                ", collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", personType=" + personType +
                ", isLeader=" + isLeader +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", keyDate=" + keyDate +
                ", score=" + score +
                '}';
    }
}