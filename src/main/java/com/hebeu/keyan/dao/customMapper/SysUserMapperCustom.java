package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.SysUser;
import org.springframework.stereotype.Repository;

/**
 * Created by 陈德华 on 2017/7/25.
 *
 */
@Repository
public interface SysUserMapperCustom {
    /**
     * 根据用户工号查询用户
     * @return 返回用户对象
     */
    public SysUser findUserByUserId(String userId);
}
