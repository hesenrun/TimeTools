package com.bqmz001.timelibaray;

import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;

public class TimeUtil {



    /*
    当前时间
     */


    //获取当前时间长整型
    public static synchronized long getNow() {
        return new DateTime().getMillis();
    }

    //获取今天的0：00长整型
    public static synchronized long getNowDayStartTimeStamp() {
        return new DateTime()
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    //获取今天的23：59：59.999长整型
    public static synchronized long getNowDayEndTimeStamp() {
        return new DateTime()
                .withHourOfDay(23)
                .withMinuteOfHour(59)
                .withSecondOfMinute(59)
                .withMillisOfSecond(999)
                .getMillis();
    }

    //获取今天任意时间长整型
    public static synchronized long getNowDayTimeStamp(int hour) {
        return new DateTime()
                .withHourOfDay(hour)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getNowDayTimeStamp(int hour, int minute) {
        return new DateTime()
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getNowDayTimeStamp(int hour, int minute, int second) {
        return new DateTime()
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getNowDayTimeStamp(int hour, int minute, int second, int millSecond) {
        return new DateTime()
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(millSecond)
                .getMillis();
    }

    /*
       当前周
     */
    //获取本周的第一天0：00长整型
    public static synchronized long getFirstTimeOfThisWeek() {
        return new DateTime()
                .withWeekyear(new DateTime().getYear())
                .withWeekOfWeekyear(new DateTime().getWeekOfWeekyear())
                .withDayOfWeek(DateTimeConstants.MONDAY)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    //获取本周的最后一天的23:59:59:999长整型
    public static synchronized long getLastTimeOfThisWeek() {
        return new DateTime()
                .withWeekyear(new DateTime().getYear())
                .withWeekOfWeekyear(new DateTime().getWeekOfWeekyear())
                .withDayOfWeek(DateTimeConstants.SUNDAY)
                .withHourOfDay(23)
                .withMinuteOfHour(59)
                .withSecondOfMinute(59)
                .withMillisOfSecond(999)
                .getMillis();
    }

    //获取本周任意时间长整型
    public static synchronized long getAnyTimeOfThisWeek(int dayOfWeek) {
        return new DateTime()
                .withWeekyear(new DateTime().getYear())
                .withWeekOfWeekyear(new DateTime().getWeekOfWeekyear())
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisWeek(int dayOfWeek, int hour) {
        return new DateTime()
                .withWeekyear(new DateTime().getYear())
                .withWeekOfWeekyear(new DateTime().getWeekOfWeekyear())
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisWeek(int dayOfWeek, int hour, int minute) {
        return new DateTime()
                .withWeekyear(new DateTime().getYear())
                .withWeekOfWeekyear(new DateTime().getWeekOfWeekyear())
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisWeek(int dayOfWeek, int hour, int minute, int second) {
        return new DateTime()
                .withWeekyear(new DateTime().getYear())
                .withWeekOfWeekyear(new DateTime().getWeekOfWeekyear())
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisWeek(int dayOfWeek, int hour, int minute, int second, int millSecond) {
        return new DateTime()
                .withWeekyear(new DateTime().getYear())
                .withWeekOfWeekyear(new DateTime().getWeekOfWeekyear())
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(millSecond)
                .getMillis();
    }


    /*
   当前月
    */
    //获取本月第一天0时长整型
    public static synchronized long getFirstTimeOfThisMonth() {
        return new DateTime()
                .withDayOfMonth(new DateTime().dayOfMonth().getMinimumValue())
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    //获取本月最后一天的最后时间长整型
    public static synchronized long getLastTimeOfThisMonth() {
        return new DateTime()
                .withDayOfMonth(new DateTime().dayOfMonth().getMaximumValue())
                .withHourOfDay(23)
                .withMinuteOfHour(59)
                .withSecondOfMinute(59)
                .withMillisOfSecond(999)
                .getMillis();
    }

    //获取本月任意一天长整型
    public static synchronized long getAnyTimeOfThisMonth(int dayOfMonth) {
        return new DateTime()
                .withDayOfMonth(dayOfMonth)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisMonth(int dayOfMonth, int hour) {
        return new DateTime()
                .withDayOfMonth(dayOfMonth)
                .withHourOfDay(hour)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisMonth(int dayOfMonth, int hour, int minute) {
        return new DateTime()
                .withDayOfMonth(dayOfMonth)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisMonth(int dayOfMonth, int hour, int minute, int second) {
        return new DateTime()
                .withDayOfMonth(dayOfMonth)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisMonth(int dayOfMonth, int hour, int minute, int second, int millSecond) {
        return new DateTime()
                .withDayOfMonth(dayOfMonth)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(millSecond)
                .getMillis();
    }

    /*
   当前年
    */
    //获取本年第一天0时
    public static synchronized long getFirstTimeOfThisYear() {
        return new DateTime()
                .withMonthOfYear(1)
                .withDayOfMonth(1)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    //获取本年最后一天最后一刻
    public static synchronized long getLastTimeOfThisYear() {
        return new DateTime()
                .withMonthOfYear(12)
                .withDayOfMonth(31)
                .withHourOfDay(23)
                .withMinuteOfHour(59)
                .withSecondOfMinute(59)
                .withMillisOfSecond(999)
                .getMillis();
    }

    //获取本年任何一天的任何时刻
    public static synchronized long getAnyDayTimeOfThisYear(int dayOfYear) {
        return new DateTime()
                .withDayOfYear(dayOfYear)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyDayTimeOfThisYear(int dayOfYear, int hour) {
        return new DateTime()
                .withDayOfYear(dayOfYear)
                .withHourOfDay(hour)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyDayTimeOfThisYear(int dayOfYear, int hour, int minute) {
        return new DateTime()
                .withDayOfYear(dayOfYear)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyDayTimeOfThisYear(int dayOfYear, int hour, int minute, int second) {
        return new DateTime()
                .withDayOfYear(dayOfYear)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyDayTimeOfThisYear(int dayOfYear, int hour, int minute, int second, int millSecond) {
        return new DateTime()
                .withDayOfYear(dayOfYear)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(millSecond)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisYear(int month, int day) {
        return new DateTime()
                .withMonthOfYear(month)
                .withDayOfMonth(day)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisYear(int month, int day, int hour) {
        return new DateTime()
                .withMonthOfYear(month)
                .withDayOfMonth(day)
                .withHourOfDay(hour)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisYear(int month, int day, int hour, int minute) {
        return new DateTime()
                .withMonthOfYear(month)
                .withDayOfMonth(day)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisYear(int month, int day, int hour, int minute, int second) {
        return new DateTime()
                .withMonthOfYear(month)
                .withDayOfMonth(day)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getAnyTimeOfThisYear(int month, int day, int hour, int minute, int second, int millSecond) {
        return new DateTime()
                .withMonthOfYear(month)
                .withDayOfMonth(day)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(millSecond)
                .getMillis();
    }


    //获取某一周的第一天0：00
    public static synchronized long getFirstTimeOfWeek(int year, int weekOfYear) {
        return new DateTime()
                .withWeekyear(year)
                .withWeekOfWeekyear(weekOfYear)
                .withDayOfWeek(DateTimeConstants.MONDAY)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    //获取某一周最后一天的最后时间
    public static synchronized long getLastTimeOfWeek(int year, int weekOfYear) {
        return new DateTime()
                .withWeekyear(year)
                .withWeekOfWeekyear(weekOfYear)
                .withDayOfWeek(DateTimeConstants.SUNDAY)
                .withHourOfDay(23)
                .withMinuteOfHour(59)
                .withSecondOfMinute(59)
                .withMillisOfSecond(999)
                .getMillis();
    }
    
    //获取某一周中的任意时间
    public static synchronized long getAnyTimeOfWeek(int year, int weekOfYear,int dayOfWeek) {
        return new DateTime()
                .withWeekyear(year)
                .withWeekOfWeekyear(weekOfYear)
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }
    public static synchronized long getAnyTimeOfWeek(int year, int weekOfYear,int dayOfWeek,int hour) {
        return new DateTime()
                .withWeekyear(year)
                .withWeekOfWeekyear(weekOfYear)
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }
    public static synchronized long getAnyTimeOfWeek(int year, int weekOfYear,int dayOfWeek,int hour,int minute) {
        return new DateTime()
                .withWeekyear(year)
                .withWeekOfWeekyear(weekOfYear)
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }
    public static synchronized long getAnyTimeOfWeek(int year, int weekOfYear,int dayOfWeek,int hour,int minute,int second) {
        return new DateTime()
                .withWeekyear(year)
                .withWeekOfWeekyear(weekOfYear)
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(0)
                .getMillis();
    }
    public static synchronized long getAnyTimeOfWeek(int year, int weekOfYear,int dayOfWeek,int hour,int minute,int second,int millSecond) {
        return new DateTime()
                .withWeekyear(year)
                .withWeekOfWeekyear(weekOfYear)
                .withDayOfWeek(dayOfWeek)
                .withHourOfDay(hour)
                .withMinuteOfHour(minute)
                .withSecondOfMinute(second)
                .withMillisOfSecond(millSecond)
                .getMillis();
    }


    //获取某一年第一天时间
    public static synchronized long getFirstTimeOfYear(int year) {
        return new DateTime(year, 1, 1, 0, 0, 0, 0).getMillis();
    }

    //获取某一年最后一天时间
    public static synchronized long getLastTimeOfYear(int year) {
        return new DateTime(year, 12, 31, 23, 59, 59, 999).getMillis();

    }

    //获取某一年任何一天的时间
    public static synchronized long getAnyDayOfYear(int year,int month,int day) {
        return new DateTime(year, month, day, 0, 0, 0, 0).getMillis();

    }
    public static synchronized long getAnyDayOfYear(int year,int month,int day,int hour) {
        return new DateTime(year, month, day, hour, 0, 0, 0).getMillis();

    }
    public static synchronized long getAnyDayOfYear(int year,int month,int day,int hour,int minute) {
        return new DateTime(year, month, day, hour, minute, 0, 0).getMillis();

    }
    public static synchronized long getAnyDayOfYear(int year,int month,int day,int hour,int minute,int second) {
        return new DateTime(year, month, day, hour, minute, second, 0).getMillis();

    }
    public static synchronized long getAnyDayOfYear(int year,int month,int day,int hour,int minute,int second,int millSecond) {
        return new DateTime(year, month, day, hour, minute, second, millSecond).getMillis();

    }

    //获取某一天的开始/结束时间——我不信有一天能有比24小时多的少的，至少电脑上看来是这样
    //事实证明我错了，拼字符串太累了！
    public static synchronized long getFirstTimeOfDay(int year, int month, int day) {
        return new DateTime()
                .withYear(year)
                .withMonthOfYear(month)
                .withDayOfMonth(day)
                .withHourOfDay(0)
                .withMinuteOfHour(0)
                .withSecondOfMinute(0)
                .withMillisOfSecond(0)
                .getMillis();
    }

    public static synchronized long getLastTimeOfDay(int year, int month, int day) {
        return new DateTime()
                .withYear(year)
                .withMonthOfYear(month)
                .withDayOfMonth(day)
                .withHourOfDay(23)
                .withMinuteOfHour(59)
                .withSecondOfMinute(59)
                .withMillisOfSecond(999)
                .getMillis();
    }


    //获取今年
    public static synchronized int getNowYear() {
        return new DateTime().getYear();
    }

    //获取本月
    public static synchronized int getNowMonth() {
        return new DateTime().getMonthOfYear();
    }

    //获取今天
    public static synchronized int getNowDay() {
        return new DateTime().getDayOfMonth();
    }

    //获取某月第一天——我不信还有哪个月能给2号起步——算了，写上吧，总有人要给你出幺蛾子
    public static synchronized int getFirstDayOfMonth(int year, int month) {
        DateTime dateTime = new DateTime(year, month, 1, 0, 0);
        return dateTime.dayOfMonth().getMinimumValue();
    }

    //获取某月的最后一天
    public static synchronized int getLastDayOfMonth(int year, int month) {
        DateTime dateTime = new DateTime(year, month, 1, 0, 0);
        return dateTime.dayOfMonth().getMaximumValue();
    }
}
