package com.zzh.service;

import com.zzh.dao.CustomerDao;
import com.zzh.entity.Customer;
import com.zzh.entity.Page;
import com.zzh.util.Unit;
import com.zzh.entity.dto.SelectPageDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/11.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    Logger logger = Logger.getLogger(CustomerServiceImpl.class);

    @Autowired
    private CustomerDao customerDao;

    @Override
    public Page<Customer> findList(Page page, Object param) {
        SelectPageDto pageDto = new SelectPageDto(page.getPageSize(), page.getPageNo() - 1, param);
        Integer count = customerDao.findCount();
        List<Customer> customers = customerDao.findList(pageDto);
        for (Customer customer : customers) {
            Integer provinceInt = customer.getProvinceInt();
            customer.setProvince(Unit.PROVINCE.values()[provinceInt]);
            customer.setProvinceName(Unit.PROVINCE.values()[provinceInt].getName());
        }
        page.setResults(customers);
        page.setTotalRecord(count);
        return page;
    }

    @Override
    public Customer addOrUpdateCustomer(Customer customer) throws Exception {
        if (null == customer.getProvince()) {
            customer.setProvinceInt(Unit.PROVINCE.JIANGSU.ordinal());
        } else {
            customer.setProvinceInt(customer.getProvince().ordinal());
        }
        if (null != customer.getCustomerId()) {
        } else {
            customerDao.insertCustomer(customer);
        }
        return customer;
    }

    @Override
    public Customer findOneByPhone(String phone) {
        Customer customer = customerDao.findOneByPhone(phone);
        return customer;
    }

}
