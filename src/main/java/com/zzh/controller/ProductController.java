package com.zzh.controller;

import com.zzh.entity.Customer;
import com.zzh.entity.Page;
import com.zzh.entity.Product;
import com.zzh.entity.Result;
import com.zzh.entity.dto.ProductListByTypeDto;
import com.zzh.entity.dto.ProductSaveDto;
import com.zzh.entity.dto.TableRequest;
import com.zzh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public Page findList(@RequestBody TableRequest tableRequest) {
        Page<Product> productPage = new Page<Product>(tableRequest.getPageSize(), tableRequest.getPageNumber());
        productPage = productService.findList(productPage, null);
        return productPage;
    }

    @RequestMapping(value = "/one/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result findOne(@PathVariable("id") Long id) {
        Product product = productService.findOne(id);
        return new Result(product);
    }

    @RequestMapping(value = "/addorupdate", method = RequestMethod.POST)
    @ResponseBody
    public Result insertOne(@RequestBody ProductSaveDto dto) {
        productService.insertOrUpdateOne(dto);
        if (null != dto.getPictureIds()) {
            return new Result("修改成功");
        } else {
            return new Result("添加成功");
        }
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result deleteOne(@PathVariable("id") Long id) {
        productService.deleteOne(id);
        return new Result("删除成功");
    }

    @RequestMapping(value = "/c/list", method = RequestMethod.GET)
    @ResponseBody
    public Result findWithType() {
        List<ProductListByTypeDto> dtos = productService.findProductsByType();
        return new Result(dtos);
    }

    /**
     * 查找最近的5个新品
     * @return
     */
    @RequestMapping(value = "/c/new5", method = RequestMethod.GET)
    @ResponseBody
    public Result findNew5() {
        List<Product> products = productService.findNew5();
        return new Result(products);
    }

}