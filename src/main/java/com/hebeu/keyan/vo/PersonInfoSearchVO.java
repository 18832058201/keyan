package com.hebeu.keyan.vo;

/**
 * 作者：陈德华
 * 时间：2017/8/14 17:14
 * 描述：经费部分查询条件值对象，根据具体查询条件添加属性
 */
public class PersonInfoSearchVO {
    private Integer auditType;    //审核类型  1表示待审核  2表示已审核  3表示全部
    private Integer collegeId2;//科研所属学院
    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    public Integer getCollegeId2() {
        return collegeId2;
    }

    public void setCollegeId2(Integer collegeId2) {
        this.collegeId2 = collegeId2;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonInfoSearchVO{" +
                ", auditType=" + auditType +
                ", collegeId2='" + collegeId2 + '\'' +
                '}';
    }
}
