package com.hebeu.keyan.service;

import com.hebeu.keyan.po.SysRole;
import com.hebeu.keyan.po.SysUser;
import com.hebeu.keyan.po.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈德华 on 2017/7/25.
 * 登录处理业务
 */
@Service
public interface LoginService {
    /**
     * 通过工号查询用户
     * @param userId  用户工号
     * @return 用户对象
     */
    public SysUser findSysUserByUserCode(String userId);

    /**
     * 通过工号查询用户权限
     * @param userId 用户工号
     * @return  返回用户权限集合
     */
    public List<String> findSysPermissionByUserId(String userId);

    /**
     * 通过用户工号查询用户详细信息
     * @param userId 用户工号
     * @return 返回用户详细信息
     */
    public UserInfo findUserInfoByUserId(String userId);

    /**
     * 通过用户工号查询用户的角色信息
     * @param userId 用户id
     * @return 返回用户角色集合
     */
    public List<String> findSysRoleByUserId(String userId);

}
