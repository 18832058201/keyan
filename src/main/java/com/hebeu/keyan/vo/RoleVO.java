package com.hebeu.keyan.vo;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/22 22:19
 * 描述：角色信息值对象
 */
public class RoleVO {
    private List<Integer> roleId;
    private String workNum;

    public List<Integer> getRoleId() {
        return roleId;
    }

    public void setRoleId(List<Integer> roleId) {
        this.roleId = roleId;
    }

    public String getWorkNum() {
        return workNum;
    }

    public void setWorkNum(String workNum) {
        this.workNum = workNum;
    }

    @Override
    public String toString() {
        return "RoleVO{" +
                "roleId=" + roleId +
                ", workNum='" + workNum + '\'' +
                '}';
    }
}
