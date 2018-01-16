package com.zzh.entity.dto;

import com.zzh.entity.Order;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public class OrderSaveDto {

    private String phone;
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {

        return order;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {

        return phone;
    }

}
