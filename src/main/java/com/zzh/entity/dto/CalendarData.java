package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/1/31.
 */
public class CalendarData {
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer count;

    public CalendarData () {}

    public CalendarData (Integer year, Integer month, Integer day, Integer count) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.count = count;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getYear() {

        return year;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getCount() {
        return count;
    }

}
