package com.hebeu.keyan.vo;

/**
 * 作者：陈德华
 * 时间：2017/8/2 11:07
 * 描述：人员列表值对象
 */
public class PersonListVO {
    private String personType;  //人员类别  1为校内职工  2为校内学生  3为校外人员
    private String collegeId;    //校内人员学院id
    private String collegeName;
    private String workNum;      //校内职工工号
    private String workName;   //姓名
    private Integer isLeader;    //是否负责人 0不是  1是


    public PersonListVO() {
    }

    public PersonListVO(String personType, String collegeId, String collegeName, String workNum, String workName, Integer isLeader) {
        this.personType = personType;
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.workNum = workNum;
        this.workName = workName;
        this.isLeader = isLeader;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public Integer getIsLeader() {
        return isLeader;
    }

    public void setIsLeader(Integer isLeader) {
        this.isLeader = isLeader;
    }

    @Override
    public String toString() {
        return "PersonListVO{" +
                "personType=" + personType +
                ", collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", workNum='" + workNum + '\'' +
                ", workName='" + workName + '\'' +
                ", isLeader=" + isLeader +
                '}';
    }
}
