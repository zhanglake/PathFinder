package com.zzh.service;

import com.zzh.dao.ReportDao;
import com.zzh.entity.dto.CalendarData;
import com.zzh.entity.dto.OrderData;
import com.zzh.entity.dto.ReportResponse;
import com.zzh.entity.dto.StatusOrderData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by zhenghua.zhang on 2018/1/30.
 */
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ReportDao reportDao;

    @Override
    public ReportResponse reportData() {
        ReportResponse response = new ReportResponse();
        OrderData todayOrderCount = reportDao.findTodayCount();
        response.setTodayOrderData(todayOrderCount);
        OrderData yesterdayOrderCount = reportDao.findYesterdayCount();
        response.setYesterdayOrderData(yesterdayOrderCount);
        List<CalendarData> calendarDatas = reportDao.findCalendar();
        int maxDate = this.getCurrentMonthLastDay();
        int year = 2018;
        int month = 1;
        List<Integer> dayList = new ArrayList<Integer>();
        for (CalendarData calendarData : calendarDatas) {
            dayList.add(calendarData.getDay());
            year = calendarData.getYear();
            month = calendarData.getMonth();
        }
        for (int i = 1; i <= maxDate; i ++) {
            if (!dayList.contains(i)) {
                CalendarData calendarData = new CalendarData(year, month, i, 0);
                calendarDatas.add(calendarData);
            }
        }
        response.setCalendarDatas(calendarDatas);
        List<StatusOrderData> statusOrder = reportDao.findStatusOrder();
        List<Integer> status = new ArrayList<Integer>();
        for (StatusOrderData statusOrderData : statusOrder) {
            status.add(statusOrderData.getStatus());
        }
        for (int i = 0; i < 5; i ++) {
            if (!status.contains(i)) {
                StatusOrderData statusOrderData = new StatusOrderData();
                statusOrderData.setStatus(i);
                statusOrderData.setCount(0);
                statusOrder.add(statusOrderData);
            }
        }
        response.setStatusOrder(statusOrder);
        Integer todayToDealCount = reportDao.findTodayToDealOrder();
        response.setTodayToDealOrderCount(todayToDealCount);
        return response;
    }

    /**
     * 取得当月天数
     * */
    private int getCurrentMonthLastDay() {
        Calendar a = Calendar.getInstance();
        a.set(Calendar.DATE, 1);//把日期设置为当月第一天
        a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天
        int maxDate = a.get(Calendar.DATE);
        return maxDate;
    }

}