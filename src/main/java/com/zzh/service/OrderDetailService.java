package com.zzh.service;

import com.zzh.dao.OrderDetailDao;
import com.zzh.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public interface OrderDetailService {

    void insertList(List<OrderDetail> orderDetails);

    void insertOne(OrderDetail orderDetail);

    List<OrderDetail> findByOrderId(Long orderId);

}
