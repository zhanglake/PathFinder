package com.zzh.entity;

/**
 * Created by zhenghua.zhang on 2018/1/15.
 */
public class OrderDetail {

    private Long orderDetailId;
    // 对应订单
    private Order order;
    private Long orderId;
    // 对应产品
    private Product product;
    private Long productId;
    // 数量
    private Integer count;
    // 产品单价
    private Double price;
    // 产品打折售价
    private Double salePrice;
    // 价格小计
    private Double countPrice;
    // 折后价格小计
    private Double countSalePrice;
    // 备注
    private String description;

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public void setCountSalePrice(Double countSalePrice) {
        this.countSalePrice = countSalePrice;
    }

    public Double getCountSalePrice() {

        return countSalePrice;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order getOrder() {

        return order;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setCountPrice(Double countPrice) {
        this.countPrice = countPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOrderDetailId() {

        return orderDetailId;
    }

    public Product getProduct() {
        return product;
    }

    public Long getProductId() {
        return productId;
    }

    public Integer getCount() {
        return count;
    }

    public Double getCountPrice() {
        return countPrice;
    }

    public String getDescription() {
        return description;
    }

}
