package com.zzh.dao;

import com.zzh.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Repository
public interface OrderDao {

    void insertOne(Order order);

    List<Order> findByCustomerId(Long customerId);

    Order findByOrderId(Long orderId);

}
