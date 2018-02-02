package com.zzh.entity.dto;

import java.util.List;
import java.util.Map;

/**
 * Created by zhenghua.zhang on 2018/1/31.
 */
public class ReportResponse {

    private OrderData todayOrderData;
    private OrderData yesterdayOrderData;
    private List<CalendarData> calendarDatas;
    private List<StatusOrderData> statusOrder;
    private Integer todayToDealOrderCount;

    public void setTodayToDealOrderCount(Integer todayToDealOrderCount) {
        this.todayToDealOrderCount = todayToDealOrderCount;
    }

    public Integer getTodayToDealOrderCount() {

        return todayToDealOrderCount;
    }

    public void setStatusOrder(List<StatusOrderData> statusOrder) {
        this.statusOrder = statusOrder;
    }

    public List<StatusOrderData> getStatusOrder() {

        return statusOrder;
    }

    public void setTodayOrderData(OrderData todayOrderData) {
        this.todayOrderData = todayOrderData;
    }

    public void setCalendarDatas(List<CalendarData> calendarDatas) {
        this.calendarDatas = calendarDatas;
    }

    public void setYesterdayOrderData(OrderData yesterdayOrderData) {
        this.yesterdayOrderData = yesterdayOrderData;
    }

    public OrderData getTodayOrderData() {

        return todayOrderData;
    }

    public OrderData getYesterdayOrderData() {
        return yesterdayOrderData;
    }

    public List<CalendarData> getCalendarDatas() {
        return calendarDatas;
    }

}