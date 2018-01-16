package com.zzh.controller;

import com.zzh.entity.Customer;
import com.zzh.entity.Page;
import com.zzh.entity.Result;
import com.zzh.entity.dto.TableRequest;
import com.zzh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhenghua.zhang on 2018/1/11.
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Page findList(@RequestBody TableRequest tableRequest) {
        Page<Customer> customerPage = new Page<Customer>(tableRequest.getPageSize(), tableRequest.getPageNumber());
        customerPage = customerService.findList(customerPage, null);
        return customerPage;
    }

    @RequestMapping(value = "/addorupdate", method = RequestMethod.POST)
    @ResponseBody
    public Result addOrUpdateCustomer(@RequestBody Customer customer) {
        try {
            customerService.addOrUpdateCustomer(customer);
            return new Result("保存成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result("保存失败");
        }
    }

    @RequestMapping(value = "/one/{phone}", method = RequestMethod.GET)
    @ResponseBody
    public Result findByPhone(@PathVariable("phone") String phone) {
        Customer customer = customerService.findOneByPhone(phone);
        return new Result(customer);
    }

}
