package com.zzh.service;

import com.zzh.dao.OrderDao;
import com.zzh.entity.Order;
import com.zzh.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderDetailService orderDetailService;

    @Override
    public void insertOne(Order order) {
        // 插入订单信息
        order.setOrderCode(String.valueOf(new Date().getTime()));
        orderDao.insertOne(order);
        Long orderId = order.getOrderId();

        // 插入订单详情
        List<OrderDetail> orderDetails = new ArrayList<OrderDetail>();
        for (OrderDetail orderDetail : order.getOrderDetails()) {
            orderDetail.setOrderId(orderId);
            orderDetail.setCountPrice(orderDetail.getPrice() * orderDetail.getCount());
            orderDetails.add(orderDetail);
        }
        if (orderDetails.size() > 0) {
            orderDetailService.insertList(orderDetails);
        }
    }

    @Override
    public List<Order> findByCustomerId(Long customerId) {
        List<Order> orders = orderDao.findByCustomerId(customerId);
        return orders;
    }

    @Override
    public Order findByOrderId(Long orderId) {
        Order order = orderDao.findByOrderId(orderId);
        List<OrderDetail> orderDetails = orderDetailService.findByOrderId(order.getOrderId());
        order.setOrderDetails(orderDetails);
        return order;
    }

}
