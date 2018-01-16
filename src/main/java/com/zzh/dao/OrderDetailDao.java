package com.zzh.dao;

import com.zzh.entity.OrderDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Repository
public interface OrderDetailDao {

    void insertOne(OrderDetail orderDetail);

    void insertList(List list);

    List<OrderDetail> findByOrderId(Long orderId);

}
