package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/1/31.
 */
public class OrderData {
    private Integer orderCount = 0;
    private Double orderPrice = 0d;

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public void setOrderPrice(Double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getOrderCount() {

        return orderCount;
    }

    public Double getOrderPrice() {
        return orderPrice;
    }
}
