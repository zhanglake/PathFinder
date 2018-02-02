package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2018/2/1.
 */
public class StatusOrderData {

    private Integer status;
    private Integer count;

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getStatus() {

        return status;
    }

    public Integer getCount() {
        return count;
    }

}