package com.designmode.utils;

/**
 * Created by Administrator on 2018/5/21.
 */

import android.util.Log;

import java.text.SimpleDateFormat;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * <p>
 * description:时间获取和转换工具类
 * </p>
 *
 * @author
 * @see
 * @since 2015-10-28
 */
public class DateUtil {
    private static final long serialVersionUID = 7867268199240522574L;


    private static final int[] dayArray = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static SimpleDateFormat sdf = new SimpleDateFormat();

    public static Calendar getCalendar() {
        return GregorianCalendar.getInstance();
    }

    /**
     * 得到格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     *
     * @return String 得到格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     */
    public static String getDateMilliFormat() {
        Calendar cal = Calendar.getInstance();
        return getDateMilliFormat(cal);
    }

    /**
     * 得到格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     *
     * @param cal Calendar
     * @return String 格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     */
    public static String getDateMilliFormat(java.util.Calendar cal) {
        String pattern = "yyyy-MM-dd HH:mm:ss,SSS";
        return getDateFormat(cal, pattern);
    }

    /**
     * 得到格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     *
     * @param date Date
     * @return String 格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     */
    public static String getDateMilliFormat(java.util.Date date) {
        String pattern = "yyyy-MM-dd HH:mm:ss,SSS";
        return getDateFormat(date, pattern);
    }

