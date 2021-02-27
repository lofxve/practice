package com.lofxve.converters;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName MyDateConverters
 * @Author lofxve
 * @Date 2021/1/9 22:56
 * @Version 1.0
 */
// 自定义转换器的类
public class MyDateConverters implements Converter<String,Date> {
    // 实现转换方法
    public Date convert(String s) {
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}