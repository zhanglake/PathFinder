package com.zzh.service;

import com.zzh.entity.Customer;
import com.zzh.entity.Page;

/**
 * Created by zhenghua.zhang on 2018/1/11.
 */
public interface CustomerService {

    Page<Customer> findList(Page page, Object param);

    void addOrUpdateCustomer(Customer customer) throws Exception;

}
