package com.hebeu.keyan.shiro;

import com.hebeu.keyan.po.SysUser;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.service.LoginService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017-07-26
 * 描述：自定义realm
 */

public class CustomRealm extends AuthorizingRealm {

	private final LoginService loginService;

	@Autowired
	public CustomRealm(LoginService loginService) {
		this.loginService = loginService;
	}

	// 设置realm的名称
	@Override
	public void setName(String name) {
		super.setName("customRealm");
	}

	/**
	 * 用户认证
	 * @param token  用户身份
	 * @return 返回用户身份信息
	 * @throws AuthenticationException  抛出认证异常
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {

		System.out.println("进入认证方法realm");
		// 第一步从token中取出用户名,token是用户输入的用户名和密码
		String userCode = (String) token.getPrincipal();

		// 第二步：根据用户输入的userCode从数据库查询
		SysUser sysUser = null;
		try {
			sysUser = loginService.findSysUserByUserCode(userCode);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		// 如果查询不到返回null
		if(sysUser==null){
			return null;
		}
		// 从数据库查询到密码
		String password = sysUser.getPassword();

		//盐
		String salt = sysUser.getSalt();

		// 如果查询到返回认证信息AuthenticationInfo

		//activeUser就是用户身份信息
		ActiveUser activeUser = new ActiveUser();

		activeUser.setUserId(sysUser.getUserId());
		activeUser.setUsername(sysUser.getUsername());
		activeUser.setWorkNameAndNum(sysUser.getUserId(),sysUser.getUsername()); //设置姓名和工号组合形式
		activeUser.setUserInfo(loginService.findUserInfoByUserId(sysUser.getUserId()));

		//将activeUser设置simpleAuthenticationInfo
		SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
				activeUser, password, ByteSource.Util.bytes(salt), this.getName());

		return simpleAuthenticationInfo;
	}

	/**
	 * 用于授权
	 * @param principals  身份信息，即用户工号
	 * @return 返回用户授权信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		System.out.println("进入到授权方法");
		//从 principals获取主身份信息
		//将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
		ActiveUser activeUser =  (ActiveUser) principals.getPrimaryPrincipal();
		//根据身份信息从数据库获取权限信息
		List<String> permissions = loginService.findSysPermissionByUserId(activeUser.getUserId());
		System.out.print("查询到的权限集合值为=");
		for (String str:permissions){
			System.out.print(str+" ");
		}
		List<String> roles = loginService.findSysRoleByUserId(activeUser.getUserId());
		System.out.print("\n查询到的角色集合值为=");
		for (String role:roles){
			System.out.print(role+" ");
		}
		//查到权限数据，返回授权信息(要包括 上边的permissions)
		SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
		//将上边查询到授权信息填充到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addStringPermissions(permissions);
		//将查询到的角色信息填充到simpleAuthorizationInfo对象中
		simpleAuthorizationInfo.addRoles(roles);

		return simpleAuthorizationInfo;
	}

}
