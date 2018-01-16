package com.zzh.entity;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public class Product extends BaseEntity {

    private Long productId;
    private String productName;
    private String description;
    // 是否可用
    private Boolean available;
    // 图片
    private List<MyFile> pictures;
    // 库存量
    private Integer stock;
    // 原价
    private Double price;
    // 折扣
    private Double discount;
    // 促销价
    private Double salePrice;
    // 种类
    private Type type;
    private Long typeId;

    public void setType(Type type) {
        this.type = type;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Type getType() {

        return type;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getSalePrice() {

        return salePrice;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void setPictures(List<MyFile> pictures) {
        this.pictures = pictures;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Long getProductId() {

        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public List<MyFile> getPictures() {
        return pictures;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Double getDiscount() {
        return discount;
    }

}
