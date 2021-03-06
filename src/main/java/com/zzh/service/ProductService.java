package com.zzh.service;

import com.zzh.entity.Page;
import com.zzh.entity.Product;
import com.zzh.entity.dto.ProductListByTypeDto;
import com.zzh.entity.dto.ProductSaveDto;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public interface ProductService {

    Page<Product> findList(Page page, Object param);

    Product findOne(Long id);

    void insertOrUpdateOne(ProductSaveDto dto);

    void deleteOne(Long id);

    List<ProductListByTypeDto> findProductsByType();

    List<Product> findNew5();

}
