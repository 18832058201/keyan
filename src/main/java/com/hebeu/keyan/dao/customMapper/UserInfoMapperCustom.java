package com.hebeu.keyan.dao.customMapper;

import com.hebeu.keyan.po.customPO.UserInfoCustom;
import org.springframework.stereotype.Repository;

/**
 * 作者：陈德华
 * 时间：2017/8/3 11:34
 * 描述：UserInfoMapper拓展接口
 */
@Repository
public interface UserInfoMapperCustom {

    /**
     * 通过用户工号查询用户详细信息
     * @param userId 用户工号
     * @return 返回用户详细信息
     */
    public UserInfoCustom selectUserInfoByUserId(String userId);


}
