package com.zzh.entity;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public class Order extends BaseEntity {

    private Long orderId;
    // 订单编号
    private String orderCode;
    // 客户信息
    private Customer customer;
    private Long customerId;
    // 对应订单详情
    private List<OrderDetail> orderDetails;
    private List<Long> orderDetailIds;
    // 总价
    private Double totalPrice;
    // 订单状态
    private Unit.ORDER_STATUS status = Unit.ORDER_STATUS.CREATED;
    private Integer statusInt = 0;

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setStatusInt(Integer statusInt) {
        this.statusInt = statusInt;
    }

    public String getOrderCode() {

        return orderCode;
    }

    public Integer getStatusInt() {
        return statusInt;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void setOrderDetailIds(List<Long> orderDetailIds) {
        this.orderDetailIds = orderDetailIds;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setStatus(Unit.ORDER_STATUS status) {
        this.status = status;
    }

    public Long getOrderId() {

        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public List<Long> getOrderDetailIds() {
        return orderDetailIds;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public Unit.ORDER_STATUS getStatus() {
        return status;
    }
}
