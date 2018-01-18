package com.zzh.entity.dto;

import com.zzh.entity.MyFile;

import java.util.List;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public class ProductSaveDto {

    private Long productId;
    private String productName;
    private String description;
    // 是否可用
    private Boolean available;
    // 图片
    private List<Long> pictureIds;
    private List<Object> pictures;
    // 库存量
    private Integer stock;
    // 原价
    private Double price;
    // 折扣
    private Double discount;
    // 促销价
    private Double salePrice;
    // 分类
    private Long typeId;

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getTypeId() {

        return typeId;
    }

    public void setPictures(List<Object> pictures) {
        this.pictures = pictures;
    }

    public List<Object> getPictures() {

        return pictures;
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

    public void setPictureIds(List<Long> pictureIds) {
        this.pictureIds = pictureIds;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
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

    public List<Long> getPictureIds() {
        return pictureIds;
    }

    public Integer getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }

    public Double getDiscount() {
        return discount;
    }

    public Double getSalePrice() {
        return salePrice;
    }
}
