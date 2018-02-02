package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/1/30.
 */
public class ReportDto {

    private Integer todayOrderCount;
    private Double todayOrderPrice;
    private Integer yesterdayOrderCount;
    private Double yesterdayOrderPrice;

    public void setTodayOrderCount(Integer todayOrderCount) {
        this.todayOrderCount = todayOrderCount;
    }

    public void setTodayOrderPrice(Double todayOrderPrice) {
        this.todayOrderPrice = todayOrderPrice;
    }

    public void setYesterdayOrderCount(Integer yesterdayOrderCount) {
        this.yesterdayOrderCount = yesterdayOrderCount;
    }

    public void setYesterdayOrderPrice(Double yesterdayOrderPrice) {
        this.yesterdayOrderPrice = yesterdayOrderPrice;
    }

    public Integer getTodayOrderCount() {

        return todayOrderCount;
    }

    public Double getTodayOrderPrice() {
        return todayOrderPrice;
    }

    public Integer getYesterdayOrderCount() {
        return yesterdayOrderCount;
    }

    public Double getYesterdayOrderPrice() {
        return yesterdayOrderPrice;
    }

}