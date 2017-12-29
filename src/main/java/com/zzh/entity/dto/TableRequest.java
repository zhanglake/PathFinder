package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2017/12/26.
 */
public class TableRequest {
    private Integer pageSize;
    private Integer pageNumber;
    private Object param;

    public void setParam(Object param) {
        this.param = param;
    }

    public Object getParam() {

        return param;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {

        return pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

}
