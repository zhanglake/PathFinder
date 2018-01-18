package com.zzh.service;

import com.zzh.entity.Order;
import com.zzh.entity.Page;
import com.zzh.entity.dto.OrderSelectPageDto;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public interface OrderService {

    void insertOne(Order order);

    List<Order> findByCustomerId(Long customerId);

    Order findByOrderId(Long orderId);

    Order findByOrderIdWithCustomer(Long orderId);

    Page<Order> findList(OrderSelectPageDto dto);

    void changeOrderStatus(Long orderId, Integer status);

}
