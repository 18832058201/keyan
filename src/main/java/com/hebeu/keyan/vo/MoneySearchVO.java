package com.hebeu.keyan.vo;

/**
 * 作者：陈德华
 * 时间：2017/8/14 17:14
 * 描述：经费部分查询条件值对象，根据具体查询条件添加属性
 */
public class MoneySearchVO {
    private Integer auditType;    //审核类型  1表示待审核  2表示已审核  3表示全部   4表示已发放   5表示未发放
    private String workNameAndNum;//姓名（工号）
    public Integer getAuditType() {
        return auditType;
    }

    public void setAuditType(Integer auditType) {
        this.auditType = auditType;
    }

    public String getWorkNameAndNum() {
        return workNameAndNum;
    }

    public void setWorkNameAndNum(String workNameAndNum) {
        this.workNameAndNum = workNameAndNum;
    }
    @Override
    public String toString() {
        return super.toString() + "MoneySearchVO{" +
                ", auditType=" + auditType +
                ", workNameAndNum='" + workNameAndNum + '\'' +
                '}';
    }
}
