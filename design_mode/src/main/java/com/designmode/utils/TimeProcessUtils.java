package com.designmode.utils;

import android.text.TextUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 日期时间处理类
 */
public class TimeProcessUtils {

    public static final String SIMPLE_TIME_FORMAT = "yyyy年MM月dd";
    /**
     * 商品揭晓时间
     */
    public static final String DETAIL_TIME_FORMAT = "yyyy年MM月dd日 HH:mm";

    /**
     * 获取当前时间
     *
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getNowTime() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                SIMPLE_TIME_FORMAT, Locale.getDefault());
        return dateFormat.format(now);
    }

    /**
     * 获取会员有效时间
     *
     * @return
     */
    public static String getUserVipTime(long milliseconds) {
        if (milliseconds - System.currentTimeMillis() > (long) 24 * 60 * 60 * 1000) {
            long s =  ((milliseconds - System.currentTimeMillis())/(24 * 60 * 60 * 1000));
            //有效时间大于1天
            return ConverToString(new Date(milliseconds), "yyyy-MM-dd")+"(剩余"+s+"天)";
        } else {
            //有效时间小于1天
            return ConverToString(new Date(milliseconds), "MM-dd HH:mm")+"(剩余<1天)";
        }
    }

    /**
     * 格式话时间
     *
     * @param milliseconds
     * @return
     */
    public static String getSimpleTimeFormat(long milliseconds) {
        return ConverToString(new Date(milliseconds), SIMPLE_TIME_FORMAT);
    }

    /**
     * 格式话时间
     *
     * @param milliseconds
     * @return
     */
    public static String getDetailTimeFormat(long milliseconds) {
        return ConverToString(new Date(milliseconds), DETAIL_TIME_FORMAT);
    }

    /**
     * 格式时间
     *
     * @param milliseconds
     * @param format
     * @return
     */
    public static String getStringTimeFormat(long milliseconds, String format) {
        return ConverToString(new Date(milliseconds), format);
    }

    /**
     * 将一种格式的时间转换为另一格式
     *
     * @param beforeTime   要转换的时间
     * @param beforeFormat 要转换时间的格式
     * @param outFormat    输出格式
     * @return
     */
    public static String transformTimeFormat(String beforeTime, String beforeFormat, String outFormat) {
        Date beforeDate = ConverToDate(beforeTime, beforeFormat);
        if (beforeDate == null) {
            return "";
        }
        return ConverToString(beforeDate, outFormat);
    }

    /**
     * 把日期转为字符串
     *
     * @param date
     * @param format
     * @return
     */
    public static String ConverToString(Date date, String format) {
        if (TextUtils.isEmpty(format)) {
            return null;
        }
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }

