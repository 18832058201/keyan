package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EInclude;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-22  16:13
 * 描述：论文收录 拓展实体类
 */
public class EIncludeCustom extends EInclude {
    private String paperName;
    private String includeToolName;
    private String auditStatusName;
    private Integer isEdit;

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getIncludeToolName() {
        return includeToolName;
    }

    public void setIncludeToolName(String includeToolName) {
        this.includeToolName = includeToolName;
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
        return super.toString() + "EIncludeCustom{" +
                "paperName='" + paperName + '\'' +
                "includeToolName='" + includeToolName + '\'' +
                "auditStatusName='" + auditStatusName + '\'' +
                "isEdit='" + isEdit + '\'' +
                '}';
    }

}
