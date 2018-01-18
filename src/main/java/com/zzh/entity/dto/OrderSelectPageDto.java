package com.zzh.entity.dto;

import com.zzh.entity.Page;

import java.util.Date;

/**
 * Created by zhenghua.zhang on 2018/1/17.
 */
public class OrderSelectPageDto extends Page {

    private String orderCode;
    private String createdDateStart;
    private String createdDateEnd;
    private Integer statusInt;

    public OrderSelectPageDto(Integer pageSize, Integer pageNo) {
        super(pageSize, pageNo);
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setCreatedDateStart(String createdDateStart) {
        this.createdDateStart = createdDateStart;
    }

    public void setCreatedDateEnd(String createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
    }

    public void setStatusInt(Integer statusInt) {
        this.statusInt = statusInt;
    }

    public String getCreatedDateStart() {

        return createdDateStart;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getCreatedDateEnd() {
        return createdDateEnd;
    }

    public Integer getStatusInt() {
        return statusInt;
    }

}
