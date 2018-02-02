package com.zzh.service;

import com.zzh.dao.OrderDao;
import com.zzh.entity.Order;
import com.zzh.entity.OrderDetail;
import com.zzh.entity.Page;
import com.zzh.entity.dto.OrderSelectPageDto;
import com.zzh.util.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        order.setOrderCode(Utils.generateOrderId(2));
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

    @Override
    public Order findByOrderIdWithCustomer(Long orderId) {
        Order order = orderDao.findByOrderIdWithCustomer(orderId);
        List<OrderDetail> orderDetails = orderDetailService.findByOrderId(order.getOrderId());
        order.setOrderDetails(orderDetails);
        return order;
    }

    @Override
    public Page<Order> findList(OrderSelectPageDto dto) {
        dto.setOrderCode("%" + dto.getOrderCode() + "%");
        Integer count = orderDao.findCount(dto);
        List<Order> orderList = orderDao.findList(dto);
        Page<Order> orderPage = new Page<Order>(dto.getPageSize(), dto.getPageNo());
        orderPage.setResults(orderList);
        orderPage.setTotalRecord(count);
        return orderPage;
    }

    @Override
    public void changeOrderStatus(Long orderId, Integer status) {
        orderDao.changeOrderStatus(orderId, status);
    }

    @Override
    public List<Order> findTopTen() {
        return orderDao.findTopTen();
    }

}
