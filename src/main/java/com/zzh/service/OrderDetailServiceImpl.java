package com.zzh.service;

import com.zzh.dao.OrderDetailDao;
import com.zzh.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Override
    public void insertList(List<OrderDetail> orderDetails) {
        orderDetailDao.insertList(orderDetails);
    }

    @Override
    public void insertOne(OrderDetail orderDetail) {
        orderDetailDao.insertOne(orderDetail);
    }

    @Override
    public List<OrderDetail> findByOrderId(Long orderId) {
        return orderDetailDao.findByOrderId(orderId);
    }

}
