package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.SysUserMapper;
import com.hebeu.keyan.dao.customMapper.SysPermissionMapperCustom;
import com.hebeu.keyan.dao.customMapper.UserInfoMapperCustom;
import com.hebeu.keyan.po.SysPermission;
import com.hebeu.keyan.po.SysRole;
import com.hebeu.keyan.po.SysUser;
import com.hebeu.keyan.po.UserInfo;
import com.hebeu.keyan.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 陈德华 on 2017/7/25.
 * 登录处理业务
 */
@Service
public class LoginServiceImpl implements LoginService{
    private final SysUserMapper sysUserMapper;
    private final SysPermissionMapperCustom sysPermissionMapperCustom;
    private final UserInfoMapperCustom userInfoMapperCustom;

    @Autowired
    public LoginServiceImpl(SysUserMapper sysUserMapper, SysPermissionMapperCustom sysPermissionMapperCustom, UserInfoMapperCustom userInfoMapperCustom) {
        this.sysUserMapper = sysUserMapper;
        this.sysPermissionMapperCustom = sysPermissionMapperCustom;
        this.userInfoMapperCustom = userInfoMapperCustom;
    }


    /**
     * 通过工号查询用户
     * @param userId  用户工号
     * @return  返回用户
     */
    @Override
    public SysUser findSysUserByUserCode(String userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }


    /**
     * 通过工号查询用户权限
     * @param userId 用户工号
     * @return  返回用户权限集合
     */
    @Override
    public List<String> findSysPermissionByUserId(String userId) {
        List<SysPermission> sysPermissionList = sysPermissionMapperCustom.findSysPermissionByUserId(userId);
        List<String> permissions = new ArrayList<>();
        for (SysPermission sysPermission :sysPermissionList){
            permissions.add(sysPermission.getPermissionCode());
        }
        return permissions;
    }

    /**
     * 通过用户工号查询用户详细信息
     *
     * @param userId 用户工号
     * @return 返回用户详细信息
     */
    @Override
    public UserInfo findUserInfoByUserId(String userId) {
        return userInfoMapperCustom.selectUserInfoByUserId(userId);
    }

    /**
     * 通过用户工号查询用户的角色信息
     *
     * @param userId 用户id
     * @return 返回用户角色集合
     */
    @Override
    public List<String> findSysRoleByUserId(String userId) {
        List<SysRole> sysRoles = sysPermissionMapperCustom.selectSysRoleByUserId(userId);
        List<String> roles = new ArrayList<>();
        for (SysRole role:sysRoles){
            roles.add(role.getRoleCode());
        }
        return roles;
    }


}
