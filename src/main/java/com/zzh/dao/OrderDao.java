package com.zzh.dao;

import com.zzh.entity.Order;
import com.zzh.entity.Page;
import com.zzh.entity.dto.OrderSelectPageDto;
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

    Order findByOrderIdWithCustomer(Long orderId);

    Integer findCount(OrderSelectPageDto dto);

    List<Order> findList(OrderSelectPageDto dto);

    void changeOrderStatus(Long orderId, Integer status);

    List<Order> findTopTen();

}
