package com.hebeu.keyan.po.customPO;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-13  15:06
 * 描述：查询所有在职人员的姓名、工号
 */
public class AllPersonCustom {
    private String workNum;
    private String workName;

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

    @Override
    public String toString() {
        return super.toString() + "AllPersonCustom{" +
                ", workNum='" + workNum + '\'' +
                ", workName='" + workName + '\'' +
                '}';
    }
}
