package com.zzh.service;

import com.zzh.dao.CustomerDao;
import com.zzh.entity.Customer;
import com.zzh.entity.Page;
import com.zzh.entity.Unit;
import com.zzh.entity.dto.SelectPageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/11.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

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
    public void addOrUpdateCustomer(Customer customer) throws Exception {
        customer.setProvinceInt(customer.getProvince().ordinal());
        if (null != customer.getCustomerId()) {
        } else {
            customerDao.insertCustomer(customer);
        }
    }

}
