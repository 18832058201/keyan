package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.EPlant;

/**
 * Created by Administrator on 2017/8/20.
 */
public class EPlantCustom extends EPlant{
    private String subjectTypeName;
    private String auditStatusName;
    private Integer isEdit;
    private String plantGradeName;
    private String plantTypeName;
    private String plantGenusName;

    public String getSubjectTypeName() {
        return subjectTypeName;
    }

    public void setSubjectTypeName(String subjectTypeName) {
        this.subjectTypeName = subjectTypeName;
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

    public String getPlantGradeName() {
        return plantGradeName;
    }

    public void setPlantGradeName(String plantGradeName) {
        this.plantGradeName = plantGradeName;
    }

    public String getPlantTypeName() {
        return plantTypeName;
    }

    public void setPlantTypeName(String plantTypeName) {
        this.plantTypeName = plantTypeName;
    }

    public String getPlantGenusName() {
        return plantGenusName;
    }

    public void setPlantGenusName(String plantGenusName) {
        this.plantGenusName = plantGenusName;
    }
}
