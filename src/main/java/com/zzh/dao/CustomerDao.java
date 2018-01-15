package com.zzh.dao;

import com.zzh.entity.Customer;
import com.zzh.entity.dto.SelectPageDto;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/11.
 */
@Repository
public interface CustomerDao {

    Integer findCount();

    List<Customer> findList(SelectPageDto dto);

    void insertCustomer(Customer customer);

}
