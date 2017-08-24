package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.ManageMoneyApply;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/11  15:30
 * 描述：科研管理费申请表  拓展类,用于接收数据库返回的数据
 */
public class ManageMoneyApplyCustom extends ManageMoneyApply{
    //科研管理费  拓展属性
    private String collegeName;
    private String applyTypeName;
    private String auditStatusName;
    private Integer isEdit;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getApplyTypeName() {
        return applyTypeName;
    }

    public void setApplyTypeName(String applyTypeName) {
        this.applyTypeName = applyTypeName;
    }

    public String getAuditStatusName() {
        return auditStatusName;
    }

    public void setAuditStatusName(String auditStatusName) {
        this.auditStatusName = auditStatusName;
    }

    public Integer getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(Integer isEdit) {
        this.isEdit = isEdit;
    }
    @Override
    public String toString() {
        return super.toString() + "ManageMoneyApplyCustom{" +
                "collegeName='" + collegeName + '\'' +
                "applyTypeName='" + applyTypeName + '\'' +
                "auditStatusName='" + auditStatusName + '\'' +
                "isEdit='" + isEdit + '\'' +
                '}';
    }
}
