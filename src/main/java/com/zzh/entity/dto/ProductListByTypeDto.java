package com.zzh.entity.dto;

import com.zzh.entity.Product;
import com.zzh.entity.Type;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/16.
 */
public class ProductListByTypeDto {
    private Type type;
    private List<Product> products;

    public ProductListByTypeDto () {}

    public ProductListByTypeDto (Type type, List<Product> products) {
        this.type = type;
        this.products = products;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Type getType() {

        return type;
    }

    public List<Product> getProducts() {
        return products;
    }
}
