package com.hebeu.keyan.service.impl;

import com.hebeu.keyan.dao.SysRoleMapper;
import com.hebeu.keyan.dao.SysUserMapper;
import com.hebeu.keyan.dao.SysUserRoleMapper;
import com.hebeu.keyan.dao.customMapper.SysPermissionMapperCustom;
import com.hebeu.keyan.po.*;
import com.hebeu.keyan.po.customPO.ActiveUser;
import com.hebeu.keyan.po.customPO.UserInfoCustom;
import com.hebeu.keyan.service.PermissionService;
import com.hebeu.keyan.vo.RoleVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/22 17:10
 * 描述：权限管理业务实现类
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    private final SysPermissionMapperCustom sysPermissionMapperCustom;
    private final SysRoleMapper sysRoleMapper;
    private final SysUserRoleMapper sysUserRoleMapper;
    private final SysUserMapper sysUserMapper;

    @Autowired
    public PermissionServiceImpl(SysPermissionMapperCustom sysPermissionMapperCustom, SysRoleMapper sysRoleMapper, SysUserRoleMapper sysUserRoleMapper, SysUserMapper sysUserMapper) {
        this.sysPermissionMapperCustom = sysPermissionMapperCustom;
        this.sysRoleMapper = sysRoleMapper;
        this.sysUserRoleMapper = sysUserRoleMapper;
        this.sysUserMapper = sysUserMapper;
    }


    /**
     * 查询所有的人员
     *
     * @return 返回所有的人员集合
     */
    @Override
    public List<UserInfoCustom> findPersonList() {
        return sysPermissionMapperCustom.selectPersonList();
    }


    /**
     * 查询所有的角色集合
     *
     * @return 返回所有的角色集合
     */
    @Override
    public List<SysRole> findAllRole() {
        return sysPermissionMapperCustom.selectAllRole();
    }

    /**
     * 更新角色
     *
     * @param roleVO 角色信息对象
     */
    @Override
    public void updateRole(RoleVO roleVO) {
        try {
            //先删除原来的角色信息
            SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
            SysUserRoleExample.Criteria criteria = sysUserRoleExample.createCriteria();
            criteria.andUserIdEqualTo(roleVO.getWorkNum());
            sysUserRoleMapper.deleteByExample(sysUserRoleExample);

            //插入新的角色信息
            for(Integer roleId:roleVO.getRoleId()){
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUserId(roleVO.getWorkNum());
                sysUserRole.setRoleId(roleId);
                sysUserRoleMapper.insertSelective(sysUserRole);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新角色失败");
        }
    }

    /**
     * 重置所有人员权限
     */
    @Override
    public void updateAllRole() {
        try {
            Subject subject = SecurityUtils.getSubject();
            ActiveUser activeUser = (ActiveUser) subject.getPrincipal();
            List<Integer> roleId = new ArrayList<>();
            RoleVO roleVO = new RoleVO();
            roleVO.setRoleId(roleId);
            roleId.add(1);
            //得到所有的人员
            List<UserInfoCustom> userInfoCustoms = sysPermissionMapperCustom.selectPersonList();
            for (UserInfoCustom userInfoCustom:userInfoCustoms){
                if (!userInfoCustom.getWorkNum().equals(activeUser.getUserId())){
                    roleVO.setWorkNum(userInfoCustom.getWorkNum());
                    updateRole(roleVO);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("更新角色失败");
        }
    }

    /**
     * 更新用户密码
     *
     * @param workNum 工号
     */
    @Override
    public void updatePassword(String workNum) {
        //生成6位随机数作为salt
        Integer randomNum = (int) (Math.random()*(1000000-100000)+100000);
        //通过随机数得到盐salt
        String salt = randomNum.toString();
        //使用SimpleHash生成md5散列值
        String simpleHash = new SimpleHash("MD5", workNum, salt,1).toString();
        //创建对象保存新的密码等信息
        SysUser sysUser = new SysUser();
        sysUser.setUserId(workNum);
        sysUser.setPassword(simpleHash);
        sysUser.setSalt(salt);
        //更新指定账号密码信息
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }
}
