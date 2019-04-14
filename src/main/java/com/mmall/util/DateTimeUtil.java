package com.mmall.util;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created by kjs on 2019/4/9
 */
public class DateTimeUtil {
    //joda-time
    public static final String STANDARD_FORMAT = "yyyy-MM-dd HH:mm:ss";
    //str->Date
    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(formatStr);
        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
        return  dateTime.toDate();
    }

    //Date->str
    public static String dateToStr(Date date,String formatStr){
        if(date == null) {
            return StringUtils.EMPTY;
        }
        DateTime dateTime = new DateTime(date);
        return  dateTime.toString(formatStr);
    }

    //str->Date
    public static Date strToDate(String dateTimeStr){
        return strToDate(dateTimeStr,STANDARD_FORMAT);
//        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern(STANDARD_FORMAT);
////        DateTime dateTime = dateTimeFormatter.parseDateTime(dateTimeStr);
////        return  dateTime.toDate();
    }

    //Date->str
    public static String dateToStr(Date date){
        return dateToStr(date,STANDARD_FORMAT);
//        if(date == null) {
//            return StringUtils.EMPTY;
//        }
//        DateTime dateTime = new DateTime(date);
//        return  dateTime.toString(STANDARD_FORMAT);
    }


//    public static void main(String[] args){
//        System.out.println(DateTimeUtil.dateToStr(new Date(),"yyyy-MM-dd HH:mm:ss"));
//        System.out.println(DateTimeUtil.strToDate("2010-01-01 11:12:13","yyyy-MM-dd HH:mm:ss"));
//    }
}
