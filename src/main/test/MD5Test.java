import com.hebeu.keyan.dao.SysUserMapper;
import com.hebeu.keyan.dao.UserInfoMapper;
import com.hebeu.keyan.dao.customMapper.SysPermissionMapperCustom;
import com.hebeu.keyan.po.*;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 作者：陈德华
 * 时间：2017/7/29 16:47
 * 描述：MD5测试和重置密码测试，可作为临时重置密码时使用
 */
public class MD5Test {

    /**
     * 使用shiro的md5Hash测试md5加密
     */
    @Test
    public void passwordToMD5(){
        //定义一个明文密码
        String sourcePwd = "00001";

        //定义一个盐
        String salt = "123456";

        //md5加密，不加盐
        String password_md5 = new Md5Hash(sourcePwd).toString();
        System.out.println("md5加密，不加盐="+password_md5);

        //md5加密，加盐，一次散列
        String password_md5_sale_1 = new Md5Hash(sourcePwd, salt, 1).toString();
        System.out.println("password_md5_sale_1="+password_md5_sale_1);
        //两次散列相当于md5(md5())
        String password_md5_sale_2 = new Md5Hash(sourcePwd, salt, 2).toString();
        System.out.println("password_md5_sale_2="+password_md5_sale_2);

        //使用SimpleHash
        String simpleHash = new SimpleHash("MD5", sourcePwd, salt,1).toString();
        System.out.println(simpleHash);

    }


    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    SysUserMapper sysUserMapper = (SysUserMapper) context.getBean("sysUserMapper");


    /**
     * 通过明文重置密码（明文即工号）
     * @param userId 工号
     */
    public void resetPassword(String userId){
        //生成6位随机数作为salt
        Integer randomNum = (int) (Math.random()*(1000000-100000)+100000);
        //通过随机数得到盐salt
        String salt = randomNum.toString();
        //使用SimpleHash生成md5散列值
        String simpleHash = new SimpleHash("MD5", userId, salt,1).toString();
        //创建对象保存新的密码等信息
        SysUser sysUser = new SysUser();
        sysUser.setUserId(userId);
        sysUser.setPassword(simpleHash);
        sysUser.setSalt(salt);
        //更新指定账号密码信息
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    /**
     * 重置指定账号密码
     */
    @Test
    public void resetOne(){
        this.resetPassword("00001");
        System.out.println("重置单个账号密码成功");
    }


    /**
     * 重置所有账号密码
     */
    @Test
    public void resetAll(){
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria  criteria = sysUserExample.createCriteria();
        criteria.andUserIdIsNotNull();
        //查询所有的用户
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);

        //遍历所有用户，调用重置单个密码方法来重置每一个用户密码
        for (SysUser sysUser:sysUsers){
            this.resetPassword(sysUser.getUserId());
        }
        System.out.println("重置所有账号密码成功");
    }

    @Test
    public void shiroTest(){
        SysPermissionMapperCustom permissionMapperCustom = (SysPermissionMapperCustom) context.getBean("sysPermissionMapperCustom");
        List<SysPermission> permissionList =  permissionMapperCustom.findSysPermissionByUserId("00001");
        for (SysPermission permission:permissionList){
            System.out.println(permission.getPermissionCode());
        }
    }

    /**
     * 批量新增登录用户
     */
    @Test
    public void insertSysUser(){
        UserInfoMapper userInfoMapper = (UserInfoMapper) context.getBean("userInfoMapper");
        UserInfoExample userInfoExample = new UserInfoExample();
        UserInfoExample.Criteria criteria = userInfoExample.createCriteria();
        criteria.andWorkNumIsNotNull();
        List<UserInfo> userInfoList = userInfoMapper.selectByExample(userInfoExample);
        for (UserInfo userInfo:userInfoList){
            //生成6位随机数作为salt
            Integer randomNum = (int) (Math.random()*(1000000-100000)+100000);
            //通过随机数得到盐salt
            String salt = randomNum.toString();
            //使用SimpleHash生成md5散列值
            String simpleHash = new SimpleHash("MD5", userInfo.getWorkNum(), salt,1).toString();

            //创建sysUser对象
            SysUser sysUser = new SysUser();
            sysUser.setUserId(userInfo.getWorkNum());
            sysUser.setUsername(userInfo.getWorkName());
            sysUser.setSalt(salt);
            sysUser.setPassword(simpleHash);
            sysUser.setLocked("0");
            //向数据库插入sysUser对象
            sysUserMapper.insert(sysUser);
        }
        System.out.println("插入完成");
    }



}
