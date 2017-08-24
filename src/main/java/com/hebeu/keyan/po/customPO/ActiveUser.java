package com.hebeu.keyan.po.customPO;

import com.hebeu.keyan.po.SysPermission;
import com.hebeu.keyan.po.UserInfo;

import java.io.Serializable;
import java.util.List;

/**
 * 用户身份信息，存入session 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * 
 * @author 陈德华
 * 时间：2017-07-24
 * 功能：保存当前用户的用户信息
 * 
 */
public class ActiveUser implements Serializable {
	private String userId;//用户id（工号）
	private String username;// 用户名称
	private List<SysPermission> permissions;// 权限
	private UserInfo userInfo; //用户详细信息
	private String workNameAndNum;    //用户名和工号 即 用户名(工号)

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<SysPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<SysPermission> permissions) {
		this.permissions = permissions;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getWorkNameAndNum() {
		return workNameAndNum;
	}

	public void setWorkNameAndNum(String userId,String username ) {
		this.workNameAndNum = username +"(" + userId + ")";
	}
}
