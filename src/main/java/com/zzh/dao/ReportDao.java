package com.zzh.dao;

import com.zzh.entity.dto.CalendarData;
import com.zzh.entity.dto.OrderData;
import com.zzh.entity.dto.StatusOrderData;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by zhenghua.zhang on 2018/1/30.
 */
@Repository
public interface ReportDao {

    OrderData findTodayCount();

    OrderData findYesterdayCount();

    List<CalendarData> findCalendar();

    List<StatusOrderData> findStatusOrder();

    Integer findTodayToDealOrder();

}