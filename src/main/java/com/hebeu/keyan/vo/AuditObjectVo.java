package com.hebeu.keyan.vo;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/15 10:24
 * 描述：审核对象的值对象，包括审核查询条件的封装
 */
public class AuditObjectVo {
    private List<String> auditObjectId;  //审核对象的id，即项目id或成果id
    private String auditOpinion;   //审核意见
    private String operation;      //操作类型 ，agree为审核通过 ，refuse 为拒绝审核 ，revoke为撤销审核

    private Integer auditType;     //审核类型  1待审核   2已审核   3全部
    private Integer collegeId;    //学院id
    private Integer subjectTypeId; //学科门类

    public List<String> getAuditObjectId() {
        return auditObjectId;
    }

    public void setAuditObjectId(List<String> auditObjectId) {
        this.auditObjectId = auditObjectId;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

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

    public AuditObjectVo(List<String> auditObjectId, String auditOpinion, String operation, Integer auditType, Integer collegeId, Integer subjectTypeId) {
        this.auditObjectId = auditObjectId;
        this.auditOpinion = auditOpinion;
        this.operation = operation;
        this.auditType = auditType;
        this.collegeId = collegeId;
        this.subjectTypeId = subjectTypeId;
    }

    public AuditObjectVo() {
    }

    @Override
    public String toString() {
        return "AuditObjectVo{" +
                "auditObjectId=" + auditObjectId +
                ", auditOpinion='" + auditOpinion + '\'' +
                ", operation='" + operation + '\'' +
                ", auditType=" + auditType +
                ", collegeId=" + collegeId +
                ", subjectTypeId=" + subjectTypeId +
                '}';
    }
}
