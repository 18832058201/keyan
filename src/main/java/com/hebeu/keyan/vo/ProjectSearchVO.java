package com.hebeu.keyan.vo;

/**
 * 作者：陈德华
 * 时间：2017/8/14 17:14
 * 描述：项目查询条件值对象，根据具体查询条件添加属性
 */
public class ProjectSearchVO {
    private Integer auditType;    //审核类型  1表示待审核  2表示已审核  3表示全部
    private Integer collegeId;    //学院id
    private Integer subjectTypeId; //学科门类

    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getSubjectTypeId() {
        return subjectTypeId;
    }

    public void setSubjectTypeId(Integer subjectTypeId) {
        this.subjectTypeId = subjectTypeId;
    }
}
