package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.SysPermission;
import com.hebeu.keyan.po.SysRole;
import com.hebeu.keyan.po.UserInfo;
import com.hebeu.keyan.po.customPO.EPersonCustom;
import com.hebeu.keyan.po.customPO.UserInfoCustom;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/7/31 12:10
 * 描述：查询用户权限接口
 */
@Repository
public interface SysPermissionMapperCustom {

    /**
     * 查询所有的用户集合
     * @return 返回用户集合
     */
    public List<UserInfoCustom> selectPersonList();

    /**
     * 通过工号查询用户权限
     * @param userId  用户工号
     * @return  返回用户权限
     */
    public List<SysPermission> findSysPermissionByUserId(@Param("userId") String userId);


    /**
     * 通过用户工号查询用户角色信息
     * @param userId 用户id
     * @return 返回角色信息
     */
    public List<SysRole> selectSysRoleByUserId(@Param("userId") String userId);

    /**
     * 查询角色列表
     * @return 返回角色集合
     */
    public List<SysRole> selectAllRole();
}
