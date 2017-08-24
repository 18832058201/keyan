package com.hebeu.keyan.utils;

import com.hebeu.keyan.dao.customMapper.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：冯嘉龙
 * 时间：2017-08-13  16:55
 * 描述：科研管理费id生成
 */
@Component
public class ManageMoneyCode {
    private final CommonMapper commonMapper;
    @Autowired
    public ManageMoneyCode(CommonMapper commonMapper) {
        this.commonMapper = commonMapper;
    }

    /**
     * 生成申请管理经费编号
     * @param applyTypeId  1为学院，2为学校，3为学校1,4位学校2
     * @return
     */
    public String getMoneyCode(Integer applyTypeId){
        String manageMoneyCode ="";
        if(1 == applyTypeId){
            manageMoneyCode += "CM";
        }else if(2 == applyTypeId){
            manageMoneyCode += "SM";
        }else if(3 == applyTypeId){
            manageMoneyCode += "SS";
        }else if(4 == applyTypeId){
            manageMoneyCode += "ST";
        }
        //生成第3~10位
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String year_month_day = sdf.format(new Date());         //将当前系统时间转化为yyyyMMdd格式字符串
        manageMoneyCode += year_month_day;
        //生成第11~14位
        String maxId = commonMapper.findMaxApplyId();
        String lastNumber = "";
        //如果数据库不存在就设置为 "0000"
        if(null == maxId){
            lastNumber = "0000";
        }else {
            lastNumber = String.valueOf(Integer.parseInt(maxId.substring(10,maxId.length()))+1);  //截取最后四位数并转成整数+1后再转成字符串
            for (int i=lastNumber.length();i<4;i++){
                lastNumber = "0" + lastNumber;   //不足四位补0
            }
        }
        manageMoneyCode += lastNumber;   //拼接成最后的校内编号
        return manageMoneyCode;
    }
}
