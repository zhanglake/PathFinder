package com.zzh.controller;

import com.zzh.entity.Customer;
import com.zzh.entity.Order;
import com.zzh.entity.Page;
import com.zzh.entity.Result;
import com.zzh.entity.dto.OrderTableRequest;
import com.zzh.entity.dto.OrderSaveDto;
import com.zzh.entity.dto.OrderSelectPageDto;
import com.zzh.entity.dto.TableRequest;
import com.zzh.service.CustomerService;
import com.zzh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Result insertOne(@RequestBody OrderSaveDto dto) {
        Order order = dto.getOrder();
        if (null != order.getCustomerId()) {
            orderService.insertOne(order);
        } else {
            Customer customer = customerService.findOneByPhone(dto.getPhone());
            order.setCustomerId(customer.getCustomerId());
            order.setCustomer(customer);
            orderService.insertOne(order);
        }
        return new Result("下单成功");
    }

    @RequestMapping(value = "/c/list/{customerId}", method = RequestMethod.GET)
    @ResponseBody
    public Result findByCustomerId(@PathVariable("customerId") Long customerId) {
        List<Order> orderList = orderService.findByCustomerId(customerId);
        return new Result(orderList);
    }

    @RequestMapping(value = "/c/one/{orderId}", method = RequestMethod.GET)
    @ResponseBody
    public Result findOneC(@PathVariable Long orderId) {
        Order order = orderService.findByOrderId(orderId);
        return new Result(order);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Page findTableList(@RequestBody OrderTableRequest request) {
        OrderSelectPageDto dto = new OrderSelectPageDto(request.getPageSize(), request.getPageNumber() - 1);
        dto.setOrderCode(request.getOrderCode());
        dto.setCreatedDateStart(request.getCreatedDateStart());
        dto.setCreatedDateEnd(request.getCreatedDateEnd());
        dto.setStatusInt(request.getStatusInt());
        Page<Order> orderPage = orderService.findList(dto);
        return orderPage;
    }

    @RequestMapping(value = "/one/{orderId}", method = RequestMethod.GET)
    @ResponseBody
    public Result findOneWithDetail(@PathVariable Long orderId) {
        Order order = orderService.findByOrderIdWithCustomer(orderId);
        return new Result(order);
    }

    @RequestMapping(value = "/changestatus/{orderId}/{status}", method = RequestMethod.GET)
    @ResponseBody
    public Result confirmOrder(@PathVariable Long orderId, @PathVariable Integer status) {
        try {
            orderService.changeOrderStatus(orderId, status);
            return new Result();
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(400, Result.ResultStatus.ERROR, "操作失败!");
        }
    }


}
