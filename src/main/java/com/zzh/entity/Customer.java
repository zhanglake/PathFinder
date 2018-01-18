package com.zzh.entity;

import com.zzh.util.Unit;

/**
 * Created by zhenghua.zhang on 2018/1/11.
 */
public class Customer extends BaseEntity {

    private Long customerId;
    private String customerName;
    private String contact;
    private String phone;
    private String mobile;
    private Unit.PROVINCE province;
    private Integer provinceInt;
    private String provinceName;
    private String address;

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public void setProvinceInt(Integer provinceInt) {
        this.provinceInt = provinceInt;
    }

    public Integer getProvinceInt() {

        return provinceInt;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setProvince(Unit.PROVINCE province) {
        this.province = province;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCustomerId() {

        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getContact() {
        return contact;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public Unit.PROVINCE getProvince() {
        return province;
    }

    public String getAddress() {
        return address;
    }

}
