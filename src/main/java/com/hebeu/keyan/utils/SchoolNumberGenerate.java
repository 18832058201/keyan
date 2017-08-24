package com.hebeu.keyan.utils;

import com.hebeu.keyan.dao.customMapper.CommonMapper;
import com.hebeu.keyan.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：陈德华
 * 时间：2017/8/3 19:58
 * 描述：通过反射生成校内编号工具类
 */
@Component
public class SchoolNumberGenerate {
    private final CommonMapper commonMapper;

    @Autowired
    public SchoolNumberGenerate(CommonMapper commonMapper) {
        this.commonMapper = commonMapper;
    }

    /**
     * 传入指定对象为该对象生成校内编号
     * 校内编号生成规则，校内编号为12位
     * 第一位：X为项目，C为科技(鉴定)成果，J为获奖成果，Z为专利，R为软件著作权，L为论文，B为标准管理，W为植物新品种权,O表示著作
     * 第二位：Z(自科),S(社科),*(其他)
     * 第3~8位：年份+月份 ，如201708
     * 第9~12位：前8位相同中的最后四位最大加1
     * @param o  传入的对象
     */
    public void setSchoolNumber(Object o){
        String schoolNumber = "";                    //定义校内编号
        Class aClass = o.getClass();                 //创建一个反射类 ，得到object类的类型
        String className = aClass.getSimpleName();   //得到传入对象的对象类型简称;

//        System.out.println("传入的对象类型简称为："+aClass.getSimpleName());
//        System.out.println("传入的对象类型全称为："+aClass);
        String subjectTypeId = null;    //定义学科门类
        try {
            Method method = aClass.getMethod("getSubjectTypeId");  //得到对象中getSubjectTypeId()方法
//            System.out.println("取到的方法名为："+method);
            subjectTypeId = String.valueOf(method.invoke(o));           //通过invoke方法动态执行取到的getSubjectTypeId()方法并得到函数返回值，参数o为执行方法的对象
            //生成第一位
            if("1".equals(subjectTypeId)){
                schoolNumber += "Z";
            }else if("2".equals(subjectTypeId)){
                schoolNumber += "S";
            }else {
                schoolNumber += "*";
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException("校内编号生成失败");
        }

        String tableName = null;  //定义查询的表名

        //生成第二位,并指定查询的表名
        //判断传入的对象是否是其子类或相同类
        if(EProject.class.isAssignableFrom(o.getClass())){
            schoolNumber += "X";
            tableName = "e_project";
        }else if(EIdentify.class.isAssignableFrom(o.getClass())){
            schoolNumber += "C";
            tableName = "e_identify";
        }else if(EReward.class.isAssignableFrom(o.getClass())){
            schoolNumber += "J";
            tableName = "e_reward";
        }else if(EPatent.class.isAssignableFrom(o.getClass())){
            schoolNumber += "Z";
            tableName = "e_patent";
        }else if(EPaper.class.isAssignableFrom(o.getClass())){
            schoolNumber += "L";
            tableName = "e_paper";
        }else if(ESoftware.class.isAssignableFrom(o.getClass())){
            schoolNumber += "R";
            tableName = "e_software";
        }else if(EStandard.class.isAssignableFrom(o.getClass())){
            schoolNumber += "B";
            tableName = "e_standard";
        }else if(EPlant.class.isAssignableFrom(o.getClass())){
            schoolNumber += "W";
            tableName = "e_plant";
        }else if(EBook.class.isAssignableFrom(o.getClass())){
            schoolNumber += "O";
            tableName = "e_book";
        }

        //生成第3~8位
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String year_month = sdf.format(new Date());         //将当前系统时间转化为yyyyMM格式字符串
        schoolNumber += year_month;

        //生成最后四位
        String maxNumber = commonMapper.findSchoolNumber(tableName,schoolNumber);
        String lastNumber = "";
        //如果数据库不存在就设置为 "0000"
        if(null == maxNumber){
            lastNumber = "0000";
        }else {
            lastNumber = String.valueOf(Integer.parseInt(maxNumber.substring(8,12))+1);  //截取最后四位数并转成整数+1后再转成字符串
            for (int i=lastNumber.length();i<4;i++){
                lastNumber = "0" + lastNumber;   //不足四位补0
            }
        }
        schoolNumber += lastNumber;   //拼接成最后的校内编号

        //通过反射调用setSchoolNumber方法设置校内编号
        try {
            Method setSchoolNumber = aClass.getMethod("setSchoolNumber",String.class);
            setSchoolNumber.invoke(o,schoolNumber);     //动态调用setSchoolNumber方法设置校内编号
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("校内编号生成失败");
        }
    }


}