    /**
     * 把日期转为字符串，默认格式："yyyy-MM-dd HH:mm:ss"
     *
     * @param date
     * @return
     */
    public static String ConverToString(Date date) {
        return ConverToString(date, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 把字符串转为日期，默认格式：自动区分"yyyy/MM/dd HH:mm:ss"，"yyyy-MM-dd HH:mm:ss"
     *
     * @param strDate
     * @return
     * @throws Exception
     */
    public static Date ConverToDate(String strDate) {
        if (TextUtils.isEmpty(strDate)) {
            return null;
        }
        Date date = null;
        try {
            if (strDate.indexOf("-") >= 0) {
                date = ConverToDate(strDate, "yyyy-MM-dd HH:mm:ss");
            } else {
                date = ConverToDate(strDate, "yyyy/MM/dd HH:mm:ss");
            }
        } catch (Exception e) {
            // do nothing
        }
        return date;
    }

    /**
     * 把字符串转为日期
     *
     * @param strDate
     * @return
     * @throws Exception
     */
    public static Date ConverToDate(String strDate, String format) {
        if (TextUtils.isEmpty(strDate)) {
            return null;
        }
        Date date = null;
        try {
            SimpleDateFormat df = new SimpleDateFormat(format);
            date = df.parse(strDate);
        } catch (Exception e) {
            // do nothing
        }
        return date;
    }

    /**
     * 把字符串时间装换为long类型时间戳
     *
     * @param strDate
     * @param format
     * @return
     */
    public static long ConverToLong(String strDate, String format) {
        return ConverToDate(strDate, format).getTime();
    }

    /**
     * 把字符串时间装换为long类型时间戳
     *
     * @param strDate
     * @return
     */
    public static long ConverToLong(String strDate) {
        return ConverToDate(strDate).getTime();
    }

    /**
     * 从毫秒获取天数
     *
     * @return
     */
    public static String getDayFormMillisecond(long milliseconds) {
        int day = 0;
        if (milliseconds > 0) {
            day = (int) (milliseconds / 1000 / 60 / 60 / 24);
        }
        return day + "天";
    }

    /**
     * 从毫秒获取天数
     *
     * @return
     */
    public static String getDayFormMinutes(long minutes) {
        int day = 0;
        if (minutes > 0) {
            day = (int) (minutes / 60 / 24);
        }
        return day + "天";
    }

    /**
     * 毫秒数转化为倒计时时间格式：00:00:00
     *
     * @param milliseconds
     * @return
     */
    public static CharSequence millisecondsFormat(long milliseconds) {
        CharSequence returnValue;
        if (milliseconds > 0) {
            long millisecond = milliseconds / 10 % 100;
            long second = milliseconds / 1000 % 60;
            long minute = milliseconds / 60000;
            String millisecondStr = String.format(Locale.getDefault(), "%02d",
                    millisecond);
            String secondStr = String.format(Locale.getDefault(), "%02d",
                    second);
            String minuteStr = String.format(Locale.getDefault(), "%02d",
                    minute);
            returnValue = new StringBuilder(minuteStr).append(":").append(secondStr).append(":").append(millisecondStr);
        } else {
            returnValue = "00:00:00";
        }
        return returnValue;
    }

    /**
     * 毫秒数转化为倒计时时间格式：
     *
     * @param milliseconds
     * @return
     */
    public static CharSequence datMillsFormat(long milliseconds) {
        CharSequence returnValue = "";
        if (milliseconds > 0) {
            long millisecond = milliseconds / 10 % 100;
            long second = milliseconds / 1000 % 60;
            long minute = milliseconds / 60000 % 60;
            long hour = milliseconds / 3600000 % 24;
            long day = milliseconds / 3600000 / 24;
            String secondStr = String.format(Locale.getDefault(), "%02d",
                    second);
            String minuteStr = String.format(Locale.getDefault(), "%02d",
                    minute);
            String hourStr = String.format(Locale.getDefault(), "%02d",
                    hour);
            String dayStr = String.format(Locale.getDefault(), "%02d",
                    day);
            if (day >= 1) {
                returnValue = new StringBuilder(dayStr).append("天").append(hourStr).append("小时").append(minuteStr).append("分").append(secondStr).append("秒");
            } else {
                if (hour >= 1) {
                    returnValue = new StringBuilder(hourStr).append("小时").append(minuteStr).append("分").append(secondStr).append("秒");
                } else {
                    if (minute >= 1) {
                        returnValue = new StringBuilder(minuteStr).append("分").append(secondStr).append("秒");

                    } else {
                        if (second > 0) {
                            returnValue = new StringBuilder(secondStr).append("秒");
                        }
                    }
                }
            }
        } else {
            returnValue = "";
        }
        return returnValue;
    }


    /**
     * 毫秒数转化为倒计时时间格式：
     *
     * @param milliseconds
     * @return
     */
    public static CharSequence threeMinTime(long milliseconds, int time) {
        CharSequence returnValue;
        if (milliseconds <= time) {
            long second = milliseconds / 1000 % 60;
            long minute = milliseconds / 60000 % 60;
            long millisecond = milliseconds / 10 % 100;
            String millisecondStr = String.format(Locale.getDefault(), "%02d",
                    millisecond);
            String secondStr = String.format(Locale.getDefault(), "%02d",
                    second);
            String minuteStr = String.format(Locale.getDefault(), "%02d",
                    minute);
            returnValue = new StringBuffer(minuteStr).append(":").append(secondStr).append(":").append(millisecondStr);
        } else {
            returnValue = "";
        }
        return returnValue;
    }


}
