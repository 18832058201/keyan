package com.hebeu.keyan.controller.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * 作者：陈德华
 * 时间：2017/8/1 21:19
 * 描述：双精度整型数据转换器
 */
public class CustomDoubleNullConverter implements Converter<String,Double>{
    @Override
    public Double convert(String source) {
        //如果前台传的是空字符串就返回0
        if("".equals(source)){
            return 0.0;
        }
        // 不为空就先将其转换为double类型再返回
        return Double.parseDouble(source);
    }
}
