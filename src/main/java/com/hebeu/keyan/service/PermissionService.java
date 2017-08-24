package com.hebeu.keyan.service;

import com.hebeu.keyan.po.SysRole;
import com.hebeu.keyan.po.customPO.UserInfoCustom;
import com.hebeu.keyan.vo.RoleVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/8/22 16:54
 * 描述：系统管理业务接口，包括权限管理等
 */
@Service
public interface PermissionService {

    /**
     * 查询所有的人员
     * @return 返回所有的人员集合
     */
    public List<UserInfoCustom> findPersonList();


    /**
     * 查询所有的角色集合
     * @return 返回所有的角色集合
     */
    public List<SysRole> findAllRole();

    /**
     * 更新角色
     * @param roleVO 角色信息对象
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateRole(RoleVO roleVO);


    /**
     * 重置所有人员权限
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void updateAllRole();

    /**
     * 更新用户密码
     * @param workNum 工号
     */
    public void updatePassword(String workNum);

}
