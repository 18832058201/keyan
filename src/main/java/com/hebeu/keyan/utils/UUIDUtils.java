package com.hebeu.keyan.utils;

import java.util.UUID;

/**
 * 作者：陈德华
 * 时间：2017/8/3 16:11
 * 描述：生成UUID随机号，此编号不会重复
 */
public class UUIDUtils {

    /**
     * 通过UUID类得到UUID号并去掉其中的 "-"
     * @return 返回UUID号
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
