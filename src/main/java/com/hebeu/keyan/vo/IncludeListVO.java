package com.hebeu.keyan.vo;

/**
 * 作者：冯嘉龙
 * 时间：2017/8/22 16:00
 * 描述：收录列表值对象，接收前台收录列表
 */
public class IncludeListVO {
    private String includeDate;
    private String includeToolId;
    private String includeToolName;
    private String includeNumber;
    private String statusId;

    public IncludeListVO() {
    }
    public IncludeListVO(String includeDate,String includeToolId,String includeToolName ,String includeNumber,String statusId) {
        this.includeDate = includeDate;
        this.includeNumber = includeNumber;
        this.includeToolId = includeToolId;
        this.includeToolName = includeToolName;
        this.statusId = statusId;
    }

    public String getIncludeDate() {
        return includeDate;
    }

    public void setIncludeDate(String includeDate) {
        this.includeDate = includeDate;
    }

    public String getIncludeToolId() {
        return includeToolId;
    }

    public void setIncludeToolId(String includeToolId) {
        this.includeToolId = includeToolId;
    }

    public String getIncludeToolName() {
        return includeToolName;
    }

    public void setIncludeToolName(String includeToolName) {
        this.includeToolName = includeToolName;
    }

    public String getIncludeNumber() {
        return includeNumber;
    }

    public void setIncludeNumber(String includeNumber) {
        this.includeNumber = includeNumber;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        return "IncludeListVO{" +
                "includeDate=" + includeDate +
                ", includeNumber=" + includeNumber +
                ", includeToolId='" + includeToolId + '\'' +
                ", includeToolName='" + includeToolName + '\'' +
                ", statusId='" + statusId + '\'' +
                '}';
    }
}
