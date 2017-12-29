package com.zzh.entity.dto;

/**
 * Created by zhenghua.zhang on 2017/12/28.
 */
public class SelectPageDto {
    private int offset;
    private int pageNo;
    private int pageSize;
    private Object param;

    public SelectPageDto(int pageSize, int pageNo, Object param) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.offset = pageNo * pageSize;
        this.param = param;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageNo() {

        return pageNo;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public int getOffset() {

        return offset;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Object getParam() {
        return param;
    }
}