    /**
     * 将格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串转化为Calendar类型
     *
     * @param strDate 格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     * @return java.util.Calendar
     */
    public static Calendar parseCalendarMilliFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss,SSS";
        return parseCalendarFormat(strDate, pattern);
    }

    /**
     * 将格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串转化为Date类型
     *
     * @param strDate 格式为yyyy-MM-dd HH:mm:ss,SSS的时间字符串
     * @return java.util.Date
     */
    public static Date parseDateMilliFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss,SSS";
        return parseDateFormat(strDate, pattern);
    }

    /**
     * 输出时间格式为yyyy-MM-dd HH:mm:ss的字符串
     *
     * @return String 输出时间格式为yyyy-MM-dd HH:mm:ss的字符串
     */
    public static String getDateSecondFormat() {
        Calendar cal = Calendar.getInstance();
        return getDateSecondFormat(cal);
    }

    /**
     * 输出时间格式为yyyy-MM-dd HH:mm:ss的字符串
     *
     * @param cal Calendar
     * @return String 输出时间格式为yyyy-MM-dd HH:mm:ss的字符串
     */
    public static String getDateSecondFormat(java.util.Calendar cal) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return getDateFormat(cal, pattern);
    }

    /**
     * 输出时间格式为yyyy-MM-dd HH:mm:ss的字符串
     *
     * @param date Date
     * @return String 输出时间格式为yyyy-MM-dd HH:mm:ss的字符串
     */
    public static String getDateSecondFormat(java.util.Date date) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return getDateFormat(date, pattern);
    }

    /**
     * 将格式为yyyy-MM-dd HH:mm:ss的时间字符串转化为Calendar类型
     *
     * @param strDate 格式为yyyy-MM-dd HH:mm:ss的时间字符串
     * @return java.util.Calendar
     */
    public static Calendar parseCalendarSecondFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return parseCalendarFormat(strDate, pattern);
    }

    /**
     * 将格式为yyyy-MM-dd HH:mm:ss的时间字符串转化为Date类型
     *
     * @param strDate 格式为yyyy-MM-dd HH:mm:ss的时间字符串
     * @return java.util.Date
     */
    public static Date parseDateSecondFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return parseDateFormat(strDate, pattern);
    }

    /**
     * 输出时间格式为yyyy-MM-dd HH:mm的字符串
     *
     * @return String 输出时间格式为yyyy-MM-dd HH:mm的字符串
     */
    public static String getDateMinuteFormat() {
        Calendar cal = Calendar.getInstance();
        return getDateMinuteFormat(cal);
    }

    /**
     * 输出时间格式为yyyy-MM-dd HH:mm的字符串
     *
     * @param cal Calendar
     * @return String 输出时间格式为yyyy-MM-dd HH:mm的字符串
     */
    public static String getDateMinuteFormat(java.util.Calendar cal) {
        String pattern = "yyyy-MM-dd HH:mm";
        return getDateFormat(cal, pattern);
    }

    /**
     * 输出时间格式为yyyy-MM-dd HH:mm的字符串
     *
     * @param date Date
     * @return String 输出时间格式为yyyy-MM-dd HH:mm的字符串
     */
    public static String getDateMinuteFormat(java.util.Date date) {
        String pattern = "yyyy-MM-dd HH:mm";
        return getDateFormat(date, pattern);
    }

    /**
     * 将时间字符串(格式：yyyy-MM-dd HH:mm)转化为Calendar类型
     *
     * @param strDate 时间格式为yyyy-MM-dd HH:mm的字符串
     * @return java.util.Calendar
     */
    public static Calendar parseCalendarMinuteFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm";
        return parseCalendarFormat(strDate, pattern);
    }

    /**
     * 将时间字符串(格式：yyyy-MM-dd HH:mm)转化为Date类型
     *
     * @param strDate 时间格式为yyyy-MM-dd HH:mm的字符串
     * @return java.util.Date
     */
    public static Date parseDateMinuteFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm";
        return parseDateFormat(strDate, pattern);
    }

    /**
     * 输出格式为yyyy-MM-dd时间字符串
     *
     * @return String 输出格式为yyyy-MM-dd时间字符串
     */
    public static String getDateDayFormat() {
        Calendar cal = Calendar.getInstance();
        return getDateDayFormat(cal);
    }

    /**
     * 将Calendar类型转换成String(yyyy-MM-dd)类型
     *
     * @param cal
     * @return String 输出格式为yyyy-MM-dd时间字符串
     */
    public static String getDateDayFormat(java.util.Calendar cal) {
        String pattern = "yyyy-MM-dd";
        return getDateFormat(cal, pattern);
    }

    /**
     * 将Date类型转换成String(yyyy-MM-dd)类型
     *
     * @param date
     * @return String 输出格式为yyyy-MM-dd时间字符串
     */
    public static String getDateDayFormat(java.util.Date date) {
        String pattern = "yyyy-MM-dd";
        return getDateFormat(date, pattern);
    }

    /**
     * 将时间格式的字符串转换成Calendar类型
     *
     * @param strDate 时间格式为:yyyy-MM-dd的字符串
     * @return java.util.Calendar
     */
    public static Calendar parseCalendarDayFormat(String strDate) {
        if (strDate == null || strDate.trim().length() == 0) {
            return null;
        }
        String pattern = "yyyy-MM-dd";
        return parseCalendarFormat(strDate, pattern);
    }

    /**
     * 将时间格式的字符串转换成Date类型
     *
     * @param strDate 时间格式为:yyyy-MM-dd的字符串
     * @return java.util.Date
     */
    public static Date parseDateDayFormat(String strDate) {
        if (strDate == null || strDate.trim().length() == 0) {
            return null;
        }
        String pattern = "yyyy-MM-dd";
        return parseDateFormat(strDate, pattern);
    }

    /**
     * 输出时间格式yyyy-MM-dd_HH-mm-ss
     *
     * @return String 输出时间格式yyyy-MM-dd_HH-mm-ss
     */
    public static String getDateFileFormat() {
        Calendar cal = Calendar.getInstance();
        return getDateFileFormat(cal);
    }

    /**
     * 输出时间格式yyyy-MM-dd_HH-mm-ss
     *
     * @param cal
     * @return String 输出时间格式yyyy-MM-dd_HH-mm-ss
     */
    public static String getDateFileFormat(java.util.Calendar cal) {
        String pattern = "yyyy-MM-dd_HH-mm-ss";
        return getDateFormat(cal, pattern);
    }

    /**
     * 输出时间格式yyyy-MM-dd_HH-mm-ss
     *
     * @param date
     * @return String 输出时间格式yyyy-MM-dd_HH-mm-ss
     */
    public static String getDateFileFormat(java.util.Date date) {
        String pattern = "yyyy-MM-dd_HH-mm-ss";
        return getDateFormat(date, pattern);
    }

    /**
     * 将格式为yyyy-MM-dd_HH-mm-ss时间字符串转换为Calendar类型
     *
     * @param strDate 格式为yyyy-MM-dd_HH-mm-ss的时间字符串
     * @return java.util.Calendar
     */
    public static Calendar parseCalendarFileFormat(String strDate) {
        String pattern = "yyyy-MM-dd_HH-mm-ss";
        return parseCalendarFormat(strDate, pattern);
    }

    /**
     * 将格式为yyyy-MM-dd_HH-mm-ss时间字符串转换为Date类型
     *
     * @param strDate 格式为yyyy-MM-dd_HH-mm-ss的时间字符串
     * @return java.util.Date
     */
    public static Date parseDateFileFormat(String strDate) {
        String pattern = "yyyy-MM-dd_HH-mm-ss";
        return parseDateFormat(strDate, pattern);
    }

    /**
     * 得到时间字符串，格式为yyyy-MM-dd HH:mm:ss
     *
     * @return String 格式为yyyy-MM-dd HH:mm:ss的时间字符串
     */
    public static String getDateW3CFormat() {
        Calendar cal = Calendar.getInstance();
        return getDateW3CFormat(cal);
    }

    /**
     * 根据时间(Calendar)类型得到时间字符串，格式为yyyy-MM-dd HH:mm:ss,如果想自定义格式请参考getDateFormat方法
     *
     * @param cal Calendar
     * @return String 格式为yyyy-MM-dd HH:mm:ss的时间字符串
     */
    public static String getDateW3CFormat(java.util.Calendar cal) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return getDateFormat(cal, pattern);
    }

    /**
     * 根据时间(Date)类型得到时间字符串，格式为yyyy-MM-dd HH:mm:ss,如果想自定义格式请参考getDateFormat方法
     *
     * @param date Date
     * @return String 格式为yyyy-MM-dd HH:mm:ss的时间字符串
     */
    public static String getDateW3CFormat(java.util.Date date) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return getDateFormat(date, pattern);
    }

    /**
     * 根据时间字符串得到Date类型时间，格式（pattern）yyyy-MM-dd HH:mm:ss
     *
     * @param strDate 时间字符串,必须为yyyy-MM-dd HH:mm:ss格式
     * @return java.util.Calendar 时间
     */
    public static Calendar parseCalendarW3CFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return parseCalendarFormat(strDate, pattern);
    }

    /**
     * 根据时间字符串得到Date类型时间，格式（pattern）yyyy-MM-dd HH:mm:ss
     *
     * @param strDate 时间字符串,必须为yyyy-MM-dd HH:mm:ss格式
     * @return java.util.Date 时间
     */
    public static Date parseDateW3CFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return parseDateFormat(strDate, pattern);
    }

    /**
     * 根据时间(Calendar)类型得到时间字符串，格式为yyyy-MM-dd HH:mm:ss,如果想自定义格式请参考getDateFormat方法
     *
     * @param cal Calendar
     * @return String 日期字符串
     */
    public static String getDateFormat(java.util.Calendar cal) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return getDateFormat(cal, pattern);
    }

    /**
     * 根据时间(Date)类型得到时间字符串，默认格式为yyyy-MM-dd HH:mm:ss,如果想自定义格式请参考getDateFormat方法
     *
     * @param date Date类型日期
     * @return String 日期字符串
     */
    public static String getDateFormat(java.util.Date date) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return getDateFormat(date, pattern);
    }

    /**
     * 根据时间字符串转换为Calendar时间类型,时间字符串格式为yyyy-MM-dd HH:mm:ss
     *
     * @param strDate strDate 时间字符串,必须为yyyy-MM-dd HH:mm:ss格式
     * @return java.util.Calendar
     */
    public static Calendar parseCalendarFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return parseCalendarFormat(strDate, pattern);
    }

    /**
     * 根据时间字符串转换为Date时间类型,时间字符串格式为yyyy-MM-dd HH:mm:ss
     *
     * @param strDate 时间字符串,必须为yyyy-MM-dd HH:mm:ss格式
     * @return java.util.Date
     */
    public static Date parseDateFormat(String strDate) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        return parseDateFormat(strDate, pattern);
    }

    /**
     * 根据日期(Calendar)和日期格式返回对应的字符串
     *
     * @param cal     Calendar参数
     * @param pattern 传入的日期格式(例如：yyyy-MM-dd HH:mm:ss)
     * @return String 日期字符串
     */
    public static String getDateFormat(java.util.Calendar cal, String pattern) {
        return getDateFormat(cal.getTime(), pattern);
    }

    /**
     * 根据日期(Date)和日期格式返回对应的字符串
     *
     * @param date    Date类型日期
     * @param pattern 传入的日期格式(例如：yyyy-MM-dd HH:mm:ss)
     * @return String 日期字符串
     */
    public static String getDateFormat(java.util.Date date, String pattern) {
        if (date == null)
            return null;
        synchronized (sdf) {
            String str = null;
            sdf.applyPattern(pattern);
            str = sdf.format(date);
            return str;
        }
    }

    /**
     * 根据时间字符串和对应的格式输出时间(Calendar)类型,如果时间字符串和格式不匹配则出现异常
     *
     * @param strDate 时间字符串
     * @param pattern 时间字符串对应的格式pattern
     * @return java.util.Calendar
     */
    public static Calendar parseCalendarFormat(String strDate, String pattern) {
        synchronized (sdf) {
            Calendar cal = null;
            sdf.applyPattern(pattern);
            try {
                sdf.parse(strDate);
                cal = sdf.getCalendar();
            } catch (Exception e) {
            }
            return cal;
        }
    }

    /**
     * 根据时间字符串和对应的格式输出时间(Date)类型,如果时间字符串和格式不匹配则出现异常
     *
     * @param strDate 时间字符串
     * @param pattern 时间字符串对应的格式pattern
     * @return java.util.Date
     */
    public static Date parseDateFormat(String strDate, String pattern) {
        if (strDate == null || strDate.trim().length() == 0) {
            return null;
        }
        synchronized (sdf) {
            StringBuffer datebuf = new StringBuffer();
            datebuf.append(strDate);
            if (strDate.length() == 10) {
                datebuf.deleteCharAt(7);
                datebuf.deleteCharAt(4);
            }

            Date date = null;
            sdf.applyPattern(pattern);
            try {
                date = sdf.parse(datebuf.toString());
            } catch (Exception e) {
            }
            return date;
        }
    }

    /**
     * 得到本年输入月份的最后一天数（如果说是2月闰年则返回29，2月平年则返回28）
     *
     * @param month 月份
     * @return int 这个月份的最后一天数，如果月份不存在则返回-1
     */
    public static int getLastDayOfMonth(int month) {
        if (month < 1 || month > 12) {
            return -1;
        }
        int retn = 0;
        if (month == 2) {
            if (isLeapYear()) {
                retn = 29;
            } else {
                retn = dayArray[month - 1];
            }
        } else {
            retn = dayArray[month - 1];
        }
        return retn;
    }

    /**
     * 得到输入年输入月份的最后一天数（如果说是2月闰年则返回29，2月平年则返回28）
     *
     * @param year  年
     * @param month 月
     * @return int 这一年这个月份的最后一天数，如果月份不存在则返回-1
     */
    public static int getLastDayOfMonth(int year, int month) {
        if (month < 1 || month > 12) {
            return -1;
        }
        int retn = 0;
        if (month == 2) {
            if (isLeapYear(year)) {
                retn = 29;
            } else {
                retn = dayArray[month - 1];
            }
        } else {
            retn = dayArray[month - 1];
        }
        return retn;
    }

    /**
     * 判断是否是闰年，如果是闰年则返回true否则返回FALSE
     *
     * @return Boolean 如果是闰年则返回true否则返回FALSE
     */
    public static boolean isLeapYear() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return isLeapYear(year);
    }

    /**
     * 判断是否是闰年，如果是闰年则返回true否则返回FALSE
     *
     * @param year 年
     * @return 如果是闰年则返回true否则返回FALSE
     */
    public static boolean isLeapYear(int year) {
        /**
         * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
         * 3.能被4整除同时能被100整除则不是闰年
         */
        if ((year % 400) == 0)
            return true;
        else if ((year % 4) == 0) {
            if ((year % 100) == 0)
                return false;
            else
                return true;
        } else
            return false;
    }

    /**
     * 判断指定日期的年份是否是闰年
     *
     * @param date 指定日期。
     * @return 是否闰年, 如果是闰年则返回true否则返回FALSE
     */
    public static boolean isLeapYear(java.util.Date date) {
        /**
         * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
         * 3.能被4整除同时能被100整除则不是闰年
         */
        // int year = date.getYear();
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        int year = gc.get(Calendar.YEAR);
        return isLeapYear(year);
    }

    /**
     * 判断指定日期的年份是否是闰年
     *
     * @return 是否闰年, 如果是闰年则返回true否则返回FALSE
     */
    public static boolean isLeapYear(java.util.Calendar gc) {
        /**
         * 详细设计： 1.被400整除是闰年，否则： 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
         * 3.能被4整除同时能被100整除则不是闰年
         */
        int year = gc.get(Calendar.YEAR);
        return isLeapYear(year);
    }

    /**
     * 得到指定日期的前一个工作日
     *
     * @param date 指定日期。
     * @return 指定日期的前一个工作日
     */
    public static java.util.Date getPreviousWeekDay(java.util.Date date) {
        {
            /**
             * 详细设计： 1.如果date是星期日，则减3天 2.如果date是星期六，则减2天 3.否则减1天
             */
            GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
            gc.setTime(date);
            return getPreviousWeekDay(gc);
        }
    }

    public static java.util.Date getPreviousWeekDay(java.util.Calendar gc) {
        {
            /**
             * 详细设计： 1.如果date是星期日，则减3天 2.如果date是星期六，则减2天 3.否则减1天
             */
            switch (gc.get(Calendar.DAY_OF_WEEK)) {
                case (Calendar.MONDAY):
                    gc.add(Calendar.DATE, -3);
                    break;
                case (Calendar.SUNDAY):
                    gc.add(Calendar.DATE, -2);
                    break;
                default:
                    gc.add(Calendar.DATE, -1);
                    break;
            }
            return gc.getTime();
        }
    }

    /**
     * 得到指定日期的后一个工作日
     *
     * @param date 指定日期。
     * @return 指定日期的后一个工作日
     */
    public static java.util.Date getNextWeekDay(java.util.Date date) {
        /**
         * 详细设计： 1.如果date是星期五，则加3天 2.如果date是星期六，则加2天 3.否则加1天
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        switch (gc.get(Calendar.DAY_OF_WEEK)) {
            case (Calendar.FRIDAY):
                gc.add(Calendar.DATE, 3);
                break;
            case (Calendar.SATURDAY):
                gc.add(Calendar.DATE, 2);
                break;
            default:
                gc.add(Calendar.DATE, 1);
                break;
        }
        return gc.getTime();
    }

    public static java.util.Calendar getNextWeekDay(java.util.Calendar gc) {
        /**
         * 详细设计： 1.如果date是星期五，则加3天 2.如果date是星期六，则加2天 3.否则加1天
         */
        switch (gc.get(Calendar.DAY_OF_WEEK)) {
            case (Calendar.FRIDAY):
                gc.add(Calendar.DATE, 3);
                break;
            case (Calendar.SATURDAY):
                gc.add(Calendar.DATE, 2);
                break;
            default:
                gc.add(Calendar.DATE, 1);
                break;
        }
        return gc;
    }

    /**
     * 取得指定日期的下一个月的最后一天
     *
     * @param date 指定日期。
     * @return 指定日期的下一个月的最后一天
     */
    public static java.util.Date getLastDayOfNextMonth(java.util.Date date) {
        /**
         * 详细设计： 1.调用getNextMonth设置当前时间 2.以1为基础，调用getLastDayOfMonth
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.setTime(DateUtil.getNextMonth(gc.getTime()));
        gc.setTime(DateUtil.getLastDayOfMonth(gc.getTime()));
        return gc.getTime();
    }

    /**
     * 取得指定日期的下一个星期的最后一天
     *
     * @param date 指定日期。
     * @return 指定日期的下一个星期的最后一天
     */
    public static java.util.Date getLastDayOfNextWeek(java.util.Date date) {
        /**
         * 详细设计： 1.调用getNextWeek设置当前时间 2.以1为基础，调用getLastDayOfWeek
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.setTime(DateUtil.getNextWeek(gc.getTime()));
        gc.setTime(DateUtil.getLastDayOfWeek(gc.getTime()));
        return gc.getTime();
    }

    /**
     * 取得指定日期的下一个月的第一天
     *
     * @param date 指定日期。
     * @return 指定日期的下一个月的第一天
     */
    public static java.util.Date getFirstDayOfNextMonth(java.util.Date date) {
        /**
         * 详细设计： 1.调用getNextMonth设置当前时间 2.以1为基础，调用getFirstDayOfMonth
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.setTime(DateUtil.getNextMonth(gc.getTime()));
        gc.setTime(DateUtil.getFirstDayOfMonth(gc.getTime()));
        return gc.getTime();
    }

    /**
     * 指定时间下一个月份的第一天
     *
     * @param gc
     * @return
     */
    public static java.util.Calendar getFirstDayOfNextMonth(java.util.Calendar gc) {
        /**
         * 详细设计： 1.调用getNextMonth设置当前时间 2.以1为基础，调用getFirstDayOfMonth
         */
        gc.setTime(DateUtil.getNextMonth(gc.getTime()));
        gc.setTime(DateUtil.getFirstDayOfMonth(gc.getTime()));
        return gc;
    }

    /**
     * 取得指定日期的下一个星期的第一天
     *
     * @param date 指定日期。
     * @return 指定日期的下一个星期的第一天
     */
    public static java.util.Date getFirstDayOfNextWeek(java.util.Date date) {
        /**
         * 详细设计： 1.调用getNextWeek设置当前时间 2.以1为基础，调用getFirstDayOfWeek
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.setTime(DateUtil.getNextWeek(gc.getTime()));
        gc.setTime(DateUtil.getFirstDayOfWeek(gc.getTime()));
        return gc.getTime();
    }

    /**
     * 指定时间下一个星期的第一天
     *
     * @param gc
     * @return
     */
    public static java.util.Calendar getFirstDayOfNextWeek(java.util.Calendar gc) {
        /**
         * 详细设计： 1.调用getNextWeek设置当前时间 2.以1为基础，调用getFirstDayOfWeek
         */
        gc.setTime(DateUtil.getNextWeek(gc.getTime()));
        gc.setTime(DateUtil.getFirstDayOfWeek(gc.getTime()));
        return gc;
    }

    /**
     * 指定日期加1年
     *
     * @param date
     * @return
     */
    public static java.util.Date getNextYear(java.util.Date date) {
        /**
         * 详细设计： 1.指定日期加1年
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.add(Calendar.YEAR, 1);
        return gc.getTime();
    }

    /**
     * 指定日期加1年
     *
     * @param gc
     * @return
     */
    public static java.util.Calendar getNextYear(java.util.Calendar gc) {
        /**
         * 详细设计： 1.指定日期加1年
         */
        gc.add(Calendar.YEAR, 1);
        return gc;
    }

    /**
     * 取得指定日期的下一个月
     *
     * @param date 指定日期。
     * @return 指定日期的下一个月
     */
    public static java.util.Date getNextMonth(java.util.Date date) {
        /**
         * 详细设计： 1.指定日期的月份加1
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.add(Calendar.MONTH, 1);
        return gc.getTime();
    }

    /**
     * 详细设计： 1.指定日期的月份加1
     */
    public static java.util.Calendar getNextMonth(java.util.Calendar gc) {
        gc.add(Calendar.MONTH, 1);
        return gc;
    }

    /**
     * 详细设计： 1.指定日期加1天
     *
     * @param date 指定日期。
     * @return 指定日期的下一天
     */
    public static java.util.Date getNextDay(java.util.Date date) {

        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.add(Calendar.DATE, 1);
        return gc.getTime();
    }

    /**
     * 详细设计： 1.指定日期加1天
     */
    public static java.util.Calendar getNextDay(java.util.Calendar gc) {
        gc.add(Calendar.DATE, 1);
        return gc;
    }

    /**
     * 详细设计： 1.指定日期减1天
     */
    public static java.util.Date getPreviousDay(java.util.Date date) {
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.add(Calendar.DATE, -1);
        return gc.getTime();
    }

    /**
     * 详细设计： 1.指定日期减1天
     */
    public static java.util.Calendar getPreviousDay(java.util.Calendar gc) {
        gc.add(Calendar.DATE, -1);
        return gc;
    }

    /**
     * 取得指定日期的下一个星期
     *
     * @param date 指定日期。
     * @return 指定日期的下一个星期
     */
    public static java.util.Date getNextWeek(java.util.Date date) {
        /**
         * 详细设计： 1.指定日期加7天
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.add(Calendar.DATE, 7);
        return gc.getTime();
    }

    /**
     * 取得指定日期的n天
     *
     * @param date 指定日期。
     * @return 指定日期的n天
     */
    public static java.util.Date getNextNumDay(java.util.Date date, int n) {
        /**
         * 详细设计： 1.指定日期加n天
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.add(Calendar.DATE, n);
        return gc.getTime();
    }

    /**
     * 指定日期加7天
     *
     * @param gc
     * @return
     */
    public static java.util.Calendar getNextWeek(java.util.Calendar gc) {
        /**
         * 详细设计： 1.指定日期加7天
         */
        gc.add(Calendar.DATE, 7);
        return gc;
    }

    /**
     * 取得指定日期的所处星期的最后一天
     *
     * @param date 指定日期。
     * @return 指定日期的所处星期的最后一天
     */
    public static java.util.Date getLastDayOfWeek(java.util.Date date) {
        /**
         * 详细设计： 1.如果date是星期日，则加6天 2.如果date是星期一，则加5天 3.如果date是星期二，则加4天
         * 4.如果date是星期三，则加3天 5.如果date是星期四，则加2天 6.如果date是星期五，则加1天
         * 7.如果date是星期六，则加0天
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        switch (gc.get(Calendar.DAY_OF_WEEK)) {
            case (Calendar.SUNDAY):
                gc.add(Calendar.DATE, 6);
                break;
            case (Calendar.MONDAY):
                gc.add(Calendar.DATE, 5);
                break;
            case (Calendar.TUESDAY):
                gc.add(Calendar.DATE, 4);
                break;
            case (Calendar.WEDNESDAY):
                gc.add(Calendar.DATE, 3);
                break;
            case (Calendar.THURSDAY):
                gc.add(Calendar.DATE, 2);
                break;
            case (Calendar.FRIDAY):
                gc.add(Calendar.DATE, 1);
                break;
            case (Calendar.SATURDAY):
                gc.add(Calendar.DATE, 0);
                break;
        }
        return gc.getTime();
    }

    /**
     * 取得指定日期的所处星期的第一天
     *
     * @param date 指定日期。
     * @return 指定日期的所处星期的第一天
     */
    public static java.util.Date getFirstDayOfWeek(java.util.Date date) {
        /**
         * 详细设计： 1.如果date是星期日，则减0天 2.如果date是星期一，则减1天 3.如果date是星期二，则减2天
         * 4.如果date是星期三，则减3天 5.如果date是星期四，则减4天 6.如果date是星期五，则减5天
         * 7.如果date是星期六，则减6天
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        switch (gc.get(Calendar.DAY_OF_WEEK)) {
            case (Calendar.SUNDAY):
                gc.add(Calendar.DATE, 0);
                break;
            case (Calendar.MONDAY):
                gc.add(Calendar.DATE, -1);
                break;
            case (Calendar.TUESDAY):
                gc.add(Calendar.DATE, -2);
                break;
            case (Calendar.WEDNESDAY):
                gc.add(Calendar.DATE, -3);
                break;
            case (Calendar.THURSDAY):
                gc.add(Calendar.DATE, -4);
                break;
            case (Calendar.FRIDAY):
                gc.add(Calendar.DATE, -5);
                break;
            case (Calendar.SATURDAY):
                gc.add(Calendar.DATE, -6);
                break;
        }
        return gc.getTime();
    }

    /**
     * 取得指定日期的所处星期的第一天
     *
     * @param gc 指定日期。
     * @return 指定日期的所处星期的第一天
     */
    public static java.util.Calendar getFirstDayOfWeek(java.util.Calendar gc) {
        /**
         * 详细设计： 1.如果date是星期日，则减0天 2.如果date是星期一，则减1天 3.如果date是星期二，则减2天
         * 4.如果date是星期三，则减3天 5.如果date是星期四，则减4天 6.如果date是星期五，则减5天
         * 7.如果date是星期六，则减6天
         */
        switch (gc.get(Calendar.DAY_OF_WEEK)) {
            case (Calendar.SUNDAY):
                gc.add(Calendar.DATE, 0);
                break;
            case (Calendar.MONDAY):
                gc.add(Calendar.DATE, -1);
                break;
            case (Calendar.TUESDAY):
                gc.add(Calendar.DATE, -2);
                break;
            case (Calendar.WEDNESDAY):
                gc.add(Calendar.DATE, -3);
                break;
            case (Calendar.THURSDAY):
                gc.add(Calendar.DATE, -4);
                break;
            case (Calendar.FRIDAY):
                gc.add(Calendar.DATE, -5);
                break;
            case (Calendar.SATURDAY):
                gc.add(Calendar.DATE, -6);
                break;
        }
        return gc;
    }

    /**
     * 取得指定日期的所处月份的最后一天
     *
     * @param date 指定日期。
     * @return 指定日期的所处月份的最后一天
     */
    public static java.util.Date getLastDayOfMonth(java.util.Date date) {
        /**
         * 详细设计： 1.如果date在1月，则为31日 2.如果date在2月，则为28日 3.如果date在3月，则为31日
         * 4.如果date在4月，则为30日 5.如果date在5月，则为31日 6.如果date在6月，则为30日
         * 7.如果date在7月，则为31日 8.如果date在8月，则为31日 9.如果date在9月，则为30日
         * 10.如果date在10月，则为31日 11.如果date在11月，则为30日 12.如果date在12月，则为31日
         * 1.如果date在闰年的2月，则为29日
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        switch (gc.get(Calendar.MONTH)) {
            case 0:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 1:
                gc.set(Calendar.DAY_OF_MONTH, 28);
                break;
            case 2:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 3:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 4:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 5:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 6:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 7:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 8:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 9:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 10:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 11:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
        }
        // 检查闰年
        if ((gc.get(Calendar.MONTH) == Calendar.FEBRUARY) && (isLeapYear(gc.get(Calendar.YEAR)))) {
            gc.set(Calendar.DAY_OF_MONTH, 29);
        }
        return gc.getTime();
    }

    /**
     * 取得指定日期的所处月份的最后一天
     *
     * @param gc 指定日期。
     * @return 指定日期的所处月份的最后一天
     */
    public static java.util.Calendar getLastDayOfMonth(java.util.Calendar gc) {
        /**
         * 详细设计： 1.如果date在1月，则为31日 2.如果date在2月，则为28日 3.如果date在3月，则为31日
         * 4.如果date在4月，则为30日 5.如果date在5月，则为31日 6.如果date在6月，则为30日
         * 7.如果date在7月，则为31日 8.如果date在8月，则为31日 9.如果date在9月，则为30日
         * 10.如果date在10月，则为31日 11.如果date在11月，则为30日 12.如果date在12月，则为31日
         * 1.如果date在闰年的2月，则为29日
         */
        switch (gc.get(Calendar.MONTH)) {
            case 0:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 1:
                gc.set(Calendar.DAY_OF_MONTH, 28);
                break;
            case 2:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 3:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 4:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 5:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 6:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 7:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 8:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 9:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
            case 10:
                gc.set(Calendar.DAY_OF_MONTH, 30);
                break;
            case 11:
                gc.set(Calendar.DAY_OF_MONTH, 31);
                break;
        }
        // 检查闰年
        if ((gc.get(Calendar.MONTH) == Calendar.FEBRUARY) && (isLeapYear(gc.get(Calendar.YEAR)))) {
            gc.set(Calendar.DAY_OF_MONTH, 29);
        }
        return gc;
    }

    /**
     * 取得指定日期的所处月份的第一天
     *
     * @param date 指定日期。
     * @return 指定日期的所处月份的第一天
     */
    public static java.util.Date getFirstDayOfMonth(java.util.Date date) {
        /**
         * 详细设计： 1.设置为1号
         */
        GregorianCalendar gc = (GregorianCalendar) Calendar.getInstance();
        gc.setTime(date);
        gc.set(Calendar.DAY_OF_MONTH, 1);
        return gc.getTime();
    }

    /**
     * 取得指定日期的所处月份的第一天
     *
     * @param gc 指定日期。
     * @return 指定日期的所处月份的第一天
     */
    public static java.util.Calendar getFirstDayOfMonth(java.util.Calendar gc) {
        /**
         * 详细设计： 1.设置为1号
         */
        gc.set(Calendar.DAY_OF_MONTH, 1);
        return gc;
    }

    /**
     * 将日期对象转换成为指定ORA日期、时间格式的字符串形式。如果日期对象为空，返回 一个空字符串对象，而不是一个空对象。
     *
     * @param theDate 将要转换为字符串的日期对象。
     * @param hasTime 如果返回的字符串带时间则为true
     * @return 转换的结果
     */
    public static String toOraString(Date theDate, boolean hasTime) {
        /**
         * 详细设计： 1.如果有时间，则设置格式为getOraDateTimeFormat()的返回值
         * 2.否则设置格式为getOraDateFormat()的返回值 3.调用toString(Date theDate, DateFormat
         * theDateFormat)
         */
        DateFormat theFormat;
        if (hasTime) {
            theFormat = getOraDateTimeFormat();
        } else {
            theFormat = getOraDateFormat();
        }
        return toString(theDate, theFormat);
    }

    /**
     * 将日期对象转换成为指定日期、时间格式的字符串形式。如果日期对象为空，返回 一个空字符串对象，而不是一个空对象。
     *
     * @param theDate 将要转换为字符串的日期对象。
     * @param hasTime 如果返回的字符串带时间则为true
     * @return 转换的结果
     */
    public static String toString(Date theDate, boolean hasTime) {
        /**
         * 详细设计： 1.如果有时间，则设置格式为getDateTimeFormat的返回值 2.否则设置格式为getDateFormat的返回值
         * 3.调用toString(Date theDate, DateFormat theDateFormat)
         */
        DateFormat theFormat;
        if (hasTime) {
            theFormat = getDateTimeFormat();
        } else {
            theFormat = getDateFormat();
        }
        return toString(theDate, theFormat);
    }

    /**
     * 标准日期格式MM/dd/yyyy
     */
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    /**
     * 标准时间格式MM/dd/yyyy HH:mm
     */
    private static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("MM/dd/yyyy HH:mm");

    /**
     * ORA标准日期格式yyyyMMdd
     */
    public static final SimpleDateFormat ORA_DATE_FORMAT = new SimpleDateFormat("yyyyMMdd");
    /**
     * yyyyMM
     */
    public static final SimpleDateFormat ORA_DATE_MONTH_FORMAT = new SimpleDateFormat("yyyyMM");

    /**
     * ORA标准时间格式yyyyMMddHHmm
     */
    private static final SimpleDateFormat ORA_DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmm");

    /**
     * 创建一个标准日期格式的克隆
     *
     * @return 标准日期格式的克隆
     */
    public static DateFormat getDateFormat() {
        /**
         * 详细设计： 1.返回DATE_FORMAT
         */
        SimpleDateFormat theDateFormat = (SimpleDateFormat) DATE_FORMAT.clone();
        theDateFormat.setLenient(false);
        return theDateFormat;
    }

    /**
     * 创建一个标准时间格式的克隆
     *
     * @return 标准时间格式的克隆
     */
    public static DateFormat getDateTimeFormat() {
        /**
         * 详细设计： 1.返回DATE_TIME_FORMAT
         */
        SimpleDateFormat theDateTimeFormat = (SimpleDateFormat) DATE_TIME_FORMAT.clone();
        theDateTimeFormat.setLenient(false);
        return theDateTimeFormat;
    }

    /**
     * 创建一个标准ORA日期格式的克隆
     *
     * @return 标准ORA日期格式的克隆
     */
    public static DateFormat getOraDateFormat() {
        /**
         * 详细设计： 1.返回ORA_DATE_FORMAT
         */
        SimpleDateFormat theDateFormat = (SimpleDateFormat) ORA_DATE_FORMAT.clone();
        theDateFormat.setLenient(false);
        return theDateFormat;
    }

    /**
     * 创建一个标准ORA时间格式的克隆
     *
     * @return 标准ORA时间格式的克隆
     */
    public static DateFormat getOraDateTimeFormat() {
        /**
         * 详细设计： 1.返回ORA_DATE_TIME_FORMAT
         */
        SimpleDateFormat theDateTimeFormat = (SimpleDateFormat) ORA_DATE_TIME_FORMAT.clone();
        theDateTimeFormat.setLenient(false);
        return theDateTimeFormat;
    }

    /**
     * 将一个日期对象转换成为指定日期、时间格式的字符串。 如果日期对象为空，返回一个空字符串，而不是一个空对象。
     *
     * @param theDate       要转换的日期对象
     * @param theDateFormat 返回的日期字符串的格式
     * @return 转换结果
     */
    public static String toString(Date theDate, DateFormat theDateFormat) {
        /**
         * 详细设计： 1.theDate为空，则返回"" 2.否则使用theDateFormat格式化
         */
        if (theDate == null)
            return "";
        return theDateFormat.format(theDate);
    }

    /**
     * 计算两个日期之间相差的月个数，不足一个月忽略
     */
    public static int subMonth(java.util.Calendar begingc, java.util.Calendar endgc) {
        int beginYear = begingc.get(Calendar.YEAR);
        int beginMonth = begingc.get(Calendar.MONTH);
        int endYear = endgc.get(Calendar.YEAR);
        int endMonth = endgc.get(Calendar.MONTH);
        return (endYear - beginYear) * 12 + (endMonth - beginMonth);
    }

    /**
     * 计算两个日期之间相差的整月数,日期是××××年××月××日００时００分００秒 如果不足一个月按照一个月计算
     */
    public static int betweenMonths(Date begin, Date end) {
        Calendar begingc = Calendar.getInstance();
        begingc.setTime(begin);
        int beginYear = begingc.get(Calendar.YEAR);
        int beginMonth = begingc.get(Calendar.MONTH);
        int beginDay = begingc.get(Calendar.DAY_OF_MONTH);

        Calendar endgc = Calendar.getInstance();
        endgc.setTime(end);
        int endYear = endgc.get(Calendar.YEAR);
        int endMonth = endgc.get(Calendar.MONTH);
        int endDay = endgc.get(Calendar.DAY_OF_MONTH);

        int between = (endYear - beginYear) * 12 + (endMonth - beginMonth);

        if (endDay > beginDay)
            between = between + 1;
        else if (endDay < beginDay)
            between = between - 1;
        return between;

    }

    /**
     * 计算两个日期之间年数
     *
     * @deprecated
     */
    public static double distanceYear(String beginDate, String endDate) {
        if (beginDate == null || beginDate.trim().length() == 0 || endDate == null || endDate.trim().length() == 0) {
            return 0;
        }
        int yday = 365;
        // logger.info("&&&&&&&&&" + yday);
        double disYear = 0.0;
        String pattern = "yyyy-MM-dd";

        Calendar bcal = parseCalendarFormat(beginDate, pattern);
        int bday = bcal.get(Calendar.DAY_OF_YEAR);

        Calendar ecal = parseCalendarFormat(endDate, pattern);
        int eday = ecal.get(Calendar.DAY_OF_YEAR);

        if (isLeapYear(Integer.parseInt(beginDate.substring(0, 4)))) {
            // logger.info("&&&&&&&&&xxx" + yday);
            yday = 366;
            disYear = (yday - bday + eday) / yday;
        } else {
            // logger.info("&&&&&&&&&" + yday);
            // logger.info("&&&&&&&&&" + bday);
            // logger.info("&&&&&&&&&" + eday);
            // logger.info("&&&&&&&&&" + ( yday - bday + eday ));
            disYear = (double) (yday - bday + eday) / yday;
            // logger.info("&&&&&&&&&" + disYear);
        }
        return disYear;
    }

    /**
     * 忽略闰年计算两时间之间天数
     *
     * @deprecated
     */
    public static int calculeteBetweenDays(Date begin, Date end) {
        if (begin == null || end == null)
            return 0;
        Calendar cal = Calendar.getInstance();
        int beginYear = begin.getYear();
        int endYear = end.getYear();
        cal.setTime(begin);
        int beginDay = cal.get(Calendar.DAY_OF_YEAR);
        cal.setTime(end);
        int endDay = cal.get(Calendar.DAY_OF_YEAR);
        return (365) * (endYear - beginYear) + (endDay - beginDay);

    }

    /**
     * 计算两时间之间年
     *
     * @param begin
     * @param end
     * @return
     * @deprecated
     */
    public static double calculateBetweenYears(Date begin, Date end) {
        return (double) calculeteBetweenDays(begin, end) / 365;
    }

    /**
     * 计算两个日期之间的年份，日期是××××年××月××日００时００分００秒 不足一个月按照一个月计算
     *
     * @param begin
     * @param end
     * @return
     */
    public static double betweenYears(Date begin, Date end) {
        return betweenMonths(begin, end) / 12.0;
    }

    /**
     * 转换日期格式
     *
     * @param date   Date
     * @param simple SimpleDateFormat
     * @return
     */
    public static String transDateToString(Date date, SimpleDateFormat simple) {
        if (date == null) {
            return null;
        }
        return simple.format(date);
    }

    /**
     * 转换日期格式
     *
     * @param date   Date
     * @param format
     * @return
     */
    public static String transDateToString(Date date, String format) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simple = new SimpleDateFormat(format);
        return simple.format(date);
    }

    /**
     * @param s
     * @return
     * @throws ParseException
     */
    public static Date transStringToDate(String s) throws ParseException {
        if (s == null || s.trim().equals("")) {
            return null;
        }
        return SimpleDateFormat.getDateInstance().parse(s);
    }

    /**
     * 将day和time拼接转换成Date格式
     *
     * @param day  yyyyMMdd
     * @param time HHmmss(可以为null)
     * @return
     */
    public static Date getBankCardDate(String day, String time) {
        if (day == null || "".equals(day.trim())) {
            return null;
        }
        if (time == null || "".equals(time.trim())) {
            time = "000000";
        }
        String strDate = day + time;
        String pattern = "yyyyMMddHHmmss";
        return parseDateFormat(strDate, pattern);
    }

    public static long getIntervalDays(Date beginDate, Date endDate) {
        long days = (endDate.getTime() - beginDate.getTime()) / (24 * 60 * 60 * 1000);
        return days;
    }

    /**
     * 只有数字的日期字符串转化为Date
     *
     * @param stringDate 只有数字的日期字符串
     * @return Date
     * @see
     */
    public static Date fromString(String stringDate) {
        if (stringDate == null || stringDate.length() == 0) {
            return null;
        }

        int length = stringDate.length();
        String dateFm;
        if (length == 8) {
            dateFm = "yyyyMMdd"; // 格式化当前系统日期到天
        } else if (length == 10) {
            dateFm = "yyyyMMddHH";// 格式化当前系统日期到时
        } else if (length == 12) {
            dateFm = "yyyyMMddHHmm"; // 格式化当前系统日期到分钟
        } else if (length == 14) {
            dateFm = "yyyyMMddHHmmss"; // 格式化当前系统日期到秒
        } else {
            dateFm = "yyyyMM";
        }
        return DateUtil.parseDateFormat(stringDate, dateFm);
    }

    /**
     * 获取日期的凌晨时间 (yyyy-MM-dd 00:00:00)
     *
     * @param date
     * @return
     */
    public static String getBeginDate(Date date) {
        String pattern = "yyyy-MM-dd 00:00:00";
        return getDateFormat(date, pattern);
    }

    /**
     * 获取日期的午夜时间 (yyyy-MM-dd 23:59:59)
     *
     * @param date
     * @return
     */
    public static String getPolicyEndDate(Date date) {
        String pattern = "yyyy-MM-dd 23:59:59";
        return getDateFormat(date, pattern);
    }


    //如果是null返回true，如果是String类型则还会判断是否是""(空字符串)，如果是""返回true，否则返回FALSE
    public static boolean isNullOrEmpty(Object obj) {
        return null == obj ? true : (obj instanceof String && "".equals(obj.toString().trim())) ? true : false;
    }

    /**
     * 获取现在时间
     *
     * @return返回字符串格式 yyyy-MM-dd HH:mm:ss
     */
    public static String getStringDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(new Date());
        return dateString;
    }
}
