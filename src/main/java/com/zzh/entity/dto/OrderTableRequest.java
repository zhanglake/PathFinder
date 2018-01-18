package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/1/17.
 */
public class OrderTableRequest extends TableRequest {

    private String orderCode;
    private String createdDateStart;
    private String createdDateEnd;
    private Integer statusInt;

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

    public String getOrderCode() {

        return orderCode;
    }

    public String getCreatedDateStart() {
        return createdDateStart;
    }

    public String getCreatedDateEnd() {
        return createdDateEnd;
    }

    public Integer getStatusInt() {
        return statusInt;
    }

}
