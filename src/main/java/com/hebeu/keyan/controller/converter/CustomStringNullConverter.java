package com.hebeu.keyan.controller.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * 作者：陈德华
 * 时间：2017/8/1 20:07
 * 描述：对字符串进行去空格和将值为 -1 的置为null
 */
public class CustomStringNullConverter implements Converter<String, String> {

    @Override
    public String convert(String source) {
        try {
            //去掉字符串两边空格，如果去除后为空设置为null
            if(source!=null){
                source = source.trim();
                if("".equals(source)){
                    return null;
                }
                //针对下拉框都将请选择的值设置为 -1，这里将其转换为空
                if("-1".equals(source)){
                    return null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return source;
    }
}
