package com.hebeu.keyan.controller.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * 作者：陈德华
 * 时间：2017/8/1 21:19
 * 描述：整型数据转换器
 */
//     Converter<S,T> 中两个参数第一个表示前台数据类型，都是String ，第二个参数是后台接收的参数类型
//    当后台类型与第二个参数类型匹配时，就会自动调用这个转换器
public class CustomIntegerNullConverter implements Converter<String,Integer>{
    @Override
    public Integer convert(String source) {
        //如果前台传的是空字符串直接返回null，否则下边的转换就会出异常
        if("".equals(source)){
            return null;
        }
        //将String类型整数转换为Integer类型
        Integer integer = Integer.parseInt(source);
        try {
            //针对下拉框都将请选择的值设置为 -1，这里将其转换为空
            if(-1 ==integer){
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return integer;
    }
}
